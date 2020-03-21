package typingsSlinky.gapiCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The type of notification. Possible values are:
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.gapiCalendar.gapiCalendarStrings.eventCreation
  - typingsSlinky.gapiCalendar.gapiCalendarStrings.eventChange
  - typingsSlinky.gapiCalendar.gapiCalendarStrings.eventCancellation
  - typingsSlinky.gapiCalendar.gapiCalendarStrings.eventResponse
  - typingsSlinky.gapiCalendar.gapiCalendarStrings.agenda
*/
trait NotificationType extends js.Object

object NotificationType {
  @scala.inline
  def agenda: typingsSlinky.gapiCalendar.gapiCalendarStrings.agenda = this.cast("agenda")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def eventCancellation: typingsSlinky.gapiCalendar.gapiCalendarStrings.eventCancellation = this.cast("eventCancellation")
  @scala.inline
  def eventChange: typingsSlinky.gapiCalendar.gapiCalendarStrings.eventChange = this.cast("eventChange")
  @scala.inline
  def eventCreation: typingsSlinky.gapiCalendar.gapiCalendarStrings.eventCreation = this.cast("eventCreation")
  @scala.inline
  def eventResponse: typingsSlinky.gapiCalendar.gapiCalendarStrings.eventResponse = this.cast("eventResponse")
}

