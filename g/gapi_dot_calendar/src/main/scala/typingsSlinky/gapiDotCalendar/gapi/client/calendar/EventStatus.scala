package typingsSlinky.gapiDotCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Status of the event. Optional. Possible values are:
/* Rewritten from type alias, can be one of: 
  - typings.gapiDotCalendar.gapiDotCalendarStrings.confirmed
  - typings.gapiDotCalendar.gapiDotCalendarStrings.tentative
  - typings.gapiDotCalendar.gapiDotCalendarStrings.cancelled
*/
trait EventStatus extends js.Object

object EventStatus {
  @scala.inline
  def cancelled: typingsSlinky.gapiDotCalendar.gapiDotCalendarStrings.cancelled = this.cast("cancelled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def confirmed: typingsSlinky.gapiDotCalendar.gapiDotCalendarStrings.confirmed = this.cast("confirmed")
  @scala.inline
  def tentative: typingsSlinky.gapiDotCalendar.gapiDotCalendarStrings.tentative = this.cast("tentative")
}

