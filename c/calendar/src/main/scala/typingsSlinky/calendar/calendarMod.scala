package typingsSlinky.calendar

import typingsSlinky.calendar.calendarMod.DayFormatter
import typingsSlinky.calendar.calendarMod.WeekFormatter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("calendar", JSImport.Namespace)
@js.native
object calendarMod extends js.Object {
  @js.native
  /**
    * @param firstWeekDay default is `0` (Sunday)
    */
  class Calendar () extends js.Object {
    def this(firstWeekDay: Double) = this()
    def monthDates(year: Double, month: Double): js.Array[js.Date] = js.native
    def monthDates(year: Double, month: Double, dayFormatter: DayFormatter): js.Array[js.Date] = js.native
    def monthDates(year: Double, month: Double, dayFormatter: DayFormatter, weekFormatter: WeekFormatter): js.Array[js.Date] = js.native
    def monthDays(year: Double, month: Double): js.Array[js.Date] = js.native
    def monthText(): String = js.native
    def monthText(year: Double, month: Double): String = js.native
    def weekStartDate(date: js.Date): js.Date = js.native
  }
  
  val version: String = js.native
  type DayFormatter = js.Function1[/* day */ js.Date, js.Date | String]
  type WeekFormatter = js.Function1[/* week */ js.Array[js.Date], js.Array[js.Date] | String]
}

