package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditCellResult extends js.Object {
  var cell: EditCell = js.native
  var isRowDirty: Boolean = js.native
}

object EditCellResult {
  @scala.inline
  def apply(cell: EditCell, isRowDirty: Boolean): EditCellResult = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], isRowDirty = isRowDirty.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditCellResult]
  }
  @scala.inline
  implicit class EditCellResultOps[Self <: EditCellResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCell(value: EditCell): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRowDirty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRowDirty")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

