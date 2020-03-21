package typingsSlinky.rcCalendar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rcCalendar.rcCalendarStrings.time
  - typingsSlinky.rcCalendar.rcCalendarStrings.date
  - typingsSlinky.rcCalendar.rcCalendarStrings.month
  - typingsSlinky.rcCalendar.rcCalendarStrings.year
  - typingsSlinky.rcCalendar.rcCalendarStrings.decade
*/
trait Mode extends js.Object

object Mode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def date: typingsSlinky.rcCalendar.rcCalendarStrings.date = this.cast("date")
  @scala.inline
  def decade: typingsSlinky.rcCalendar.rcCalendarStrings.decade = this.cast("decade")
  @scala.inline
  def month: typingsSlinky.rcCalendar.rcCalendarStrings.month = this.cast("month")
  @scala.inline
  def time: typingsSlinky.rcCalendar.rcCalendarStrings.time = this.cast("time")
  @scala.inline
  def year: typingsSlinky.rcCalendar.rcCalendarStrings.year = this.cast("year")
}

