package typingsSlinky.powerappsComponentFramework.ComponentFramework.UserSettingApi

import typingsSlinky.powerappsComponentFramework.ComponentFramework.UserSettingApi.Types.DayOfWeek
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The interface for Org Date Format Info exposed to a custom control
		 * Result pattern is based on culture,examples are for 'USA' area
		 */
@js.native
trait DateFormattingInfo extends js.Object {
  /**
  			 * @example { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" }
  			 */
  var abbreviatedDayNames: js.Array[String] = js.native
  /**
  			 * @example { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", "" }
  			 */
  var abbreviatedMonthGenitiveNames: js.Array[String] = js.native
  /**
  			 * @example { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", "" }
  			 */
  var abbreviatedMonthNames: js.Array[String] = js.native
  /**
  			 * @example "AM"
  			 */
  var amDesignator: String = js.native
  /**
  			 * @example See interface Calendar
  			 */
  var calendar: Calendar = js.native
  /**
  			 * @example 0
  			 */
  var calendarWeekRule: Double = js.native
  /**
  			 * @example "/"
  			 */
  var dateSeparator: String = js.native
  /**
  			 * @example { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" }
  			 */
  var dayNames: js.Array[String] = js.native
  /**
  			 * @example See interface DayOfWeek
  			 */
  var firstDayOfWeek: DayOfWeek = js.native
  /**
  			 * @example "dddd, MMMM d, yyyy h:mm:ss tt"
  			 */
  var fullDateTimePattern: String = js.native
  /**
  			 * @example "dddd, MMMM d, yyyy"
  			 */
  var longDatePattern: String = js.native
  /**
  			 * @example "hh:mm:ss tt"
  			 */
  var longTimePattern: String = js.native
  /**
  			 * @example "MMMM dd"
  			 */
  var monthDayPattern: String = js.native
  /**
  			 * @example { "January", "February", "March", ...  "December", "" }
  			 */
  var monthGenitiveNames: js.Array[String] = js.native
  /**
  			 * @example { "January", "February", "March", ...  "December", "" }
  			 */
  var monthNames: js.Array[String] = js.native
  /**
  			 * @example "PM"
  			 */
  var pmDesignator: String = js.native
  /**
  			 * @example "M/d/yyyy"
  			 */
  var shortDatePattern: String = js.native
  /**
  			 * @example "h:mm tt"
  			 */
  var shortTimePattern: String = js.native
  /**
  			 * @example { "Su", "Mo", "Tu", "We", "Th", "Fr", "Sa" }
  			 */
  var shortestDayNames: js.Array[String] = js.native
  /**
  			 * @example "yyyy'-'MM'-'dd'T'HH':'mm':'ss"
  			 */
  var sortableDateTimePattern: String = js.native
  /**
  			 * @example ":"
  			 */
  var timeSeparator: String = js.native
  /**
  			 * @example "yyyy'-'MM'-'dd HH':'mm':'ss'Z'"
  			 */
  var universalSortableDateTimePattern: String = js.native
  /**
  			 * @example "MMMM yyyy"
  			 */
  var yearMonthPattern: String = js.native
}

object DateFormattingInfo {
  @scala.inline
  def apply(
    abbreviatedDayNames: js.Array[String],
    abbreviatedMonthGenitiveNames: js.Array[String],
    abbreviatedMonthNames: js.Array[String],
    amDesignator: String,
    calendar: Calendar,
    calendarWeekRule: Double,
    dateSeparator: String,
    dayNames: js.Array[String],
    firstDayOfWeek: DayOfWeek,
    fullDateTimePattern: String,
    longDatePattern: String,
    longTimePattern: String,
    monthDayPattern: String,
    monthGenitiveNames: js.Array[String],
    monthNames: js.Array[String],
    pmDesignator: String,
    shortDatePattern: String,
    shortTimePattern: String,
    shortestDayNames: js.Array[String],
    sortableDateTimePattern: String,
    timeSeparator: String,
    universalSortableDateTimePattern: String,
    yearMonthPattern: String
  ): DateFormattingInfo = {
    val __obj = js.Dynamic.literal(abbreviatedDayNames = abbreviatedDayNames.asInstanceOf[js.Any], abbreviatedMonthGenitiveNames = abbreviatedMonthGenitiveNames.asInstanceOf[js.Any], abbreviatedMonthNames = abbreviatedMonthNames.asInstanceOf[js.Any], amDesignator = amDesignator.asInstanceOf[js.Any], calendar = calendar.asInstanceOf[js.Any], calendarWeekRule = calendarWeekRule.asInstanceOf[js.Any], dateSeparator = dateSeparator.asInstanceOf[js.Any], dayNames = dayNames.asInstanceOf[js.Any], firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any], fullDateTimePattern = fullDateTimePattern.asInstanceOf[js.Any], longDatePattern = longDatePattern.asInstanceOf[js.Any], longTimePattern = longTimePattern.asInstanceOf[js.Any], monthDayPattern = monthDayPattern.asInstanceOf[js.Any], monthGenitiveNames = monthGenitiveNames.asInstanceOf[js.Any], monthNames = monthNames.asInstanceOf[js.Any], pmDesignator = pmDesignator.asInstanceOf[js.Any], shortDatePattern = shortDatePattern.asInstanceOf[js.Any], shortTimePattern = shortTimePattern.asInstanceOf[js.Any], shortestDayNames = shortestDayNames.asInstanceOf[js.Any], sortableDateTimePattern = sortableDateTimePattern.asInstanceOf[js.Any], timeSeparator = timeSeparator.asInstanceOf[js.Any], universalSortableDateTimePattern = universalSortableDateTimePattern.asInstanceOf[js.Any], yearMonthPattern = yearMonthPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateFormattingInfo]
  }
  @scala.inline
  implicit class DateFormattingInfoOps[Self <: DateFormattingInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbbreviatedDayNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abbreviatedDayNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAbbreviatedMonthGenitiveNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abbreviatedMonthGenitiveNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAbbreviatedMonthNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abbreviatedMonthNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAmDesignator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amDesignator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalendar(value: Calendar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalendarWeekRule(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarWeekRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDayNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstDayOfWeek(value: DayOfWeek): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDayOfWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullDateTimePattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullDateTimePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongDatePattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longDatePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongTimePattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longTimePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonthDayPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthDayPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonthGenitiveNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthGenitiveNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonthNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPmDesignator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pmDesignator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortDatePattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortDatePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortTimePattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortTimePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortestDayNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortestDayNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortableDateTimePattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortableDateTimePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniversalSortableDateTimePattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("universalSortableDateTimePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYearMonthPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearMonthPattern")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

