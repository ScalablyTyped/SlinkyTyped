package typingsSlinky.reactNativeGestureHandler.components

import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.Animated.Value
import typingsSlinky.reactNative.mod.StatusBarAnimation
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeGestureHandler.drawerLayoutMod.DrawerKeyboardDismissMode
import typingsSlinky.reactNativeGestureHandler.drawerLayoutMod.DrawerLayoutProperties
import typingsSlinky.reactNativeGestureHandler.drawerLayoutMod.DrawerLockMode
import typingsSlinky.reactNativeGestureHandler.drawerLayoutMod.DrawerPosition
import typingsSlinky.reactNativeGestureHandler.drawerLayoutMod.DrawerState
import typingsSlinky.reactNativeGestureHandler.drawerLayoutMod.DrawerType
import typingsSlinky.reactNativeGestureHandler.drawerLayoutMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DrawerLayout {
  @JSImport("react-native-gesture-handler/DrawerLayout", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def contentContainerStyle(value: StyleProp[ViewStyle]): this.type = set("contentContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def contentContainerStyleNull: this.type = set("contentContainerStyle", null)
    @scala.inline
    def drawerBackgroundColor(value: String): this.type = set("drawerBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def drawerLockMode(value: DrawerLockMode): this.type = set("drawerLockMode", value.asInstanceOf[js.Any])
    @scala.inline
    def drawerPosition(value: DrawerPosition): this.type = set("drawerPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def drawerType(value: DrawerType): this.type = set("drawerType", value.asInstanceOf[js.Any])
    @scala.inline
    def drawerWidth(value: Double): this.type = set("drawerWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def edgeWidth(value: Double): this.type = set("edgeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def hideStatusBar(value: Boolean): this.type = set("hideStatusBar", value.asInstanceOf[js.Any])
    @scala.inline
    def keyboardDismissMode(value: DrawerKeyboardDismissMode): this.type = set("keyboardDismissMode", value.asInstanceOf[js.Any])
    @scala.inline
    def minSwipeDistance(value: Double): this.type = set("minSwipeDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def onDrawerClose(value: () => Unit): this.type = set("onDrawerClose", js.Any.fromFunction0(value))
    @scala.inline
    def onDrawerOpen(value: () => Unit): this.type = set("onDrawerOpen", js.Any.fromFunction0(value))
    @scala.inline
    def onDrawerStateChanged(value: (/* newState */ DrawerState, /* drawerWillShow */ Boolean) => Unit): this.type = set("onDrawerStateChanged", js.Any.fromFunction2(value))
    @scala.inline
    def overlayColor(value: String): this.type = set("overlayColor", value.asInstanceOf[js.Any])
    @scala.inline
    def statusBarAnimation(value: StatusBarAnimation): this.type = set("statusBarAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def useNativeAnimations(value: Boolean): this.type = set("useNativeAnimations", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DrawerLayoutProperties): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(renderNavigationView: Value => TagMod[Any]): Builder = {
    val __props = js.Dynamic.literal(renderNavigationView = js.Any.fromFunction1(renderNavigationView))
    new Builder(js.Array(this.component, __props.asInstanceOf[DrawerLayoutProperties]))
  }
}

