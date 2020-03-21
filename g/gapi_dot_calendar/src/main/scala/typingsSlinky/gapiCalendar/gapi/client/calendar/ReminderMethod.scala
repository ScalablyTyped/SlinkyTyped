package typingsSlinky.gapiCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The method used by this reminder. Possible values are:
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.gapiCalendar.gapiCalendarStrings.email
  - typingsSlinky.gapiCalendar.gapiCalendarStrings.sms
  - typingsSlinky.gapiCalendar.gapiCalendarStrings.popup
*/
trait ReminderMethod extends js.Object

object ReminderMethod {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def email: typingsSlinky.gapiCalendar.gapiCalendarStrings.email = this.cast("email")
  @scala.inline
  def popup: typingsSlinky.gapiCalendar.gapiCalendarStrings.popup = this.cast("popup")
  @scala.inline
  def sms: typingsSlinky.gapiCalendar.gapiCalendarStrings.sms = this.cast("sms")
}

