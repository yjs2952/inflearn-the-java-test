package com.study.inflearnthejavatest;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class StudyTest {
    @Test
    void create(){
        Study study = new Study();
        assertNotNull(study);
        System.out.println("create");
    }

    @Test
    @Disabled
    void create1(){
        Study study = new Study();
        assertNotNull(study);
        System.out.println("create1");
    }

    @Test
    @DisplayName("스터디 만들기")
    void create_new_study(){
        String test_env = System.getenv("TEST_ENV");
        System.out.println(test_env);
        assumeTrue("LOCAL".equalsIgnoreCase(test_env));
    }

    @BeforeAll
    static void beforeAll(){
        System.out.println("before all");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("after all");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("Before each");
    }

    @AfterEach
    void afterEach(){
        System.out.println("After each");
    }
}