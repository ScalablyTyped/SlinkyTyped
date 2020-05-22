package typingsSlinky.gestalt.anon

import org.scalajs.dom.raw.HTMLInputElement
import slinky.web.SyntheticKeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `2` extends js.Object {
  var event: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, SyntheticKeyboardEvent[HTMLInputElement]]
  var value: String
}

object `2` {
  @scala.inline
  def apply(
    event: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, SyntheticKeyboardEvent[HTMLInputElement]],
    value: String
  ): `2` = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
}

