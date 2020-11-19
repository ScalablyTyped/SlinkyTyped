package typingsSlinky.jestReporters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  type TestRunData = js.Array[typingsSlinky.jestReporters.anon.Context]
}
