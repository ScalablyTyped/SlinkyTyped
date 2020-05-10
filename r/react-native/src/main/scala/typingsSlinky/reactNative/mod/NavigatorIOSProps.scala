package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigatorIOSProps extends js.Object {
  /**
    * The default background color of the navigation bar.
    */
  var barTintColor: js.UndefOr[String] = js.native
  /**
    * NavigatorIOS uses "route" objects to identify child views, their props, and navigation bar configuration.
    * "push" and all the other navigation operations expect routes to be like this
    */
  var initialRoute: Route = js.native
  /**
    * Boolean value that indicates whether the interactive pop gesture is
    * enabled. This is useful for enabling/disabling the back swipe navigation
    * gesture.
    *
    * If this prop is not provided, the default behavior is for the back swipe
    * gesture to be enabled when the navigation bar is shown and disabled when
    * the navigation bar is hidden. Once you've provided the
    * `interactivePopGestureEnabled` prop, you can never restore the default
    * behavior.
    */
  var interactivePopGestureEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The default wrapper style for components in the navigator.
    * A common use case is to set the backgroundColor for every page
    */
  var itemWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * A Boolean value that indicates whether the navigation bar is hidden
    */
  var navigationBarHidden: js.UndefOr[Boolean] = js.native
  /**
    * A Boolean value that indicates whether to hide the 1px hairline shadow
    */
  var shadowHidden: js.UndefOr[Boolean] = js.native
  /**
    * NOT IN THE DOC BUT IN THE EXAMPLES
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * The color used for buttons in the navigation bar
    */
  var tintColor: js.UndefOr[String] = js.native
  /**
    * The text color of the navigation bar title
    */
  var titleTextColor: js.UndefOr[String] = js.native
  /**
    * A Boolean value that indicates whether the navigation bar is translucent
    */
  var translucent: js.UndefOr[Boolean] = js.native
}

object NavigatorIOSProps {
  @scala.inline
  def apply(initialRoute: Route): NavigatorIOSProps = {
    val __obj = js.Dynamic.literal(initialRoute = initialRoute.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorIOSProps]
  }
  @scala.inline
  implicit class NavigatorIOSPropsOps[Self <: NavigatorIOSProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialRoute(value: Route): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialRoute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBarTintColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barTintColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarTintColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barTintColor")(js.undefined)
        ret
    }
    @scala.inline
    def withInteractivePopGestureEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactivePopGestureEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractivePopGestureEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactivePopGestureEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withItemWrapperStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemWrapperStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemWrapperStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemWrapperStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withItemWrapperStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemWrapperStyle")(null)
        ret
    }
    @scala.inline
    def withNavigationBarHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationBarHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationBarHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationBarHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowHidden")(js.undefined)
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
    def withTintColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tintColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTintColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tintColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslucent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translucent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslucent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translucent")(js.undefined)
        ret
    }
  }
  
}

