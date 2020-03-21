package typingsSlinky.reactBigCalendar.mod

import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.agenda_
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.day_
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.month_
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.week_
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.work_week_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactBigCalendar.reactBigCalendarStrings.month_
  - typingsSlinky.reactBigCalendar.reactBigCalendarStrings.week_
  - typingsSlinky.reactBigCalendar.reactBigCalendarStrings.work_week_
  - typingsSlinky.reactBigCalendar.reactBigCalendarStrings.day_
  - typingsSlinky.reactBigCalendar.reactBigCalendarStrings.agenda_
*/
trait View extends js.Object

object View {
  @scala.inline
  def agenda: agenda_ = this.cast("agenda")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def day: day_ = this.cast("day")
  @scala.inline
  def month: month_ = this.cast("month")
  @scala.inline
  def week: week_ = this.cast("week")
  @scala.inline
  def work_week: work_week_ = this.cast("work_week")
}

