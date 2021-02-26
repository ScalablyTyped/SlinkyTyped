package typingsSlinky.reactNativeElements.anon

import slinky.core.SyntheticEvent
import typingsSlinky.reactNative.anon.Layout
import typingsSlinky.reactNative.anon.ReadonlyactionNamestring
import typingsSlinky.reactNative.mod.AccessibilityActionInfo
import typingsSlinky.reactNative.mod.AccessibilityRole
import typingsSlinky.reactNative.mod.AccessibilityState
import typingsSlinky.reactNative.mod.AccessibilityTrait
import typingsSlinky.reactNative.mod.AccessibilityValue
import typingsSlinky.reactNative.mod.Insets
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TVParallaxProperties
import typingsSlinky.reactNative.mod.TargetedEvent
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.`no-hide-descendants`
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.assertive
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.auto
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.button
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.no
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.none
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.polite
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.radiobutton_checked
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.radiobutton_unchecked
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-native.react-native.TouchableOpacityProps> & {  buttonStyle :react-native.react-native.StyleProp<react-native.react-native.ViewStyle> | undefined,   buttonTextStyle :react-native.react-native.StyleProp<react-native.react-native.TextStyle> | undefined,   color :string | undefined,   buttonDisabledStyle :react-native.react-native.StyleProp<react-native.react-native.ViewStyle> | undefined,   buttonDisabledTextStyle :react-native.react-native.StyleProp<react-native.react-native.ViewStyle> | undefined} */
@js.native
trait PartialTouchableOpacityPr extends StObject {
  
  var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.native
  
  var accessibilityComponentType: js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked] = js.native
  
  var accessibilityElementsHidden: js.UndefOr[Boolean] = js.native
  
  var accessibilityHint: js.UndefOr[String] = js.native
  
  var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.native
  
  var accessibilityLabel: js.UndefOr[String] = js.native
  
  var accessibilityLiveRegion: js.UndefOr[none | polite | assertive] = js.native
  
  var accessibilityRole: js.UndefOr[AccessibilityRole] = js.native
  
  var accessibilityState: js.UndefOr[AccessibilityState] = js.native
  
  var accessibilityTraits: js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]] = js.native
  
  var accessibilityValue: js.UndefOr[AccessibilityValue] = js.native
  
  var accessibilityViewIsModal: js.UndefOr[Boolean] = js.native
  
  var accessible: js.UndefOr[Boolean] = js.native
  
  var activeOpacity: js.UndefOr[Double] = js.native
  
  var buttonDisabledStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var buttonDisabledTextStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var buttonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var buttonTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var delayLongPress: js.UndefOr[Double] = js.native
  
  var delayPressIn: js.UndefOr[Double] = js.native
  
  var delayPressOut: js.UndefOr[Double] = js.native
  
  var disabled: js.UndefOr[Boolean | Null] = js.native
  
  var hasTVPreferredFocus: js.UndefOr[Boolean] = js.native
  
  var hitSlop: js.UndefOr[Insets] = js.native
  
  var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.native
  
  var onAccessibilityAction: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ReadonlyactionNamestring], Unit]] = js.native
  
  var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onBlur: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TargetedEvent], Unit]] = js.native
  
  var onFocus: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TargetedEvent], Unit]] = js.native
  
  var onLayout: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, Layout], Unit]] = js.native
  
  var onLongPress: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPress: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var onPressIn: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var onPressOut: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var pressRetentionOffset: js.UndefOr[Insets] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var testID: js.UndefOr[String] = js.native
  
  var touchSoundDisabled: js.UndefOr[Boolean | Null] = js.native
  
  var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.native
}
object PartialTouchableOpacityPr {
  
  @scala.inline
  def apply(): PartialTouchableOpacityPr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTouchableOpacityPr]
  }
  
  @scala.inline
  implicit class PartialTouchableOpacityPrMutableBuilder[Self <: PartialTouchableOpacityPr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityActions(value: js.Array[AccessibilityActionInfo]): Self = StObject.set(x, "accessibilityActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityActionsUndefined: Self = StObject.set(x, "accessibilityActions", js.undefined)
    
    @scala.inline
    def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = StObject.set(x, "accessibilityActions", js.Array(value :_*))
    
    @scala.inline
    def setAccessibilityComponentType(value: none | button | radiobutton_checked | radiobutton_unchecked): Self = StObject.set(x, "accessibilityComponentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityComponentTypeUndefined: Self = StObject.set(x, "accessibilityComponentType", js.undefined)
    
    @scala.inline
    def setAccessibilityElementsHidden(value: Boolean): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityElementsHiddenUndefined: Self = StObject.set(x, "accessibilityElementsHidden", js.undefined)
    
    @scala.inline
    def setAccessibilityHint(value: String): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
    
    @scala.inline
    def setAccessibilityIgnoresInvertColors(value: Boolean): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    @scala.inline
    def setAccessibilityLiveRegion(value: none | polite | assertive): Self = StObject.set(x, "accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLiveRegionUndefined: Self = StObject.set(x, "accessibilityLiveRegion", js.undefined)
    
    @scala.inline
    def setAccessibilityRole(value: AccessibilityRole): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
    
    @scala.inline
    def setAccessibilityState(value: AccessibilityState): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
    
    @scala.inline
    def setAccessibilityTraits(value: AccessibilityTrait | js.Array[AccessibilityTrait]): Self = StObject.set(x, "accessibilityTraits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityTraitsUndefined: Self = StObject.set(x, "accessibilityTraits", js.undefined)
    
    @scala.inline
    def setAccessibilityTraitsVarargs(value: AccessibilityTrait*): Self = StObject.set(x, "accessibilityTraits", js.Array(value :_*))
    
    @scala.inline
    def setAccessibilityValue(value: AccessibilityValue): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
    
    @scala.inline
    def setAccessibilityViewIsModal(value: Boolean): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
    
    @scala.inline
    def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
    
    @scala.inline
    def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
    
    @scala.inline
    def setButtonDisabledStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "buttonDisabledStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonDisabledStyleNull: Self = StObject.set(x, "buttonDisabledStyle", null)
    
    @scala.inline
    def setButtonDisabledStyleUndefined: Self = StObject.set(x, "buttonDisabledStyle", js.undefined)
    
    @scala.inline
    def setButtonDisabledTextStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "buttonDisabledTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonDisabledTextStyleNull: Self = StObject.set(x, "buttonDisabledTextStyle", null)
    
    @scala.inline
    def setButtonDisabledTextStyleUndefined: Self = StObject.set(x, "buttonDisabledTextStyle", js.undefined)
    
    @scala.inline
    def setButtonStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "buttonStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonStyleNull: Self = StObject.set(x, "buttonStyle", null)
    
    @scala.inline
    def setButtonStyleUndefined: Self = StObject.set(x, "buttonStyle", js.undefined)
    
    @scala.inline
    def setButtonTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "buttonTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonTextStyleNull: Self = StObject.set(x, "buttonTextStyle", null)
    
    @scala.inline
    def setButtonTextStyleUndefined: Self = StObject.set(x, "buttonTextStyle", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDelayLongPress(value: Double): Self = StObject.set(x, "delayLongPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayLongPressUndefined: Self = StObject.set(x, "delayLongPress", js.undefined)
    
    @scala.inline
    def setDelayPressIn(value: Double): Self = StObject.set(x, "delayPressIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayPressInUndefined: Self = StObject.set(x, "delayPressIn", js.undefined)
    
    @scala.inline
    def setDelayPressOut(value: Double): Self = StObject.set(x, "delayPressOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayPressOutUndefined: Self = StObject.set(x, "delayPressOut", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledNull: Self = StObject.set(x, "disabled", null)
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setHasTVPreferredFocus(value: Boolean): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
    
    @scala.inline
    def setHitSlop(value: Insets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
    
    @scala.inline
    def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
    
    @scala.inline
    def setOnAccessibilityAction(value: SyntheticEvent[NodeHandle, ReadonlyactionNamestring] => Unit): Self = StObject.set(x, "onAccessibilityAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
    
    @scala.inline
    def setOnAccessibilityEscape(value: () => Unit): Self = StObject.set(x, "onAccessibilityEscape", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
    
    @scala.inline
    def setOnAccessibilityTap(value: () => Unit): Self = StObject.set(x, "onAccessibilityTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
    
    @scala.inline
    def setOnBlur(value: SyntheticEvent[NodeHandle, TargetedEvent] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnFocus(value: SyntheticEvent[NodeHandle, TargetedEvent] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setOnLayout(value: SyntheticEvent[NodeHandle, Layout] => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
    
    @scala.inline
    def setOnLongPress(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
    
    @scala.inline
    def setOnMagicTap(value: () => Unit): Self = StObject.set(x, "onMagicTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
    
    @scala.inline
    def setOnPress(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPressIn(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onPressIn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPressInUndefined: Self = StObject.set(x, "onPressIn", js.undefined)
    
    @scala.inline
    def setOnPressOut(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onPressOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPressOutUndefined: Self = StObject.set(x, "onPressOut", js.undefined)
    
    @scala.inline
    def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    @scala.inline
    def setPressRetentionOffset(value: Insets): Self = StObject.set(x, "pressRetentionOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPressRetentionOffsetUndefined: Self = StObject.set(x, "pressRetentionOffset", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    @scala.inline
    def setTouchSoundDisabled(value: Boolean): Self = StObject.set(x, "touchSoundDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchSoundDisabledNull: Self = StObject.set(x, "touchSoundDisabled", null)
    
    @scala.inline
    def setTouchSoundDisabledUndefined: Self = StObject.set(x, "touchSoundDisabled", js.undefined)
    
    @scala.inline
    def setTvParallaxProperties(value: TVParallaxProperties): Self = StObject.set(x, "tvParallaxProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvParallaxPropertiesUndefined: Self = StObject.set(x, "tvParallaxProperties", js.undefined)
  }
}
