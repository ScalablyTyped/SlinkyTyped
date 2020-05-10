package typingsSlinky.ionicCore.gestureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gesture extends js.Object {
  def destroy(): Unit = js.native
  def setDisabled(disabled: Boolean): Unit = js.native
}

object Gesture {
  @scala.inline
  def apply(destroy: () => Unit, setDisabled: Boolean => Unit): Gesture = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), setDisabled = js.Any.fromFunction1(setDisabled))
    __obj.asInstanceOf[Gesture]
  }
  @scala.inline
  implicit class GestureOps[Self <: Gesture] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetDisabled(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDisabled")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

