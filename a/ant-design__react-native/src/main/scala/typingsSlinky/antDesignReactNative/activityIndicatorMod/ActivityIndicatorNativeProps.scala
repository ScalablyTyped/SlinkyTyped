package typingsSlinky.antDesignReactNative.activityIndicatorMod

import typingsSlinky.antDesignReactNative.activityIndicatorStyleMod.ActivityIndicatorStyle
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.large
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.small
import typingsSlinky.antDesignReactNative.libStyleMod.WithThemeStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityIndicatorNativeProps extends WithThemeStyles[ActivityIndicatorStyle] {
  var animating: js.UndefOr[Boolean] = js.native
  var color: js.UndefOr[String] = js.native
  var size: js.UndefOr[large | small] = js.native
  @JSName("styles")
  var styles_ActivityIndicatorNativeProps: js.UndefOr[ActivityIndicatorStyle] = js.native
  var text: js.UndefOr[String] = js.native
  var toast: js.UndefOr[Boolean] = js.native
}

object ActivityIndicatorNativeProps {
  @scala.inline
  def apply(): ActivityIndicatorNativeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityIndicatorNativeProps]
  }
  @scala.inline
  implicit class ActivityIndicatorNativePropsOps[Self <: ActivityIndicatorNativeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimating(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animating")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: large | small): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withStyles(value: ActivityIndicatorStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withToast(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toast")(js.undefined)
        ret
    }
  }
  
}

