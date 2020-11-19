package typingsSlinky.jupyterlabServices.mod

import typingsSlinky.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typingsSlinky.jupyterlabServices.terminalRestapiMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/services", "TerminalAPI")
@js.native
object TerminalAPI extends js.Object {
  
  val TERMINAL_SERVICE_URL: /* "api/terminals" */ String = js.native
  
  def isAvailable(): Boolean = js.native
  
  def listRunning(): js.Promise[js.Array[IModel]] = js.native
  def listRunning(settings: ISettings): js.Promise[js.Array[IModel]] = js.native
  
  def shutdownTerminal(name: String): js.Promise[Unit] = js.native
  def shutdownTerminal(name: String, settings: ISettings): js.Promise[Unit] = js.native
  
  def startNew(): js.Promise[IModel] = js.native
  def startNew(settings: ISettings): js.Promise[IModel] = js.native
}
