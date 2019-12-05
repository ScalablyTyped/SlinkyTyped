package typingsSlinky.primereact

import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventValue extends js.Object {
  var event: Event
  var value: js.Any
}

object Anon_EventValue {
  @scala.inline
  def apply(event: Event, value: js.Any): Anon_EventValue = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EventValue]
  }
}

