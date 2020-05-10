package typingsSlinky.antDesignReactNative.progressMod

import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.fixed
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.normal
import typingsSlinky.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsSlinky.antDesignReactNative.progressStyleMod.ProgressStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressProps extends WithThemeStyles[ProgressStyle] {
  var appearTransition: js.UndefOr[Boolean] = js.native
  var barStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var percent: js.UndefOr[Double] = js.native
  var position: js.UndefOr[fixed | normal] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var unfilled: js.UndefOr[Boolean] = js.native
  var wrapWidth: js.UndefOr[Double] = js.native
}

object ProgressProps {
  @scala.inline
  def apply(): ProgressProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressProps]
  }
  @scala.inline
  implicit class ProgressPropsOps[Self <: ProgressProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppearTransition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appearTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppearTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appearTransition")(js.undefined)
        ret
    }
    @scala.inline
    def withBarStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withBarStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barStyle")(null)
        ret
    }
    @scala.inline
    def withPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: fixed | normal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: StyleProp[ViewStyle]): Self = {
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
    @scala.inline
    def withStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(null)
        ret
    }
    @scala.inline
    def withUnfilled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unfilled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnfilled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unfilled")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapWidth")(js.undefined)
        ret
    }
  }
  
}

