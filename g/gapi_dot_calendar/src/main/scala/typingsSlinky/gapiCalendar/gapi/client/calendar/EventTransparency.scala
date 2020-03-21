package typingsSlinky.gapiCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Whether the event blocks time on the calendar. Optional. Possible values are:
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.gapiCalendar.gapiCalendarStrings.opaque
  - typingsSlinky.gapiCalendar.gapiCalendarStrings.transparent
*/
trait EventTransparency extends js.Object

object EventTransparency {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def opaque: typingsSlinky.gapiCalendar.gapiCalendarStrings.opaque = this.cast("opaque")
  @scala.inline
  def transparent: typingsSlinky.gapiCalendar.gapiCalendarStrings.transparent = this.cast("transparent")
}

