package typingsSlinky.fluentuiDateTimeUtilities

import typingsSlinky.fluentuiDateTimeUtilities.dateFormattingTypesMod.ICalendarStrings
import typingsSlinky.fluentuiDateTimeUtilities.dateFormattingTypesMod.IDateFormatting
import typingsSlinky.fluentuiDateTimeUtilities.dateFormattingTypesMod.IDateGridStrings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateFormattingMod {
  
  @JSImport("@fluentui/date-time-utilities/lib/dateFormatting", "DEFAULT_CALENDAR_STRINGS")
  @js.native
  val DEFAULT_CALENDAR_STRINGS: ICalendarStrings = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateFormatting", "DEFAULT_DATE_FORMATTING")
  @js.native
  val DEFAULT_DATE_FORMATTING: IDateFormatting = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateFormatting", "DEFAULT_LOCALIZED_STRINGS")
  @js.native
  val DEFAULT_LOCALIZED_STRINGS: IDateGridStrings = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateFormatting", "formatDay")
  @js.native
  def formatDay(date: js.Date): String = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateFormatting", "formatMonthDayYear")
  @js.native
  def formatMonthDayYear(date: js.Date, strings: IDateGridStrings): String = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateFormatting", "formatMonthYear")
  @js.native
  def formatMonthYear(date: js.Date, strings: IDateGridStrings): String = js.native
  
  @JSImport("@fluentui/date-time-utilities/lib/dateFormatting", "formatYear")
  @js.native
  def formatYear(date: js.Date): String = js.native
}
