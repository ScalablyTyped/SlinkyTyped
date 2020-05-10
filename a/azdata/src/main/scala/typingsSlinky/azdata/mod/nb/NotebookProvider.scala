package typingsSlinky.azdata.mod.nb

import typingsSlinky.vscode.Thenable
import typingsSlinky.vscode.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotebookProvider extends js.Object {
  val providerId: String = js.native
  val standardKernels: js.Array[IStandardKernel] = js.native
  def getNotebookManager(notebookUri: Uri): Thenable[NotebookManager] = js.native
  def handleNotebookClosed(notebookUri: Uri): Unit = js.native
}

object NotebookProvider {
  @scala.inline
  def apply(
    getNotebookManager: Uri => Thenable[NotebookManager],
    handleNotebookClosed: Uri => Unit,
    providerId: String,
    standardKernels: js.Array[IStandardKernel]
  ): NotebookProvider = {
    val __obj = js.Dynamic.literal(getNotebookManager = js.Any.fromFunction1(getNotebookManager), handleNotebookClosed = js.Any.fromFunction1(handleNotebookClosed), providerId = providerId.asInstanceOf[js.Any], standardKernels = standardKernels.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookProvider]
  }
  @scala.inline
  implicit class NotebookProviderOps[Self <: NotebookProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetNotebookManager(value: Uri => Thenable[NotebookManager]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNotebookManager")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHandleNotebookClosed(value: Uri => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleNotebookClosed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withProviderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStandardKernels(value: js.Array[IStandardKernel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardKernels")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

