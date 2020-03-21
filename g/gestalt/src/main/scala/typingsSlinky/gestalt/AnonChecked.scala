package typingsSlinky.gestalt

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChecked extends js.Object {
  var checked: Boolean
  var event: SyntheticEvent[Event_, HTMLInputElement]
}

object AnonChecked {
  @scala.inline
  def apply(checked: Boolean, event: SyntheticEvent[Event_, HTMLInputElement]): AnonChecked = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChecked]
  }
}

