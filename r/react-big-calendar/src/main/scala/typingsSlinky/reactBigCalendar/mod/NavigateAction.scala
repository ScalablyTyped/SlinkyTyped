package typingsSlinky.reactBigCalendar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactBigCalendar.reactBigCalendarStrings.PREV
  - typingsSlinky.reactBigCalendar.reactBigCalendarStrings.NEXT
  - typingsSlinky.reactBigCalendar.reactBigCalendarStrings.TODAY
  - typingsSlinky.reactBigCalendar.reactBigCalendarStrings.DATE
*/
trait NavigateAction extends js.Object

object NavigateAction {
  @scala.inline
  def DATE: typingsSlinky.reactBigCalendar.reactBigCalendarStrings.DATE = this.cast("DATE")
  @scala.inline
  def NEXT: typingsSlinky.reactBigCalendar.reactBigCalendarStrings.NEXT = this.cast("NEXT")
  @scala.inline
  def PREV: typingsSlinky.reactBigCalendar.reactBigCalendarStrings.PREV = this.cast("PREV")
  @scala.inline
  def TODAY: typingsSlinky.reactBigCalendar.reactBigCalendarStrings.TODAY = this.cast("TODAY")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

