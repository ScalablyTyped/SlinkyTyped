package typingsSlinky.jestReporters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type OnTestFailure = js.Function2[
    /* test */ typingsSlinky.jestReporters.typesMod.Test, 
    /* error */ typingsSlinky.jestTestResult.typesMod.SerializableError, 
    js.Promise[js.Any]
  ]
  type OnTestStart = js.Function1[/* test */ typingsSlinky.jestReporters.typesMod.Test, js.Promise[scala.Unit]]
  type OnTestSuccess = js.Function2[
    /* test */ typingsSlinky.jestReporters.typesMod.Test, 
    /* result */ typingsSlinky.jestTestResult.typesMod.TestResult, 
    js.Promise[js.Any]
  ]
  type TestFramework = js.Function5[
    /* globalConfig */ typingsSlinky.jestTypes.configMod.GlobalConfig, 
    /* config */ typingsSlinky.jestTypes.configMod.ProjectConfig, 
    /* environment */ typingsSlinky.jestEnvironment.mod.JestEnvironment, 
    /* runtime */ typingsSlinky.jestRuntime.mod.^, 
    /* testPath */ java.lang.String, 
    js.Promise[typingsSlinky.jestTestResult.typesMod.TestResult]
  ]
  type TestRunData = js.Array[typingsSlinky.jestReporters.anon.Context]
}
