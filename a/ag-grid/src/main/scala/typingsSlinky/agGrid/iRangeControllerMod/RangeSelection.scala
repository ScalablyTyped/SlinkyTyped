package typingsSlinky.agGrid.iRangeControllerMod

import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.gridCellMod.GridCell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeSelection extends js.Object {
  var columns: js.Array[Column] = js.native
  var end: GridCell = js.native
  var start: GridCell = js.native
}

object RangeSelection {
  @scala.inline
  def apply(columns: js.Array[Column], end: GridCell, start: GridCell): RangeSelection = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeSelection]
  }
  @scala.inline
  implicit class RangeSelectionOps[Self <: RangeSelection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Array[Column]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: GridCell): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: GridCell): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

