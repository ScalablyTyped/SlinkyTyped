package typingsSlinky.reactDateRange.mod

import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarTheme extends js.Object {
  var Calendar: js.UndefOr[CSSProperties] = js.native
  var DateRange: js.UndefOr[CSSProperties] = js.native
  var Day: js.UndefOr[CSSProperties] = js.native
  var DayActive: js.UndefOr[CSSProperties] = js.native
  var DayEndEdge: js.UndefOr[CSSProperties] = js.native
  var DayHover: js.UndefOr[CSSProperties] = js.native
  var DayInRange: js.UndefOr[CSSProperties] = js.native
  var DayPassive: js.UndefOr[CSSProperties] = js.native
  var DaySelected: js.UndefOr[CSSProperties] = js.native
  var DaySpecialDay: js.UndefOr[CSSProperties] = js.native
  var DayStartEdge: js.UndefOr[CSSProperties] = js.native
  var DaySunday: js.UndefOr[CSSProperties] = js.native
  var DayToday: js.UndefOr[CSSProperties] = js.native
  var MonthAndYear: js.UndefOr[CSSProperties] = js.native
  var MonthArrow: js.UndefOr[CSSProperties] = js.native
  var MonthArrowNext: js.UndefOr[CSSProperties] = js.native
  var MonthArrowPrev: js.UndefOr[CSSProperties] = js.native
  var MonthButton: js.UndefOr[CSSProperties] = js.native
  var PredefinedRanges: js.UndefOr[CSSProperties] = js.native
  var PredefinedRangesItem: js.UndefOr[CSSProperties] = js.native
  var PredefinedRangesItemActive: js.UndefOr[CSSProperties] = js.native
  var Weekday: js.UndefOr[CSSProperties] = js.native
}

object CalendarTheme {
  @scala.inline
  def apply(): CalendarTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarTheme]
  }
  @scala.inline
  implicit class CalendarThemeOps[Self <: CalendarTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalendar(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Calendar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Calendar")(js.undefined)
        ret
    }
    @scala.inline
    def withDateRange(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateRange")(js.undefined)
        ret
    }
    @scala.inline
    def withDay(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Day")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Day")(js.undefined)
        ret
    }
    @scala.inline
    def withDayActive(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DayActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DayActive")(js.undefined)
        ret
    }
    @scala.inline
    def withDayEndEdge(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DayEndEdge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayEndEdge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DayEndEdge")(js.undefined)
        ret
    }
    @scala.inline
    def withDayHover(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DayHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DayHover")(js.undefined)
        ret
    }
    @scala.inline
    def withDayInRange(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DayInRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayInRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DayInRange")(js.undefined)
        ret
    }
    @scala.inline
    def withDayPassive(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DayPassive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayPassive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DayPassive")(js.undefined)
        ret
    }
    @scala.inline
    def withDaySelected(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DaySelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDaySelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DaySelected")(js.undefined)
        ret
    }
    @scala.inline
    def withDaySpecialDay(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DaySpecialDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDaySpecialDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DaySpecialDay")(js.undefined)
        ret
    }
    @scala.inline
    def withDayStartEdge(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DayStartEdge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayStartEdge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DayStartEdge")(js.undefined)
        ret
    }
    @scala.inline
    def withDaySunday(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DaySunday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDaySunday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DaySunday")(js.undefined)
        ret
    }
    @scala.inline
    def withDayToday(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DayToday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayToday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DayToday")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthAndYear(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonthAndYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthAndYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonthAndYear")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthArrow(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonthArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonthArrow")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthArrowNext(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonthArrowNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthArrowNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonthArrowNext")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthArrowPrev(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonthArrowPrev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthArrowPrev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonthArrowPrev")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthButton(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonthButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonthButton")(js.undefined)
        ret
    }
    @scala.inline
    def withPredefinedRanges(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PredefinedRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPredefinedRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PredefinedRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withPredefinedRangesItem(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PredefinedRangesItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPredefinedRangesItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PredefinedRangesItem")(js.undefined)
        ret
    }
    @scala.inline
    def withPredefinedRangesItemActive(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PredefinedRangesItemActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPredefinedRangesItemActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PredefinedRangesItemActive")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekday(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Weekday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Weekday")(js.undefined)
        ret
    }
  }
  
}

