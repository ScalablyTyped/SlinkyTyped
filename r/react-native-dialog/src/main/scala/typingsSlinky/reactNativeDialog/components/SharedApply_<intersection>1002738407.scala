package typingsSlinky.reactNativeDialog.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactNative.ReadonlyactionNamestring
import typingsSlinky.reactNative.mod.AccessibilityActionInfo
import typingsSlinky.reactNative.mod.AccessibilityRole
import typingsSlinky.reactNative.mod.AccessibilityState
import typingsSlinky.reactNative.mod.AccessibilityStates
import typingsSlinky.reactNative.mod.AccessibilityTrait
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.Insets
import typingsSlinky.reactNative.mod.LayoutChangeEvent
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TVParallaxProperties
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNative.reactNativeStrings.`box-none`
import typingsSlinky.reactNative.reactNativeStrings.`box-only`
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
import typingsSlinky.reactNativeAnimatable.mod.Animation
import typingsSlinky.reactNativeAnimatable.mod.CustomAnimation
import typingsSlinky.reactNativeDialog.mod.ContainerProps
import typingsSlinky.reactNativeDialog.mod.reactNativeModalContainerProps
import typingsSlinky.reactNativeModal.modalMod.OnSwipeCompleteParams
import typingsSlinky.reactNativeModal.typesMod.Direction
import typingsSlinky.reactNativeModal.typesMod.Orientation
import typingsSlinky.reactNativeModal.typesMod.PresentationStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class `SharedApply_<intersection>1002738407`[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  def apply(
    accessibilityActions: js.Array[AccessibilityActionInfo] = null,
    accessibilityComponentType: none | button | radiobutton_checked | radiobutton_unchecked = null,
    accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined,
    accessibilityHint: String = null,
    accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined,
    accessibilityLabel: String = null,
    accessibilityLiveRegion: none | polite | assertive = null,
    accessibilityRole: AccessibilityRole = null,
    accessibilityState: AccessibilityState = null,
    accessibilityStates: js.Array[AccessibilityStates] = null,
    accessibilityTraits: AccessibilityTrait | js.Array[AccessibilityTrait] = null,
    accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined,
    accessible: js.UndefOr[Boolean] = js.undefined,
    animationIn: Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle]) = null,
    animationInTiming: Int | Double = null,
    animationOut: Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle]) = null,
    animationOutTiming: Int | Double = null,
    avoidKeyboard: js.UndefOr[Boolean] = js.undefined,
    backdropColor: String = null,
    backdropOpacity: Int | Double = null,
    backdropTransitionInTiming: Int | Double = null,
    backdropTransitionOutTiming: Int | Double = null,
    blurComponentIOS: TagMod[Any] = null,
    buttonSeparatorStyle: ViewStyle = null,
    collapsable: js.UndefOr[Boolean] = js.undefined,
    contentStyle: ViewStyle = null,
    coverScreen: js.UndefOr[Boolean] = js.undefined,
    customBackdrop: TagMod[Any] = null,
    deviceHeight: Int | Double = null,
    deviceWidth: Int | Double = null,
    footerStyle: ViewStyle = null,
    hardwareAccelerated: js.UndefOr[Boolean] = js.undefined,
    hasBackdrop: js.UndefOr[Boolean] = js.undefined,
    hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined,
    headerStyle: ViewStyle = null,
    hideModalContentWhileAnimating: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Insets = null,
    importantForAccessibility: auto | yes | no | `no-hide-descendants` = null,
    isTVSelectable: js.UndefOr[Boolean] = js.undefined,
    nativeID: String = null,
    needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined,
    onAccessibilityAction: SyntheticEvent[NodeHandle, ReadonlyactionNamestring] => Unit = null,
    onAccessibilityEscape: () => Unit = null,
    onAccessibilityTap: () => Unit = null,
    onBackButtonPress: () => Unit = null,
    onBackdropPress: () => Unit = null,
    onDismiss: () => Unit = null,
    onLayout: /* event */ LayoutChangeEvent => Unit = null,
    onMagicTap: () => Unit = null,
    onModalHide: () => Unit = null,
    onModalShow: () => Unit = null,
    onModalWillHide: () => Unit = null,
    onModalWillShow: () => Unit = null,
    onMoveShouldSetResponder: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean = null,
    onMoveShouldSetResponderCapture: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean = null,
    onOrientationChange: SyntheticEvent[NodeHandle, js.Any] => Unit = null,
    onResponderEnd: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onResponderGrant: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onResponderMove: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onResponderReject: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onResponderRelease: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onResponderStart: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onResponderTerminate: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onResponderTerminationRequest: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean = null,
    onShow: () => Unit = null,
    onStartShouldSetResponder: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean = null,
    onStartShouldSetResponderCapture: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean = null,
    onSwipeCancel: () => Unit = null,
    onSwipeComplete: /* params */ OnSwipeCompleteParams => Unit = null,
    onSwipeMove: /* percentageShown */ Double => Unit = null,
    onSwipeStart: () => Unit = null,
    onTouchCancel: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onTouchEnd: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onTouchEndCapture: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onTouchMove: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onTouchStart: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    pointerEvents: `box-none` | none | `box-only` | auto = null,
    presentationStyle: PresentationStyle = null,
    propagateSwipe: js.UndefOr[Boolean] = js.undefined,
    removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
    renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined,
    scrollHorizontal: js.UndefOr[Boolean] = js.undefined,
    scrollOffset: Int | Double = null,
    scrollOffsetMax: Int | Double = null,
    scrollTo: /* e */ _ => Unit = null,
    shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    supportedOrientations: js.Array[Orientation] = null,
    swipeDirection: Direction | js.Array[Direction] = null,
    swipeThreshold: Int | Double = null,
    testID: String = null,
    tvParallaxMagnification: Int | Double = null,
    tvParallaxProperties: TVParallaxProperties = null,
    tvParallaxShiftDistanceX: Int | Double = null,
    tvParallaxShiftDistanceY: Int | Double = null,
    tvParallaxTiltAngle: Int | Double = null,
    useNativeDriver: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal()
    if (accessibilityActions != null) __obj.updateDynamic("accessibilityActions")(accessibilityActions.asInstanceOf[js.Any])
    if (accessibilityComponentType != null) __obj.updateDynamic("accessibilityComponentType")(accessibilityComponentType.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityElementsHidden)) __obj.updateDynamic("accessibilityElementsHidden")(accessibilityElementsHidden.asInstanceOf[js.Any])
    if (accessibilityHint != null) __obj.updateDynamic("accessibilityHint")(accessibilityHint.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityIgnoresInvertColors)) __obj.updateDynamic("accessibilityIgnoresInvertColors")(accessibilityIgnoresInvertColors.asInstanceOf[js.Any])
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel.asInstanceOf[js.Any])
    if (accessibilityLiveRegion != null) __obj.updateDynamic("accessibilityLiveRegion")(accessibilityLiveRegion.asInstanceOf[js.Any])
    if (accessibilityRole != null) __obj.updateDynamic("accessibilityRole")(accessibilityRole.asInstanceOf[js.Any])
    if (accessibilityState != null) __obj.updateDynamic("accessibilityState")(accessibilityState.asInstanceOf[js.Any])
    if (accessibilityStates != null) __obj.updateDynamic("accessibilityStates")(accessibilityStates.asInstanceOf[js.Any])
    if (accessibilityTraits != null) __obj.updateDynamic("accessibilityTraits")(accessibilityTraits.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityViewIsModal)) __obj.updateDynamic("accessibilityViewIsModal")(accessibilityViewIsModal.asInstanceOf[js.Any])
    if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible.asInstanceOf[js.Any])
    if (animationIn != null) __obj.updateDynamic("animationIn")(animationIn.asInstanceOf[js.Any])
    if (animationInTiming != null) __obj.updateDynamic("animationInTiming")(animationInTiming.asInstanceOf[js.Any])
    if (animationOut != null) __obj.updateDynamic("animationOut")(animationOut.asInstanceOf[js.Any])
    if (animationOutTiming != null) __obj.updateDynamic("animationOutTiming")(animationOutTiming.asInstanceOf[js.Any])
    if (!js.isUndefined(avoidKeyboard)) __obj.updateDynamic("avoidKeyboard")(avoidKeyboard.asInstanceOf[js.Any])
    if (backdropColor != null) __obj.updateDynamic("backdropColor")(backdropColor.asInstanceOf[js.Any])
    if (backdropOpacity != null) __obj.updateDynamic("backdropOpacity")(backdropOpacity.asInstanceOf[js.Any])
    if (backdropTransitionInTiming != null) __obj.updateDynamic("backdropTransitionInTiming")(backdropTransitionInTiming.asInstanceOf[js.Any])
    if (backdropTransitionOutTiming != null) __obj.updateDynamic("backdropTransitionOutTiming")(backdropTransitionOutTiming.asInstanceOf[js.Any])
    if (blurComponentIOS != null) __obj.updateDynamic("blurComponentIOS")(blurComponentIOS.asInstanceOf[js.Any])
    if (buttonSeparatorStyle != null) __obj.updateDynamic("buttonSeparatorStyle")(buttonSeparatorStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsable)) __obj.updateDynamic("collapsable")(collapsable.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(coverScreen)) __obj.updateDynamic("coverScreen")(coverScreen.asInstanceOf[js.Any])
    if (customBackdrop != null) __obj.updateDynamic("customBackdrop")(customBackdrop.asInstanceOf[js.Any])
    if (deviceHeight != null) __obj.updateDynamic("deviceHeight")(deviceHeight.asInstanceOf[js.Any])
    if (deviceWidth != null) __obj.updateDynamic("deviceWidth")(deviceWidth.asInstanceOf[js.Any])
    if (footerStyle != null) __obj.updateDynamic("footerStyle")(footerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(hardwareAccelerated)) __obj.updateDynamic("hardwareAccelerated")(hardwareAccelerated.asInstanceOf[js.Any])
    if (!js.isUndefined(hasBackdrop)) __obj.updateDynamic("hasBackdrop")(hasBackdrop.asInstanceOf[js.Any])
    if (!js.isUndefined(hasTVPreferredFocus)) __obj.updateDynamic("hasTVPreferredFocus")(hasTVPreferredFocus.asInstanceOf[js.Any])
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(hideModalContentWhileAnimating)) __obj.updateDynamic("hideModalContentWhileAnimating")(hideModalContentWhileAnimating.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(isTVSelectable)) __obj.updateDynamic("isTVSelectable")(isTVSelectable.asInstanceOf[js.Any])
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID.asInstanceOf[js.Any])
    if (!js.isUndefined(needsOffscreenAlphaCompositing)) __obj.updateDynamic("needsOffscreenAlphaCompositing")(needsOffscreenAlphaCompositing.asInstanceOf[js.Any])
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(js.Any.fromFunction1(onAccessibilityAction))
    if (onAccessibilityEscape != null) __obj.updateDynamic("onAccessibilityEscape")(js.Any.fromFunction0(onAccessibilityEscape))
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(js.Any.fromFunction0(onAccessibilityTap))
    if (onBackButtonPress != null) __obj.updateDynamic("onBackButtonPress")(js.Any.fromFunction0(onBackButtonPress))
    if (onBackdropPress != null) __obj.updateDynamic("onBackdropPress")(js.Any.fromFunction0(onBackdropPress))
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1(onLayout))
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(js.Any.fromFunction0(onMagicTap))
    if (onModalHide != null) __obj.updateDynamic("onModalHide")(js.Any.fromFunction0(onModalHide))
    if (onModalShow != null) __obj.updateDynamic("onModalShow")(js.Any.fromFunction0(onModalShow))
    if (onModalWillHide != null) __obj.updateDynamic("onModalWillHide")(js.Any.fromFunction0(onModalWillHide))
    if (onModalWillShow != null) __obj.updateDynamic("onModalWillShow")(js.Any.fromFunction0(onModalWillShow))
    if (onMoveShouldSetResponder != null) __obj.updateDynamic("onMoveShouldSetResponder")(js.Any.fromFunction1(onMoveShouldSetResponder))
    if (onMoveShouldSetResponderCapture != null) __obj.updateDynamic("onMoveShouldSetResponderCapture")(js.Any.fromFunction1(onMoveShouldSetResponderCapture))
    if (onOrientationChange != null) __obj.updateDynamic("onOrientationChange")(js.Any.fromFunction1(onOrientationChange))
    if (onResponderEnd != null) __obj.updateDynamic("onResponderEnd")(js.Any.fromFunction1(onResponderEnd))
    if (onResponderGrant != null) __obj.updateDynamic("onResponderGrant")(js.Any.fromFunction1(onResponderGrant))
    if (onResponderMove != null) __obj.updateDynamic("onResponderMove")(js.Any.fromFunction1(onResponderMove))
    if (onResponderReject != null) __obj.updateDynamic("onResponderReject")(js.Any.fromFunction1(onResponderReject))
    if (onResponderRelease != null) __obj.updateDynamic("onResponderRelease")(js.Any.fromFunction1(onResponderRelease))
    if (onResponderStart != null) __obj.updateDynamic("onResponderStart")(js.Any.fromFunction1(onResponderStart))
    if (onResponderTerminate != null) __obj.updateDynamic("onResponderTerminate")(js.Any.fromFunction1(onResponderTerminate))
    if (onResponderTerminationRequest != null) __obj.updateDynamic("onResponderTerminationRequest")(js.Any.fromFunction1(onResponderTerminationRequest))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (onStartShouldSetResponder != null) __obj.updateDynamic("onStartShouldSetResponder")(js.Any.fromFunction1(onStartShouldSetResponder))
    if (onStartShouldSetResponderCapture != null) __obj.updateDynamic("onStartShouldSetResponderCapture")(js.Any.fromFunction1(onStartShouldSetResponderCapture))
    if (onSwipeCancel != null) __obj.updateDynamic("onSwipeCancel")(js.Any.fromFunction0(onSwipeCancel))
    if (onSwipeComplete != null) __obj.updateDynamic("onSwipeComplete")(js.Any.fromFunction1(onSwipeComplete))
    if (onSwipeMove != null) __obj.updateDynamic("onSwipeMove")(js.Any.fromFunction1(onSwipeMove))
    if (onSwipeStart != null) __obj.updateDynamic("onSwipeStart")(js.Any.fromFunction0(onSwipeStart))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(js.Any.fromFunction1(onTouchEndCapture))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (presentationStyle != null) __obj.updateDynamic("presentationStyle")(presentationStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(propagateSwipe)) __obj.updateDynamic("propagateSwipe")(propagateSwipe.asInstanceOf[js.Any])
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews.asInstanceOf[js.Any])
    if (!js.isUndefined(renderToHardwareTextureAndroid)) __obj.updateDynamic("renderToHardwareTextureAndroid")(renderToHardwareTextureAndroid.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollHorizontal)) __obj.updateDynamic("scrollHorizontal")(scrollHorizontal.asInstanceOf[js.Any])
    if (scrollOffset != null) __obj.updateDynamic("scrollOffset")(scrollOffset.asInstanceOf[js.Any])
    if (scrollOffsetMax != null) __obj.updateDynamic("scrollOffsetMax")(scrollOffsetMax.asInstanceOf[js.Any])
    if (scrollTo != null) __obj.updateDynamic("scrollTo")(js.Any.fromFunction1(scrollTo))
    if (!js.isUndefined(shouldRasterizeIOS)) __obj.updateDynamic("shouldRasterizeIOS")(shouldRasterizeIOS.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (supportedOrientations != null) __obj.updateDynamic("supportedOrientations")(supportedOrientations.asInstanceOf[js.Any])
    if (swipeDirection != null) __obj.updateDynamic("swipeDirection")(swipeDirection.asInstanceOf[js.Any])
    if (swipeThreshold != null) __obj.updateDynamic("swipeThreshold")(swipeThreshold.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (tvParallaxMagnification != null) __obj.updateDynamic("tvParallaxMagnification")(tvParallaxMagnification.asInstanceOf[js.Any])
    if (tvParallaxProperties != null) __obj.updateDynamic("tvParallaxProperties")(tvParallaxProperties.asInstanceOf[js.Any])
    if (tvParallaxShiftDistanceX != null) __obj.updateDynamic("tvParallaxShiftDistanceX")(tvParallaxShiftDistanceX.asInstanceOf[js.Any])
    if (tvParallaxShiftDistanceY != null) __obj.updateDynamic("tvParallaxShiftDistanceY")(tvParallaxShiftDistanceY.asInstanceOf[js.Any])
    if (tvParallaxTiltAngle != null) __obj.updateDynamic("tvParallaxTiltAngle")(tvParallaxTiltAngle.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ComponentRef] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, ComponentRef](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ContainerProps with ViewProps with reactNativeModalContainerProps
}

