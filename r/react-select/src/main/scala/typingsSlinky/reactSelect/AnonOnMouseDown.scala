package typingsSlinky.reactSelect

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnMouseDown extends js.Object {
  def onMouseDown(event: SyntheticMouseEvent[HTMLElement]): Unit
}

object AnonOnMouseDown {
  @scala.inline
  def apply(onMouseDown: SyntheticMouseEvent[HTMLElement] => Unit): AnonOnMouseDown = {
    val __obj = js.Dynamic.literal(onMouseDown = js.Any.fromFunction1(onMouseDown))
  
    __obj.asInstanceOf[AnonOnMouseDown]
  }
}

