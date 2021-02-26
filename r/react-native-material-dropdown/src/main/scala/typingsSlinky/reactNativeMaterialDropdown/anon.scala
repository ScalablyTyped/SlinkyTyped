package typingsSlinky.reactNativeMaterialDropdown

import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
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
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeMaterialDropdown.mod.DropDownData
import typingsSlinky.reactNativeMaterialDropdown.mod.DropDownInsets
import typingsSlinky.reactNativeMaterialDropdown.mod.DropDownMargins
import typingsSlinky.reactNativeMaterialDropdown.mod.DropDownOffset
import typingsSlinky.reactNativeMaterialDropdown.mod.DropDownProps
import typingsSlinky.reactNativeMaterialDropdown.mod.RenderBaseProps
import typingsSlinky.reactNativeMaterialDropdown.reactNativeMaterialDropdownStrings.`no-hide-descendants`
import typingsSlinky.reactNativeMaterialDropdown.reactNativeMaterialDropdownStrings.assertive
import typingsSlinky.reactNativeMaterialDropdown.reactNativeMaterialDropdownStrings.auto
import typingsSlinky.reactNativeMaterialDropdown.reactNativeMaterialDropdownStrings.button
import typingsSlinky.reactNativeMaterialDropdown.reactNativeMaterialDropdownStrings.no
import typingsSlinky.reactNativeMaterialDropdown.reactNativeMaterialDropdownStrings.none
import typingsSlinky.reactNativeMaterialDropdown.reactNativeMaterialDropdownStrings.polite
import typingsSlinky.reactNativeMaterialDropdown.reactNativeMaterialDropdownStrings.radiobutton_checked
import typingsSlinky.reactNativeMaterialDropdown.reactNativeMaterialDropdownStrings.radiobutton_unchecked
import typingsSlinky.reactNativeMaterialDropdown.reactNativeMaterialDropdownStrings.yes
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<react-native-material-dropdown.react-native-material-dropdown.DropDownProps> */
  @js.native
  trait PartialDropDownProps extends StObject {
    
    var absoluteRTLLayout: js.UndefOr[Boolean] = js.native
    
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
    
    var animationDuration: js.UndefOr[Double] = js.native
    
    var baseColor: js.UndefOr[String] = js.native
    
    var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var data: js.UndefOr[js.Array[DropDownData]] = js.native
    
    var delayLongPress: js.UndefOr[Double] = js.native
    
    var delayPressIn: js.UndefOr[Double] = js.native
    
    var delayPressOut: js.UndefOr[Double] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var disabledItemColor: js.UndefOr[String] = js.native
    
    var dropdownMargins: js.UndefOr[DropDownMargins] = js.native
    
    var dropdownOffset: js.UndefOr[DropDownOffset] = js.native
    
    var dropdownPosition: js.UndefOr[Double] = js.native
    
    var fontSize: js.UndefOr[Double] = js.native
    
    var hasTVPreferredFocus: js.UndefOr[Boolean] = js.native
    
    var hitSlop: js.UndefOr[DropDownInsets] = js.native
    
    var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.native
    
    var inputContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var itemColor: js.UndefOr[String] = js.native
    
    var itemCount: js.UndefOr[Double] = js.native
    
    var itemPadding: js.UndefOr[Double] = js.native
    
    var itemTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
    
    var label: js.UndefOr[String] = js.native
    
    var labelExtractor: js.UndefOr[js.Function2[/* item */ DropDownData, /* index */ Double, String]] = js.native
    
    var labelFontSize: js.UndefOr[Double] = js.native
    
    var labelTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
    
    var onAccessibilityAction: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ReadonlyactionNamestring], Unit]] = js.native
    
    var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onBlur: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onChangeText: js.UndefOr[
        js.Function3[/* value */ String, /* index */ Double, /* data */ js.Array[DropDownData], Unit]
      ] = js.native
    
    var onFocus: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onLayout: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, Layout], Unit]] = js.native
    
    var onLongPress: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
    
    var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onPress: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
    
    var onPressIn: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
    
    var onPressOut: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
    
    var overlayStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var pickerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var pressRetentionOffset: js.UndefOr[Insets] = js.native
    
    var propsExtractor: js.UndefOr[js.Function2[/* item */ DropDownData, /* index */ Double, Partial[this.type]]] = js.native
    
    var renderAccessory: js.UndefOr[js.Function0[ReactElement]] = js.native
    
    var renderBase: js.UndefOr[js.Function1[/* props */ RenderBaseProps, ReactElement]] = js.native
    
    var rippleCentered: js.UndefOr[Boolean] = js.native
    
    var rippleColor: js.UndefOr[String] = js.native
    
    var rippleDuration: js.UndefOr[Double] = js.native
    
    var rippleInsets: js.UndefOr[DropDownInsets] = js.native
    
    var rippleOpacity: js.UndefOr[Double] = js.native
    
    var rippleSequential: js.UndefOr[Boolean] = js.native
    
    var selectedItemColor: js.UndefOr[String] = js.native
    
    var shadeOpacity: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var supportedOrientations: js.UndefOr[js.Array[String]] = js.native
    
    var testID: js.UndefOr[String] = js.native
    
    var textColor: js.UndefOr[String] = js.native
    
    var touchSoundDisabled: js.UndefOr[Boolean | Null] = js.native
    
    var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.native
    
    var useNativeDriver: js.UndefOr[Boolean] = js.native
    
    var value: js.UndefOr[String | Double] = js.native
    
    var valueExtractor: js.UndefOr[js.Function2[/* item */ DropDownData, /* index */ Double, String]] = js.native
  }
  object PartialDropDownProps {
    
    @scala.inline
    def apply(): PartialDropDownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDropDownProps]
    }
    
    @scala.inline
    implicit class PartialDropDownPropsMutableBuilder[Self <: PartialDropDownProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsoluteRTLLayout(value: Boolean): Self = StObject.set(x, "absoluteRTLLayout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsoluteRTLLayoutUndefined: Self = StObject.set(x, "absoluteRTLLayout", js.undefined)
      
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
      def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      @scala.inline
      def setBaseColor(value: String): Self = StObject.set(x, "baseColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseColorUndefined: Self = StObject.set(x, "baseColor", js.undefined)
      
      @scala.inline
      def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
      
      @scala.inline
      def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      @scala.inline
      def setData(value: js.Array[DropDownData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDataVarargs(value: DropDownData*): Self = StObject.set(x, "data", js.Array(value :_*))
      
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
      def setDisabledItemColor(value: String): Self = StObject.set(x, "disabledItemColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledItemColorUndefined: Self = StObject.set(x, "disabledItemColor", js.undefined)
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDropdownMargins(value: DropDownMargins): Self = StObject.set(x, "dropdownMargins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownMarginsUndefined: Self = StObject.set(x, "dropdownMargins", js.undefined)
      
      @scala.inline
      def setDropdownOffset(value: DropDownOffset): Self = StObject.set(x, "dropdownOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownOffsetUndefined: Self = StObject.set(x, "dropdownOffset", js.undefined)
      
      @scala.inline
      def setDropdownPosition(value: Double): Self = StObject.set(x, "dropdownPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownPositionUndefined: Self = StObject.set(x, "dropdownPosition", js.undefined)
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setHasTVPreferredFocus(value: Boolean): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
      
      @scala.inline
      def setHitSlop(value: DropDownInsets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
      
      @scala.inline
      def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
      
      @scala.inline
      def setInputContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "inputContainerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputContainerStyleNull: Self = StObject.set(x, "inputContainerStyle", null)
      
      @scala.inline
      def setInputContainerStyleUndefined: Self = StObject.set(x, "inputContainerStyle", js.undefined)
      
      @scala.inline
      def setItemColor(value: String): Self = StObject.set(x, "itemColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemColorUndefined: Self = StObject.set(x, "itemColor", js.undefined)
      
      @scala.inline
      def setItemCount(value: Double): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemCountUndefined: Self = StObject.set(x, "itemCount", js.undefined)
      
      @scala.inline
      def setItemPadding(value: Double): Self = StObject.set(x, "itemPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemPaddingUndefined: Self = StObject.set(x, "itemPadding", js.undefined)
      
      @scala.inline
      def setItemTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "itemTextStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemTextStyleNull: Self = StObject.set(x, "itemTextStyle", null)
      
      @scala.inline
      def setItemTextStyleUndefined: Self = StObject.set(x, "itemTextStyle", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelExtractor(value: (/* item */ DropDownData, /* index */ Double) => String): Self = StObject.set(x, "labelExtractor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLabelExtractorUndefined: Self = StObject.set(x, "labelExtractor", js.undefined)
      
      @scala.inline
      def setLabelFontSize(value: Double): Self = StObject.set(x, "labelFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontSizeUndefined: Self = StObject.set(x, "labelFontSize", js.undefined)
      
      @scala.inline
      def setLabelTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "labelTextStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelTextStyleNull: Self = StObject.set(x, "labelTextStyle", null)
      
      @scala.inline
      def setLabelTextStyleUndefined: Self = StObject.set(x, "labelTextStyle", js.undefined)
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
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
      def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChangeText(value: (/* value */ String, /* index */ Double, /* data */ js.Array[DropDownData]) => Unit): Self = StObject.set(x, "onChangeText", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnChangeTextUndefined: Self = StObject.set(x, "onChangeText", js.undefined)
      
      @scala.inline
      def setOnFocus(value: () => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
      
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
      def setOverlayStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayStyleNull: Self = StObject.set(x, "overlayStyle", null)
      
      @scala.inline
      def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
      
      @scala.inline
      def setPickerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "pickerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerStyleNull: Self = StObject.set(x, "pickerStyle", null)
      
      @scala.inline
      def setPickerStyleUndefined: Self = StObject.set(x, "pickerStyle", js.undefined)
      
      @scala.inline
      def setPressRetentionOffset(value: Insets): Self = StObject.set(x, "pressRetentionOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPressRetentionOffsetUndefined: Self = StObject.set(x, "pressRetentionOffset", js.undefined)
      
      @scala.inline
      def setPropsExtractor(value: (/* item */ DropDownData, /* index */ Double) => Partial[PartialDropDownProps]): Self = StObject.set(x, "propsExtractor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPropsExtractorUndefined: Self = StObject.set(x, "propsExtractor", js.undefined)
      
      @scala.inline
      def setRenderAccessory(value: () => ReactElement): Self = StObject.set(x, "renderAccessory", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRenderAccessoryUndefined: Self = StObject.set(x, "renderAccessory", js.undefined)
      
      @scala.inline
      def setRenderBase(value: /* props */ RenderBaseProps => ReactElement): Self = StObject.set(x, "renderBase", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderBaseUndefined: Self = StObject.set(x, "renderBase", js.undefined)
      
      @scala.inline
      def setRippleCentered(value: Boolean): Self = StObject.set(x, "rippleCentered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleCenteredUndefined: Self = StObject.set(x, "rippleCentered", js.undefined)
      
      @scala.inline
      def setRippleColor(value: String): Self = StObject.set(x, "rippleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleColorUndefined: Self = StObject.set(x, "rippleColor", js.undefined)
      
      @scala.inline
      def setRippleDuration(value: Double): Self = StObject.set(x, "rippleDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleDurationUndefined: Self = StObject.set(x, "rippleDuration", js.undefined)
      
      @scala.inline
      def setRippleInsets(value: DropDownInsets): Self = StObject.set(x, "rippleInsets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleInsetsUndefined: Self = StObject.set(x, "rippleInsets", js.undefined)
      
      @scala.inline
      def setRippleOpacity(value: Double): Self = StObject.set(x, "rippleOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleOpacityUndefined: Self = StObject.set(x, "rippleOpacity", js.undefined)
      
      @scala.inline
      def setRippleSequential(value: Boolean): Self = StObject.set(x, "rippleSequential", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleSequentialUndefined: Self = StObject.set(x, "rippleSequential", js.undefined)
      
      @scala.inline
      def setSelectedItemColor(value: String): Self = StObject.set(x, "selectedItemColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedItemColorUndefined: Self = StObject.set(x, "selectedItemColor", js.undefined)
      
      @scala.inline
      def setShadeOpacity(value: Double): Self = StObject.set(x, "shadeOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadeOpacityUndefined: Self = StObject.set(x, "shadeOpacity", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSupportedOrientations(value: js.Array[String]): Self = StObject.set(x, "supportedOrientations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedOrientationsUndefined: Self = StObject.set(x, "supportedOrientations", js.undefined)
      
      @scala.inline
      def setSupportedOrientationsVarargs(value: String*): Self = StObject.set(x, "supportedOrientations", js.Array(value :_*))
      
      @scala.inline
      def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      @scala.inline
      def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
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
      
      @scala.inline
      def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseNativeDriverUndefined: Self = StObject.set(x, "useNativeDriver", js.undefined)
      
      @scala.inline
      def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueExtractor(value: (/* item */ DropDownData, /* index */ Double) => String): Self = StObject.set(x, "valueExtractor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setValueExtractorUndefined: Self = StObject.set(x, "valueExtractor", js.undefined)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined std.Partial<react-native-material-dropdown.react-native-material-dropdown.DropDownProps> */
  @js.native
  trait PartialDropDownPropsAbsoluteRTLLayout extends StObject {
    
    var absoluteRTLLayout: js.UndefOr[Boolean] = js.native
    
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
    
    var animationDuration: js.UndefOr[Double] = js.native
    
    var baseColor: js.UndefOr[String] = js.native
    
    var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var data: js.UndefOr[js.Array[DropDownData]] = js.native
    
    var delayLongPress: js.UndefOr[Double] = js.native
    
    var delayPressIn: js.UndefOr[Double] = js.native
    
    var delayPressOut: js.UndefOr[Double] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var disabledItemColor: js.UndefOr[String] = js.native
    
    var dropdownMargins: js.UndefOr[DropDownMargins] = js.native
    
    var dropdownOffset: js.UndefOr[DropDownOffset] = js.native
    
    var dropdownPosition: js.UndefOr[Double] = js.native
    
    var fontSize: js.UndefOr[Double] = js.native
    
    var hasTVPreferredFocus: js.UndefOr[Boolean] = js.native
    
    var hitSlop: js.UndefOr[DropDownInsets] = js.native
    
    var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.native
    
    var inputContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var itemColor: js.UndefOr[String] = js.native
    
    var itemCount: js.UndefOr[Double] = js.native
    
    var itemPadding: js.UndefOr[Double] = js.native
    
    var itemTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
    
    var label: js.UndefOr[String] = js.native
    
    var labelExtractor: js.UndefOr[js.Function2[/* item */ this.type, /* index */ Double, String]] = js.native
    
    var labelFontSize: js.UndefOr[Double] = js.native
    
    var labelTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
    
    var onAccessibilityAction: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ReadonlyactionNamestring], Unit]] = js.native
    
    var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onBlur: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onChangeText: js.UndefOr[
        js.Function3[/* value */ String, /* index */ Double, /* data */ js.Array[this.type], Unit]
      ] = js.native
    
    var onFocus: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onLayout: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, Layout], Unit]] = js.native
    
    var onLongPress: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
    
    var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onPress: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
    
    var onPressIn: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
    
    var onPressOut: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
    
    var overlayStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var pickerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var pressRetentionOffset: js.UndefOr[Insets] = js.native
    
    var propsExtractor: js.UndefOr[js.Function2[/* item */ this.type, /* index */ Double, Partial[DropDownProps]]] = js.native
    
    var renderAccessory: js.UndefOr[js.Function0[ReactElement]] = js.native
    
    var renderBase: js.UndefOr[js.Function1[/* props */ RenderBaseProps, ReactElement]] = js.native
    
    var rippleCentered: js.UndefOr[Boolean] = js.native
    
    var rippleColor: js.UndefOr[String] = js.native
    
    var rippleDuration: js.UndefOr[Double] = js.native
    
    var rippleInsets: js.UndefOr[DropDownInsets] = js.native
    
    var rippleOpacity: js.UndefOr[Double] = js.native
    
    var rippleSequential: js.UndefOr[Boolean] = js.native
    
    var selectedItemColor: js.UndefOr[String] = js.native
    
    var shadeOpacity: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var supportedOrientations: js.UndefOr[js.Array[String]] = js.native
    
    var testID: js.UndefOr[String] = js.native
    
    var textColor: js.UndefOr[String] = js.native
    
    var touchSoundDisabled: js.UndefOr[Boolean | Null] = js.native
    
    var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.native
    
    var useNativeDriver: js.UndefOr[Boolean] = js.native
    
    var value: js.UndefOr[String | Double] = js.native
    
    var valueExtractor: js.UndefOr[js.Function2[/* item */ this.type, /* index */ Double, String]] = js.native
  }
  object PartialDropDownPropsAbsoluteRTLLayout {
    
    @scala.inline
    def apply(): PartialDropDownPropsAbsoluteRTLLayout = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDropDownPropsAbsoluteRTLLayout]
    }
    
    @scala.inline
    implicit class PartialDropDownPropsAbsoluteRTLLayoutMutableBuilder[Self <: PartialDropDownPropsAbsoluteRTLLayout] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsoluteRTLLayout(value: Boolean): Self = StObject.set(x, "absoluteRTLLayout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsoluteRTLLayoutUndefined: Self = StObject.set(x, "absoluteRTLLayout", js.undefined)
      
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
      def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      @scala.inline
      def setBaseColor(value: String): Self = StObject.set(x, "baseColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseColorUndefined: Self = StObject.set(x, "baseColor", js.undefined)
      
      @scala.inline
      def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
      
      @scala.inline
      def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      @scala.inline
      def setData(value: js.Array[DropDownData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDataVarargs(value: DropDownData*): Self = StObject.set(x, "data", js.Array(value :_*))
      
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
      def setDisabledItemColor(value: String): Self = StObject.set(x, "disabledItemColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledItemColorUndefined: Self = StObject.set(x, "disabledItemColor", js.undefined)
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDropdownMargins(value: DropDownMargins): Self = StObject.set(x, "dropdownMargins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownMarginsUndefined: Self = StObject.set(x, "dropdownMargins", js.undefined)
      
      @scala.inline
      def setDropdownOffset(value: DropDownOffset): Self = StObject.set(x, "dropdownOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownOffsetUndefined: Self = StObject.set(x, "dropdownOffset", js.undefined)
      
      @scala.inline
      def setDropdownPosition(value: Double): Self = StObject.set(x, "dropdownPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownPositionUndefined: Self = StObject.set(x, "dropdownPosition", js.undefined)
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setHasTVPreferredFocus(value: Boolean): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
      
      @scala.inline
      def setHitSlop(value: DropDownInsets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
      
      @scala.inline
      def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
      
      @scala.inline
      def setInputContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "inputContainerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputContainerStyleNull: Self = StObject.set(x, "inputContainerStyle", null)
      
      @scala.inline
      def setInputContainerStyleUndefined: Self = StObject.set(x, "inputContainerStyle", js.undefined)
      
      @scala.inline
      def setItemColor(value: String): Self = StObject.set(x, "itemColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemColorUndefined: Self = StObject.set(x, "itemColor", js.undefined)
      
      @scala.inline
      def setItemCount(value: Double): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemCountUndefined: Self = StObject.set(x, "itemCount", js.undefined)
      
      @scala.inline
      def setItemPadding(value: Double): Self = StObject.set(x, "itemPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemPaddingUndefined: Self = StObject.set(x, "itemPadding", js.undefined)
      
      @scala.inline
      def setItemTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "itemTextStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemTextStyleNull: Self = StObject.set(x, "itemTextStyle", null)
      
      @scala.inline
      def setItemTextStyleUndefined: Self = StObject.set(x, "itemTextStyle", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelExtractor(value: (PartialDropDownPropsAbsoluteRTLLayout, /* index */ Double) => String): Self = StObject.set(x, "labelExtractor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLabelExtractorUndefined: Self = StObject.set(x, "labelExtractor", js.undefined)
      
      @scala.inline
      def setLabelFontSize(value: Double): Self = StObject.set(x, "labelFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontSizeUndefined: Self = StObject.set(x, "labelFontSize", js.undefined)
      
      @scala.inline
      def setLabelTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "labelTextStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelTextStyleNull: Self = StObject.set(x, "labelTextStyle", null)
      
      @scala.inline
      def setLabelTextStyleUndefined: Self = StObject.set(x, "labelTextStyle", js.undefined)
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
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
      def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChangeText(
        value: (/* value */ String, /* index */ Double, /* data */ js.Array[PartialDropDownPropsAbsoluteRTLLayout]) => Unit
      ): Self = StObject.set(x, "onChangeText", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnChangeTextUndefined: Self = StObject.set(x, "onChangeText", js.undefined)
      
      @scala.inline
      def setOnFocus(value: () => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
      
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
      def setOverlayStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayStyleNull: Self = StObject.set(x, "overlayStyle", null)
      
      @scala.inline
      def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
      
      @scala.inline
      def setPickerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "pickerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerStyleNull: Self = StObject.set(x, "pickerStyle", null)
      
      @scala.inline
      def setPickerStyleUndefined: Self = StObject.set(x, "pickerStyle", js.undefined)
      
      @scala.inline
      def setPressRetentionOffset(value: Insets): Self = StObject.set(x, "pressRetentionOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPressRetentionOffsetUndefined: Self = StObject.set(x, "pressRetentionOffset", js.undefined)
      
      @scala.inline
      def setPropsExtractor(value: (PartialDropDownPropsAbsoluteRTLLayout, /* index */ Double) => Partial[DropDownProps]): Self = StObject.set(x, "propsExtractor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPropsExtractorUndefined: Self = StObject.set(x, "propsExtractor", js.undefined)
      
      @scala.inline
      def setRenderAccessory(value: () => ReactElement): Self = StObject.set(x, "renderAccessory", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRenderAccessoryUndefined: Self = StObject.set(x, "renderAccessory", js.undefined)
      
      @scala.inline
      def setRenderBase(value: /* props */ RenderBaseProps => ReactElement): Self = StObject.set(x, "renderBase", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderBaseUndefined: Self = StObject.set(x, "renderBase", js.undefined)
      
      @scala.inline
      def setRippleCentered(value: Boolean): Self = StObject.set(x, "rippleCentered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleCenteredUndefined: Self = StObject.set(x, "rippleCentered", js.undefined)
      
      @scala.inline
      def setRippleColor(value: String): Self = StObject.set(x, "rippleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleColorUndefined: Self = StObject.set(x, "rippleColor", js.undefined)
      
      @scala.inline
      def setRippleDuration(value: Double): Self = StObject.set(x, "rippleDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleDurationUndefined: Self = StObject.set(x, "rippleDuration", js.undefined)
      
      @scala.inline
      def setRippleInsets(value: DropDownInsets): Self = StObject.set(x, "rippleInsets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleInsetsUndefined: Self = StObject.set(x, "rippleInsets", js.undefined)
      
      @scala.inline
      def setRippleOpacity(value: Double): Self = StObject.set(x, "rippleOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleOpacityUndefined: Self = StObject.set(x, "rippleOpacity", js.undefined)
      
      @scala.inline
      def setRippleSequential(value: Boolean): Self = StObject.set(x, "rippleSequential", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleSequentialUndefined: Self = StObject.set(x, "rippleSequential", js.undefined)
      
      @scala.inline
      def setSelectedItemColor(value: String): Self = StObject.set(x, "selectedItemColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedItemColorUndefined: Self = StObject.set(x, "selectedItemColor", js.undefined)
      
      @scala.inline
      def setShadeOpacity(value: Double): Self = StObject.set(x, "shadeOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadeOpacityUndefined: Self = StObject.set(x, "shadeOpacity", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSupportedOrientations(value: js.Array[String]): Self = StObject.set(x, "supportedOrientations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedOrientationsUndefined: Self = StObject.set(x, "supportedOrientations", js.undefined)
      
      @scala.inline
      def setSupportedOrientationsVarargs(value: String*): Self = StObject.set(x, "supportedOrientations", js.Array(value :_*))
      
      @scala.inline
      def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      @scala.inline
      def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
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
      
      @scala.inline
      def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseNativeDriverUndefined: Self = StObject.set(x, "useNativeDriver", js.undefined)
      
      @scala.inline
      def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueExtractor(value: (PartialDropDownPropsAbsoluteRTLLayout, /* index */ Double) => String): Self = StObject.set(x, "valueExtractor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setValueExtractorUndefined: Self = StObject.set(x, "valueExtractor", js.undefined)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
