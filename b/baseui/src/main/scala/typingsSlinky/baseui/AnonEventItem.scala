package typingsSlinky.baseui

import slinky.core.SyntheticEvent
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventItem extends js.Object {
  var event: SyntheticEvent[Event_, _]
  var item: js.Any
}

object AnonEventItem {
  @scala.inline
  def apply(event: SyntheticEvent[Event_, _], item: js.Any): AnonEventItem = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEventItem]
  }
}

