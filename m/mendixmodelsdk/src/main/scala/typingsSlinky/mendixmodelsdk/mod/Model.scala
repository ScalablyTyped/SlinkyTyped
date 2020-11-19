package typingsSlinky.mendixmodelsdk.mod

import typingsSlinky.mendixmodelsdk.configurationMod.configuration.ISdkConfig
import typingsSlinky.mendixmodelsdk.modelMod.IModel
import typingsSlinky.mendixmodelsdk.modelSdkClientImplMod.ModelSdkClientImpl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "Model")
@js.native
class Model ()
  extends typingsSlinky.mendixmodelsdk.modelMod.Model
/* static members */
@JSImport("mendixmodelsdk", "Model")
@js.native
object Model extends js.Object {
  
  def createSdkClient(connectionConfig: ISdkConfig): ModelSdkClientImpl[IModel, typingsSlinky.mendixmodelsdk.modelMod.Model] = js.native
}
