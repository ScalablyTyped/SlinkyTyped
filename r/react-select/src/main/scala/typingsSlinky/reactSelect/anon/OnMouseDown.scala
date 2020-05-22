package typingsSlinky.reactSelect.anon

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnMouseDown extends js.Object {
  def onMouseDown(event: SyntheticMouseEvent[HTMLElement]): Unit
}

object OnMouseDown {
  @scala.inline
  def apply(onMouseDown: SyntheticMouseEvent[HTMLElement] => Unit): OnMouseDown = {
    val __obj = js.Dynamic.literal(onMouseDown = js.Any.fromFunction1(onMouseDown))
    __obj.asInstanceOf[OnMouseDown]
  }
}

