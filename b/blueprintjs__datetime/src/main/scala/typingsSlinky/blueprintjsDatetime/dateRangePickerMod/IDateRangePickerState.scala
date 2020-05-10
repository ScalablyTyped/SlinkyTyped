package typingsSlinky.blueprintjsDatetime.dateRangePickerMod

import typingsSlinky.blueprintjsDatetime.dateUtilsMod.DateRange
import typingsSlinky.blueprintjsDatetime.monthAndYearMod.MonthAndYear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDateRangePickerState extends js.Object {
  var hoverValue: js.UndefOr[DateRange] = js.native
  var leftView: js.UndefOr[MonthAndYear] = js.native
  var rightView: js.UndefOr[MonthAndYear] = js.native
  var selectedShortcutIndex: js.UndefOr[Double] = js.native
  var time: js.UndefOr[DateRange] = js.native
  var value: js.UndefOr[DateRange] = js.native
}

object IDateRangePickerState {
  @scala.inline
  def apply(): IDateRangePickerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDateRangePickerState]
  }
  @scala.inline
  implicit class IDateRangePickerStateOps[Self <: IDateRangePickerState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHoverValue(value: DateRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverValue")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftView(value: MonthAndYear): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftView")(js.undefined)
        ret
    }
    @scala.inline
    def withRightView(value: MonthAndYear): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightView")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedShortcutIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedShortcutIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedShortcutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedShortcutIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withTime(value: DateRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: DateRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

