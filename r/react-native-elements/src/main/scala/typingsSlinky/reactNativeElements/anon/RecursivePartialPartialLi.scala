package typingsSlinky.reactNativeElements.anon

import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
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
import scala.scalajs.js.annotation._

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
  var accessibilityStates: js.UndefOr[RecursivePartial[js.UndefOr[js.Array[AccessibilityStates]]]] = js.native
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
  var disabled: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var disabledStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  var hasTVPreferredFocus: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var hitSlop: js.UndefOr[RecursivePartial[js.UndefOr[Insets]]] = js.native
  var importantForAccessibility: js.UndefOr[RecursivePartial[js.UndefOr[auto | yes | no | `no-hide-descendants`]]] = js.native
  var input: js.UndefOr[RecursivePartial[js.UndefOr[InputProps]]] = js.native
  var leftAvatar: js.UndefOr[RecursivePartial[js.UndefOr[PartialAvatarPropsActiveOpacity | ReactElement]]] = js.native
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
  var rightAvatar: js.UndefOr[RecursivePartial[js.UndefOr[PartialAvatarPropsActiveOpacity | ReactElement]]] = js.native
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
  var tvParallaxProperties: js.UndefOr[RecursivePartial[js.UndefOr[TVParallaxProperties]]] = js.native
  var underlayColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
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
    def withComponent(value: RecursivePartial[js.UndefOr[ReactComponentClass[js.Object]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Component")(js.undefined)
        ret
    }
    @scala.inline
    def withViewComponent(value: RecursivePartial[js.UndefOr[ReactComponentClass[js.Object]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibilityActions(value: RecursivePartial[js.UndefOr[js.Array[AccessibilityActionInfo]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityActions")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibilityComponentType(value: RecursivePartial[js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityComponentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityComponentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityComponentType")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibilityElementsHidden(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityElementsHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityElementsHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityElementsHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibilityHint(value: RecursivePartial[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityHint")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibilityIgnoresInvertColors(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityIgnoresInvertColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityIgnoresInvertColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityIgnoresInvertColors")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibilityLabel(value: RecursivePartial[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibilityLiveRegion(value: RecursivePartial[js.UndefOr[none | polite | assertive]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityLiveRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityLiveRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityLiveRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibilityRole(value: RecursivePartial[js.UndefOr[AccessibilityRole]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityRole")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibilityState(value: RecursivePartial[js.UndefOr[AccessibilityState]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityState")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibilityStates(value: RecursivePartial[js.UndefOr[js.Array[AccessibilityStates]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityStates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityStates")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibilityTraits(value: RecursivePartial[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityTraits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityTraits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityTraits")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibilityValue(value: RecursivePartial[js.UndefOr[AccessibilityValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityValue")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibilityViewIsModal(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityViewIsModal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityViewIsModal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityViewIsModal")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessible(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessible")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveOpacity(value: RecursivePartial[js.UndefOr[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withBadge(value: RecursivePartial[js.UndefOr[BadgeProps]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badge")(js.undefined)
        ret
    }
    @scala.inline
    def withBottomDivider(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomDivider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomDivider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomDivider")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonGroup(value: RecursivePartial[js.UndefOr[ButtonGroupProps]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckBox(value: RecursivePartial[js.UndefOr[CheckBoxProps]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkBox")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckmark(value: RecursivePartial[js.UndefOr[Boolean | PartialIconProps | ReactElement]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkmark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckmark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkmark")(js.undefined)
        ret
    }
    @scala.inline
    def withChevron(value: RecursivePartial[js.UndefOr[Boolean | PartialIconProps | ReactElement]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chevron")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChevron: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chevron")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withContentContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDelayLongPress(value: RecursivePartial[js.UndefOr[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayLongPress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayLongPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayLongPress")(js.undefined)
        ret
    }
    @scala.inline
    def withDelayPressIn(value: RecursivePartial[js.UndefOr[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayPressIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayPressIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayPressIn")(js.undefined)
        ret
    }
    @scala.inline
    def withDelayPressOut(value: RecursivePartial[js.UndefOr[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayPressOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayPressOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayPressOut")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withHasTVPreferredFocus(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasTVPreferredFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasTVPreferredFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasTVPreferredFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withHitSlop(value: RecursivePartial[js.UndefOr[Insets]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitSlop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHitSlop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitSlop")(js.undefined)
        ret
    }
    @scala.inline
    def withImportantForAccessibility(value: RecursivePartial[js.UndefOr[auto | yes | no | `no-hide-descendants`]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importantForAccessibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportantForAccessibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importantForAccessibility")(js.undefined)
        ret
    }
    @scala.inline
    def withInput(value: RecursivePartial[js.UndefOr[InputProps]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftAvatar(value: RecursivePartial[js.UndefOr[PartialAvatarPropsActiveOpacity | ReactElement]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftAvatar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftAvatar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftAvatar")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftElement(value: RecursivePartial[js.UndefOr[ReactElement]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftElement")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftIcon(value: RecursivePartial[js.UndefOr[PartialIconProps | ReactElement]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAccessibilityAction(
      value: RecursivePartial[
          js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ReadonlyactionNamestring], Unit]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnAccessibilityAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityAction")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAccessibilityEscape(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityEscape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnAccessibilityEscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityEscape")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAccessibilityTap(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityTap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnAccessibilityTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityTap")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TargetedEvent], Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TargetedEvent], Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHideUnderlay(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHideUnderlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnHideUnderlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHideUnderlay")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLayout(value: RecursivePartial[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLongPress(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLongPress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLongPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLongPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMagicTap(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMagicTap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnMagicTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMagicTap")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPress(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPressIn(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPressIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressIn")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPressOut(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPressOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressOut")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShowUnderlay(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShowUnderlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnShowUnderlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShowUnderlay")(js.undefined)
        ret
    }
    @scala.inline
    def withPad(value: RecursivePartial[js.UndefOr[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pad")(js.undefined)
        ret
    }
    @scala.inline
    def withPressRetentionOffset(value: RecursivePartial[js.UndefOr[Insets]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressRetentionOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPressRetentionOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressRetentionOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withRightAvatar(value: RecursivePartial[js.UndefOr[PartialAvatarPropsActiveOpacity | ReactElement]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightAvatar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightAvatar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightAvatar")(js.undefined)
        ret
    }
    @scala.inline
    def withRightContentContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightContentContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightContentContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightContentContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withRightElement(value: RecursivePartial[js.UndefOr[ReactElement]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightElement")(js.undefined)
        ret
    }
    @scala.inline
    def withRightIcon(value: RecursivePartial[js.UndefOr[PartialIconProps | ReactElement]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withRightSubtitle(value: RecursivePartial[js.UndefOr[String | ReactElement]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightSubtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightSubtitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightSubtitle")(js.undefined)
        ret
    }
    @scala.inline
    def withRightSubtitleProps(value: RecursivePartial[js.UndefOr[TextProperties]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightSubtitleProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightSubtitleProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightSubtitleProps")(js.undefined)
        ret
    }
    @scala.inline
    def withRightSubtitleStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightSubtitleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightSubtitleStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightSubtitleStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withRightTitle(value: RecursivePartial[js.UndefOr[String | ReactElement]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withRightTitleProps(value: RecursivePartial[js.UndefOr[TextProperties]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightTitleProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightTitleProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightTitleProps")(js.undefined)
        ret
    }
    @scala.inline
    def withRightTitleStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightTitleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightTitleStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightTitleStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleProps(value: RecursivePartial[js.UndefOr[ScaleProps]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleProps")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitle(value: RecursivePartial[js.UndefOr[String | ReactElement]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitleProps(value: RecursivePartial[js.UndefOr[TextProperties]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitleProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleProps")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitleStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitleStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSwitch(value: RecursivePartial[js.UndefOr[SwitchProperties]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwitch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switch")(js.undefined)
        ret
    }
    @scala.inline
    def withTestID(value: RecursivePartial[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testID")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: RecursivePartial[js.UndefOr[String | ReactElement]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleProps(value: RecursivePartial[js.UndefOr[TextProperties]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleProps")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTopDivider(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topDivider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopDivider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topDivider")(js.undefined)
        ret
    }
    @scala.inline
    def withTvParallaxProperties(value: RecursivePartial[js.UndefOr[TVParallaxProperties]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTvParallaxProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderlayColor(value: RecursivePartial[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlayColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderlayColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlayColor")(js.undefined)
        ret
    }
  }
  
}

