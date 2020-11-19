package typingsSlinky.jupyterlabServices.mod

import typingsSlinky.jupyterlabServices.kernelRestapiMod.IKernelOptions
import typingsSlinky.jupyterlabServices.kernelRestapiMod.IModel
import typingsSlinky.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/services", "KernelAPI")
@js.native
object KernelAPI extends js.Object {
  
  val KERNEL_SERVICE_URL: /* "api/kernels" */ String = js.native
  
  def getKernelModel(id: String): js.Promise[js.UndefOr[IModel]] = js.native
  def getKernelModel(id: String, settings: ISettings): js.Promise[js.UndefOr[IModel]] = js.native
  
  def interruptKernel(id: String): js.Promise[Unit] = js.native
  def interruptKernel(id: String, settings: ISettings): js.Promise[Unit] = js.native
  
  def listRunning(): js.Promise[js.Array[IModel]] = js.native
  def listRunning(settings: ISettings): js.Promise[js.Array[IModel]] = js.native
  
  def restartKernel(id: String): js.Promise[Unit] = js.native
  def restartKernel(id: String, settings: ISettings): js.Promise[Unit] = js.native
  
  def shutdownKernel(id: String): js.Promise[Unit] = js.native
  def shutdownKernel(id: String, settings: ISettings): js.Promise[Unit] = js.native
  
  def startNew(): js.Promise[IModel] = js.native
  def startNew(options: js.UndefOr[scala.Nothing], settings: ISettings): js.Promise[IModel] = js.native
  def startNew(options: IKernelOptions): js.Promise[IModel] = js.native
  def startNew(options: IKernelOptions, settings: ISettings): js.Promise[IModel] = js.native
}
