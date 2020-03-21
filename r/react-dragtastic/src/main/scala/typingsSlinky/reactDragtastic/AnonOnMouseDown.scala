package typingsSlinky.reactDragtastic

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.TouchEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnMouseDown extends js.Object {
  var onMouseDown: MouseEventHandler[Element]
  var onTouchStart: TouchEventHandler[Element]
}

object AnonOnMouseDown {
  @scala.inline
  def apply(
    onMouseDown: SyntheticMouseEvent[Element] => Unit,
    onTouchStart: SyntheticTouchEvent[Element] => Unit
  ): AnonOnMouseDown = {
    val __obj = js.Dynamic.literal(onMouseDown = js.Any.fromFunction1(onMouseDown), onTouchStart = js.Any.fromFunction1(onTouchStart))
  
    __obj.asInstanceOf[AnonOnMouseDown]
  }
}

