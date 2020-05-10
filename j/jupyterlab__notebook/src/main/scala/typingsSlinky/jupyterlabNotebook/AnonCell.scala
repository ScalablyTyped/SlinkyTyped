package typingsSlinky.jupyterlabNotebook

import typingsSlinky.jupyterlabCells.mod.Cell
import typingsSlinky.jupyterlabNotebook.widgetMod.Notebook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCell extends js.Object {
  var cell: Cell = js.native
  var notebook: Notebook = js.native
}

object AnonCell {
  @scala.inline
  def apply(cell: Cell, notebook: Notebook): AnonCell = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], notebook = notebook.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCell]
  }
  @scala.inline
  implicit class AnonCellOps[Self <: AnonCell] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCell(value: Cell): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotebook(value: Notebook): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notebook")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

