package typingsSlinky.ionicCore.navInterfaceMod

import typingsSlinky.ionicCore.mod.Mode
import typingsSlinky.ionicCore.oldAnimationAnimationInterfaceMod.Animation
import typingsSlinky.ionicCore.oldAnimationAnimationInterfaceMod.AnimationBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouterOutletOptions extends js.Object {
  var animated: js.UndefOr[Boolean] = js.native
  var animationBuilder: js.UndefOr[AnimationBuilder] = js.native
  var deepWait: js.UndefOr[Boolean] = js.native
  var direction: js.UndefOr[NavDirection] = js.native
  var duration: js.UndefOr[Double] = js.native
  var easing: js.UndefOr[String] = js.native
  var keyboardClose: js.UndefOr[Boolean] = js.native
  var mode: js.UndefOr[Mode] = js.native
  var progressAnimation: js.UndefOr[Boolean] = js.native
  var showGoBack: js.UndefOr[Boolean] = js.native
  var skipIfBusy: js.UndefOr[Boolean] = js.native
}

object RouterOutletOptions {
  @scala.inline
  def apply(): RouterOutletOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterOutletOptions]
  }
  @scala.inline
  implicit class RouterOutletOptionsOps[Self <: RouterOutletOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationBuilder(
      value: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => js.Promise[Animation]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationBuilder")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAnimationBuilder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationBuilder")(js.undefined)
        ret
    }
    @scala.inline
    def withDeepWait(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deepWait")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeepWait: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deepWait")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: NavDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withEasing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardClose")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: Mode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withShowGoBack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGoBack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowGoBack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGoBack")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipIfBusy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipIfBusy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipIfBusy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipIfBusy")(js.undefined)
        ret
    }
  }
  
}

