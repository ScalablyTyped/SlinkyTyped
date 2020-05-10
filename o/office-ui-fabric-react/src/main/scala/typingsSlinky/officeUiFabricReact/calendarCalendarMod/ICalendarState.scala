package typingsSlinky.officeUiFabricReact.calendarCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalendarState extends js.Object {
  /** State used to show/hide day picker */
  var isDayPickerVisible: js.UndefOr[Boolean] = js.native
  /** State used to show/hide month picker */
  var isMonthPickerVisible: js.UndefOr[Boolean] = js.native
  /** The currently focused date in the day picker, but not necessarily selected */
  var navigatedDayDate: js.UndefOr[js.Date] = js.native
  /** The currently focused date in the month picker, but not necessarily selected */
  var navigatedMonthDate: js.UndefOr[js.Date] = js.native
  /** The currently selected date in the calendar */
  var selectedDate: js.UndefOr[js.Date] = js.native
}

object ICalendarState {
  @scala.inline
  def apply(): ICalendarState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICalendarState]
  }
  @scala.inline
  implicit class ICalendarStateOps[Self <: ICalendarState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withNavigatedDayDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatedDayDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigatedDayDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatedDayDate")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigatedMonthDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatedMonthDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigatedMonthDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatedMonthDate")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDate")(js.undefined)
        ret
    }
  }
  
}

