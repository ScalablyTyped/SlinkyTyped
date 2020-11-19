package typingsSlinky.node.vmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vm", "runInContext")
@js.native
object runInContext extends js.Object {
  
  def apply(code: String, contextifiedSandbox: Context): js.Any = js.native
  def apply(code: String, contextifiedSandbox: Context, options: String): js.Any = js.native
  def apply(code: String, contextifiedSandbox: Context, options: RunningScriptOptions): js.Any = js.native
}
