package typingsSlinky.ionicCore.navInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwipeGestureHandler extends js.Object {
  def canStart(): Boolean = js.native
  def onEnd(shouldComplete: Boolean): Unit = js.native
  def onStart(): Unit = js.native
}

object SwipeGestureHandler {
  @scala.inline
  def apply(canStart: () => Boolean, onEnd: Boolean => Unit, onStart: () => Unit): SwipeGestureHandler = {
    val __obj = js.Dynamic.literal(canStart = js.Any.fromFunction0(canStart), onEnd = js.Any.fromFunction1(onEnd), onStart = js.Any.fromFunction0(onStart))
    __obj.asInstanceOf[SwipeGestureHandler]
  }
  @scala.inline
  implicit class SwipeGestureHandlerOps[Self <: SwipeGestureHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanStart(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnEnd(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

