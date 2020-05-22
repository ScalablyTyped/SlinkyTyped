package typingsSlinky.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventEvent extends js.Object {
  var date: js.Date
  var event: org.scalajs.dom.raw.Event
}

object EventEvent {
  @scala.inline
  def apply(date: js.Date, event: org.scalajs.dom.raw.Event): EventEvent = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventEvent]
  }
}

