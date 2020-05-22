package typingsSlinky.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueString extends js.Object {
  var originalEvent: org.scalajs.dom.raw.Event
  var value: String
}

object ValueString {
  @scala.inline
  def apply(originalEvent: org.scalajs.dom.raw.Event, value: String): ValueString = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueString]
  }
}

