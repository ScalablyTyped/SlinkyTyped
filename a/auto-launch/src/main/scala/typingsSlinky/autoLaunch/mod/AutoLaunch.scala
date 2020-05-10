package typingsSlinky.autoLaunch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoLaunch extends js.Object {
  /**
    * Disables auto-launch at start up.
    */
  def disable(): js.Promise[Unit] = js.native
  /**
    * Enables auto-launch at start up.
    */
  def enable(): js.Promise[Unit] = js.native
  /**
    * Returns true if auto-launch is enabled.
    */
  def isEnabled(): js.Promise[Boolean] = js.native
}

object AutoLaunch {
  @scala.inline
  def apply(
    disable: () => js.Promise[Unit],
    enable: () => js.Promise[Unit],
    isEnabled: () => js.Promise[Boolean]
  ): AutoLaunch = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), isEnabled = js.Any.fromFunction0(isEnabled))
    __obj.asInstanceOf[AutoLaunch]
  }
  @scala.inline
  implicit class AutoLaunchOps[Self <: AutoLaunch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisable(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnable(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsEnabled(value: () => js.Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

