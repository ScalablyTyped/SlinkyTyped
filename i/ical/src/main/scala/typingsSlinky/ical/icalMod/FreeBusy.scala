package typingsSlinky.ical.icalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreeBusy extends js.Object {
  var end: js.Date
  var start: js.Date
  var `type`: FreeBusyType
}

object FreeBusy {
  @scala.inline
  def apply(end: js.Date, start: js.Date, `type`: FreeBusyType): FreeBusy = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreeBusy]
  }
}

