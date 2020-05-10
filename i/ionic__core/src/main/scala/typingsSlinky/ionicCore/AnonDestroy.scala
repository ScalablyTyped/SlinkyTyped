package typingsSlinky.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDestroy extends js.Object {
  def destroy(): Unit = js.native
  def setDisabled(disabled: Boolean): Unit = js.native
  def stop(): Unit = js.native
}

object AnonDestroy {
  @scala.inline
  def apply(destroy: () => Unit, setDisabled: Boolean => Unit, stop: () => Unit): AnonDestroy = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), setDisabled = js.Any.fromFunction1(setDisabled), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[AnonDestroy]
  }
  @scala.inline
  implicit class AnonDestroyOps[Self <: AnonDestroy] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withStop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

