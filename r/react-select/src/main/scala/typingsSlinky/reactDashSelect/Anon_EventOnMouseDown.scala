package typingsSlinky.reactDashSelect

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventOnMouseDown extends js.Object {
  def onMouseDown(event: SyntheticMouseEvent[HTMLElement]): Unit
}

object Anon_EventOnMouseDown {
  @scala.inline
  def apply(onMouseDown: SyntheticMouseEvent[HTMLElement] => Unit): Anon_EventOnMouseDown = {
    val __obj = js.Dynamic.literal(onMouseDown = js.Any.fromFunction1(onMouseDown))
  
    __obj.asInstanceOf[Anon_EventOnMouseDown]
  }
}

