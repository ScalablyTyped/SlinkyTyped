package typingsSlinky.reactNativeElements.anon

import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.anon.ReadonlyactionNamestring
import typingsSlinky.reactNative.mod.AccessibilityActionInfo
import typingsSlinky.reactNative.mod.AccessibilityRole
import typingsSlinky.reactNative.mod.AccessibilityState
import typingsSlinky.reactNative.mod.AccessibilityTrait
import typingsSlinky.reactNative.mod.AccessibilityValue
import typingsSlinky.reactNative.mod.ColorValue
import typingsSlinky.reactNative.mod.Insets
import typingsSlinky.reactNative.mod.LayoutChangeEvent
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.SwitchProperties
import typingsSlinky.reactNative.mod.TVParallaxProperties
import typingsSlinky.reactNative.mod.TargetedEvent
import typingsSlinky.reactNative.mod.TextProperties
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.mod.BadgeProps
import typingsSlinky.reactNativeElements.mod.ButtonGroupProps
import typingsSlinky.reactNativeElements.mod.CheckBoxProps
import typingsSlinky.reactNativeElements.mod.InputProps
import typingsSlinky.reactNativeElements.mod.RecursivePartial
import typingsSlinky.reactNativeElements.mod.ScaleProps
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.ListItemProps>> */
@js.native
trait RecursivePartialPartialLi extends js.Object {
  
  var Component: js.UndefOr[RecursivePartial[js.UndefOr[ReactComponentClass[js.Object]]]] = js.native
  
  var ViewComponent: js.UndefOr[RecursivePartial[js.UndefOr[ReactComponentClass[js.Object]]]] = js.native
  
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
  
  var badge: js.UndefOr[RecursivePartial[js.UndefOr[BadgeProps]]] = js.native
  
  var bottomDivider: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var buttonGroup: js.UndefOr[RecursivePartial[js.UndefOr[ButtonGroupProps]]] = js.native
  
  var checkBox: js.UndefOr[RecursivePartial[js.UndefOr[CheckBoxProps]]] = js.native
  
  var checkmark: js.UndefOr[RecursivePartial[js.UndefOr[Boolean | PartialIconProps | ReactElement]]] = js.native
  
  var chevron: js.UndefOr[RecursivePartial[js.UndefOr[Boolean | PartialIconProps | ReactElement]]] = js.native
  
  var containerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  
  var contentContainerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  
  var delayLongPress: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var delayPressIn: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var delayPressOut: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var disabled: js.UndefOr[RecursivePartial[js.UndefOr[Boolean | Null]]] = js.native
  
  var disabledStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  
  var hasTVPreferredFocus: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var hitSlop: js.UndefOr[RecursivePartial[js.UndefOr[Insets]]] = js.native
  
  var importantForAccessibility: js.UndefOr[RecursivePartial[js.UndefOr[auto | yes | no | `no-hide-descendants`]]] = js.native
  
  var input: js.UndefOr[RecursivePartial[js.UndefOr[InputProps]]] = js.native
  
  var leftAvatar: js.UndefOr[RecursivePartial[js.UndefOr[PartialAvatarPropsAccessory | ReactElement]]] = js.native
  
  var leftElement: js.UndefOr[RecursivePartial[js.UndefOr[ReactElement]]] = js.native
  
  var leftIcon: js.UndefOr[RecursivePartial[js.UndefOr[PartialIconProps | ReactElement]]] = js.native
  
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
  
  var onLayout: js.UndefOr[RecursivePartial[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]]] = js.native
  
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
  
  var pad: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var pressRetentionOffset: js.UndefOr[RecursivePartial[js.UndefOr[Insets]]] = js.native
  
  var rightAvatar: js.UndefOr[RecursivePartial[js.UndefOr[PartialAvatarPropsAccessory | ReactElement]]] = js.native
  
  var rightContentContainerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  
  var rightElement: js.UndefOr[RecursivePartial[js.UndefOr[ReactElement]]] = js.native
  
  var rightIcon: js.UndefOr[RecursivePartial[js.UndefOr[PartialIconProps | ReactElement]]] = js.native
  
  var rightSubtitle: js.UndefOr[RecursivePartial[js.UndefOr[String | ReactElement]]] = js.native
  
  var rightSubtitleProps: js.UndefOr[RecursivePartial[js.UndefOr[TextProperties]]] = js.native
  
  var rightSubtitleStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.native
  
  var rightTitle: js.UndefOr[RecursivePartial[js.UndefOr[String | ReactElement]]] = js.native
  
  var rightTitleProps: js.UndefOr[RecursivePartial[js.UndefOr[TextProperties]]] = js.native
  
  var rightTitleStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.native
  
  var scaleProps: js.UndefOr[RecursivePartial[js.UndefOr[ScaleProps]]] = js.native
  
  var style: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  
  var subtitle: js.UndefOr[RecursivePartial[js.UndefOr[String | ReactElement]]] = js.native
  
  var subtitleProps: js.UndefOr[RecursivePartial[js.UndefOr[TextProperties]]] = js.native
  
  var subtitleStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.native
  
  var switch: js.UndefOr[RecursivePartial[js.UndefOr[SwitchProperties]]] = js.native
  
  var testID: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  
  var title: js.UndefOr[RecursivePartial[js.UndefOr[String | ReactElement]]] = js.native
  
  var titleProps: js.UndefOr[RecursivePartial[js.UndefOr[TextProperties]]] = js.native
  
  var titleStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.native
  
  var topDivider: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var touchSoundDisabled: js.UndefOr[RecursivePartial[js.UndefOr[Boolean | Null]]] = js.native
  
  var tvParallaxProperties: js.UndefOr[RecursivePartial[js.UndefOr[TVParallaxProperties]]] = js.native
  
  var underlayColor: js.UndefOr[RecursivePartial[js.UndefOr[ColorValue]]] = js.native
}
object RecursivePartialPartialLi {
  
  @scala.inline
  def apply(): RecursivePartialPartialLi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialPartialLi]
  }
  
  @scala.inline
  implicit class RecursivePartialPartialLiOps[Self <: RecursivePartialPartialLi] (val x: Self) extends AnyVal {
    
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
    def setComponent(value: RecursivePartial[js.UndefOr[ReactComponentClass[js.Object]]]): Self = this.set("Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("Component", js.undefined)
    
    @scala.inline
    def setViewComponent(value: RecursivePartial[js.UndefOr[ReactComponentClass[js.Object]]]): Self = this.set("ViewComponent", value.asInstanceOf[js.Any])
    
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
    def setBadge(value: RecursivePartial[js.UndefOr[BadgeProps]]): Self = this.set("badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadge: Self = this.set("badge", js.undefined)
    
    @scala.inline
    def setBottomDivider(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("bottomDivider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomDivider: Self = this.set("bottomDivider", js.undefined)
    
    @scala.inline
    def setButtonGroup(value: RecursivePartial[js.UndefOr[ButtonGroupProps]]): Self = this.set("buttonGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonGroup: Self = this.set("buttonGroup", js.undefined)
    
    @scala.inline
    def setCheckBox(value: RecursivePartial[js.UndefOr[CheckBoxProps]]): Self = this.set("checkBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckBox: Self = this.set("checkBox", js.undefined)
    
    @scala.inline
    def setCheckmark(value: RecursivePartial[js.UndefOr[Boolean | PartialIconProps | ReactElement]]): Self = this.set("checkmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckmark: Self = this.set("checkmark", js.undefined)
    
    @scala.inline
    def setChevron(value: RecursivePartial[js.UndefOr[Boolean | PartialIconProps | ReactElement]]): Self = this.set("chevron", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChevron: Self = this.set("chevron", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    
    @scala.inline
    def setContentContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = this.set("contentContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentContainerStyle: Self = this.set("contentContainerStyle", js.undefined)
    
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
    def setDisabled(value: RecursivePartial[js.UndefOr[Boolean | Null]]): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDisabledStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = this.set("disabledStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledStyle: Self = this.set("disabledStyle", js.undefined)
    
    @scala.inline
    def setHasTVPreferredFocus(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasTVPreferredFocus: Self = this.set("hasTVPreferredFocus", js.undefined)
    
    @scala.inline
    def setHitSlop(value: RecursivePartial[js.UndefOr[Insets]]): Self = this.set("hitSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHitSlop: Self = this.set("hitSlop", js.undefined)
    
    @scala.inline
    def setImportantForAccessibility(value: RecursivePartial[js.UndefOr[auto | yes | no | `no-hide-descendants`]]): Self = this.set("importantForAccessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportantForAccessibility: Self = this.set("importantForAccessibility", js.undefined)
    
    @scala.inline
    def setInput(value: RecursivePartial[js.UndefOr[InputProps]]): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setLeftAvatar(value: RecursivePartial[js.UndefOr[PartialAvatarPropsAccessory | ReactElement]]): Self = this.set("leftAvatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftAvatar: Self = this.set("leftAvatar", js.undefined)
    
    @scala.inline
    def setLeftElement(value: RecursivePartial[js.UndefOr[ReactElement]]): Self = this.set("leftElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftElement: Self = this.set("leftElement", js.undefined)
    
    @scala.inline
    def setLeftIcon(value: RecursivePartial[js.UndefOr[PartialIconProps | ReactElement]]): Self = this.set("leftIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftIcon: Self = this.set("leftIcon", js.undefined)
    
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
    def setOnHideUnderlay(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = this.set("onHideUnderlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnHideUnderlay: Self = this.set("onHideUnderlay", js.undefined)
    
    @scala.inline
    def setOnLayout(value: RecursivePartial[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]]): Self = this.set("onLayout", value.asInstanceOf[js.Any])
    
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
    def setOnShowUnderlay(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = this.set("onShowUnderlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnShowUnderlay: Self = this.set("onShowUnderlay", js.undefined)
    
    @scala.inline
    def setPad(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePad: Self = this.set("pad", js.undefined)
    
    @scala.inline
    def setPressRetentionOffset(value: RecursivePartial[js.UndefOr[Insets]]): Self = this.set("pressRetentionOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePressRetentionOffset: Self = this.set("pressRetentionOffset", js.undefined)
    
    @scala.inline
    def setRightAvatar(value: RecursivePartial[js.UndefOr[PartialAvatarPropsAccessory | ReactElement]]): Self = this.set("rightAvatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightAvatar: Self = this.set("rightAvatar", js.undefined)
    
    @scala.inline
    def setRightContentContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = this.set("rightContentContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightContentContainerStyle: Self = this.set("rightContentContainerStyle", js.undefined)
    
    @scala.inline
    def setRightElement(value: RecursivePartial[js.UndefOr[ReactElement]]): Self = this.set("rightElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightElement: Self = this.set("rightElement", js.undefined)
    
    @scala.inline
    def setRightIcon(value: RecursivePartial[js.UndefOr[PartialIconProps | ReactElement]]): Self = this.set("rightIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightIcon: Self = this.set("rightIcon", js.undefined)
    
    @scala.inline
    def setRightSubtitle(value: RecursivePartial[js.UndefOr[String | ReactElement]]): Self = this.set("rightSubtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightSubtitle: Self = this.set("rightSubtitle", js.undefined)
    
    @scala.inline
    def setRightSubtitleProps(value: RecursivePartial[js.UndefOr[TextProperties]]): Self = this.set("rightSubtitleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightSubtitleProps: Self = this.set("rightSubtitleProps", js.undefined)
    
    @scala.inline
    def setRightSubtitleStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = this.set("rightSubtitleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightSubtitleStyle: Self = this.set("rightSubtitleStyle", js.undefined)
    
    @scala.inline
    def setRightTitle(value: RecursivePartial[js.UndefOr[String | ReactElement]]): Self = this.set("rightTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightTitle: Self = this.set("rightTitle", js.undefined)
    
    @scala.inline
    def setRightTitleProps(value: RecursivePartial[js.UndefOr[TextProperties]]): Self = this.set("rightTitleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightTitleProps: Self = this.set("rightTitleProps", js.undefined)
    
    @scala.inline
    def setRightTitleStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = this.set("rightTitleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightTitleStyle: Self = this.set("rightTitleStyle", js.undefined)
    
    @scala.inline
    def setScaleProps(value: RecursivePartial[js.UndefOr[ScaleProps]]): Self = this.set("scaleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleProps: Self = this.set("scaleProps", js.undefined)
    
    @scala.inline
    def setStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setSubtitle(value: RecursivePartial[js.UndefOr[String | ReactElement]]): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    
    @scala.inline
    def setSubtitleProps(value: RecursivePartial[js.UndefOr[TextProperties]]): Self = this.set("subtitleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitleProps: Self = this.set("subtitleProps", js.undefined)
    
    @scala.inline
    def setSubtitleStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = this.set("subtitleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitleStyle: Self = this.set("subtitleStyle", js.undefined)
    
    @scala.inline
    def setSwitch(value: RecursivePartial[js.UndefOr[SwitchProperties]]): Self = this.set("switch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwitch: Self = this.set("switch", js.undefined)
    
    @scala.inline
    def setTestID(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestID: Self = this.set("testID", js.undefined)
    
    @scala.inline
    def setTitle(value: RecursivePartial[js.UndefOr[String | ReactElement]]): Self = this.set("title", value.asInstanceOf[js.Any])
    
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
    def setTopDivider(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("topDivider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopDivider: Self = this.set("topDivider", js.undefined)
    
    @scala.inline
    def setTouchSoundDisabled(value: RecursivePartial[js.UndefOr[Boolean | Null]]): Self = this.set("touchSoundDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchSoundDisabled: Self = this.set("touchSoundDisabled", js.undefined)
    
    @scala.inline
    def setTvParallaxProperties(value: RecursivePartial[js.UndefOr[TVParallaxProperties]]): Self = this.set("tvParallaxProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTvParallaxProperties: Self = this.set("tvParallaxProperties", js.undefined)
    
    @scala.inline
    def setUnderlayColor(value: RecursivePartial[js.UndefOr[ColorValue]]): Self = this.set("underlayColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlayColor: Self = this.set("underlayColor", js.undefined)
  }
}
