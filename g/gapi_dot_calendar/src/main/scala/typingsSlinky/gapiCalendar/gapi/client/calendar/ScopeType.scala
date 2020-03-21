package typingsSlinky.gapiCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The type of the scope. Possible values are:
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.gapiCalendar.gapiCalendarStrings.default
  - typingsSlinky.gapiCalendar.gapiCalendarStrings.user
  - typingsSlinky.gapiCalendar.gapiCalendarStrings.group
  - typingsSlinky.gapiCalendar.gapiCalendarStrings.domain
*/
trait ScopeType extends js.Object

object ScopeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typingsSlinky.gapiCalendar.gapiCalendarStrings.default = this.cast("default")
  @scala.inline
  def domain: typingsSlinky.gapiCalendar.gapiCalendarStrings.domain = this.cast("domain")
  @scala.inline
  def group: typingsSlinky.gapiCalendar.gapiCalendarStrings.group = this.cast("group")
  @scala.inline
  def user: typingsSlinky.gapiCalendar.gapiCalendarStrings.user = this.cast("user")
}

