package typingsSlinky.mendixmodelsdk.internalMod

import typingsSlinky.mendixmodelsdk.AnonHandleError
import typingsSlinky.mendixmodelsdk.imodelserverclientMod.IModelServerClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal", "ModelEventReceiver")
@js.native
class ModelEventReceiver protected ()
  extends typingsSlinky.mendixmodelsdk.modelEventReceiverMod.ModelEventReceiver {
  def this(workingCopyId: String, client: IModelServerClient, errorHandler: AnonHandleError) = this()
}

