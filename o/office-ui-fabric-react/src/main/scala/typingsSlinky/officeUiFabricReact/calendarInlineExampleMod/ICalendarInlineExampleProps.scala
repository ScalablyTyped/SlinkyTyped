package typingsSlinky.officeUiFabricReact.calendarInlineExampleMod

import typingsSlinky.officeUiFabricReact.dateValuesMod.DateRangeType
import typingsSlinky.officeUiFabricReact.dateValuesMod.DayOfWeek
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalendarInlineExampleProps extends js.Object {
  var autoNavigateOnSelection: Boolean = js.native
  var dateRangeType: DateRangeType = js.native
  var firstDayOfWeek: js.UndefOr[DayOfWeek] = js.native
  var highlightCurrentMonth: js.UndefOr[Boolean] = js.native
  var highlightSelectedMonth: js.UndefOr[Boolean] = js.native
  var isDayPickerVisible: js.UndefOr[Boolean] = js.native
  var isMonthPickerVisible: js.UndefOr[Boolean] = js.native
  var maxDate: js.UndefOr[js.Date] = js.native
  var minDate: js.UndefOr[js.Date] = js.native
  var restrictedDates: js.UndefOr[js.Array[js.Date]] = js.native
  var showGoToToday: Boolean = js.native
  var showMonthPickerAsOverlay: js.UndefOr[Boolean] = js.native
  var showNavigateButtons: js.UndefOr[Boolean] = js.native
  var showSixWeeksByDefault: js.UndefOr[Boolean] = js.native
  var showWeekNumbers: js.UndefOr[Boolean] = js.native
  var workWeekDays: js.UndefOr[js.Array[DayOfWeek]] = js.native
}

object ICalendarInlineExampleProps {
  @scala.inline
  def apply(autoNavigateOnSelection: Boolean, dateRangeType: DateRangeType, showGoToToday: Boolean): ICalendarInlineExampleProps = {
    val __obj = js.Dynamic.literal(autoNavigateOnSelection = autoNavigateOnSelection.asInstanceOf[js.Any], dateRangeType = dateRangeType.asInstanceOf[js.Any], showGoToToday = showGoToToday.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalendarInlineExampleProps]
  }
  @scala.inline
  implicit class ICalendarInlineExamplePropsOps[Self <: ICalendarInlineExampleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoNavigateOnSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoNavigateOnSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateRangeType(value: DateRangeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateRangeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowGoToToday(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGoToToday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstDayOfWeek(value: DayOfWeek): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDayOfWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstDayOfWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDayOfWeek")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightCurrentMonth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightCurrentMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightCurrentMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightCurrentMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightSelectedMonth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightSelectedMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightSelectedMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightSelectedMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDayPickerVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDayPickerVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDayPickerVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDayPickerVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMonthPickerVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMonthPickerVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMonthPickerVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMonthPickerVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(js.undefined)
        ret
    }
    @scala.inline
    def withRestrictedDates(value: js.Array[js.Date]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictedDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictedDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictedDates")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMonthPickerAsOverlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMonthPickerAsOverlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMonthPickerAsOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMonthPickerAsOverlay")(js.undefined)
        ret
    }
    @scala.inline
    def withShowNavigateButtons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNavigateButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowNavigateButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNavigateButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSixWeeksByDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSixWeeksByDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSixWeeksByDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSixWeeksByDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withShowWeekNumbers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWeekNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowWeekNumbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWeekNumbers")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkWeekDays(value: js.Array[DayOfWeek]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workWeekDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkWeekDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workWeekDays")(js.undefined)
        ret
    }
  }
  
}

