package typingsSlinky.reactNativeSideMenu.components

import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.Animated.CompositeAnimation
import typingsSlinky.reactNative.mod.Animated.EndCallback
import typingsSlinky.reactNative.mod.Animated.Value
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeSideMenu.mod.ReactNativeSideMenuProps
import typingsSlinky.reactNativeSideMenu.mod.default
import typingsSlinky.reactNativeSideMenu.reactNativeSideMenuStrings.left
import typingsSlinky.reactNativeSideMenu.reactNativeSideMenuStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeSideMenu {
  @JSImport("react-native-side-menu", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def animationFunction(value: (/* prop */ Value, /* value */ Double) => CompositeAnimation): this.type = set("animationFunction", js.Any.fromFunction2(value))
    @scala.inline
    def animationStyle(value: /* value */ Double => ViewStyle): this.type = set("animationStyle", js.Any.fromFunction1(value))
    @scala.inline
    def autoClosing(value: Boolean): this.type = set("autoClosing", value.asInstanceOf[js.Any])
    @scala.inline
    def bounceBackOnOverdraw(value: Boolean): this.type = set("bounceBackOnOverdraw", value.asInstanceOf[js.Any])
    @scala.inline
    def disableGestures(value: Boolean): this.type = set("disableGestures", value.asInstanceOf[js.Any])
    @scala.inline
    def edgeHitWidth(value: Double): this.type = set("edgeHitWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def hiddenMenuOffset(value: Double): this.type = set("hiddenMenuOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def isOpen(value: Boolean): this.type = set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def menu(value: ReactElement): this.type = set("menu", value.asInstanceOf[js.Any])
    @scala.inline
    def menuPosition(value: left | right): this.type = set("menuPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def onAnimationComplete(value: /* event */ EndCallback => Unit): this.type = set("onAnimationComplete", js.Any.fromFunction1(value))
    @scala.inline
    def onChange(value: /* isOpen */ Boolean => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onMove(value: /* left */ Double => Unit): this.type = set("onMove", js.Any.fromFunction1(value))
    @scala.inline
    def onSliding(value: /* fraction */ Double => Unit): this.type = set("onSliding", js.Any.fromFunction1(value))
    @scala.inline
    def onStartShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
    @scala.inline
    def openMenuOffset(value: Double): this.type = set("openMenuOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def toleranceX(value: Double): this.type = set("toleranceX", value.asInstanceOf[js.Any])
    @scala.inline
    def toleranceY(value: Double): this.type = set("toleranceY", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactNativeSideMenuProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactNativeSideMenu.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

