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
import typingsSlinky.reactNative.mod.ActivityIndicatorProperties
import typingsSlinky.reactNative.mod.BackgroundPropType
import typingsSlinky.reactNative.mod.Insets
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TVParallaxProperties
import typingsSlinky.reactNative.mod.TargetedEvent
import typingsSlinky.reactNative.mod.TextProperties
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.mod.IconNode
import typingsSlinky.reactNativeElements.mod.RecursivePartial
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.`no-hide-descendants`
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.assertive
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.auto
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.button
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.clear
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.no
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.none
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.outline
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.polite
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.radiobutton_checked
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.radiobutton_unchecked
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.solid
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.ButtonProps>> */
@js.native
trait RecursivePartialPartialBu extends js.Object {
  
  var TouchableComponent: js.UndefOr[RecursivePartial[js.UndefOr[ReactComponentClass[js.Object]]]] = js.native
  
  var ViewComponent: js.UndefOr[RecursivePartial[js.UndefOr[ReactComponentClass[_]]]] = js.native
  
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
  
  var background: js.UndefOr[RecursivePartial[js.UndefOr[BackgroundPropType]]] = js.native
  
  var buttonStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  
  var containerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  
  var delayLongPress: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var delayPressIn: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var delayPressOut: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var disabled: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var disabledStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  
  var disabledTitleStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.native
  
  var hasTVPreferredFocus: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var hitSlop: js.UndefOr[RecursivePartial[js.UndefOr[Insets]]] = js.native
  
  var icon: js.UndefOr[RecursivePartial[js.UndefOr[IconNode]]] = js.native
  
  var iconContainerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  
  var iconRight: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var importantForAccessibility: js.UndefOr[RecursivePartial[js.UndefOr[auto | yes | no | `no-hide-descendants`]]] = js.native
  
  var linearGradientProps: js.UndefOr[RecursivePartial[js.UndefOr[js.Object]]] = js.native
  
  var loading: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var loadingProps: js.UndefOr[RecursivePartial[js.UndefOr[ActivityIndicatorProperties]]] = js.native
  
  var loadingStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  
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
  
  var pressRetentionOffset: js.UndefOr[RecursivePartial[js.UndefOr[Insets]]] = js.native
  
  var raised: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var style: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  
  var testID: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  
  var title: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  
  var titleProps: js.UndefOr[RecursivePartial[js.UndefOr[TextProperties]]] = js.native
  
  var titleStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.native
  
  var touchSoundDisabled: js.UndefOr[RecursivePartial[js.UndefOr[Boolean | Null]]] = js.native
  
  var tvParallaxProperties: js.UndefOr[RecursivePartial[js.UndefOr[TVParallaxProperties]]] = js.native
  
  var `type`: js.UndefOr[RecursivePartial[js.UndefOr[solid | clear | outline]]] = js.native
  
  var useForeground: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
}
object RecursivePartialPartialBu {
  
  @scala.inline
  def apply(): RecursivePartialPartialBu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialPartialBu]
  }
  
  @scala.inline
  implicit class RecursivePartialPartialBuOps[Self <: RecursivePartialPartialBu] (val x: Self) extends AnyVal {
    
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
    def setTouchableComponent(value: RecursivePartial[js.UndefOr[ReactComponentClass[js.Object]]]): Self = this.set("TouchableComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchableComponent: Self = this.set("TouchableComponent", js.undefined)
    
    @scala.inline
    def setViewComponent(value: RecursivePartial[js.UndefOr[ReactComponentClass[_]]]): Self = this.set("ViewComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewComponent: Self = this.set("ViewComponent", js.undefined)
    
    @scala.inline
    def setAccessibilityActions(value: RecursivePartial[js.UndefOr[js.Array[AccessibilityActionInfo]]]): Self = this.set("accessibilityActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityActions: Self = this.set("accessibilityActions", js.undefined)
    
    @scala.inline
    def setAccessibilityComponentType(value: RecursivePartial[js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked]]): Self = this.set("accessibilityComponentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityComponentType: Self = this.set("accessibilityComponentType", js.undefined)
    
    @scala.inline
    def setAccessibilityElementsHidden(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityElementsHidden: Self = this.set("accessibilityElementsHidden", js.undefined)
    
    @scala.inline
    def setAccessibilityHint(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("accessibilityHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityHint: Self = this.set("accessibilityHint", js.undefined)
    
    @scala.inline
    def setAccessibilityIgnoresInvertColors(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityIgnoresInvertColors: Self = this.set("accessibilityIgnoresInvertColors", js.undefined)
    
    @scala.inline
    def setAccessibilityLabel(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityLabel: Self = this.set("accessibilityLabel", js.undefined)
    
    @scala.inline
    def setAccessibilityLiveRegion(value: RecursivePartial[js.UndefOr[none | polite | assertive]]): Self = this.set("accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityLiveRegion: Self = this.set("accessibilityLiveRegion", js.undefined)
    
    @scala.inline
    def setAccessibilityRole(value: RecursivePartial[js.UndefOr[AccessibilityRole]]): Self = this.set("accessibilityRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityRole: Self = this.set("accessibilityRole", js.undefined)
    
    @scala.inline
    def setAccessibilityState(value: RecursivePartial[js.UndefOr[AccessibilityState]]): Self = this.set("accessibilityState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityState: Self = this.set("accessibilityState", js.undefined)
    
    @scala.inline
    def setAccessibilityTraits(value: RecursivePartial[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]]): Self = this.set("accessibilityTraits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityTraits: Self = this.set("accessibilityTraits", js.undefined)
    
    @scala.inline
    def setAccessibilityValue(value: RecursivePartial[js.UndefOr[AccessibilityValue]]): Self = this.set("accessibilityValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityValue: Self = this.set("accessibilityValue", js.undefined)
    
    @scala.inline
    def setAccessibilityViewIsModal(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityViewIsModal: Self = this.set("accessibilityViewIsModal", js.undefined)
    
    @scala.inline
    def setAccessible(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("accessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessible: Self = this.set("accessible", js.undefined)
    
    @scala.inline
    def setActiveOpacity(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("activeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveOpacity: Self = this.set("activeOpacity", js.undefined)
    
    @scala.inline
    def setBackground(value: RecursivePartial[js.UndefOr[BackgroundPropType]]): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setButtonStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = this.set("buttonStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonStyle: Self = this.set("buttonStyle", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    
    @scala.inline
    def setDelayLongPress(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("delayLongPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayLongPress: Self = this.set("delayLongPress", js.undefined)
    
    @scala.inline
    def setDelayPressIn(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("delayPressIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayPressIn: Self = this.set("delayPressIn", js.undefined)
    
    @scala.inline
    def setDelayPressOut(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("delayPressOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayPressOut: Self = this.set("delayPressOut", js.undefined)
    
    @scala.inline
    def setDisabled(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDisabledStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = this.set("disabledStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledStyle: Self = this.set("disabledStyle", js.undefined)
    
    @scala.inline
    def setDisabledTitleStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = this.set("disabledTitleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledTitleStyle: Self = this.set("disabledTitleStyle", js.undefined)
    
    @scala.inline
    def setHasTVPreferredFocus(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasTVPreferredFocus: Self = this.set("hasTVPreferredFocus", js.undefined)
    
    @scala.inline
    def setHitSlop(value: RecursivePartial[js.UndefOr[Insets]]): Self = this.set("hitSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHitSlop: Self = this.set("hitSlop", js.undefined)
    
    @scala.inline
    def setIcon(value: RecursivePartial[js.UndefOr[IconNode]]): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIconContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = this.set("iconContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconContainerStyle: Self = this.set("iconContainerStyle", js.undefined)
    
    @scala.inline
    def setIconRight(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("iconRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconRight: Self = this.set("iconRight", js.undefined)
    
    @scala.inline
    def setImportantForAccessibility(value: RecursivePartial[js.UndefOr[auto | yes | no | `no-hide-descendants`]]): Self = this.set("importantForAccessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportantForAccessibility: Self = this.set("importantForAccessibility", js.undefined)
    
    @scala.inline
    def setLinearGradientProps(value: RecursivePartial[js.UndefOr[js.Object]]): Self = this.set("linearGradientProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinearGradientProps: Self = this.set("linearGradientProps", js.undefined)
    
    @scala.inline
    def setLoading(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    
    @scala.inline
    def setLoadingProps(value: RecursivePartial[js.UndefOr[ActivityIndicatorProperties]]): Self = this.set("loadingProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingProps: Self = this.set("loadingProps", js.undefined)
    
    @scala.inline
    def setLoadingStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = this.set("loadingStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingStyle: Self = this.set("loadingStyle", js.undefined)
    
    @scala.inline
    def setOnAccessibilityAction(
      value: RecursivePartial[
          js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ReadonlyactionNamestring], Unit]]
        ]
    ): Self = this.set("onAccessibilityAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAccessibilityAction: Self = this.set("onAccessibilityAction", js.undefined)
    
    @scala.inline
    def setOnAccessibilityEscape(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = this.set("onAccessibilityEscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAccessibilityEscape: Self = this.set("onAccessibilityEscape", js.undefined)
    
    @scala.inline
    def setOnAccessibilityTap(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = this.set("onAccessibilityTap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAccessibilityTap: Self = this.set("onAccessibilityTap", js.undefined)
    
    @scala.inline
    def setOnBlur(value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TargetedEvent], Unit]]]): Self = this.set("onBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnFocus(value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TargetedEvent], Unit]]]): Self = this.set("onFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnLayout(value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, Layout], Unit]]]): Self = this.set("onLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLayout: Self = this.set("onLayout", js.undefined)
    
    @scala.inline
    def setOnLongPress(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = this.set("onLongPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLongPress: Self = this.set("onLongPress", js.undefined)
    
    @scala.inline
    def setOnMagicTap(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = this.set("onMagicTap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMagicTap: Self = this.set("onMagicTap", js.undefined)
    
    @scala.inline
    def setOnPress(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = this.set("onPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    
    @scala.inline
    def setOnPressIn(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = this.set("onPressIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPressIn: Self = this.set("onPressIn", js.undefined)
    
    @scala.inline
    def setOnPressOut(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = this.set("onPressOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPressOut: Self = this.set("onPressOut", js.undefined)
    
    @scala.inline
    def setPressRetentionOffset(value: RecursivePartial[js.UndefOr[Insets]]): Self = this.set("pressRetentionOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePressRetentionOffset: Self = this.set("pressRetentionOffset", js.undefined)
    
    @scala.inline
    def setRaised(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("raised", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaised: Self = this.set("raised", js.undefined)
    
    @scala.inline
    def setStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTestID(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestID: Self = this.set("testID", js.undefined)
    
    @scala.inline
    def setTitle(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleProps(value: RecursivePartial[js.UndefOr[TextProperties]]): Self = this.set("titleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleProps: Self = this.set("titleProps", js.undefined)
    
    @scala.inline
    def setTitleStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = this.set("titleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleStyle: Self = this.set("titleStyle", js.undefined)
    
    @scala.inline
    def setTouchSoundDisabled(value: RecursivePartial[js.UndefOr[Boolean | Null]]): Self = this.set("touchSoundDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchSoundDisabled: Self = this.set("touchSoundDisabled", js.undefined)
    
    @scala.inline
    def setTvParallaxProperties(value: RecursivePartial[js.UndefOr[TVParallaxProperties]]): Self = this.set("tvParallaxProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTvParallaxProperties: Self = this.set("tvParallaxProperties", js.undefined)
    
    @scala.inline
    def setType(value: RecursivePartial[js.UndefOr[solid | clear | outline]]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUseForeground(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("useForeground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseForeground: Self = this.set("useForeground", js.undefined)
  }
}
