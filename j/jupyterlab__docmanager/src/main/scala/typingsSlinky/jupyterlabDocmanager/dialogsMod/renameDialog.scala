package typingsSlinky.jupyterlabDocmanager.dialogsMod

import typingsSlinky.jupyterlabDocmanager.tokensMod.IDocumentManager
import typingsSlinky.jupyterlabServices.contentsMod.Contents.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docmanager/lib/dialogs", "renameDialog")
@js.native
object renameDialog extends js.Object {
  def apply(manager: IDocumentManager, oldPath: String): js.Promise[IModel | Null] = js.native
}

