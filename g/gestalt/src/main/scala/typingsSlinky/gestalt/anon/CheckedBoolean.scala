package typingsSlinky.gestalt.anon

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckedBoolean extends js.Object {
  var checked: Boolean
  var event: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, HTMLElement]
}

object CheckedBoolean {
  @scala.inline
  def apply(checked: Boolean, event: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, HTMLElement]): CheckedBoolean = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckedBoolean]
  }
}

