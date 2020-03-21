package typingsSlinky.jestRunner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type OnTestFailure = js.Function2[
    /* test */ typingsSlinky.jestRunner.typesMod.Test, 
    /* serializableError */ typingsSlinky.jestTestResult.typesMod.SerializableError, 
    js.Promise[scala.Unit]
  ]
  type OnTestStart = js.Function1[/* test */ typingsSlinky.jestRunner.typesMod.Test, js.Promise[scala.Unit]]
  type OnTestSuccess = js.Function2[
    /* test */ typingsSlinky.jestRunner.typesMod.Test, 
    /* testResult */ typingsSlinky.jestTestResult.typesMod.TestResult, 
    js.Promise[scala.Unit]
  ]
  type TestFramework = js.Function5[
    /* globalConfig */ typingsSlinky.jestTypes.configMod.GlobalConfig, 
    /* config */ typingsSlinky.jestTypes.configMod.ProjectConfig, 
    /* environment */ typingsSlinky.jestEnvironment.mod.JestEnvironment, 
    /* runtime */ typingsSlinky.jestRuntime.mod.^, 
    /* testPath */ java.lang.String, 
    js.Promise[typingsSlinky.jestTestResult.typesMod.TestResult]
  ]
}
