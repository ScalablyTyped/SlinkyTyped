package typingsSlinky.atlaskitSingleSelect.anon

import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var event: SyntheticEvent[org.scalajs.dom.raw.Event, _]
  var isOpen: Boolean
}

object Event {
  @scala.inline
  def apply(event: SyntheticEvent[org.scalajs.dom.raw.Event, _], isOpen: Boolean): Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

