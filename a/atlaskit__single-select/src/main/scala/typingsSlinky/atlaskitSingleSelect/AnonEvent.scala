package typingsSlinky.atlaskitSingleSelect

import slinky.core.SyntheticEvent
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEvent extends js.Object {
  var event: SyntheticEvent[Event_, _]
  var isOpen: Boolean
}

object AnonEvent {
  @scala.inline
  def apply(event: SyntheticEvent[Event_, _], isOpen: Boolean): AnonEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEvent]
  }
}

