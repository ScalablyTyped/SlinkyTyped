package typingsSlinky.reactNativeVectorIcons.components

import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.anon.ReadonlyactionNamestring
import typingsSlinky.reactNative.mod.AccessibilityActionInfo
import typingsSlinky.reactNative.mod.AccessibilityRole
import typingsSlinky.reactNative.mod.AccessibilityState
import typingsSlinky.reactNative.mod.AccessibilityTrait
import typingsSlinky.reactNative.mod.AccessibilityValue
import typingsSlinky.reactNative.mod.BackgroundPropType
import typingsSlinky.reactNative.mod.ColorValue
import typingsSlinky.reactNative.mod.Insets
import typingsSlinky.reactNative.mod.LayoutChangeEvent
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.TVParallaxProperties
import typingsSlinky.reactNative.mod.TargetedEvent
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNative.reactNativeStrings.`no-hide-descendants`
import typingsSlinky.reactNative.reactNativeStrings.assertive
import typingsSlinky.reactNative.reactNativeStrings.auto
import typingsSlinky.reactNative.reactNativeStrings.balanced
import typingsSlinky.reactNative.reactNativeStrings.button
import typingsSlinky.reactNative.reactNativeStrings.clip
import typingsSlinky.reactNative.reactNativeStrings.head
import typingsSlinky.reactNative.reactNativeStrings.highQuality
import typingsSlinky.reactNative.reactNativeStrings.middle
import typingsSlinky.reactNative.reactNativeStrings.no
import typingsSlinky.reactNative.reactNativeStrings.none
import typingsSlinky.reactNative.reactNativeStrings.polite
import typingsSlinky.reactNative.reactNativeStrings.radiobutton_checked
import typingsSlinky.reactNative.reactNativeStrings.radiobutton_unchecked
import typingsSlinky.reactNative.reactNativeStrings.simple
import typingsSlinky.reactNative.reactNativeStrings.tail
import typingsSlinky.reactNative.reactNativeStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_IconButtonProps_1587742882[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def accessibilityActionsVarargs(value: AccessibilityActionInfo*): this.type = set("accessibilityActions", js.Array(value :_*))
  
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
  def accessibilityTraitsVarargs(value: AccessibilityTrait*): this.type = set("accessibilityTraits", js.Array(value :_*))
  
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
  def adjustsFontSizeToFit(value: Boolean): this.type = set("adjustsFontSizeToFit", value.asInstanceOf[js.Any])
  
  @scala.inline
  def allowFontScaling(value: Boolean): this.type = set("allowFontScaling", value.asInstanceOf[js.Any])
  
  @scala.inline
  def background(value: BackgroundPropType): this.type = set("background", value.asInstanceOf[js.Any])
  
  @scala.inline
  def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
  
  @scala.inline
  def borderRadius(value: Double): this.type = set("borderRadius", value.asInstanceOf[js.Any])
  
  @scala.inline
  def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
  
  @scala.inline
  def delayLongPress(value: Double): this.type = set("delayLongPress", value.asInstanceOf[js.Any])
  
  @scala.inline
  def delayPressIn(value: Double): this.type = set("delayPressIn", value.asInstanceOf[js.Any])
  
  @scala.inline
  def delayPressOut(value: Double): this.type = set("delayPressOut", value.asInstanceOf[js.Any])
  
  @scala.inline
  def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  @scala.inline
  def disabledNull: this.type = set("disabled", null)
  
  @scala.inline
  def ellipsizeMode(value: head | middle | tail | clip): this.type = set("ellipsizeMode", value.asInstanceOf[js.Any])
  
  @scala.inline
  def hasTVPreferredFocus(value: Boolean): this.type = set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
  
  @scala.inline
  def hitSlop(value: Insets): this.type = set("hitSlop", value.asInstanceOf[js.Any])
  
  @scala.inline
  def iconStyle(value: TextStyle): this.type = set("iconStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
  
  @scala.inline
  def lineBreakMode(value: head | middle | tail | clip): this.type = set("lineBreakMode", value.asInstanceOf[js.Any])
  
  @scala.inline
  def maxFontSizeMultiplier(value: Double): this.type = set("maxFontSizeMultiplier", value.asInstanceOf[js.Any])
  
  @scala.inline
  def maxFontSizeMultiplierNull: this.type = set("maxFontSizeMultiplier", null)
  
  @scala.inline
  def minimumFontScale(value: Double): this.type = set("minimumFontScale", value.asInstanceOf[js.Any])
  
  @scala.inline
  def nativeID(value: String): this.type = set("nativeID", value.asInstanceOf[js.Any])
  
  @scala.inline
  def numberOfLines(value: Double): this.type = set("numberOfLines", value.asInstanceOf[js.Any])
  
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
  def onHideUnderlay(value: () => Unit): this.type = set("onHideUnderlay", js.Any.fromFunction0(value))
  
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
  def onShowUnderlay(value: () => Unit): this.type = set("onShowUnderlay", js.Any.fromFunction0(value))
  
  @scala.inline
  def pressRetentionOffset(value: Insets): this.type = set("pressRetentionOffset", value.asInstanceOf[js.Any])
  
  @scala.inline
  def selectable(value: Boolean): this.type = set("selectable", value.asInstanceOf[js.Any])
  
  @scala.inline
  def selectionColor(value: ColorValue): this.type = set("selectionColor", value.asInstanceOf[js.Any])
  
  @scala.inline
  def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
  
  @scala.inline
  def style(value: ViewStyle | TextStyle): this.type = set("style", value.asInstanceOf[js.Any])
  
  @scala.inline
  def suppressHighlighting(value: Boolean): this.type = set("suppressHighlighting", value.asInstanceOf[js.Any])
  
  @scala.inline
  def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
  
  @scala.inline
  def textBreakStrategy(value: simple | highQuality | balanced): this.type = set("textBreakStrategy", value.asInstanceOf[js.Any])
  
  @scala.inline
  def touchSoundDisabled(value: Boolean): this.type = set("touchSoundDisabled", value.asInstanceOf[js.Any])
  
  @scala.inline
  def touchSoundDisabledNull: this.type = set("touchSoundDisabled", null)
  
  @scala.inline
  def tvParallaxProperties(value: TVParallaxProperties): this.type = set("tvParallaxProperties", value.asInstanceOf[js.Any])
  
  @scala.inline
  def underlayColor(value: ColorValue): this.type = set("underlayColor", value.asInstanceOf[js.Any])
  
  @scala.inline
  def useForeground(value: Boolean): this.type = set("useForeground", value.asInstanceOf[js.Any])
}
