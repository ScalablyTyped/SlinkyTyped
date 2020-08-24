package typingsSlinky.fluentuiDateTimeUtilities.dateFormattingTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDateFormatting extends IDateGridStrings {
  /**
    * Format the day according to specified function.
    * Intended use case is localization.
    */
  def formatDay(date: js.Date): String = js.native
  /**
    * Format the month, day and year according to specified function.
    * Intended use case is localization.
    */
  def formatMonthDayYear(date: js.Date): String = js.native
  /**
    * Format the month and year according to specified function.
    * Intended use case is localization.
    */
  def formatMonthYear(date: js.Date): String = js.native
  /**
    * Format the year according to specified function.
    * Intended use case is localization.
    */
  def formatYear(date: js.Date): String = js.native
  /**
    * Parse date from string representation into Date type.
    */
  def parseDate(date: String): js.Date | Null = js.native
}

object IDateFormatting {
  @scala.inline
  def apply(
    days: js.Array[String],
    formatDay: js.Date => String,
    formatMonthDayYear: js.Date => String,
    formatMonthYear: js.Date => String,
    formatYear: js.Date => String,
    months: js.Array[String],
    parseDate: String => js.Date | Null,
    shortDays: js.Array[String],
    shortMonths: js.Array[String]
  ): IDateFormatting = {
    val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], formatDay = js.Any.fromFunction1(formatDay), formatMonthDayYear = js.Any.fromFunction1(formatMonthDayYear), formatMonthYear = js.Any.fromFunction1(formatMonthYear), formatYear = js.Any.fromFunction1(formatYear), months = months.asInstanceOf[js.Any], parseDate = js.Any.fromFunction1(parseDate), shortDays = shortDays.asInstanceOf[js.Any], shortMonths = shortMonths.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDateFormatting]
  }
  @scala.inline
  implicit class IDateFormattingOps[Self <: IDateFormatting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFormatDay(value: js.Date => String): Self = this.set("formatDay", js.Any.fromFunction1(value))
    @scala.inline
    def setFormatMonthDayYear(value: js.Date => String): Self = this.set("formatMonthDayYear", js.Any.fromFunction1(value))
    @scala.inline
    def setFormatMonthYear(value: js.Date => String): Self = this.set("formatMonthYear", js.Any.fromFunction1(value))
    @scala.inline
    def setFormatYear(value: js.Date => String): Self = this.set("formatYear", js.Any.fromFunction1(value))
    @scala.inline
    def setParseDate(value: String => js.Date | Null): Self = this.set("parseDate", js.Any.fromFunction1(value))
  }
  
}

