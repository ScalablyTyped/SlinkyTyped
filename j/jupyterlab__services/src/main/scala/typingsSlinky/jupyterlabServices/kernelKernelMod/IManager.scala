package typingsSlinky.jupyterlabServices.kernelKernelMod

import typingsSlinky.jupyterlabServices.anon.OmitIOptionsmodelserverSe
import typingsSlinky.jupyterlabServices.kernelKernelMod.IKernelConnection.IOptions
import typingsSlinky.jupyterlabServices.kernelRestapiMod.IKernelOptions
import typingsSlinky.jupyterlabServices.kernelRestapiMod.IModel
import typingsSlinky.luminoAlgorithm.iterMod.IIterator
import typingsSlinky.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IManager
  extends typingsSlinky.jupyterlabServices.basemanagerMod.IManager {
  
  /**
    * Connect to an existing kernel.
    *
    * @param model - The model of the target kernel.
    *
    * @returns A promise that resolves with the new kernel instance.
    */
  def connectTo(options: IOptions): IKernelConnection = js.native
  
  /**
    * Find a kernel by id.
    *
    * @param id - The id of the target kernel.
    *
    * @returns A promise that resolves with the kernel's model, or undefined if not found.
    */
  def findById(id: String): js.Promise[js.UndefOr[IModel]] = js.native
  
  /**
    * Force a refresh of the running kernels.
    *
    * @returns A promise that resolves when the models are refreshed.
    *
    * #### Notes
    * This is intended to be called only in response to a user action,
    * since the manager maintains its internal state.
    */
  def refreshRunning(): js.Promise[Unit] = js.native
  
  /**
    * Create an iterator over the known running kernels.
    *
    * @returns A new iterator over the running kernels.
    */
  def running(): IIterator[IModel] = js.native
  
  /**
    * A signal emitted when the running kernels change.
    */
  var runningChanged: ISignal[IManager, js.Array[IModel]] = js.native
  
  /**
    * Shut down a kernel by id.
    *
    * @param id - The id of the target kernel.
    *
    * @returns A promise that resolves when the operation is complete.
    */
  def shutdown(id: String): js.Promise[Unit] = js.native
  
  /**
    * Shut down all kernels.
    *
    * @returns A promise that resolves when all of the kernels are shut down.
    */
  def shutdownAll(): js.Promise[Unit] = js.native
  
  /**
    * Start a new kernel.
    *
    * @param createOptions - The kernel creation options
    *
    * @param connectOptions - The kernel connection options
    *
    * @returns A promise that resolves with the kernel connection.
    *
    * #### Notes
    * The manager `serverSettings` will be always be used.
    */
  def startNew(): js.Promise[IKernelConnection] = js.native
  def startNew(createOptions: js.UndefOr[scala.Nothing], connectOptions: OmitIOptionsmodelserverSe): js.Promise[IKernelConnection] = js.native
  def startNew(createOptions: IKernelOptions): js.Promise[IKernelConnection] = js.native
  def startNew(createOptions: IKernelOptions, connectOptions: OmitIOptionsmodelserverSe): js.Promise[IKernelConnection] = js.native
}
