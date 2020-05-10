package typingsSlinky.reactNativeGestureHandler.drawerLayoutMod

import slinky.core.TagMod
import typingsSlinky.reactNative.mod.Animated.Value
import typingsSlinky.reactNative.mod.StatusBarAnimation
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawerLayoutProperties extends js.Object {
  var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var drawerBackgroundColor: js.UndefOr[String] = js.native
  var drawerLockMode: js.UndefOr[DrawerLockMode] = js.native
  var drawerPosition: js.UndefOr[DrawerPosition] = js.native
  var drawerType: js.UndefOr[DrawerType] = js.native
  var drawerWidth: js.UndefOr[Double] = js.native
  var edgeWidth: js.UndefOr[Double] = js.native
  var hideStatusBar: js.UndefOr[Boolean] = js.native
  var keyboardDismissMode: js.UndefOr[DrawerKeyboardDismissMode] = js.native
  var minSwipeDistance: js.UndefOr[Double] = js.native
  var onDrawerClose: js.UndefOr[js.Function0[Unit]] = js.native
  var onDrawerOpen: js.UndefOr[js.Function0[Unit]] = js.native
  var onDrawerStateChanged: js.UndefOr[js.Function2[/* newState */ DrawerState, /* drawerWillShow */ Boolean, Unit]] = js.native
  var overlayColor: js.UndefOr[String] = js.native
  var statusBarAnimation: js.UndefOr[StatusBarAnimation] = js.native
  var useNativeAnimations: js.UndefOr[Boolean] = js.native
  def renderNavigationView(progressAnimatedValue: Value): TagMod[Any] = js.native
}

object DrawerLayoutProperties {
  @scala.inline
  def apply(renderNavigationView: Value => TagMod[Any]): DrawerLayoutProperties = {
    val __obj = js.Dynamic.literal(renderNavigationView = js.Any.fromFunction1(renderNavigationView))
    __obj.asInstanceOf[DrawerLayoutProperties]
  }
  @scala.inline
  implicit class DrawerLayoutPropertiesOps[Self <: DrawerLayoutProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRenderNavigationView(value: Value => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderNavigationView")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContentContainerStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withContentContainerStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentContainerStyle")(null)
        ret
    }
    @scala.inline
    def withDrawerBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawerBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawerLockMode(value: DrawerLockMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerLockMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawerLockMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerLockMode")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawerPosition(value: DrawerPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawerPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawerType(value: DrawerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerType")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawerWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawerWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withHideStatusBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideStatusBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideStatusBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideStatusBar")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardDismissMode(value: DrawerKeyboardDismissMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardDismissMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardDismissMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardDismissMode")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSwipeDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSwipeDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSwipeDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSwipeDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrawerClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrawerClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDrawerClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrawerClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrawerOpen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrawerOpen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDrawerOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrawerOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrawerStateChanged(value: (/* newState */ DrawerState, /* drawerWillShow */ Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrawerStateChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDrawerStateChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrawerStateChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayColor")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusBarAnimation(value: StatusBarAnimation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusBarAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusBarAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusBarAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withUseNativeAnimations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeAnimations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseNativeAnimations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeAnimations")(js.undefined)
        ret
    }
  }
  
}

