package typingsSlinky.reactNativeTabView.typesMod

import typingsSlinky.reactNativeTabView.AnonDamping
import typingsSlinky.reactNativeTabView.AnonDuration
import typingsSlinky.reactNativeTabView.reactNativeTabViewStrings.`on-drag`
import typingsSlinky.reactNativeTabView.reactNativeTabViewStrings.auto
import typingsSlinky.reactNativeTabView.reactNativeTabViewStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PagerCommonProps extends js.Object {
  var keyboardDismissMode: none | `on-drag` | auto = js.native
  var onSwipeEnd: js.UndefOr[js.Function0[Unit]] = js.native
  var onSwipeStart: js.UndefOr[js.Function0[Unit]] = js.native
  var springConfig: AnonDamping = js.native
  var springVelocityScale: js.UndefOr[Double] = js.native
  var swipeEnabled: Boolean = js.native
  var swipeVelocityImpact: js.UndefOr[Double] = js.native
  var timingConfig: AnonDuration = js.native
}

object PagerCommonProps {
  @scala.inline
  def apply(
    keyboardDismissMode: none | `on-drag` | auto,
    springConfig: AnonDamping,
    swipeEnabled: Boolean,
    timingConfig: AnonDuration
  ): PagerCommonProps = {
    val __obj = js.Dynamic.literal(keyboardDismissMode = keyboardDismissMode.asInstanceOf[js.Any], springConfig = springConfig.asInstanceOf[js.Any], swipeEnabled = swipeEnabled.asInstanceOf[js.Any], timingConfig = timingConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagerCommonProps]
  }
  @scala.inline
  implicit class PagerCommonPropsOps[Self <: PagerCommonProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyboardDismissMode(value: none | `on-drag` | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardDismissMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpringConfig(value: AnonDamping): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("springConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwipeEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimingConfig(value: AnonDuration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timingConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnSwipeEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSwipeEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwipeStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSwipeStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeStart")(js.undefined)
        ret
    }
    @scala.inline
    def withSpringVelocityScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("springVelocityScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpringVelocityScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("springVelocityScale")(js.undefined)
        ret
    }
    @scala.inline
    def withSwipeVelocityImpact(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeVelocityImpact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipeVelocityImpact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeVelocityImpact")(js.undefined)
        ret
    }
  }
  
}

