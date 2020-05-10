package typingsSlinky.officeUiFabricReact.calendarTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalendarStrings extends js.Object {
  /**
    * Aria-label for the "close" button.
    */
  var closeButtonAriaLabel: js.UndefOr[String] = js.native
  /**
    * An array of strings for the full names of days of the week.
    * The array is 0-based, so days[0] should be the full name of Sunday.
    */
  var days: js.Array[String] = js.native
  /**
    * String to render for button to direct the user to today's date.
    */
  var goToToday: String = js.native
  /**
    * An array of strings for the full names of months.
    * The array is 0-based, so months[0] should be the full name of January.
    */
  var months: js.Array[String] = js.native
  /**
    * Aria-label for the "next month" button.
    */
  var nextMonthAriaLabel: js.UndefOr[String] = js.native
  /**
    * Aria-label for the "next year" button.
    */
  var nextYearAriaLabel: js.UndefOr[String] = js.native
  /**
    * Aria-label for the "next year range" button.
    */
  var nextYearRangeAriaLabel: js.UndefOr[String] = js.native
  /**
    * Aria-label for the "previous month" button.
    */
  var prevMonthAriaLabel: js.UndefOr[String] = js.native
  /**
    * Aria-label for the "previous year" button.
    */
  var prevYearAriaLabel: js.UndefOr[String] = js.native
  /**
    * Aria-label for the "previous year range" button.
    */
  var prevYearRangeAriaLabel: js.UndefOr[String] = js.native
  /**
    * An array of strings for the initials of the days of the week.
    * The array is 0-based, so days[0] should be the initial of Sunday.
    */
  var shortDays: js.Array[String] = js.native
  /**
    * An array of strings for the short names of months.
    * The array is 0-based, so shortMonths[0] should be the short name of January.
    */
  var shortMonths: js.Array[String] = js.native
  /**
    * Aria-label format string for the week number header. Should have 1 string param e.g. "week number \{0\}"
    */
  var weekNumberFormatString: js.UndefOr[String] = js.native
}

object ICalendarStrings {
  @scala.inline
  def apply(
    days: js.Array[String],
    goToToday: String,
    months: js.Array[String],
    shortDays: js.Array[String],
    shortMonths: js.Array[String]
  ): ICalendarStrings = {
    val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], goToToday = goToToday.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], shortDays = shortDays.asInstanceOf[js.Any], shortMonths = shortMonths.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalendarStrings]
  }
  @scala.inline
  implicit class ICalendarStringsOps[Self <: ICalendarStrings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDays(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("days")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGoToToday(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goToToday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("months")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortDays(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortMonths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortMonths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloseButtonAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeButtonAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseButtonAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeButtonAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withNextMonthAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextMonthAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextMonthAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextMonthAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withNextYearAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextYearAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextYearAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextYearAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withNextYearRangeAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextYearRangeAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextYearRangeAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextYearRangeAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevMonthAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevMonthAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevMonthAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevMonthAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevYearAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevYearAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevYearAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevYearAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevYearRangeAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevYearRangeAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevYearRangeAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevYearRangeAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekNumberFormatString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekNumberFormatString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekNumberFormatString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekNumberFormatString")(js.undefined)
        ret
    }
  }
  
}

