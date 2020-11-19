package typingsSlinky.mochaSugarFree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type HookFunc = js.ThisFunction1[
    /* this */ js.UndefOr[scala.Nothing], 
    /* context */ typingsSlinky.mochaSugarFree.mod.HookContext, 
    scala.Unit
  ]
  
  /** Construct a type with the properties of T except for those in type K. */
  type Omit[T, K /* <: /* keyof any */ java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type SuiteFunc = js.ThisFunction1[
    /* this */ js.UndefOr[scala.Nothing], 
    /* context */ typingsSlinky.mochaSugarFree.mod.SuiteContext, 
    scala.Unit
  ]
  
  type TestCase = js.ThisFunction1[
    /* this */ js.UndefOr[scala.Nothing], 
    /* context */ typingsSlinky.mochaSugarFree.mod.TestContext, 
    scala.Unit | js.Thenable[js.Any]
  ]
  
  type TestCaseWithDone = js.ThisFunction1[
    /* this */ js.UndefOr[scala.Nothing], 
    /* context */ typingsSlinky.mochaSugarFree.mod.TestContextWithDone, 
    scala.Unit
  ]
}
