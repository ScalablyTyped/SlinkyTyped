package typingsSlinky.officeDashUiDashFabricDashReact.libComponentsCalendarCalendarDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalendarFormatDateCallbacks extends js.Object {
  /**
    * Callback to apply formatting to the days in the Day Picker calendar
    */
  def formatDay(date: js.Date): String = js.native
  /**
    * Callback to apply formatting to mmmm d, yyyy formated dates
    */
  def formatMonthDayYear(date: js.Date): String = js.native
  def formatMonthDayYear(date: js.Date, strings: ICalendarStrings): String = js.native
  /**
    * Callback to apply formatting to the month and year in the Day Picker header
    */
  def formatMonthYear(date: js.Date): String = js.native
  def formatMonthYear(date: js.Date, strings: ICalendarStrings): String = js.native
  /**
    * Callback to apply formatting to the year in the Month Picker header
    */
  def formatYear(date: js.Date): String = js.native
}

