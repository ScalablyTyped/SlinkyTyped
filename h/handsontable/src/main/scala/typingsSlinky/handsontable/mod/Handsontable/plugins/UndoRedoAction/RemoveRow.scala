package typingsSlinky.handsontable.mod.Handsontable.plugins.UndoRedoAction

import typingsSlinky.handsontable.handsontableStrings.remove_row
import typingsSlinky.handsontable.mod.Handsontable.plugins.CellValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveRow extends js.Object {
  var actionType: remove_row = js.native
  var data: js.Array[js.Array[CellValue]] = js.native
  var index: Double = js.native
}

object RemoveRow {
  @scala.inline
  def apply(actionType: remove_row, data: js.Array[js.Array[CellValue]], index: Double): RemoveRow = {
    val __obj = js.Dynamic.literal(actionType = actionType.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveRow]
  }
  @scala.inline
  implicit class RemoveRowOps[Self <: RemoveRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionType(value: remove_row): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Array[js.Array[CellValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

