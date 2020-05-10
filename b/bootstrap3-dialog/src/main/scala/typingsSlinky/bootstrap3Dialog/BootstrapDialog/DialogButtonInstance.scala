package typingsSlinky.bootstrap3Dialog.BootstrapDialog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogButtonInstance extends js.Object {
  /** Equals to $button.toggleEnable(false); */
  def disable(): Unit = js.native
  /** Equals to $button.toggleEnable(true); */
  def enable(): Unit = js.native
  /** Equals to $button.toggleSpin(true); */
  def spin(): Unit = js.native
  /** Equals to $button.toggleSpin(false); */
  def stopSpin(): Unit = js.native
  def toggleEnable(enabled: Boolean): Unit = js.native
  def toggleSpin(spin: Boolean): Unit = js.native
}

object DialogButtonInstance {
  @scala.inline
  def apply(
    disable: () => Unit,
    enable: () => Unit,
    spin: () => Unit,
    stopSpin: () => Unit,
    toggleEnable: Boolean => Unit,
    toggleSpin: Boolean => Unit
  ): DialogButtonInstance = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), spin = js.Any.fromFunction0(spin), stopSpin = js.Any.fromFunction0(stopSpin), toggleEnable = js.Any.fromFunction1(toggleEnable), toggleSpin = js.Any.fromFunction1(toggleSpin))
    __obj.asInstanceOf[DialogButtonInstance]
  }
  @scala.inline
  implicit class DialogButtonInstanceOps[Self <: DialogButtonInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSpin(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spin")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStopSpin(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopSpin")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToggleEnable(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleEnable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToggleSpin(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleSpin")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

