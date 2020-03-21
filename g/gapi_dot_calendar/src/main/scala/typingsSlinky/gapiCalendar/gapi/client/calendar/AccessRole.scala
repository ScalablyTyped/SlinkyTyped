package typingsSlinky.gapiCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The user's access role for this calendar. Read-only. Possible values are:
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.gapiCalendar.gapiCalendarStrings.none
  - typingsSlinky.gapiCalendar.gapiCalendarStrings.freeBusyReader
  - typingsSlinky.gapiCalendar.gapiCalendarStrings.reader
  - typingsSlinky.gapiCalendar.gapiCalendarStrings.writer
  - typingsSlinky.gapiCalendar.gapiCalendarStrings.owner
*/
trait AccessRole extends js.Object

object AccessRole {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def freeBusyReader: typingsSlinky.gapiCalendar.gapiCalendarStrings.freeBusyReader = this.cast("freeBusyReader")
  @scala.inline
  def none: typingsSlinky.gapiCalendar.gapiCalendarStrings.none = this.cast("none")
  @scala.inline
  def owner: typingsSlinky.gapiCalendar.gapiCalendarStrings.owner = this.cast("owner")
  @scala.inline
  def reader: typingsSlinky.gapiCalendar.gapiCalendarStrings.reader = this.cast("reader")
  @scala.inline
  def writer: typingsSlinky.gapiCalendar.gapiCalendarStrings.writer = this.cast("writer")
}

