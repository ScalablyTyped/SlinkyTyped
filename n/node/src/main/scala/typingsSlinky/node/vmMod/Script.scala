package typingsSlinky.node.vmMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vm", "Script")
@js.native
class Script protected () extends js.Object {
  def this(code: String) = this()
  def this(code: String, options: ScriptOptions) = this()
  
  def createCachedData(): Buffer = js.native
  
  def runInContext(contextifiedSandbox: Context): js.Any = js.native
  def runInContext(contextifiedSandbox: Context, options: RunningScriptOptions): js.Any = js.native
  
  def runInNewContext(): js.Any = js.native
  def runInNewContext(sandbox: js.UndefOr[scala.Nothing], options: RunningScriptOptions): js.Any = js.native
  def runInNewContext(sandbox: Context): js.Any = js.native
  def runInNewContext(sandbox: Context, options: RunningScriptOptions): js.Any = js.native
  
  def runInThisContext(): js.Any = js.native
  def runInThisContext(options: RunningScriptOptions): js.Any = js.native
}
