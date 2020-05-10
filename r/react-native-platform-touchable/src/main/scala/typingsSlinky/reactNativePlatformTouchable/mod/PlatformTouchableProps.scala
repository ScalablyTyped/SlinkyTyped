package typingsSlinky.reactNativePlatformTouchable.mod

import typingsSlinky.reactNative.mod.BackgroundPropType
import typingsSlinky.reactNative.mod.TouchableWithoutFeedbackProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformTouchableProps extends TouchableWithoutFeedbackProps {
  // TouchableOpacity (default iOS)
  var activeOpacity: js.UndefOr[Double] = js.native
  // TouchableNativeFeedback (default Android)
  var background: js.UndefOr[BackgroundPropType] = js.native
  var foreground: js.UndefOr[BackgroundPropType] = js.native
  var onHideUnderlay: js.UndefOr[js.Function0[Unit]] = js.native
  var onShowUnderlay: js.UndefOr[js.Function0[Unit]] = js.native
  // TouchableHighlight
  var underlayColor: js.UndefOr[String] = js.native
}

object PlatformTouchableProps {
  @scala.inline
  def apply(): PlatformTouchableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlatformTouchableProps]
  }
  @scala.inline
  implicit class PlatformTouchablePropsOps[Self <: PlatformTouchableProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withBackground(value: BackgroundPropType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withForeground(value: BackgroundPropType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForeground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreground")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHideUnderlay(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHideUnderlay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnHideUnderlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHideUnderlay")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShowUnderlay(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShowUnderlay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnShowUnderlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShowUnderlay")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderlayColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlayColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderlayColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlayColor")(js.undefined)
        ret
    }
  }
  
}

