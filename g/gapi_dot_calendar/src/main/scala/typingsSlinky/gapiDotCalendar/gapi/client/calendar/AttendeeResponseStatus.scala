package typingsSlinky.gapiDotCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The attendee's response status. Possible values are:
/* Rewritten from type alias, can be one of: 
  - typings.gapiDotCalendar.gapiDotCalendarStrings.needsAction
  - typings.gapiDotCalendar.gapiDotCalendarStrings.declined
  - typings.gapiDotCalendar.gapiDotCalendarStrings.tentative
  - typings.gapiDotCalendar.gapiDotCalendarStrings.accepted
*/
trait AttendeeResponseStatus extends js.Object

object AttendeeResponseStatus {
  @scala.inline
  def accepted: typingsSlinky.gapiDotCalendar.gapiDotCalendarStrings.accepted = this.cast("accepted")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def declined: typingsSlinky.gapiDotCalendar.gapiDotCalendarStrings.declined = this.cast("declined")
  @scala.inline
  def needsAction: typingsSlinky.gapiDotCalendar.gapiDotCalendarStrings.needsAction = this.cast("needsAction")
  @scala.inline
  def tentative: typingsSlinky.gapiDotCalendar.gapiDotCalendarStrings.tentative = this.cast("tentative")
}

