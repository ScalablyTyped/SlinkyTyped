package typingsSlinky.azdata.mod.nb

import typingsSlinky.vscode.Thenable
import typingsSlinky.vscode.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azdata", "nb.showNotebookDocument")
@js.native
object showNotebookDocument extends js.Object {
  def apply(uri: Uri): Thenable[NotebookEditor] = js.native
  def apply(uri: Uri, showOptions: NotebookShowOptions): Thenable[NotebookEditor] = js.native
}

