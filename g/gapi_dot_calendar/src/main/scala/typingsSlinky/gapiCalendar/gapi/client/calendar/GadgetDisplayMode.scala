package typingsSlinky.gapiCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The gadget's display mode. Optional. Possible values are:
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.gapiCalendar.gapiCalendarStrings.icon
  - typingsSlinky.gapiCalendar.gapiCalendarStrings.chip
*/
trait GadgetDisplayMode extends js.Object

object GadgetDisplayMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chip: typingsSlinky.gapiCalendar.gapiCalendarStrings.chip = this.cast("chip")
  @scala.inline
  def icon: typingsSlinky.gapiCalendar.gapiCalendarStrings.icon = this.cast("icon")
}

