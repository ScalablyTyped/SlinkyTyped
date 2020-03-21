package typingsSlinky.gapiCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The order of the events returned in the result. Optional. The default is an unspecified, stable order.
// Acceptable values are:
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.gapiCalendar.gapiCalendarStrings.startTime
  - typingsSlinky.gapiCalendar.gapiCalendarStrings.updated
*/
trait EventsOrder extends js.Object

object EventsOrder {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def startTime: typingsSlinky.gapiCalendar.gapiCalendarStrings.startTime = this.cast("startTime")
  @scala.inline
  def updated: typingsSlinky.gapiCalendar.gapiCalendarStrings.updated = this.cast("updated")
}

