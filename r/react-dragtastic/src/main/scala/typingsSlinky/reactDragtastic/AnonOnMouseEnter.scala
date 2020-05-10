package typingsSlinky.reactDragtastic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOnMouseEnter extends js.Object {
  def onMouseEnter(): Unit = js.native
  def onMouseLeave(): Unit = js.native
  def onMouseUp(): Unit = js.native
}

object AnonOnMouseEnter {
  @scala.inline
  def apply(onMouseEnter: () => Unit, onMouseLeave: () => Unit, onMouseUp: () => Unit): AnonOnMouseEnter = {
    val __obj = js.Dynamic.literal(onMouseEnter = js.Any.fromFunction0(onMouseEnter), onMouseLeave = js.Any.fromFunction0(onMouseLeave), onMouseUp = js.Any.fromFunction0(onMouseUp))
    __obj.asInstanceOf[AnonOnMouseEnter]
  }
  @scala.inline
  implicit class AnonOnMouseEnterOps[Self <: AnonOnMouseEnter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnMouseEnter(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnMouseLeave(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnMouseUp(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUp")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

