package typingsSlinky.ical.icalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ical.icalStrings.VEVENT
  - typings.ical.icalStrings.VTODO
  - typings.ical.icalStrings.VJOURNAL
  - typings.ical.icalStrings.VFREEBUSY
  - typings.ical.icalStrings.VTIMEZONE
  - typings.ical.icalStrings.VALARM
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

