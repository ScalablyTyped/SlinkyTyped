package typingsSlinky.reactDashInfiniteDashCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashInfiniteDashCalendarMod {
  import slinky.core.ReactComponentClass

  type CalendarClass = ReactComponentClass[ReactInfiniteCalendarProps]
  type DateSelectFunction = js.Function1[/* date */ js.Date, Unit]
  type DateType = js.Date | String | Double
  type RangedSelectFunction = js.Function1[/* rangedDate */ RangedSelection, Unit]
  type ReactInfiniteCalendar = ReactComponentClass[ReactInfiniteCalendarProps]
}
