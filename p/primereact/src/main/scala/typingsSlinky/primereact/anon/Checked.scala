package typingsSlinky.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Checked extends js.Object {
  var checked: Boolean
  var originalEvent: org.scalajs.dom.raw.Event
  var value: js.Any
}

object Checked {
  @scala.inline
  def apply(checked: Boolean, originalEvent: org.scalajs.dom.raw.Event, value: js.Any): Checked = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checked]
  }
}

