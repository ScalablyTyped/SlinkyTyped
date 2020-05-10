package typingsSlinky.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotebookCellChangeEvent extends js.Object {
  /**
  			 * The new value for the [notebook document's cells](#NotebookDocument.cells).
  			 */
  var cells: js.Array[NotebookCell] = js.native
  /**
  			 * The [change kind](#NotebookChangeKind) which has triggered this
  			 * event. Can be `undefined`.
  			 */
  var kind: js.UndefOr[NotebookChangeKind] = js.native
  /**
  			 * The [notebook document](#NotebookDocument) for which the selections have changed.
  			 */
  var notebook: NotebookDocument = js.native
}

object NotebookCellChangeEvent {
  @scala.inline
  def apply(cells: js.Array[NotebookCell], notebook: NotebookDocument): NotebookCellChangeEvent = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], notebook = notebook.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookCellChangeEvent]
  }
  @scala.inline
  implicit class NotebookCellChangeEventOps[Self <: NotebookCellChangeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCells(value: js.Array[NotebookCell]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotebook(value: NotebookDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notebook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: NotebookChangeKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

