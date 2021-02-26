package typingsSlinky.jupyterlabServices

import typingsSlinky.jupyterlabServices.managerMod.KernelSpecManager.IOptions
import typingsSlinky.jupyterlabServices.restapiMod.ISpecModels
import typingsSlinky.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kernelspecMod {
  
  object KernelSpecAPI {
    
    @JSImport("@jupyterlab/services/lib/kernelspec", "KernelSpecAPI.getSpecs")
    @js.native
    def getSpecs(): js.Promise[ISpecModels] = js.native
    @JSImport("@jupyterlab/services/lib/kernelspec", "KernelSpecAPI.getSpecs")
    @js.native
    def getSpecs(settings: ISettings): js.Promise[ISpecModels] = js.native
  }
  
  @JSImport("@jupyterlab/services/lib/kernelspec", "KernelSpecManager")
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
