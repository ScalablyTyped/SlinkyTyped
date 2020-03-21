package typingsSlinky.ical.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ical.icalStrings.VEVENT
  - typingsSlinky.ical.icalStrings.VTODO
  - typingsSlinky.ical.icalStrings.VJOURNAL
  - typingsSlinky.ical.icalStrings.VFREEBUSY
  - typingsSlinky.ical.icalStrings.VTIMEZONE
  - typingsSlinky.ical.icalStrings.VALARM
*/
trait CalendarComponentType extends js.Object

object CalendarComponentType {
  @scala.inline
  def VALARM: typingsSlinky.ical.icalStrings.VALARM = this.cast("VALARM")
  @scala.inline
  def VEVENT: typingsSlinky.ical.icalStrings.VEVENT = this.cast("VEVENT")
  @scala.inline
  def VFREEBUSY: typingsSlinky.ical.icalStrings.VFREEBUSY = this.cast("VFREEBUSY")
  @scala.inline
  def VJOURNAL: typingsSlinky.ical.icalStrings.VJOURNAL = this.cast("VJOURNAL")
  @scala.inline
  def VTIMEZONE: typingsSlinky.ical.icalStrings.VTIMEZONE = this.cast("VTIMEZONE")
  @scala.inline
  def VTODO: typingsSlinky.ical.icalStrings.VTODO = this.cast("VTODO")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

