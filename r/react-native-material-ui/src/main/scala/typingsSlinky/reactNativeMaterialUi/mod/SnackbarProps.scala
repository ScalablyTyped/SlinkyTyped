package typingsSlinky.reactNativeMaterialUi.mod

import typingsSlinky.reactNativeMaterialUi.AnonMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnackbarProps extends js.Object {
  var actionText: js.UndefOr[String] = js.native
  var bottomNavigation: Boolean = js.native
  var button: js.UndefOr[ButtonProps] = js.native
  var message: String = js.native
  var onActionPress: js.UndefOr[js.Function0[Unit]] = js.native
  var style: js.UndefOr[AnonMessage] = js.native
  var timeout: Double = js.native
  var visible: Boolean = js.native
  def onRequestClose(): Unit = js.native
}

object SnackbarProps {
  @scala.inline
  def apply(
    bottomNavigation: Boolean,
    message: String,
    onRequestClose: () => Unit,
    timeout: Double,
    visible: Boolean
  ): SnackbarProps = {
    val __obj = js.Dynamic.literal(bottomNavigation = bottomNavigation.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], onRequestClose = js.Any.fromFunction0(onRequestClose), timeout = timeout.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnackbarProps]
  }
  @scala.inline
  implicit class SnackbarPropsOps[Self <: SnackbarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottomNavigation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnRequestClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRequestClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionText")(js.undefined)
        ret
    }
    @scala.inline
    def withButton(value: ButtonProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(js.undefined)
        ret
    }
    @scala.inline
    def withOnActionPress(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActionPress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnActionPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActionPress")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: AnonMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

