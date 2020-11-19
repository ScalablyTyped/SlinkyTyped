package typingsSlinky.jupyterlabServices.kernelRestapiMod

import typingsSlinky.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/services/lib/kernel/restapi", "startNew")
@js.native
object startNew extends js.Object {
  
  def apply(): js.Promise[IModel] = js.native
  def apply(options: js.UndefOr[scala.Nothing], settings: ISettings): js.Promise[IModel] = js.native
  def apply(options: IKernelOptions): js.Promise[IModel] = js.native
  def apply(options: IKernelOptions, settings: ISettings): js.Promise[IModel] = js.native
}
