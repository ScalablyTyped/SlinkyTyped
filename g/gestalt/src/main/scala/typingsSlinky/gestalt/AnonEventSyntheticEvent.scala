package typingsSlinky.gestalt

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.SyntheticEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventSyntheticEvent extends js.Object {
  var event: SyntheticEvent[Event_, SyntheticMouseEvent[HTMLDivElement]]
}

object AnonEventSyntheticEvent {
  @scala.inline
  def apply(event: SyntheticEvent[Event_, SyntheticMouseEvent[HTMLDivElement]]): AnonEventSyntheticEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEventSyntheticEvent]
  }
}

