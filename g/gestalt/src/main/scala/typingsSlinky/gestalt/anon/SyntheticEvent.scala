package typingsSlinky.gestalt.anon

import org.scalajs.dom.raw.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyntheticEvent extends js.Object {
  var syntheticEvent: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, HTMLInputElement]
  var value: String
}

object SyntheticEvent {
  @scala.inline
  def apply(
    syntheticEvent: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, HTMLInputElement],
    value: String
  ): SyntheticEvent = {
    val __obj = js.Dynamic.literal(syntheticEvent = syntheticEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntheticEvent]
  }
}

