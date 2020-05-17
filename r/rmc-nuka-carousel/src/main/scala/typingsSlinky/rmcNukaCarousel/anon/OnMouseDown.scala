package typingsSlinky.rmcNukaCarousel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnMouseDown extends js.Object {
  def onMouseDown(e: js.Any): Unit = js.native
  def onMouseLeave(e: js.Any): Unit = js.native
  def onMouseMove(e: js.Any): Unit = js.native
  def onMouseOut(): Unit = js.native
  def onMouseOver(): Unit = js.native
  def onMouseUp(e: js.Any): Unit = js.native
}

object OnMouseDown {
  @scala.inline
  def apply(
    onMouseDown: js.Any => Unit,
    onMouseLeave: js.Any => Unit,
    onMouseMove: js.Any => Unit,
    onMouseOut: () => Unit,
    onMouseOver: () => Unit,
    onMouseUp: js.Any => Unit
  ): OnMouseDown = {
    val __obj = js.Dynamic.literal(onMouseDown = js.Any.fromFunction1(onMouseDown), onMouseLeave = js.Any.fromFunction1(onMouseLeave), onMouseMove = js.Any.fromFunction1(onMouseMove), onMouseOut = js.Any.fromFunction0(onMouseOut), onMouseOver = js.Any.fromFunction0(onMouseOver), onMouseUp = js.Any.fromFunction1(onMouseUp))
    __obj.asInstanceOf[OnMouseDown]
  }
  @scala.inline
  implicit class OnMouseDownOps[Self <: OnMouseDown] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnMouseDown(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnMouseLeave(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnMouseMove(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnMouseOut(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOut")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnMouseOver(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOver")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnMouseUp(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUp")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

