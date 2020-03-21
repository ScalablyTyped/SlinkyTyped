package typingsSlinky.baseui

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.KeyboardEvent
import slinky.core.SyntheticEvent
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItem extends js.Object {
  var event: js.UndefOr[(SyntheticEvent[Event_, HTMLElement]) | KeyboardEvent] = js.undefined
  var item: js.Any
}

object AnonItem {
  @scala.inline
  def apply(item: js.Any, event: (SyntheticEvent[Event_, HTMLElement]) | KeyboardEvent = null): AnonItem = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItem]
  }
}

