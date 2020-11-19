package typingsSlinky.jupyterlabServices.kernelRestapiMod

import typingsSlinky.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/services/lib/kernel/restapi", "shutdownKernel")
@js.native
object shutdownKernel extends js.Object {
  
  def apply(id: String): js.Promise[Unit] = js.native
  def apply(id: String, settings: ISettings): js.Promise[Unit] = js.native
}
