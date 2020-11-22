package typingsSlinky.jupyterlabApputils.mod

import typingsSlinky.jupyterlabApputils.sessioncontextMod.SessionContext.IKernelSearch
import typingsSlinky.jupyterlabApputils.sessioncontextMod.SessionContext.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/apputils", "SessionContext")
@js.native
class SessionContext protected ()
  extends typingsSlinky.jupyterlabApputils.sessioncontextMod.SessionContext {
  /**
    * Construct a new session context.
    */
  def this(options: IOptions) = this()
}
@JSImport("@jupyterlab/apputils", "SessionContext")
@js.native
object SessionContext extends js.Object {
  
  /**
    * Get the default kernel name given select options.
    */
  def getDefaultKernel(options: IKernelSearch): String | Null = js.native
}
