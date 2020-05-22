package typingsSlinky.gestalt.anon

import org.scalajs.dom.raw.HTMLInputElement
import slinky.web.SyntheticFocusEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1` extends js.Object {
  var event: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, SyntheticFocusEvent[HTMLInputElement]]
  var value: String
}

object `1` {
  @scala.inline
  def apply(
    event: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, SyntheticFocusEvent[HTMLInputElement]],
    value: String
  ): `1` = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
}

