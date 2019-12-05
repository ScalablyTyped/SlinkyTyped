package typingsSlinky.baseui

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.KeyboardEvent
import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventItem extends js.Object {
  var event: js.UndefOr[(SyntheticEvent[Event, HTMLElement]) | KeyboardEvent] = js.undefined
  var item: js.Any
}

object Anon_EventItem {
  @scala.inline
  def apply(item: js.Any, event: (SyntheticEvent[Event, HTMLElement]) | KeyboardEvent = null): Anon_EventItem = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EventItem]
  }
}

