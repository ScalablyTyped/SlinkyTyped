package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditRow extends js.Object {
  var cells: js.Array[DbCellValue] = js.native
  var id: Double = js.native
  var isDirty: Boolean = js.native
  var state: EditRowState = js.native
}

object EditRow {
  @scala.inline
  def apply(cells: js.Array[DbCellValue], id: Double, isDirty: Boolean, state: EditRowState): EditRow = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDirty = isDirty.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditRow]
  }
  @scala.inline
  implicit class EditRowOps[Self <: EditRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCells(value: js.Array[DbCellValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDirty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDirty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: EditRowState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

