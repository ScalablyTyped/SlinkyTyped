package typingsSlinky.gestalt.anon

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `3` extends js.Object {
  var event: slinky.core.SyntheticEvent[
    org.scalajs.dom.raw.Event, 
    SyntheticKeyboardEvent[HTMLDivElement] | SyntheticMouseEvent[HTMLDivElement]
  ]
}

object `3` {
  @scala.inline
  def apply(
    event: slinky.core.SyntheticEvent[
      org.scalajs.dom.raw.Event, 
      SyntheticKeyboardEvent[HTMLDivElement] | SyntheticMouseEvent[HTMLDivElement]
    ]
  ): `3` = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`]
  }
}

