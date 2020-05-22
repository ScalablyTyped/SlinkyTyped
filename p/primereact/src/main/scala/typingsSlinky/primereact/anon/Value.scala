package typingsSlinky.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var originalEvent: org.scalajs.dom.raw.Event
  var value: js.Any
}

object Value {
  @scala.inline
  def apply(originalEvent: org.scalajs.dom.raw.Event, value: js.Any): Value = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

