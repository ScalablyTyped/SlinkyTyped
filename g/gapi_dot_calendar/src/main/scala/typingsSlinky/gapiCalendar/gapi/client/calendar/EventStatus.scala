package typingsSlinky.gapiCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Status of the event. Optional. Possible values are:
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.gapiCalendar.gapiCalendarStrings.confirmed
  - typingsSlinky.gapiCalendar.gapiCalendarStrings.tentative
  - typingsSlinky.gapiCalendar.gapiCalendarStrings.cancelled
*/
trait EventStatus extends js.Object

object EventStatus {
  @scala.inline
  def cancelled: typingsSlinky.gapiCalendar.gapiCalendarStrings.cancelled = this.cast("cancelled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def confirmed: typingsSlinky.gapiCalendar.gapiCalendarStrings.confirmed = this.cast("confirmed")
  @scala.inline
  def tentative: typingsSlinky.gapiCalendar.gapiCalendarStrings.tentative = this.cast("tentative")
}

