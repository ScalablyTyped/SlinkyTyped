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

trait NavigationDrawerConfig extends js.Object {
  var contentComponent: js.UndefOr[ReactComponentClass[DrawerContentComponentProps]] = js.undefined
  var drawerBackgroundColor: js.UndefOr[ThemedColor] = js.undefined
  var drawerLockMode: js.UndefOr[DrawerLockMode] = js.undefined
  var drawerPosition: js.UndefOr[left | right] = js.undefined
  var drawerType: js.UndefOr[front | back | slide] = js.undefined
  var drawerWidth: js.UndefOr[Double | js.Function0[Double]] = js.undefined
  var edgeWidth: js.UndefOr[Double] = js.undefined
  var hideStatusBar: js.UndefOr[Boolean] = js.undefined
  var keyboardDismissMode: js.UndefOr[none | `on-drag`] = js.undefined
  var minSwipeDistance: js.UndefOr[Double] = js.undefined
  var overlayColor: js.UndefOr[ThemedColor] = js.undefined
  var screenContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var statusBarAnimation: js.UndefOr[slide | none | fade] = js.undefined
  var swipeDistanceThreshold: js.UndefOr[Double] = js.undefined
  var swipeEdgeWidth: js.UndefOr[Double] = js.undefined
  var swipeVelocityThreshold: js.UndefOr[Double] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContentComponentFunctionComponent(value: ReactComponentClass[DrawerContentComponentProps]): Self = this.set("contentComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentComponentComponentClass(value: ReactComponentClass[DrawerContentComponentProps]): Self = this.set("contentComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentComponent(value: ReactComponentClass[DrawerContentComponentProps]): Self = this.set("contentComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentComponent: Self = this.set("contentComponent", js.undefined)
    @scala.inline
    def setDrawerBackgroundColor(value: ThemedColor): Self = this.set("drawerBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawerBackgroundColor: Self = this.set("drawerBackgroundColor", js.undefined)
    @scala.inline
    def setDrawerLockMode(value: DrawerLockMode): Self = this.set("drawerLockMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawerLockMode: Self = this.set("drawerLockMode", js.undefined)
    @scala.inline
    def setDrawerPosition(value: left | right): Self = this.set("drawerPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawerPosition: Self = this.set("drawerPosition", js.undefined)
    @scala.inline
    def setDrawerType(value: front | back | slide): Self = this.set("drawerType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawerType: Self = this.set("drawerType", js.undefined)
    @scala.inline
    def setDrawerWidthFunction0(value: () => Double): Self = this.set("drawerWidth", js.Any.fromFunction0(value))
    @scala.inline
    def setDrawerWidth(value: Double | js.Function0[Double]): Self = this.set("drawerWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawerWidth: Self = this.set("drawerWidth", js.undefined)
    @scala.inline
    def setEdgeWidth(value: Double): Self = this.set("edgeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdgeWidth: Self = this.set("edgeWidth", js.undefined)
    @scala.inline
    def setHideStatusBar(value: Boolean): Self = this.set("hideStatusBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideStatusBar: Self = this.set("hideStatusBar", js.undefined)
    @scala.inline
    def setKeyboardDismissMode(value: none | `on-drag`): Self = this.set("keyboardDismissMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardDismissMode: Self = this.set("keyboardDismissMode", js.undefined)
    @scala.inline
    def setMinSwipeDistance(value: Double): Self = this.set("minSwipeDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinSwipeDistance: Self = this.set("minSwipeDistance", js.undefined)
    @scala.inline
    def setOverlayColor(value: ThemedColor): Self = this.set("overlayColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayColor: Self = this.set("overlayColor", js.undefined)
    @scala.inline
    def setScreenContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("screenContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenContainerStyle: Self = this.set("screenContainerStyle", js.undefined)
    @scala.inline
    def setScreenContainerStyleNull: Self = this.set("screenContainerStyle", null)
    @scala.inline
    def setStatusBarAnimation(value: slide | none | fade): Self = this.set("statusBarAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusBarAnimation: Self = this.set("statusBarAnimation", js.undefined)
    @scala.inline
    def setSwipeDistanceThreshold(value: Double): Self = this.set("swipeDistanceThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwipeDistanceThreshold: Self = this.set("swipeDistanceThreshold", js.undefined)
    @scala.inline
    def setSwipeEdgeWidth(value: Double): Self = this.set("swipeEdgeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwipeEdgeWidth: Self = this.set("swipeEdgeWidth", js.undefined)
    @scala.inline
    def setSwipeVelocityThreshold(value: Double): Self = this.set("swipeVelocityThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwipeVelocityThreshold: Self = this.set("swipeVelocityThreshold", js.undefined)
  }
  
}

