package typingsSlinky.gestalt

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SyntheticEvent extends js.Object {
  var syntheticEvent: SyntheticEvent[Event, HTMLInputElement]
  var value: String
}

object Anon_SyntheticEvent {
  @scala.inline
  def apply(syntheticEvent: SyntheticEvent[Event, HTMLInputElement], value: String): Anon_SyntheticEvent = {
    val __obj = js.Dynamic.literal(syntheticEvent = syntheticEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_SyntheticEvent]
  }
}

