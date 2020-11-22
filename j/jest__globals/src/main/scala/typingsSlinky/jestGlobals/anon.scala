package typingsSlinky.jestGlobals

import typingsSlinky.jestTypes.globalMod.HookFn
import typingsSlinky.jestTypes.globalMod.TestFn
import typingsSlinky.jestTypes.globalMod.TestName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait FnCall extends js.Object {
    
    def apply(testName: TestName, fn: TestFn): Unit = js.native
    def apply(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
  }
  
  @js.native
  trait FnCallFnTimeout extends js.Object {
    
    def apply(fn: HookFn): Unit = js.native
    def apply(fn: HookFn, timeout: Double): Unit = js.native
  }
}
