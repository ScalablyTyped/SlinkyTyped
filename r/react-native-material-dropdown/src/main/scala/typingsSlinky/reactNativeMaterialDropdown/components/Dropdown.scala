package typingsSlinky.reactNativeMaterialDropdown.components

import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.ReadonlyactionNamestring
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
import typingsSlinky.reactNative.mod.TextStyle
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
import typingsSlinky.reactNativeMaterialDropdown.PartialDropDownProps
import typingsSlinky.reactNativeMaterialDropdown.mod.DropDownData
import typingsSlinky.reactNativeMaterialDropdown.mod.DropDownInsets
import typingsSlinky.reactNativeMaterialDropdown.mod.DropDownMargins
import typingsSlinky.reactNativeMaterialDropdown.mod.DropDownOffset
import typingsSlinky.reactNativeMaterialDropdown.mod.DropDownProps
import typingsSlinky.reactNativeMaterialDropdown.mod.RenderBaseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Dropdown {
  @JSImport("react-native-material-dropdown", "Dropdown")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeMaterialDropdown.mod.Dropdown] {
    @scala.inline
    def absoluteRTLLayout(value: Boolean): this.type = set("absoluteRTLLayout", value.asInstanceOf[js.Any])
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
    def animationDuration(value: Double): this.type = set("animationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def baseColor(value: String): this.type = set("baseColor", value.asInstanceOf[js.Any])
    @scala.inline
    def containerStyle(value: StyleProp[ViewStyle]): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def containerStyleNull: this.type = set("containerStyle", null)
    @scala.inline
    def delayLongPress(value: Double): this.type = set("delayLongPress", value.asInstanceOf[js.Any])
    @scala.inline
    def delayPressIn(value: Double): this.type = set("delayPressIn", value.asInstanceOf[js.Any])
    @scala.inline
    def delayPressOut(value: Double): this.type = set("delayPressOut", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def disabledItemColor(value: String): this.type = set("disabledItemColor", value.asInstanceOf[js.Any])
    @scala.inline
    def dropdownMargins(value: DropDownMargins): this.type = set("dropdownMargins", value.asInstanceOf[js.Any])
    @scala.inline
    def dropdownOffset(value: DropDownOffset): this.type = set("dropdownOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def dropdownPosition(value: Double): this.type = set("dropdownPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def fontSize(value: Double): this.type = set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def hasTVPreferredFocus(value: Boolean): this.type = set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def hitSlop(value: DropDownInsets): this.type = set("hitSlop", value.asInstanceOf[js.Any])
    @scala.inline
    def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
    @scala.inline
    def inputContainerStyle(value: StyleProp[ViewStyle]): this.type = set("inputContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def inputContainerStyleNull: this.type = set("inputContainerStyle", null)
    @scala.inline
    def itemColor(value: String): this.type = set("itemColor", value.asInstanceOf[js.Any])
    @scala.inline
    def itemCount(value: Double): this.type = set("itemCount", value.asInstanceOf[js.Any])
    @scala.inline
    def itemPadding(value: Double): this.type = set("itemPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def itemTextStyle(value: StyleProp[TextStyle]): this.type = set("itemTextStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def itemTextStyleNull: this.type = set("itemTextStyle", null)
    @scala.inline
    def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def labelExtractor(value: (/* item */ DropDownData, /* index */ Double) => String): this.type = set("labelExtractor", js.Any.fromFunction2(value))
    @scala.inline
    def labelFontSize(value: Double): this.type = set("labelFontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def labelTextStyle(value: StyleProp[TextStyle]): this.type = set("labelTextStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def labelTextStyleNull: this.type = set("labelTextStyle", null)
    @scala.inline
    def onAccessibilityAction(value: SyntheticEvent[NodeHandle, ReadonlyactionNamestring] => Unit): this.type = set("onAccessibilityAction", js.Any.fromFunction1(value))
    @scala.inline
    def onAccessibilityEscape(value: () => Unit): this.type = set("onAccessibilityEscape", js.Any.fromFunction0(value))
    @scala.inline
    def onAccessibilityTap(value: () => Unit): this.type = set("onAccessibilityTap", js.Any.fromFunction0(value))
    @scala.inline
    def onBlur(value: () => Unit): this.type = set("onBlur", js.Any.fromFunction0(value))
    @scala.inline
    def onChangeText(value: (/* value */ String, /* index */ Double, /* data */ js.Array[DropDownData]) => Unit): this.type = set("onChangeText", js.Any.fromFunction3(value))
    @scala.inline
    def onFocus(value: () => Unit): this.type = set("onFocus", js.Any.fromFunction0(value))
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
    def overlayStyle(value: StyleProp[ViewStyle]): this.type = set("overlayStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def overlayStyleNull: this.type = set("overlayStyle", null)
    @scala.inline
    def pickerStyle(value: StyleProp[ViewStyle]): this.type = set("pickerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def pickerStyleNull: this.type = set("pickerStyle", null)
    @scala.inline
    def pressRetentionOffset(value: Insets): this.type = set("pressRetentionOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def propsExtractor(value: (/* item */ DropDownData, /* index */ Double) => PartialDropDownProps): this.type = set("propsExtractor", js.Any.fromFunction2(value))
    @scala.inline
    def renderAccessory(value: () => ReactElement): this.type = set("renderAccessory", js.Any.fromFunction0(value))
    @scala.inline
    def renderBase(value: /* props */ RenderBaseProps => ReactElement): this.type = set("renderBase", js.Any.fromFunction1(value))
    @scala.inline
    def rippleCentered(value: Boolean): this.type = set("rippleCentered", value.asInstanceOf[js.Any])
    @scala.inline
    def rippleColor(value: String): this.type = set("rippleColor", value.asInstanceOf[js.Any])
    @scala.inline
    def rippleDuration(value: Double): this.type = set("rippleDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def rippleInsets(value: DropDownInsets): this.type = set("rippleInsets", value.asInstanceOf[js.Any])
    @scala.inline
    def rippleOpacity(value: Double): this.type = set("rippleOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def rippleSequential(value: Boolean): this.type = set("rippleSequential", value.asInstanceOf[js.Any])
    @scala.inline
    def selectedItemColor(value: String): this.type = set("selectedItemColor", value.asInstanceOf[js.Any])
    @scala.inline
    def shadeOpacity(value: Double): this.type = set("shadeOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def styleNull: this.type = set("style", null)
    @scala.inline
    def supportedOrientations(value: js.Array[String]): this.type = set("supportedOrientations", value.asInstanceOf[js.Any])
    @scala.inline
    def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    @scala.inline
    def textColor(value: String): this.type = set("textColor", value.asInstanceOf[js.Any])
    @scala.inline
    def tvParallaxProperties(value: TVParallaxProperties): this.type = set("tvParallaxProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def useNativeDriver(value: Boolean): this.type = set("useNativeDriver", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: String | Double): this.type = set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def valueExtractor(value: (/* item */ DropDownData, /* index */ Double) => String): this.type = set("valueExtractor", js.Any.fromFunction2(value))
  }
  
  def withProps(p: DropDownProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(data: js.Array[DropDownData]): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DropDownProps]))
  }
}

