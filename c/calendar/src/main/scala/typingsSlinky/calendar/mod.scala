package typingsSlinky.calendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("calendar", "Calendar")
  @js.native
  /**
    * @param firstWeekDay default is `0` (Sunday)
    */
  class Calendar () extends StObject {
    def this(firstWeekDay: Double) = this()
    
    def monthDates(year: Double, month: Double): js.Array[js.Date] = js.native
    def monthDates(year: Double, month: Double, dayFormatter: js.UndefOr[scala.Nothing], weekFormatter: WeekFormatter): js.Array[js.Date] = js.native
    def monthDates(year: Double, month: Double, dayFormatter: DayFormatter): js.Array[js.Date] = js.native
    def monthDates(year: Double, month: Double, dayFormatter: DayFormatter, weekFormatter: WeekFormatter): js.Array[js.Date] = js.native
    
    def monthDays(year: Double, month: Double): js.Array[js.Date] = js.native
    
    def monthText(): String = js.native
    def monthText(year: Double, month: Double): String = js.native
    
    def weekStartDate(date: js.Date): js.Date = js.native
  }
  
  @JSImport("calendar", "version")
  @js.native
  val version: String = js.native
  
  type DayFormatter = js.Function1[/* day */ js.Date, js.Date | String]
  
  type WeekFormatter = js.Function1[/* week */ js.Array[js.Date], js.Array[js.Date] | String]
}
