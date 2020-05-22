package typingsSlinky.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventValue extends js.Object {
  var event: org.scalajs.dom.raw.Event
  var value: js.Any
}

object EventValue {
  @scala.inline
  def apply(event: org.scalajs.dom.raw.Event, value: js.Any): EventValue = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventValue]
  }
}

