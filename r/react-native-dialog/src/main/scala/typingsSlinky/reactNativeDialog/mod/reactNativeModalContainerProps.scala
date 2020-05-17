package typingsSlinky.reactNativeDialog.mod

import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.anon.ReadonlyactionNamestring
import typingsSlinky.reactNative.mod.AccessibilityActionInfo
import typingsSlinky.reactNative.mod.AccessibilityRole
import typingsSlinky.reactNative.mod.AccessibilityState
import typingsSlinky.reactNative.mod.AccessibilityStates
import typingsSlinky.reactNative.mod.AccessibilityTrait
import typingsSlinky.reactNative.mod.AccessibilityValue
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.Insets
import typingsSlinky.reactNative.mod.LayoutChangeEvent
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TVParallaxProperties
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeAnimatable.mod.Animation
import typingsSlinky.reactNativeAnimatable.mod.CustomAnimation
import typingsSlinky.reactNativeDialog.reactNativeDialogStrings.`box-none`
import typingsSlinky.reactNativeDialog.reactNativeDialogStrings.`box-only`
import typingsSlinky.reactNativeDialog.reactNativeDialogStrings.`no-hide-descendants`
import typingsSlinky.reactNativeDialog.reactNativeDialogStrings.assertive
import typingsSlinky.reactNativeDialog.reactNativeDialogStrings.auto
import typingsSlinky.reactNativeDialog.reactNativeDialogStrings.button
import typingsSlinky.reactNativeDialog.reactNativeDialogStrings.no
import typingsSlinky.reactNativeDialog.reactNativeDialogStrings.none
import typingsSlinky.reactNativeDialog.reactNativeDialogStrings.polite
import typingsSlinky.reactNativeDialog.reactNativeDialogStrings.radiobutton_checked
import typingsSlinky.reactNativeDialog.reactNativeDialogStrings.radiobutton_unchecked
import typingsSlinky.reactNativeDialog.reactNativeDialogStrings.yes
import typingsSlinky.reactNativeModal.modalMod.OnSwipeCompleteParams
import typingsSlinky.reactNativeModal.typesMod.Direction
import typingsSlinky.reactNativeModal.typesMod.OnOrientationChange
import typingsSlinky.reactNativeModal.typesMod.OrNull
import typingsSlinky.reactNativeModal.typesMod.Orientation
import typingsSlinky.reactNativeModal.typesMod.PresentationStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<react-native-modal.react-native-modal.ModalProps, std.Exclude<keyof react-native-modal.react-native-modal.ModalProps, 'isVisible'>>> */
@js.native
trait reactNativeModalContainerProps extends js.Object {
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
  var animationIn: js.UndefOr[Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle])] = js.native
  var animationInTiming: js.UndefOr[Double] = js.native
  var animationOut: js.UndefOr[Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle])] = js.native
  var animationOutTiming: js.UndefOr[Double] = js.native
  var avoidKeyboard: js.UndefOr[Boolean] = js.native
  var backdropColor: js.UndefOr[String] = js.native
  var backdropOpacity: js.UndefOr[Double] = js.native
  var backdropTransitionInTiming: js.UndefOr[Double] = js.native
  var backdropTransitionOutTiming: js.UndefOr[Double] = js.native
  var children: js.UndefOr[TagMod[Any]] = js.native
  var collapsable: js.UndefOr[Boolean] = js.native
  var coverScreen: js.UndefOr[Boolean] = js.native
  var customBackdrop: js.UndefOr[TagMod[Any]] = js.native
  var deviceHeight: js.UndefOr[Double] = js.native
  var deviceWidth: js.UndefOr[Double] = js.native
  var hardwareAccelerated: js.UndefOr[Boolean] = js.native
  var hasBackdrop: js.UndefOr[Boolean] = js.native
  var hasTVPreferredFocus: js.UndefOr[Boolean] = js.native
  var hideModalContentWhileAnimating: js.UndefOr[Boolean] = js.native
  var hitSlop: js.UndefOr[Insets] = js.native
  var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.native
  var isTVSelectable: js.UndefOr[Boolean] = js.native
  var nativeID: js.UndefOr[String] = js.native
  var needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.native
  var onAccessibilityAction: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ReadonlyactionNamestring], Unit]] = js.native
  var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.native
  var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.native
  var onBackButtonPress: js.UndefOr[js.Function0[Unit]] = js.native
  var onBackdropPress: js.UndefOr[js.Function0[Unit]] = js.native
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.native
  var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.native
  var onModalHide: js.UndefOr[js.Function0[Unit]] = js.native
  var onModalShow: js.UndefOr[js.Function0[Unit]] = js.native
  var onModalWillHide: js.UndefOr[js.Function0[Unit]] = js.native
  var onModalWillShow: js.UndefOr[js.Function0[Unit]] = js.native
  var onMoveShouldSetResponder: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]] = js.native
  var onMoveShouldSetResponderCapture: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]] = js.native
  var onOrientationChange: js.UndefOr[OnOrientationChange] = js.native
  var onResponderEnd: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  var onResponderGrant: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  var onResponderMove: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  var onResponderReject: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  var onResponderRelease: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  var onResponderStart: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  var onResponderTerminate: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  var onResponderTerminationRequest: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]] = js.native
  var onShow: js.UndefOr[js.Function0[Unit]] = js.native
  var onStartShouldSetResponder: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]] = js.native
  var onStartShouldSetResponderCapture: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]] = js.native
  var onSwipeCancel: js.UndefOr[js.Function0[Unit]] = js.native
  var onSwipeComplete: js.UndefOr[js.Function1[/* params */ OnSwipeCompleteParams, Unit]] = js.native
  var onSwipeMove: js.UndefOr[js.Function1[/* percentageShown */ Double, Unit]] = js.native
  var onSwipeStart: js.UndefOr[js.Function0[Unit]] = js.native
  var onTouchCancel: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  var onTouchEnd: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  var onTouchEndCapture: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  var onTouchMove: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  var onTouchStart: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  var pointerEvents: js.UndefOr[`box-none` | none | `box-only` | auto] = js.native
  var presentationStyle: js.UndefOr[PresentationStyle] = js.native
  var propagateSwipe: js.UndefOr[Boolean] = js.native
  var removeClippedSubviews: js.UndefOr[Boolean] = js.native
  var renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.native
  var scrollHorizontal: js.UndefOr[Boolean] = js.native
  var scrollOffset: js.UndefOr[Double] = js.native
  var scrollOffsetMax: js.UndefOr[Double] = js.native
  var scrollTo: js.UndefOr[OrNull[js.Function1[/* e */ _, Unit]]] = js.native
  var shouldRasterizeIOS: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var supportedOrientations: js.UndefOr[js.Array[Orientation]] = js.native
  var swipeDirection: js.UndefOr[Direction | js.Array[Direction]] = js.native
  var swipeThreshold: js.UndefOr[Double] = js.native
  var testID: js.UndefOr[String] = js.native
  var tvParallaxMagnification: js.UndefOr[Double] = js.native
  var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.native
  var tvParallaxShiftDistanceX: js.UndefOr[Double] = js.native
  var tvParallaxShiftDistanceY: js.UndefOr[Double] = js.native
  var tvParallaxTiltAngle: js.UndefOr[Double] = js.native
  var useNativeDriver: js.UndefOr[Boolean] = js.native
}

object reactNativeModalContainerProps {
  @scala.inline
  def apply(): reactNativeModalContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[reactNativeModalContainerProps]
  }
  @scala.inline
  implicit class reactNativeModalContainerPropsOps[Self <: reactNativeModalContainerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withAnimationIn(value: Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationIn")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationInTiming(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationInTiming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationInTiming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationInTiming")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationOut(value: Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOut")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationOutTiming(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOutTiming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationOutTiming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOutTiming")(js.undefined)
        ret
    }
    @scala.inline
    def withAvoidKeyboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidKeyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvoidKeyboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidKeyboard")(js.undefined)
        ret
    }
    @scala.inline
    def withBackdropColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackdropColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBackdropOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackdropOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withBackdropTransitionInTiming(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropTransitionInTiming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackdropTransitionInTiming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropTransitionInTiming")(js.undefined)
        ret
    }
    @scala.inline
    def withBackdropTransitionOutTiming(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropTransitionOutTiming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackdropTransitionOutTiming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropTransitionOutTiming")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsable")(js.undefined)
        ret
    }
    @scala.inline
    def withCoverScreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoverScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomBackdropReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customBackdrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomBackdrop(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customBackdrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomBackdrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customBackdrop")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withHardwareAccelerated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardwareAccelerated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHardwareAccelerated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardwareAccelerated")(js.undefined)
        ret
    }
    @scala.inline
    def withHasBackdrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasBackdrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasBackdrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasBackdrop")(js.undefined)
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
    def withHideModalContentWhileAnimating(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideModalContentWhileAnimating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideModalContentWhileAnimating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideModalContentWhileAnimating")(js.undefined)
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
    def withIsTVSelectable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTVSelectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTVSelectable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTVSelectable")(js.undefined)
        ret
    }
    @scala.inline
    def withNativeID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNativeID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeID")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedsOffscreenAlphaCompositing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needsOffscreenAlphaCompositing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedsOffscreenAlphaCompositing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needsOffscreenAlphaCompositing")(js.undefined)
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
    def withOnBackButtonPress(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBackButtonPress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnBackButtonPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBackButtonPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBackdropPress(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBackdropPress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnBackdropPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBackdropPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDismiss(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismiss")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismiss")(js.undefined)
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
    def withOnModalHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onModalHide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnModalHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onModalHide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnModalShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onModalShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnModalShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onModalShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnModalWillHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onModalWillHide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnModalWillHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onModalWillHide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnModalWillShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onModalWillShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnModalWillShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onModalWillShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMoveShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveShouldSetResponder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMoveShouldSetResponder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveShouldSetResponder")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMoveShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveShouldSetResponderCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMoveShouldSetResponderCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveShouldSetResponderCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOrientationChange(value: SyntheticEvent[NodeHandle, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOrientationChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOrientationChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOrientationChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponderEnd(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResponderEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponderGrant(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderGrant")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResponderGrant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderGrant")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponderMove(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResponderMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponderReject(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderReject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResponderReject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderReject")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponderRelease(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderRelease")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResponderRelease: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderRelease")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponderStart(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResponderStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponderTerminate(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderTerminate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResponderTerminate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderTerminate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponderTerminationRequest(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderTerminationRequest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResponderTerminationRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderTerminationRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStartShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartShouldSetResponder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnStartShouldSetResponder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartShouldSetResponder")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStartShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartShouldSetResponderCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnStartShouldSetResponderCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartShouldSetResponderCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwipeCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeCancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSwipeCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwipeComplete(value: /* params */ OnSwipeCompleteParams => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSwipeComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwipeMove(value: /* percentageShown */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSwipeMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwipeStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSwipeStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchCancel(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchCancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTouchCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchEnd(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTouchEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchEndCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEndCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTouchEndCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEndCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchMove(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTouchMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchStart(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTouchStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStart")(js.undefined)
        ret
    }
    @scala.inline
    def withPointerEvents(value: `box-none` | none | `box-only` | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointerEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withPresentationStyle(value: PresentationStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presentationStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPresentationStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presentationStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withPropagateSwipe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propagateSwipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropagateSwipe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propagateSwipe")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveClippedSubviews(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClippedSubviews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveClippedSubviews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClippedSubviews")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderToHardwareTextureAndroid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderToHardwareTextureAndroid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderToHardwareTextureAndroid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderToHardwareTextureAndroid")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollHorizontal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollHorizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollHorizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollOffsetMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollOffsetMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollOffsetMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollOffsetMax")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollTo(value: /* e */ _ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutScrollTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTo")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollToNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTo")(null)
        ret
    }
    @scala.inline
    def withShouldRasterizeIOS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRasterizeIOS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldRasterizeIOS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRasterizeIOS")(js.undefined)
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
    def withSupportedOrientations(value: js.Array[Orientation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedOrientations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedOrientations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedOrientations")(js.undefined)
        ret
    }
    @scala.inline
    def withSwipeDirection(value: Direction | js.Array[Direction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipeDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withSwipeThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipeThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeThreshold")(js.undefined)
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
    def withTvParallaxMagnification(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxMagnification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTvParallaxMagnification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxMagnification")(js.undefined)
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
    def withTvParallaxShiftDistanceX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxShiftDistanceX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTvParallaxShiftDistanceX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxShiftDistanceX")(js.undefined)
        ret
    }
    @scala.inline
    def withTvParallaxShiftDistanceY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxShiftDistanceY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTvParallaxShiftDistanceY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxShiftDistanceY")(js.undefined)
        ret
    }
    @scala.inline
    def withTvParallaxTiltAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxTiltAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTvParallaxTiltAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxTiltAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withUseNativeDriver(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeDriver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseNativeDriver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeDriver")(js.undefined)
        ret
    }
  }
  
}

