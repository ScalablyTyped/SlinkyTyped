package typingsSlinky.jupyterlabNotebook.anon

import typingsSlinky.jupyterlabNotebook.widgetMod.Notebook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cell extends js.Object {
  var cell: typingsSlinky.jupyterlabCells.mod.Cell = js.native
  var notebook: Notebook = js.native
}

object Cell {
  @scala.inline
  def apply(cell: typingsSlinky.jupyterlabCells.mod.Cell, notebook: Notebook): Cell = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], notebook = notebook.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cell]
  }
  @scala.inline
  implicit class CellOps[Self <: Cell] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCell(value: typingsSlinky.jupyterlabCells.mod.Cell): Self = {
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

