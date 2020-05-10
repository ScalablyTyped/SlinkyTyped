package typingsSlinky.electronNotify.mod

import typingsSlinky.electron.Electron.BrowserWindowConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICustomConfig extends js.Object {
  var animateInParallel: js.UndefOr[Boolean] = js.native
  var animationStepMs: js.UndefOr[Double] = js.native
  var animationSteps: js.UndefOr[Double] = js.native
  var appIcon: js.UndefOr[String] = js.native
  var borderRadius: js.UndefOr[Double] = js.native
  var defaultStyleAppIcon: js.UndefOr[js.Any] = js.native
  var defaultStyleClose: js.UndefOr[js.Any] = js.native
  var defaultStyleContainer: js.UndefOr[js.Any] = js.native
  var defaultStyleImage: js.UndefOr[js.Any] = js.native
  var defaultStyleText: js.UndefOr[js.Any] = js.native
  var defaultWindow: js.UndefOr[BrowserWindowConstructorOptions] = js.native
  var displayTime: js.UndefOr[Double] = js.native
  var height: js.UndefOr[Double] = js.native
  var logging: js.UndefOr[Boolean] = js.native
  var padding: js.UndefOr[Double] = js.native
  var pathToModule: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object ICustomConfig {
  @scala.inline
  def apply(): ICustomConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICustomConfig]
  }
  @scala.inline
  implicit class ICustomConfigOps[Self <: ICustomConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimateInParallel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateInParallel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimateInParallel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateInParallel")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationStepMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationStepMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationStepMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationStepMs")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationSteps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationSteps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationSteps")(js.undefined)
        ret
    }
    @scala.inline
    def withAppIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultStyleAppIcon(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultStyleAppIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultStyleAppIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultStyleAppIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultStyleClose(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultStyleClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultStyleClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultStyleClose")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultStyleContainer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultStyleContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultStyleContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultStyleContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultStyleImage(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultStyleImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultStyleImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultStyleImage")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultStyleText(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultStyleText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultStyleText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultStyleText")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultWindow(value: BrowserWindowConstructorOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayTime")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withLogging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withPathToModule(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathToModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathToModule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathToModule")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

