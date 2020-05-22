package typingsSlinky.gestalt.anon

import org.scalajs.dom.raw.HTMLInputElement
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckedEvent extends js.Object {
  var checked: Boolean
  var event: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, SyntheticMouseEvent[HTMLInputElement]]
}

object CheckedEvent {
  @scala.inline
  def apply(
    checked: Boolean,
    event: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, SyntheticMouseEvent[HTMLInputElement]]
  ): CheckedEvent = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckedEvent]
  }
}

