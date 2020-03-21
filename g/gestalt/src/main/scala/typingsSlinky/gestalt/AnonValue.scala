package typingsSlinky.gestalt

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue extends js.Object {
  var event: SyntheticEvent[Event_, HTMLInputElement]
  var value: String
}

object AnonValue {
  @scala.inline
  def apply(event: SyntheticEvent[Event_, HTMLInputElement], value: String): AnonValue = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValue]
  }
}

