package typingsSlinky.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginalEventValue extends js.Object {
  var originalEvent: org.scalajs.dom.raw.Event
  var value: js.Date
}

object OriginalEventValue {
  @scala.inline
  def apply(originalEvent: org.scalajs.dom.raw.Event, value: js.Date): OriginalEventValue = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalEventValue]
  }
}

