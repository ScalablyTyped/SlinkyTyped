package typingsSlinky.gestalt

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSyntheticEvent extends js.Object {
  var syntheticEvent: SyntheticEvent[Event_, HTMLInputElement]
  var value: String
}

object AnonSyntheticEvent {
  @scala.inline
  def apply(syntheticEvent: SyntheticEvent[Event_, HTMLInputElement], value: String): AnonSyntheticEvent = {
    val __obj = js.Dynamic.literal(syntheticEvent = syntheticEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSyntheticEvent]
  }
}

