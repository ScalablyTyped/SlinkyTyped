package typingsSlinky.jestDashRunner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildTypesMod {
  import typingsSlinky.atJestEnvironment.atJestEnvironmentMod.JestEnvironment
  import typingsSlinky.atJestTestDashResult.buildTypesMod.SerializableError
  import typingsSlinky.atJestTestDashResult.buildTypesMod.TestResult
  import typingsSlinky.atJestTypes.buildConfigMod.GlobalConfig
  import typingsSlinky.atJestTypes.buildConfigMod.ProjectConfig
  import typingsSlinky.jestDashRunner.Anon_Code
  import typingsSlinky.jestDashRuntime.jestDashRuntimeMod.^

  type ErrorWithCode = js.Error with Anon_Code
  type OnTestFailure = js.Function2[/* test */ Test, /* serializableError */ SerializableError, js.Promise[Unit]]
  type OnTestStart = js.Function1[/* test */ Test, js.Promise[Unit]]
  type OnTestSuccess = js.Function2[/* test */ Test, /* testResult */ TestResult, js.Promise[Unit]]
  type TestFramework = js.Function5[
    /* globalConfig */ GlobalConfig, 
    /* config */ ProjectConfig, 
    /* environment */ JestEnvironment, 
    /* runtime */ ^, 
    /* testPath */ String, 
    js.Promise[TestResult]
  ]
}
