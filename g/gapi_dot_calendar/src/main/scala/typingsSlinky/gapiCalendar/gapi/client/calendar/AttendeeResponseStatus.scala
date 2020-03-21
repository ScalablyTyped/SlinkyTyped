package typingsSlinky.gapiCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The attendee's response status. Possible values are:
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.gapiCalendar.gapiCalendarStrings.needsAction
  - typingsSlinky.gapiCalendar.gapiCalendarStrings.declined
  - typingsSlinky.gapiCalendar.gapiCalendarStrings.tentative
  - typingsSlinky.gapiCalendar.gapiCalendarStrings.accepted
*/
trait AttendeeResponseStatus extends js.Object

object AttendeeResponseStatus {
  @scala.inline
  def accepted: typingsSlinky.gapiCalendar.gapiCalendarStrings.accepted = this.cast("accepted")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def declined: typingsSlinky.gapiCalendar.gapiCalendarStrings.declined = this.cast("declined")
  @scala.inline
  def needsAction: typingsSlinky.gapiCalendar.gapiCalendarStrings.needsAction = this.cast("needsAction")
  @scala.inline
  def tentative: typingsSlinky.gapiCalendar.gapiCalendarStrings.tentative = this.cast("tentative")
}

