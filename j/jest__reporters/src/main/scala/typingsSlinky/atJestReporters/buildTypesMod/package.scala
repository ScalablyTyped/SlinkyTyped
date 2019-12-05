package typingsSlinky.atJestReporters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildTypesMod {
  import typingsSlinky.atJestEnvironment.atJestEnvironmentMod.JestEnvironment
  import typingsSlinky.atJestReporters.Anon_Context
  import typingsSlinky.atJestTestDashResult.buildTypesMod.SerializableError
  import typingsSlinky.atJestTestDashResult.buildTypesMod.TestResult
  import typingsSlinky.atJestTypes.buildConfigMod.GlobalConfig
  import typingsSlinky.atJestTypes.buildConfigMod.ProjectConfig
  import typingsSlinky.jestDashRuntime.jestDashRuntimeMod.^

  type OnTestFailure = js.Function2[/* test */ Test, /* error */ SerializableError, js.Promise[js.Any]]
  type OnTestStart = js.Function1[/* test */ Test, js.Promise[Unit]]
  type OnTestSuccess = js.Function2[/* test */ Test, /* result */ TestResult, js.Promise[js.Any]]
  type TestFramework = js.Function5[
    /* globalConfig */ GlobalConfig, 
    /* config */ ProjectConfig, 
    /* environment */ JestEnvironment, 
    /* runtime */ ^, 
    /* testPath */ String, 
    js.Promise[TestResult]
  ]
  type TestRunData = js.Array[Anon_Context]
}
