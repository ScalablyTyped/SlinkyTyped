package typingsSlinky.fluentuiDateTimeUtilities

import typingsSlinky.fluentuiDateTimeUtilities.dateFormattingTypesMod.ICalendarStrings
import typingsSlinky.fluentuiDateTimeUtilities.dateFormattingTypesMod.IDateFormatting
import typingsSlinky.fluentuiDateTimeUtilities.dateFormattingTypesMod.IDateGridStrings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@fluentui/date-time-utilities/lib/dateFormatting", JSImport.Namespace)
@js.native
object dateFormattingMod extends js.Object {
  val DEFAULT_CALENDAR_STRINGS: ICalendarStrings = js.native
  val DEFAULT_DATE_FORMATTING: IDateFormatting = js.native
  val DEFAULT_LOCALIZED_STRINGS: IDateGridStrings = js.native
  def formatDay(date: js.Date): String = js.native
  def formatMonthDayYear(date: js.Date, strings: IDateGridStrings): String = js.native
  def formatMonthYear(date: js.Date, strings: IDateGridStrings): String = js.native
  def formatYear(date: js.Date): String = js.native
}

