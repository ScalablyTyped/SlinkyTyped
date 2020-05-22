package typingsSlinky.gestalt.anon

import org.scalajs.dom.raw.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Checked extends js.Object {
  var checked: Boolean
  var event: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, HTMLInputElement]
}

object Checked {
  @scala.inline
  def apply(checked: Boolean, event: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, HTMLInputElement]): Checked = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checked]
  }
}

