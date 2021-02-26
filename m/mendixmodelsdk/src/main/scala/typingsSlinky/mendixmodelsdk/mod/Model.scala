package typingsSlinky.mendixmodelsdk.mod

import typingsSlinky.mendixmodelsdk.commonMod.common.IErrorCallback
import typingsSlinky.mendixmodelsdk.configurationMod.configuration.ISdkConfig
import typingsSlinky.mendixmodelsdk.imodelserverclientMod.IModelServerClient
import typingsSlinky.mendixmodelsdk.modelMod.IModel
import typingsSlinky.mendixmodelsdk.modelSdkClientImplMod.ModelSdkClientImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "Model")
@js.native
class Model protected ()
  extends typingsSlinky.mendixmodelsdk.modelMod.Model {
  def this(_client: IModelServerClient, _errorHandler: IErrorCallback) = this()
}
/* static members */
object Model {
  
  @JSImport("mendixmodelsdk", "Model.createSdkClient")
  @js.native
  def createSdkClient(connectionConfig: ISdkConfig): ModelSdkClientImpl[IModel, typingsSlinky.mendixmodelsdk.modelMod.Model] = js.native
}
