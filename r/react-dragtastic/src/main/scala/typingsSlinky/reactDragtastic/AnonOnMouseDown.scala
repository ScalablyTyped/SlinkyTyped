package typingsSlinky.reactDragtastic

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.TouchEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOnMouseDown extends js.Object {
  var onMouseDown: MouseEventHandler[Element] = js.native
  var onTouchStart: TouchEventHandler[Element] = js.native
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
  @scala.inline
  implicit class AnonOnMouseDownOps[Self <: AnonOnMouseDown] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnMouseDown(value: SyntheticMouseEvent[Element] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnTouchStart(value: SyntheticTouchEvent[Element] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStart")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

