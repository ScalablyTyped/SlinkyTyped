package typingsSlinky.baseui.anon

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.KeyboardEvent
import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventItem extends js.Object {
  var event: js.UndefOr[(SyntheticEvent[org.scalajs.dom.raw.Event, HTMLElement]) | KeyboardEvent] = js.undefined
  var item: js.Any
}

object EventItem {
  @scala.inline
  def apply(
    item: js.Any,
    event: (SyntheticEvent[org.scalajs.dom.raw.Event, HTMLElement]) | KeyboardEvent = null
  ): EventItem = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventItem]
  }
}

