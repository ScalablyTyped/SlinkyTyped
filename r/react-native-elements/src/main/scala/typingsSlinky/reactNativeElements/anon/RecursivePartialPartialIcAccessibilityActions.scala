package typingsSlinky.reactNativeElements.anon

import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import typingsSlinky.reactNative.anon.Layout
import typingsSlinky.reactNative.anon.ReadonlyactionNamestring
import typingsSlinky.reactNative.mod.AccessibilityActionInfo
import typingsSlinky.reactNative.mod.AccessibilityRole
import typingsSlinky.reactNative.mod.AccessibilityState
import typingsSlinky.reactNative.mod.AccessibilityTrait
import typingsSlinky.reactNative.mod.AccessibilityValue
import typingsSlinky.reactNative.mod.BackgroundPropType
import typingsSlinky.reactNative.mod.ColorValue
import typingsSlinky.reactNative.mod.Insets
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TVParallaxProperties
import typingsSlinky.reactNative.mod.TargetedEvent
import typingsSlinky.reactNative.mod.TextLayoutEventData
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.mod.IconType
import typingsSlinky.reactNativeElements.mod.RecursivePartial
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.`no-hide-descendants`
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.all
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.assertive
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.auto
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.balanced
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.button
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.clip
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.email
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.head
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.highQuality
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.link
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.middle
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.no
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.none
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.phoneNumber
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.polite
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.radiobutton_checked
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.radiobutton_unchecked
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.simple
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.tail
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.yes
import typingsSlinky.reactNativeVectorIcons.iconMod.IconProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.IconProps>> */
@js.native
trait RecursivePartialPartialIcAccessibilityActions extends StObject {
  
  var Component: js.UndefOr[RecursivePartial[js.UndefOr[ReactComponentClass[js.Object]]]] = js.native
  
  var accessibilityActions: js.UndefOr[RecursivePartial[js.UndefOr[js.Array[AccessibilityActionInfo]]]] = js.native
  
  var accessibilityComponentType: js.UndefOr[
    RecursivePartial[js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked]]
  ] = js.native
  
  var accessibilityElementsHidden: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var accessibilityHint: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  
  var accessibilityIgnoresInvertColors: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var accessibilityLabel: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  
  var accessibilityLiveRegion: js.UndefOr[RecursivePartial[js.UndefOr[none | polite | assertive]]] = js.native
  
  var accessibilityRole: js.UndefOr[RecursivePartial[js.UndefOr[AccessibilityRole]]] = js.native
  
  var accessibilityState: js.UndefOr[RecursivePartial[js.UndefOr[AccessibilityState]]] = js.native
  
  var accessibilityTraits: js.UndefOr[RecursivePartial[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]]] = js.native
  
  var accessibilityValue: js.UndefOr[RecursivePartial[js.UndefOr[AccessibilityValue]]] = js.native
  
  var accessibilityViewIsModal: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var accessible: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var activeOpacity: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var adjustsFontSizeToFit: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var allowFontScaling: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var background: js.UndefOr[RecursivePartial[js.UndefOr[BackgroundPropType]]] = js.native
  
  var backgroundColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  
  var borderRadius: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var brand: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var color: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  
  var containerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  
  var dataDetectorType: js.UndefOr[RecursivePartial[js.UndefOr[Null | phoneNumber | link | email | none | all]]] = js.native
  
  var delayLongPress: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var delayPressIn: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var delayPressOut: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var disabled: js.UndefOr[RecursivePartial[js.UndefOr[Boolean | Null]]] = js.native
  
  var disabledStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  
  var ellipsizeMode: js.UndefOr[RecursivePartial[js.UndefOr[head | middle | tail | clip]]] = js.native
  
  var hasTVPreferredFocus: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var hitSlop: js.UndefOr[RecursivePartial[js.UndefOr[Insets]]] = js.native
  
  var iconProps: js.UndefOr[RecursivePartial[js.UndefOr[IconProps]]] = js.native
  
  var iconStyle: js.UndefOr[RecursivePartial[js.UndefOr[TextStyle]]] = js.native
  
  var importantForAccessibility: js.UndefOr[RecursivePartial[js.UndefOr[auto | yes | no | `no-hide-descendants`]]] = js.native
  
  var lineBreakMode: js.UndefOr[RecursivePartial[js.UndefOr[head | middle | tail | clip]]] = js.native
  
  var maxFontSizeMultiplier: js.UndefOr[RecursivePartial[js.UndefOr[Double | Null]]] = js.native
  
  var minimumFontScale: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var name: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  
  var nativeID: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  
  var numberOfLines: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var onAccessibilityAction: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ReadonlyactionNamestring], Unit]]
    ]
  ] = js.native
  
  var onAccessibilityEscape: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var onAccessibilityTap: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var onBlur: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TargetedEvent], Unit]]]
  ] = js.native
  
  var onFocus: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TargetedEvent], Unit]]]
  ] = js.native
  
  var onHideUnderlay: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var onLayout: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, Layout], Unit]]]
  ] = js.native
  
  var onLongPress: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.native
  
  var onMagicTap: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var onPress: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.native
  
  var onPressIn: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.native
  
  var onPressOut: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.native
  
  var onShowUnderlay: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var onTextLayout: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextLayoutEventData], Unit]]]
  ] = js.native
  
  var pressRetentionOffset: js.UndefOr[RecursivePartial[js.UndefOr[Insets]]] = js.native
  
  var raised: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var reverse: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var reverseColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  
  var selectable: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var selectionColor: js.UndefOr[RecursivePartial[js.UndefOr[ColorValue]]] = js.native
  
  var size: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var solid: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var style: js.UndefOr[RecursivePartial[js.UndefOr[ViewStyle | TextStyle]]] = js.native
  
  var suppressHighlighting: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var testID: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  
  var textBreakStrategy: js.UndefOr[RecursivePartial[js.UndefOr[simple | highQuality | balanced]]] = js.native
  
  var touchSoundDisabled: js.UndefOr[RecursivePartial[js.UndefOr[Boolean | Null]]] = js.native
  
  var tvParallaxProperties: js.UndefOr[RecursivePartial[js.UndefOr[TVParallaxProperties]]] = js.native
  
  var `type`: js.UndefOr[RecursivePartial[js.UndefOr[IconType]]] = js.native
  
  var underlayColor: js.UndefOr[RecursivePartial[js.UndefOr[ColorValue]]] = js.native
  
  var useForeground: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
}
object RecursivePartialPartialIcAccessibilityActions {
  
  @scala.inline
  def apply(): RecursivePartialPartialIcAccessibilityActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialPartialIcAccessibilityActions]
  }
  
  @scala.inline
  implicit class RecursivePartialPartialIcAccessibilityActionsMutableBuilder[Self <: RecursivePartialPartialIcAccessibilityActions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityActions(value: RecursivePartial[js.UndefOr[js.Array[AccessibilityActionInfo]]]): Self = StObject.set(x, "accessibilityActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityActionsUndefined: Self = StObject.set(x, "accessibilityActions", js.undefined)
    
    @scala.inline
    def setAccessibilityComponentType(value: RecursivePartial[js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked]]): Self = StObject.set(x, "accessibilityComponentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityComponentTypeUndefined: Self = StObject.set(x, "accessibilityComponentType", js.undefined)
    
    @scala.inline
    def setAccessibilityElementsHidden(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityElementsHiddenUndefined: Self = StObject.set(x, "accessibilityElementsHidden", js.undefined)
    
    @scala.inline
    def setAccessibilityHint(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
    
    @scala.inline
    def setAccessibilityIgnoresInvertColors(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
    
    @scala.inline
    def setAccessibilityLabel(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    @scala.inline
    def setAccessibilityLiveRegion(value: RecursivePartial[js.UndefOr[none | polite | assertive]]): Self = StObject.set(x, "accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLiveRegionUndefined: Self = StObject.set(x, "accessibilityLiveRegion", js.undefined)
    
    @scala.inline
    def setAccessibilityRole(value: RecursivePartial[js.UndefOr[AccessibilityRole]]): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
    
    @scala.inline
    def setAccessibilityState(value: RecursivePartial[js.UndefOr[AccessibilityState]]): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
    
    @scala.inline
    def setAccessibilityTraits(value: RecursivePartial[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]]): Self = StObject.set(x, "accessibilityTraits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityTraitsUndefined: Self = StObject.set(x, "accessibilityTraits", js.undefined)
    
    @scala.inline
    def setAccessibilityValue(value: RecursivePartial[js.UndefOr[AccessibilityValue]]): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
    
    @scala.inline
    def setAccessibilityViewIsModal(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
    
    @scala.inline
    def setAccessible(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
    
    @scala.inline
    def setActiveOpacity(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
    
    @scala.inline
    def setAdjustsFontSizeToFit(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "adjustsFontSizeToFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdjustsFontSizeToFitUndefined: Self = StObject.set(x, "adjustsFontSizeToFit", js.undefined)
    
    @scala.inline
    def setAllowFontScaling(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "allowFontScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowFontScalingUndefined: Self = StObject.set(x, "allowFontScaling", js.undefined)
    
    @scala.inline
    def setBackground(value: RecursivePartial[js.UndefOr[BackgroundPropType]]): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColor(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBorderRadius(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    @scala.inline
    def setBrand(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
    
    @scala.inline
    def setColor(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setComponent(value: RecursivePartial[js.UndefOr[ReactComponentClass[js.Object]]]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    @scala.inline
    def setDataDetectorType(value: RecursivePartial[js.UndefOr[Null | phoneNumber | link | email | none | all]]): Self = StObject.set(x, "dataDetectorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataDetectorTypeUndefined: Self = StObject.set(x, "dataDetectorType", js.undefined)
    
    @scala.inline
    def setDelayLongPress(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "delayLongPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayLongPressUndefined: Self = StObject.set(x, "delayLongPress", js.undefined)
    
    @scala.inline
    def setDelayPressIn(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "delayPressIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayPressInUndefined: Self = StObject.set(x, "delayPressIn", js.undefined)
    
    @scala.inline
    def setDelayPressOut(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "delayPressOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayPressOutUndefined: Self = StObject.set(x, "delayPressOut", js.undefined)
    
    @scala.inline
    def setDisabled(value: RecursivePartial[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = StObject.set(x, "disabledStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledStyleUndefined: Self = StObject.set(x, "disabledStyle", js.undefined)
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setEllipsizeMode(value: RecursivePartial[js.UndefOr[head | middle | tail | clip]]): Self = StObject.set(x, "ellipsizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsizeModeUndefined: Self = StObject.set(x, "ellipsizeMode", js.undefined)
    
    @scala.inline
    def setHasTVPreferredFocus(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
    
    @scala.inline
    def setHitSlop(value: RecursivePartial[js.UndefOr[Insets]]): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
    
    @scala.inline
    def setIconProps(value: RecursivePartial[js.UndefOr[IconProps]]): Self = StObject.set(x, "iconProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconPropsUndefined: Self = StObject.set(x, "iconProps", js.undefined)
    
    @scala.inline
    def setIconStyle(value: RecursivePartial[js.UndefOr[TextStyle]]): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
    
    @scala.inline
    def setImportantForAccessibility(value: RecursivePartial[js.UndefOr[auto | yes | no | `no-hide-descendants`]]): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
    
    @scala.inline
    def setLineBreakMode(value: RecursivePartial[js.UndefOr[head | middle | tail | clip]]): Self = StObject.set(x, "lineBreakMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineBreakModeUndefined: Self = StObject.set(x, "lineBreakMode", js.undefined)
    
    @scala.inline
    def setMaxFontSizeMultiplier(value: RecursivePartial[js.UndefOr[Double | Null]]): Self = StObject.set(x, "maxFontSizeMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFontSizeMultiplierUndefined: Self = StObject.set(x, "maxFontSizeMultiplier", js.undefined)
    
    @scala.inline
    def setMinimumFontScale(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "minimumFontScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumFontScaleUndefined: Self = StObject.set(x, "minimumFontScale", js.undefined)
    
    @scala.inline
    def setName(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNativeID(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
    
    @scala.inline
    def setNumberOfLines(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "numberOfLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfLinesUndefined: Self = StObject.set(x, "numberOfLines", js.undefined)
    
    @scala.inline
    def setOnAccessibilityAction(
      value: RecursivePartial[
          js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ReadonlyactionNamestring], Unit]]
        ]
    ): Self = StObject.set(x, "onAccessibilityAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
    
    @scala.inline
    def setOnAccessibilityEscape(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "onAccessibilityEscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
    
    @scala.inline
    def setOnAccessibilityTap(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "onAccessibilityTap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
    
    @scala.inline
    def setOnBlur(value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TargetedEvent], Unit]]]): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnFocus(value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TargetedEvent], Unit]]]): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setOnHideUnderlay(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "onHideUnderlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnHideUnderlayUndefined: Self = StObject.set(x, "onHideUnderlay", js.undefined)
    
    @scala.inline
    def setOnLayout(value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, Layout], Unit]]]): Self = StObject.set(x, "onLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
    
    @scala.inline
    def setOnLongPress(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = StObject.set(x, "onLongPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
    
    @scala.inline
    def setOnMagicTap(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "onMagicTap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
    
    @scala.inline
    def setOnPress(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = StObject.set(x, "onPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPressIn(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = StObject.set(x, "onPressIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPressInUndefined: Self = StObject.set(x, "onPressIn", js.undefined)
    
    @scala.inline
    def setOnPressOut(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = StObject.set(x, "onPressOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPressOutUndefined: Self = StObject.set(x, "onPressOut", js.undefined)
    
    @scala.inline
    def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    @scala.inline
    def setOnShowUnderlay(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "onShowUnderlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnShowUnderlayUndefined: Self = StObject.set(x, "onShowUnderlay", js.undefined)
    
    @scala.inline
    def setOnTextLayout(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextLayoutEventData], Unit]]]
    ): Self = StObject.set(x, "onTextLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTextLayoutUndefined: Self = StObject.set(x, "onTextLayout", js.undefined)
    
    @scala.inline
    def setPressRetentionOffset(value: RecursivePartial[js.UndefOr[Insets]]): Self = StObject.set(x, "pressRetentionOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPressRetentionOffsetUndefined: Self = StObject.set(x, "pressRetentionOffset", js.undefined)
    
    @scala.inline
    def setRaised(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "raised", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaisedUndefined: Self = StObject.set(x, "raised", js.undefined)
    
    @scala.inline
    def setReverse(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseColor(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "reverseColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseColorUndefined: Self = StObject.set(x, "reverseColor", js.undefined)
    
    @scala.inline
    def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    @scala.inline
    def setSelectable(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    @scala.inline
    def setSelectionColor(value: RecursivePartial[js.UndefOr[ColorValue]]): Self = StObject.set(x, "selectionColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionColorUndefined: Self = StObject.set(x, "selectionColor", js.undefined)
    
    @scala.inline
    def setSize(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSolid(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "solid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolidUndefined: Self = StObject.set(x, "solid", js.undefined)
    
    @scala.inline
    def setStyle(value: RecursivePartial[js.UndefOr[ViewStyle | TextStyle]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSuppressHighlighting(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "suppressHighlighting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressHighlightingUndefined: Self = StObject.set(x, "suppressHighlighting", js.undefined)
    
    @scala.inline
    def setTestID(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    @scala.inline
    def setTextBreakStrategy(value: RecursivePartial[js.UndefOr[simple | highQuality | balanced]]): Self = StObject.set(x, "textBreakStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextBreakStrategyUndefined: Self = StObject.set(x, "textBreakStrategy", js.undefined)
    
    @scala.inline
    def setTouchSoundDisabled(value: RecursivePartial[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "touchSoundDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchSoundDisabledUndefined: Self = StObject.set(x, "touchSoundDisabled", js.undefined)
    
    @scala.inline
    def setTvParallaxProperties(value: RecursivePartial[js.UndefOr[TVParallaxProperties]]): Self = StObject.set(x, "tvParallaxProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvParallaxPropertiesUndefined: Self = StObject.set(x, "tvParallaxProperties", js.undefined)
    
    @scala.inline
    def setType(value: RecursivePartial[js.UndefOr[IconType]]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUnderlayColor(value: RecursivePartial[js.UndefOr[ColorValue]]): Self = StObject.set(x, "underlayColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlayColorUndefined: Self = StObject.set(x, "underlayColor", js.undefined)
    
    @scala.inline
    def setUseForeground(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "useForeground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseForegroundUndefined: Self = StObject.set(x, "useForeground", js.undefined)
  }
}
