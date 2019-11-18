package typingsSlinky.reactDashNativeDashGestureDashHandler.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.Animated.Value
import typingsSlinky.reactDashNative.reactDashNativeMod.StatusBarAnimation
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.reactDashNativeDashGestureDashHandler.drawerLayoutMod.DrawerKeyboardDismissMode
import typingsSlinky.reactDashNativeDashGestureDashHandler.drawerLayoutMod.DrawerLayoutProperties
import typingsSlinky.reactDashNativeDashGestureDashHandler.drawerLayoutMod.DrawerLockMode
import typingsSlinky.reactDashNativeDashGestureDashHandler.drawerLayoutMod.DrawerPosition
import typingsSlinky.reactDashNativeDashGestureDashHandler.drawerLayoutMod.DrawerState
import typingsSlinky.reactDashNativeDashGestureDashHandler.drawerLayoutMod.DrawerType
import typingsSlinky.reactDashNativeDashGestureDashHandler.drawerLayoutMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DrawerLayout
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.reactDashNativeDashGestureDashHandler.drawerLayoutMod.default].asInstanceOf[String | js.Object]
  def apply(
    renderNavigationView: Value => TagMod[Any],
    containerStyle: StyleProp[ViewStyle] = null,
    drawerBackgroundColor: String = null,
    drawerLockMode: DrawerLockMode = null,
    drawerPosition: DrawerPosition = null,
    drawerType: DrawerType = null,
    drawerWidth: Int | Double = null,
    edgeWidth: Int | Double = null,
    hideStatusBar: js.UndefOr[Boolean] = js.undefined,
    keyboardDismissMode: DrawerKeyboardDismissMode = null,
    minSwipeDistance: Int | Double = null,
    onDrawerClose: () => Unit = null,
    onDrawerOpen: () => Unit = null,
    onDrawerStateChanged: (/* newState */ DrawerState, /* drawerWillShow */ Boolean) => Unit = null,
    overlayColor: String = null,
    statusBarAnimation: StatusBarAnimation = null,
    useNativeAnimations: js.UndefOr[Boolean] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(renderNavigationView = js.Any.fromFunction1(renderNavigationView))
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (drawerBackgroundColor != null) __obj.updateDynamic("drawerBackgroundColor")(drawerBackgroundColor.asInstanceOf[js.Any])
    if (drawerLockMode != null) __obj.updateDynamic("drawerLockMode")(drawerLockMode.asInstanceOf[js.Any])
    if (drawerPosition != null) __obj.updateDynamic("drawerPosition")(drawerPosition.asInstanceOf[js.Any])
    if (drawerType != null) __obj.updateDynamic("drawerType")(drawerType.asInstanceOf[js.Any])
    if (drawerWidth != null) __obj.updateDynamic("drawerWidth")(drawerWidth.asInstanceOf[js.Any])
    if (edgeWidth != null) __obj.updateDynamic("edgeWidth")(edgeWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(hideStatusBar)) __obj.updateDynamic("hideStatusBar")(hideStatusBar.asInstanceOf[js.Any])
    if (keyboardDismissMode != null) __obj.updateDynamic("keyboardDismissMode")(keyboardDismissMode.asInstanceOf[js.Any])
    if (minSwipeDistance != null) __obj.updateDynamic("minSwipeDistance")(minSwipeDistance.asInstanceOf[js.Any])
    if (onDrawerClose != null) __obj.updateDynamic("onDrawerClose")(js.Any.fromFunction0(onDrawerClose))
    if (onDrawerOpen != null) __obj.updateDynamic("onDrawerOpen")(js.Any.fromFunction0(onDrawerOpen))
    if (onDrawerStateChanged != null) __obj.updateDynamic("onDrawerStateChanged")(js.Any.fromFunction2(onDrawerStateChanged))
    if (overlayColor != null) __obj.updateDynamic("overlayColor")(overlayColor.asInstanceOf[js.Any])
    if (statusBarAnimation != null) __obj.updateDynamic("statusBarAnimation")(statusBarAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeAnimations)) __obj.updateDynamic("useNativeAnimations")(useNativeAnimations.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DrawerLayoutProperties
}

