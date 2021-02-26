package typingsSlinky.jestGlobals

import typingsSlinky.jestTypes.globalMod.HookFn
import typingsSlinky.jestTypes.globalMod.TestFn
import typingsSlinky.jestTypes.globalMod.TestName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(testName: TestName, fn: TestFn): Unit = js.native
    def apply(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
  }
  
  @js.native
  trait FnCallFnTimeout extends StObject {
    
    def apply(fn: HookFn): Unit = js.native
    def apply(fn: HookFn, timeout: Double): Unit = js.native
  }
}
