package typingsSlinky.jestRunner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  type TestFileEvent[T /* <: /* keyof jest-runner.jest-runner/build/types.TestEvents */ typingsSlinky.jestRunner.jestRunnerStrings.`test-file-start` | typingsSlinky.jestRunner.jestRunnerStrings.`test-file-success` | typingsSlinky.jestRunner.jestRunnerStrings.`test-file-failure` | typingsSlinky.jestRunner.jestRunnerStrings.`test-case-result` */] = js.Function2[
    /* eventName */ T, 
    /* import warning: importer.ImportType#apply Failed type conversion: jest-runner.jest-runner/build/types.TestEvents[T] */ /* args */ js.Any, 
    js.Any
  ]
  
  type TestFramework = js.Function6[
    /* globalConfig */ typingsSlinky.jestTypes.configMod.GlobalConfig, 
    /* config */ typingsSlinky.jestTypes.configMod.ProjectConfig, 
    /* environment */ typingsSlinky.jestEnvironment.mod.JestEnvironment, 
    /* runtime */ typingsSlinky.jestRuntime.mod.RuntimeType, 
    /* testPath */ java.lang.String, 
    /* sendMessageToJest */ js.UndefOr[
      typingsSlinky.jestRunner.typesMod.TestFileEvent[
        /* keyof jest-runner.jest-runner/build/types.TestEvents */ typingsSlinky.jestRunner.jestRunnerStrings.`test-file-start` | typingsSlinky.jestRunner.jestRunnerStrings.`test-file-success` | typingsSlinky.jestRunner.jestRunnerStrings.`test-file-failure` | typingsSlinky.jestRunner.jestRunnerStrings.`test-case-result`
      ]
    ], 
    js.Promise[typingsSlinky.jestTestResult.typesMod.TestResult]
  ]
}
