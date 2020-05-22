package typingsSlinky.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var event: org.scalajs.dom.raw.Event
  var value: Boolean
}

object Event {
  @scala.inline
  def apply(event: org.scalajs.dom.raw.Event, value: Boolean): Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

