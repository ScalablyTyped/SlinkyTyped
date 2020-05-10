package typingsSlinky.rmcNukaCarousel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOnTouchCancel extends js.Object {
  def onTouchCancel(e: js.Any): Unit = js.native
  def onTouchEnd(e: js.Any): Unit = js.native
  def onTouchMove(e: js.Any): Unit = js.native
  def onTouchStart(e: js.Any): Unit = js.native
}

object AnonOnTouchCancel {
  @scala.inline
  def apply(
    onTouchCancel: js.Any => Unit,
    onTouchEnd: js.Any => Unit,
    onTouchMove: js.Any => Unit,
    onTouchStart: js.Any => Unit
  ): AnonOnTouchCancel = {
    val __obj = js.Dynamic.literal(onTouchCancel = js.Any.fromFunction1(onTouchCancel), onTouchEnd = js.Any.fromFunction1(onTouchEnd), onTouchMove = js.Any.fromFunction1(onTouchMove), onTouchStart = js.Any.fromFunction1(onTouchStart))
    __obj.asInstanceOf[AnonOnTouchCancel]
  }
  @scala.inline
  implicit class AnonOnTouchCancelOps[Self <: AnonOnTouchCancel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnTouchCancel(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchCancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnTouchEnd(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnTouchMove(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnTouchStart(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStart")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

