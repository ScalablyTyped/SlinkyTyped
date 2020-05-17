package typingsSlinky.googleVisualization.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellColor extends js.Object {
  var cellColor: js.Object = js.native
  var cellSize: Double = js.native
  var dayOfWeekLabel: js.Object = js.native
  var dayOfWeekRightSpace: Double = js.native
  var daysOfWeek: String = js.native
  var focusedCellColor: js.Object = js.native
  var monthLabel: js.Object = js.native
  var monthOutlineColor: js.Object = js.native
  var underMonthSpace: Double = js.native
  var underYearSpace: Double = js.native
  var unusedMonthOutlineColor: js.Object = js.native
}

object CellColor {
  @scala.inline
  def apply(
    cellColor: js.Object,
    cellSize: Double,
    dayOfWeekLabel: js.Object,
    dayOfWeekRightSpace: Double,
    daysOfWeek: String,
    focusedCellColor: js.Object,
    monthLabel: js.Object,
    monthOutlineColor: js.Object,
    underMonthSpace: Double,
    underYearSpace: Double,
    unusedMonthOutlineColor: js.Object
  ): CellColor = {
    val __obj = js.Dynamic.literal(cellColor = cellColor.asInstanceOf[js.Any], cellSize = cellSize.asInstanceOf[js.Any], dayOfWeekLabel = dayOfWeekLabel.asInstanceOf[js.Any], dayOfWeekRightSpace = dayOfWeekRightSpace.asInstanceOf[js.Any], daysOfWeek = daysOfWeek.asInstanceOf[js.Any], focusedCellColor = focusedCellColor.asInstanceOf[js.Any], monthLabel = monthLabel.asInstanceOf[js.Any], monthOutlineColor = monthOutlineColor.asInstanceOf[js.Any], underMonthSpace = underMonthSpace.asInstanceOf[js.Any], underYearSpace = underYearSpace.asInstanceOf[js.Any], unusedMonthOutlineColor = unusedMonthOutlineColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellColor]
  }
  @scala.inline
  implicit class CellColorOps[Self <: CellColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellColor(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDayOfWeekLabel(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayOfWeekLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDayOfWeekRightSpace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayOfWeekRightSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDaysOfWeek(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysOfWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocusedCellColor(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusedCellColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonthLabel(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonthOutlineColor(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthOutlineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnderMonthSpace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underMonthSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnderYearSpace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underYearSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnusedMonthOutlineColor(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unusedMonthOutlineColor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

