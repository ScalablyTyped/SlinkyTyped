package typingsSlinky.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateEvent extends js.Object {
  var date: js.Date
  var event: org.scalajs.dom.raw.Event
}

object DateEvent {
  @scala.inline
  def apply(date: js.Date, event: org.scalajs.dom.raw.Event): DateEvent = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateEvent]
  }
}

