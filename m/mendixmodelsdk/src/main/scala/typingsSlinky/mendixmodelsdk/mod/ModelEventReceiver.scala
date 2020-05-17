package typingsSlinky.mendixmodelsdk.mod

import typingsSlinky.mendixmodelsdk.anon.HandleError
import typingsSlinky.mendixmodelsdk.imodelserverclientMod.IModelServerClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "ModelEventReceiver")
@js.native
class ModelEventReceiver protected ()
  extends typingsSlinky.mendixmodelsdk.internalMod.ModelEventReceiver {
  def this(workingCopyId: String, client: IModelServerClient, errorHandler: HandleError) = this()
}

