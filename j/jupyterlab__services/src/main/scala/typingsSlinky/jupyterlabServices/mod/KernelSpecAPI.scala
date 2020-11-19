package typingsSlinky.jupyterlabServices.mod

import typingsSlinky.jupyterlabServices.restapiMod.ISpecModels
import typingsSlinky.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/services", "KernelSpecAPI")
@js.native
object KernelSpecAPI extends js.Object {
  
  def getSpecs(): js.Promise[ISpecModels] = js.native
  def getSpecs(settings: ISettings): js.Promise[ISpecModels] = js.native
}
