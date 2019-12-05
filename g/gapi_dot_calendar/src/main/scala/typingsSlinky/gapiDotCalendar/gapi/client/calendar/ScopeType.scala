package typingsSlinky.gapiDotCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The type of the scope. Possible values are:
/* Rewritten from type alias, can be one of: 
  - typings.gapiDotCalendar.gapiDotCalendarStrings.default
  - typings.gapiDotCalendar.gapiDotCalendarStrings.user
  - typings.gapiDotCalendar.gapiDotCalendarStrings.group
  - typings.gapiDotCalendar.gapiDotCalendarStrings.domain
*/
trait ScopeType extends js.Object

object ScopeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typingsSlinky.gapiDotCalendar.gapiDotCalendarStrings.default = this.cast("default")
  @scala.inline
  def domain: typingsSlinky.gapiDotCalendar.gapiDotCalendarStrings.domain = this.cast("domain")
  @scala.inline
  def group: typingsSlinky.gapiDotCalendar.gapiDotCalendarStrings.group = this.cast("group")
  @scala.inline
  def user: typingsSlinky.gapiDotCalendar.gapiDotCalendarStrings.user = this.cast("user")
}

