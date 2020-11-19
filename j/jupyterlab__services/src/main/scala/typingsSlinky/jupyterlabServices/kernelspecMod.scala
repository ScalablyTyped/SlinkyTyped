package typingsSlinky.jupyterlabServices

import typingsSlinky.jupyterlabServices.managerMod.KernelSpecManager.IOptions
import typingsSlinky.jupyterlabServices.restapiMod.ISpecModels
import typingsSlinky.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/services/lib/kernelspec", JSImport.Namespace)
@js.native
object kernelspecMod extends js.Object {
  
  @js.native
  object KernelSpecAPI extends js.Object {
    
    def getSpecs(): js.Promise[ISpecModels] = js.native
    def getSpecs(settings: ISettings): js.Promise[ISpecModels] = js.native
  }
  
  @js.native
  /**
    * Construct a new kernel spec manager.
    *
    * @param options - The default options for kernel.
    */
  class KernelSpecManager ()
    extends typingsSlinky.jupyterlabServices.managerMod.KernelSpecManager {
    def this(options: IOptions) = this()
  }
}
