package typingsSlinky.reactNavigationDrawer.typesMod

import slinky.core.ReactComponentClass
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.`on-drag`
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.back
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.fade
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.front
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.left
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.none
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.right
import typingsSlinky.reactNavigationDrawer.reactNavigationDrawerStrings.slide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationDrawerConfig extends js.Object {
  var contentComponent: js.UndefOr[ReactComponentClass[DrawerContentComponentProps]] = js.native
  var drawerBackgroundColor: js.UndefOr[ThemedColor] = js.native
  var drawerLockMode: js.UndefOr[DrawerLockMode] = js.native
  var drawerPosition: js.UndefOr[left | right] = js.native
  var drawerType: js.UndefOr[front | back | slide] = js.native
  var drawerWidth: js.UndefOr[Double | js.Function0[Double]] = js.native
  var edgeWidth: js.UndefOr[Double] = js.native
  var hideStatusBar: js.UndefOr[Boolean] = js.native
  var keyboardDismissMode: js.UndefOr[none | `on-drag`] = js.native
  var minSwipeDistance: js.UndefOr[Double] = js.native
  var overlayColor: js.UndefOr[ThemedColor] = js.native
  var screenContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var statusBarAnimation: js.UndefOr[slide | none | fade] = js.native
  var swipeDistanceThreshold: js.UndefOr[Double] = js.native
  var swipeEdgeWidth: js.UndefOr[Double] = js.native
  var swipeVelocityThreshold: js.UndefOr[Double] = js.native
}

object NavigationDrawerConfig {
  @scala.inline
  def apply(): NavigationDrawerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationDrawerConfig]
  }
  @scala.inline
  implicit class NavigationDrawerConfigOps[Self <: NavigationDrawerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentComponentFunctionComponent(value: ReactComponentClass[DrawerContentComponentProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentComponentComponentClass(value: ReactComponentClass[DrawerContentComponentProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentComponent(value: ReactComponentClass[DrawerContentComponentProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawerBackgroundColor(value: ThemedColor): Self = {
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
    def withDrawerPosition(value: left | right): Self = {
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
    def withDrawerType(value: front | back | slide): Self = {
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
    def withDrawerWidthFunction0(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDrawerWidth(value: Double | js.Function0[Double]): Self = {
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
    def withKeyboardDismissMode(value: none | `on-drag`): Self = {
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
    def withOverlayColor(value: ThemedColor): Self = {
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
    def withScreenContainerStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenContainerStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenContainerStyle")(null)
        ret
    }
    @scala.inline
    def withStatusBarAnimation(value: slide | none | fade): Self = {
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
    def withSwipeDistanceThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeDistanceThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipeDistanceThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeDistanceThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withSwipeEdgeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeEdgeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipeEdgeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeEdgeWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSwipeVelocityThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeVelocityThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipeVelocityThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeVelocityThreshold")(js.undefined)
        ret
    }
  }
  
}

