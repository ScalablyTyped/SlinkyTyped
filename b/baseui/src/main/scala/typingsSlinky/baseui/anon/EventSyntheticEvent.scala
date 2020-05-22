package typingsSlinky.baseui.anon

import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventSyntheticEvent extends js.Object {
  var event: SyntheticEvent[org.scalajs.dom.raw.Event, _]
  var item: js.Any
}

object EventSyntheticEvent {
  @scala.inline
  def apply(event: SyntheticEvent[org.scalajs.dom.raw.Event, _], item: js.Any): EventSyntheticEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSyntheticEvent]
  }
}

