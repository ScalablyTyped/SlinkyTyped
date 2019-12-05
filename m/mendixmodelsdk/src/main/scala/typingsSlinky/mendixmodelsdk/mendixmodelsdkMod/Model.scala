package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod

import typingsSlinky.mendixmodelsdk.distModelMod.IModel
import typingsSlinky.mendixmodelsdk.distModelSdkClientImplMod.ModelSdkClientImpl
import typingsSlinky.mendixmodelsdk.distSdkConfigurationMod.configuration.ISdkConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "Model")
@js.native
class Model ()
  extends typingsSlinky.mendixmodelsdk.distModelMod.Model

/* static members */
@JSImport("mendixmodelsdk", "Model")
@js.native
object Model extends js.Object {
  def createSdkClient(connectionConfig: ISdkConfig): ModelSdkClientImpl[IModel, typingsSlinky.mendixmodelsdk.distModelMod.Model] = js.native
}

