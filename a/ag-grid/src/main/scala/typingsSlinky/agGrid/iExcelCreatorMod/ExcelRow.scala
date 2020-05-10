package typingsSlinky.agGrid.iExcelCreatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExcelRow extends js.Object {
  var cells: js.Array[ExcelCell] = js.native
}

object ExcelRow {
  @scala.inline
  def apply(cells: js.Array[ExcelCell]): ExcelRow = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcelRow]
  }
  @scala.inline
  implicit class ExcelRowOps[Self <: ExcelRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCells(value: js.Array[ExcelCell]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cells")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

