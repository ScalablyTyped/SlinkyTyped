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
import typingsSlinky.reactNative.mod.ActivityIndicatorProperties
import typingsSlinky.reactNative.mod.BackgroundPropType
import typingsSlinky.reactNative.mod.Insets
import typingsSlinky.reactNative.mod.LayoutChangeEvent
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TVParallaxProperties
import typingsSlinky.reactNative.mod.TargetedEvent
import typingsSlinky.reactNative.mod.TextProperties
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.mod.IconNode
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
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-elements.react-native-elements.ButtonProps> */
@js.native
trait PartialButtonProps extends js.Object {
  var TouchableComponent: js.UndefOr[ReactComponentClass[js.Object]] = js.native
  var ViewComponent: js.UndefOr[ReactComponentClass[_]] = js.native
  var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.native
  var accessibilityComponentType: js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked] = js.native
  var accessibilityElementsHidden: js.UndefOr[Boolean] = js.native
  var accessibilityHint: js.UndefOr[String] = js.native
  var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.native
  var accessibilityLabel: js.UndefOr[String] = js.native
  var accessibilityLiveRegion: js.UndefOr[none | polite | assertive] = js.native
  var accessibilityRole: js.UndefOr[AccessibilityRole] = js.native
  var accessibilityState: js.UndefOr[AccessibilityState] = js.native
  var accessibilityStates: js.UndefOr[js.Array[AccessibilityStates]] = js.native
  var accessibilityTraits: js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]] = js.native
  var accessibilityValue: js.UndefOr[AccessibilityValue] = js.native
  var accessibilityViewIsModal: js.UndefOr[Boolean] = js.native
  var accessible: js.UndefOr[Boolean] = js.native
  var activeOpacity: js.UndefOr[Double] = js.native
  var background: js.UndefOr[BackgroundPropType] = js.native
  var buttonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var delayLongPress: js.UndefOr[Double] = js.native
  var delayPressIn: js.UndefOr[Double] = js.native
  var delayPressOut: js.UndefOr[Double] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var disabledStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var disabledTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var hasTVPreferredFocus: js.UndefOr[Boolean] = js.native
  var hitSlop: js.UndefOr[Insets] = js.native
  var icon: js.UndefOr[IconNode] = js.native
  var iconContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var iconRight: js.UndefOr[Boolean] = js.native
  var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.native
  var linearGradientProps: js.UndefOr[js.Object] = js.native
  var loading: js.UndefOr[Boolean] = js.native
  var loadingProps: js.UndefOr[ActivityIndicatorProperties] = js.native
  var loadingStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var onAccessibilityAction: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ReadonlyactionNamestring], Unit]] = js.native
  var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.native
  var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.native
  var onBlur: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TargetedEvent], Unit]] = js.native
  var onFocus: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TargetedEvent], Unit]] = js.native
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.native
  var onLongPress: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.native
  var onPress: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  var onPressIn: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  var onPressOut: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  var pressRetentionOffset: js.UndefOr[Insets] = js.native
  var raised: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var testID: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var titleProps: js.UndefOr[TextProperties] = js.native
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.native
  var `type`: js.UndefOr[solid | clear | outline] = js.native
  var useForeground: js.UndefOr[Boolean] = js.native
}

object PartialButtonProps {
  @scala.inline
  def apply(): PartialButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialButtonProps]
  }
  @scala.inline
  implicit class PartialButtonPropsOps[Self <: PartialButtonProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTouchableComponent(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TouchableComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchableComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TouchableComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withViewComponent(value: ReactComponentClass[_]): Self = {
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
    def withAccessibilityActions(value: js.Array[AccessibilityActionInfo]): Self = {
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
    def withAccessibilityComponentType(value: none | button | radiobutton_checked | radiobutton_unchecked): Self = {
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
    def withAccessibilityElementsHidden(value: Boolean): Self = {
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
    def withAccessibilityHint(value: String): Self = {
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
    def withAccessibilityIgnoresInvertColors(value: Boolean): Self = {
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
    def withAccessibilityLabel(value: String): Self = {
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
    def withAccessibilityLiveRegion(value: none | polite | assertive): Self = {
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
    def withAccessibilityRole(value: AccessibilityRole): Self = {
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
    def withAccessibilityState(value: AccessibilityState): Self = {
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
    def withAccessibilityStates(value: js.Array[AccessibilityStates]): Self = {
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
    def withAccessibilityTraits(value: AccessibilityTrait | js.Array[AccessibilityTrait]): Self = {
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
    def withAccessibilityValue(value: AccessibilityValue): Self = {
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
    def withAccessibilityViewIsModal(value: Boolean): Self = {
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
    def withAccessible(value: Boolean): Self = {
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
    def withActiveOpacity(value: Double): Self = {
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
    def withBackground(value: BackgroundPropType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonStyle")(null)
        ret
    }
    @scala.inline
    def withContainerStyle(value: StyleProp[ViewStyle]): Self = {
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
    def withContainerStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(null)
        ret
    }
    @scala.inline
    def withDelayLongPress(value: Double): Self = {
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
    def withDelayPressIn(value: Double): Self = {
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
    def withDelayPressOut(value: Double): Self = {
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
    def withDisabled(value: Boolean): Self = {
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
    def withDisabledStyle(value: StyleProp[ViewStyle]): Self = {
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
    def withDisabledStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledStyle")(null)
        ret
    }
    @scala.inline
    def withDisabledTitleStyle(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledTitleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledTitleStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledTitleStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledTitleStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledTitleStyle")(null)
        ret
    }
    @scala.inline
    def withHasTVPreferredFocus(value: Boolean): Self = {
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
    def withHitSlop(value: Insets): Self = {
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
    def withIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: IconNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withIconContainerStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withIconContainerStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconContainerStyle")(null)
        ret
    }
    @scala.inline
    def withIconRight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconRight")(js.undefined)
        ret
    }
    @scala.inline
    def withImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = {
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
    def withLinearGradientProps(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linearGradientProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinearGradientProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linearGradientProps")(js.undefined)
        ret
    }
    @scala.inline
    def withLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingProps(value: ActivityIndicatorProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingProps")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingStyle")(null)
        ret
    }
    @scala.inline
    def withOnAccessibilityAction(value: SyntheticEvent[NodeHandle, ReadonlyactionNamestring] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAccessibilityAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityAction")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAccessibilityEscape(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityEscape")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnAccessibilityEscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityEscape")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAccessibilityTap(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityTap")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnAccessibilityTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityTap")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: SyntheticEvent[NodeHandle, TargetedEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: SyntheticEvent[NodeHandle, TargetedEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLayout(value: /* event */ LayoutChangeEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLayout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLongPress(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLongPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLongPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLongPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMagicTap(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMagicTap")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnMagicTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMagicTap")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPress(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPressIn(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressIn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPressIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressIn")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPressOut(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPressOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressOut")(js.undefined)
        ret
    }
    @scala.inline
    def withPressRetentionOffset(value: Insets): Self = {
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
    def withRaised(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raised")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaised: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raised")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: StyleProp[ViewStyle]): Self = {
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
    def withStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(null)
        ret
    }
    @scala.inline
    def withTestID(value: String): Self = {
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
    def withTitle(value: String): Self = {
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
    def withTitleProps(value: TextProperties): Self = {
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
    def withTitleStyle(value: StyleProp[TextStyle]): Self = {
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
    def withTitleStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleStyle")(null)
        ret
    }
    @scala.inline
    def withTvParallaxProperties(value: TVParallaxProperties): Self = {
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
    def withType(value: solid | clear | outline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUseForeground(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useForeground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseForeground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useForeground")(js.undefined)
        ret
    }
  }
  
}

