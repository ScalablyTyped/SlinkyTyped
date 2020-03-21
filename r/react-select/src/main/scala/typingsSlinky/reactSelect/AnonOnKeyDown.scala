package typingsSlinky.reactSelect

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.reactSelect.typesMod.KeyboardEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnKeyDown extends js.Object {
  var onKeyDown: KeyboardEventHandler
}

object AnonOnKeyDown {
  @scala.inline
  def apply(onKeyDown: /* event */ SyntheticKeyboardEvent[HTMLElement] => Unit): AnonOnKeyDown = {
    val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction1(onKeyDown))
  
    __obj.asInstanceOf[AnonOnKeyDown]
  }
}

