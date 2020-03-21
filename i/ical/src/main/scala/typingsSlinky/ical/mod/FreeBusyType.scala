package typingsSlinky.ical.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ical.icalStrings.FREE
  - typingsSlinky.ical.icalStrings.BUSY
*/
trait FreeBusyType extends js.Object

object FreeBusyType {
  @scala.inline
  def BUSY: typingsSlinky.ical.icalStrings.BUSY = this.cast("BUSY")
  @scala.inline
  def FREE: typingsSlinky.ical.icalStrings.FREE = this.cast("FREE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

