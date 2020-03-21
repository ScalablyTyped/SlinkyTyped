package typingsSlinky.gestalt

import org.scalajs.dom.raw.Element
import slinky.core.SyntheticEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEvent extends js.Object {
  var event: SyntheticEvent[Event_, SyntheticMouseEvent[Element]]
}

object AnonEvent {
  @scala.inline
  def apply(event: SyntheticEvent[Event_, SyntheticMouseEvent[Element]]): AnonEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEvent]
  }
}

