package typingsSlinky.reactNative.components

import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.anon.ReadonlyactionNamestring
import typingsSlinky.reactNative.mod.AccessibilityActionInfo
import typingsSlinky.reactNative.mod.AccessibilityRole
import typingsSlinky.reactNative.mod.AccessibilityState
import typingsSlinky.reactNative.mod.AccessibilityStates
import typingsSlinky.reactNative.mod.AccessibilityTrait
import typingsSlinky.reactNative.mod.AccessibilityValue
import typingsSlinky.reactNative.mod.Insets
import typingsSlinky.reactNative.mod.LayoutChangeEvent
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TVParallaxProperties
import typingsSlinky.reactNative.mod.TargetedEvent
import typingsSlinky.reactNative.mod.TouchableOpacityProps
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNative.reactNativeStrings.`no-hide-descendants`
import typingsSlinky.reactNative.reactNativeStrings.assertive
import typingsSlinky.reactNative.reactNativeStrings.auto
import typingsSlinky.reactNative.reactNativeStrings.button
import typingsSlinky.reactNative.reactNativeStrings.no
import typingsSlinky.reactNative.reactNativeStrings.none
import typingsSlinky.reactNative.reactNativeStrings.polite
import typingsSlinky.reactNative.reactNativeStrings.radiobutton_checked
import typingsSlinky.reactNative.reactNativeStrings.radiobutton_unchecked
import typingsSlinky.reactNative.reactNativeStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TouchableOpacity {
  @JSImport("react-native", "TouchableOpacity")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNative.mod.TouchableOpacity] {
    @scala.inline
    def accessibilityActions(value: js.Array[AccessibilityActionInfo]): this.type = set("accessibilityActions", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityComponentType(value: none | button | radiobutton_checked | radiobutton_unchecked): this.type = set("accessibilityComponentType", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityElementsHidden(value: Boolean): this.type = set("accessibilityElementsHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityHint(value: String): this.type = set("accessibilityHint", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityIgnoresInvertColors(value: Boolean): this.type = set("accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityLiveRegion(value: none | polite | assertive): this.type = set("accessibilityLiveRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityRole(value: AccessibilityRole): this.type = set("accessibilityRole", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityState(value: AccessibilityState): this.type = set("accessibilityState", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityStates(value: js.Array[AccessibilityStates]): this.type = set("accessibilityStates", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityTraits(value: AccessibilityTrait | js.Array[AccessibilityTrait]): this.type = set("accessibilityTraits", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityValue(value: AccessibilityValue): this.type = set("accessibilityValue", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityViewIsModal(value: Boolean): this.type = set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
    @scala.inline
    def accessible(value: Boolean): this.type = set("accessible", value.asInstanceOf[js.Any])
    @scala.inline
    def activeOpacity(value: Double): this.type = set("activeOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def delayLongPress(value: Double): this.type = set("delayLongPress", value.asInstanceOf[js.Any])
    @scala.inline
    def delayPressIn(value: Double): this.type = set("delayPressIn", value.asInstanceOf[js.Any])
    @scala.inline
    def delayPressOut(value: Double): this.type = set("delayPressOut", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def hasTVPreferredFocus(value: Boolean): this.type = set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def hitSlop(value: Insets): this.type = set("hitSlop", value.asInstanceOf[js.Any])
    @scala.inline
    def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
    @scala.inline
    def onAccessibilityAction(value: SyntheticEvent[NodeHandle, ReadonlyactionNamestring] => Unit): this.type = set("onAccessibilityAction", js.Any.fromFunction1(value))
    @scala.inline
    def onAccessibilityEscape(value: () => Unit): this.type = set("onAccessibilityEscape", js.Any.fromFunction0(value))
    @scala.inline
    def onAccessibilityTap(value: () => Unit): this.type = set("onAccessibilityTap", js.Any.fromFunction0(value))
    @scala.inline
    def onBlur(value: SyntheticEvent[NodeHandle, TargetedEvent] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def onFocus(value: SyntheticEvent[NodeHandle, TargetedEvent] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def onLayout(value: /* event */ LayoutChangeEvent => Unit): this.type = set("onLayout", js.Any.fromFunction1(value))
    @scala.inline
    def onLongPress(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onLongPress", js.Any.fromFunction1(value))
    @scala.inline
    def onMagicTap(value: () => Unit): this.type = set("onMagicTap", js.Any.fromFunction0(value))
    @scala.inline
    def onPress(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onPress", js.Any.fromFunction1(value))
    @scala.inline
    def onPressIn(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onPressIn", js.Any.fromFunction1(value))
    @scala.inline
    def onPressOut(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onPressOut", js.Any.fromFunction1(value))
    @scala.inline
    def pressRetentionOffset(value: Insets): this.type = set("pressRetentionOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def styleNull: this.type = set("style", null)
    @scala.inline
    def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    @scala.inline
    def tvParallaxProperties(value: TVParallaxProperties): this.type = set("tvParallaxProperties", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TouchableOpacityProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TouchableOpacity.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

