package typingsSlinky.reactNativeSnapCarousel.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.reactNative.ReadonlyactionNamestring
import typingsSlinky.reactNative.mod.AccessibilityActionInfo
import typingsSlinky.reactNative.mod.AccessibilityRole
import typingsSlinky.reactNative.mod.AccessibilityState
import typingsSlinky.reactNative.mod.AccessibilityStates
import typingsSlinky.reactNative.mod.AccessibilityTrait
import typingsSlinky.reactNative.mod.Animated.AnimatedValue
import typingsSlinky.reactNative.mod.Animated.DecayAnimationConfig
import typingsSlinky.reactNative.mod.Animated.SpringAnimationConfig
import typingsSlinky.reactNative.mod.Animated.TimingAnimationConfig
import typingsSlinky.reactNative.mod.Insets
import typingsSlinky.reactNative.mod.LayoutChangeEvent
import typingsSlinky.reactNative.mod.NativeScrollEvent
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.PointPropType
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TVParallaxProperties
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNative.reactNativeStrings.`box-none`
import typingsSlinky.reactNative.reactNativeStrings.`box-only`
import typingsSlinky.reactNative.reactNativeStrings.`no-hide-descendants`
import typingsSlinky.reactNative.reactNativeStrings.`on-drag`
import typingsSlinky.reactNative.reactNativeStrings.always
import typingsSlinky.reactNative.reactNativeStrings.assertive
import typingsSlinky.reactNative.reactNativeStrings.auto
import typingsSlinky.reactNative.reactNativeStrings.automatic
import typingsSlinky.reactNative.reactNativeStrings.black
import typingsSlinky.reactNative.reactNativeStrings.button
import typingsSlinky.reactNative.reactNativeStrings.fast
import typingsSlinky.reactNative.reactNativeStrings.handled
import typingsSlinky.reactNative.reactNativeStrings.interactive
import typingsSlinky.reactNative.reactNativeStrings.never
import typingsSlinky.reactNative.reactNativeStrings.no
import typingsSlinky.reactNative.reactNativeStrings.none
import typingsSlinky.reactNative.reactNativeStrings.normal_
import typingsSlinky.reactNative.reactNativeStrings.polite
import typingsSlinky.reactNative.reactNativeStrings.radiobutton_checked
import typingsSlinky.reactNative.reactNativeStrings.radiobutton_unchecked
import typingsSlinky.reactNative.reactNativeStrings.scrollableAxes
import typingsSlinky.reactNative.reactNativeStrings.white
import typingsSlinky.reactNative.reactNativeStrings.yes
import typingsSlinky.reactNativeSnapCarousel.AnonIndex
import typingsSlinky.reactNativeSnapCarousel.AnonInputRange
import typingsSlinky.reactNativeSnapCarousel.mod.AdditionalParallaxProps
import typingsSlinky.reactNativeSnapCarousel.mod.CarouselProperties
import typingsSlinky.reactNativeSnapCarousel.mod.CarouselProps
import typingsSlinky.reactNativeSnapCarousel.mod.default
import typingsSlinky.reactNativeSnapCarousel.reactNativeSnapCarouselStrings.center
import typingsSlinky.reactNativeSnapCarousel.reactNativeSnapCarouselStrings.decay
import typingsSlinky.reactNativeSnapCarousel.reactNativeSnapCarouselStrings.end
import typingsSlinky.reactNativeSnapCarousel.reactNativeSnapCarouselStrings.spring
import typingsSlinky.reactNativeSnapCarousel.reactNativeSnapCarouselStrings.stack
import typingsSlinky.reactNativeSnapCarousel.reactNativeSnapCarouselStrings.start
import typingsSlinky.reactNativeSnapCarousel.reactNativeSnapCarouselStrings.timing
import typingsSlinky.reactNativeSnapCarousel.reactNativeSnapCarouselStrings.tinder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeSnapCarousel
  extends ExternalComponentWithAttributesWithRefType[tag.type, default[js.Any]] {
  @JSImport("react-native-snap-carousel", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply[T](
    data: js.Array[T],
    renderItem: (AnonIndex[T], js.UndefOr[AdditionalParallaxProps]) => TagMod[Any],
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
    activeAnimationOptions: DecayAnimationConfig | TimingAnimationConfig | SpringAnimationConfig = null,
    activeAnimationType: decay | spring | timing = null,
    activeSlideAlignment: start | center | end = null,
    activeSlideOffset: Int | Double = null,
    alwaysBounceHorizontal: js.UndefOr[Boolean] = js.undefined,
    alwaysBounceVertical: js.UndefOr[Boolean] = js.undefined,
    apparitionDelay: Int | Double = null,
    automaticallyAdjustContentInsets: js.UndefOr[Boolean] = js.undefined,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    autoplayDelay: Int | Double = null,
    autoplayInterval: Int | Double = null,
    bounces: js.UndefOr[Boolean] = js.undefined,
    bouncesZoom: js.UndefOr[Boolean] = js.undefined,
    callbackOffsetMargin: Int | Double = null,
    canCancelContentTouches: js.UndefOr[Boolean] = js.undefined,
    centerContent: js.UndefOr[Boolean] = js.undefined,
    collapsable: js.UndefOr[Boolean] = js.undefined,
    containerCustomStyle: StyleProp[ViewStyle] = null,
    contentContainerCustomStyle: StyleProp[ViewStyle] = null,
    contentContainerStyle: StyleProp[ViewStyle] = null,
    contentInset: Insets = null,
    contentInsetAdjustmentBehavior: automatic | scrollableAxes | never | always = null,
    contentOffset: PointPropType = null,
    decelerationRate: fast | normal_ | Double = null,
    directionalLockEnabled: js.UndefOr[Boolean] = js.undefined,
    disableIntervalMomentum: js.UndefOr[Boolean] = js.undefined,
    disableScrollViewPanResponder: js.UndefOr[Boolean] = js.undefined,
    enableMomentum: js.UndefOr[Boolean] = js.undefined,
    enableSnap: js.UndefOr[Boolean] = js.undefined,
    endFillColor: String = null,
    firstItem: Int | Double = null,
    hasParallaxImages: js.UndefOr[Boolean] = js.undefined,
    hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Insets = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    importantForAccessibility: auto | yes | no | `no-hide-descendants` = null,
    inactiveSlideOpacity: Int | Double = null,
    inactiveSlideScale: Int | Double = null,
    inactiveSlideShift: Int | Double = null,
    indicatorStyle: typingsSlinky.reactNative.reactNativeStrings.default | black | white = null,
    initialNumToRender: Int | Double = null,
    invertStickyHeaders: js.UndefOr[Boolean] = js.undefined,
    inverted: js.UndefOr[Boolean] = js.undefined,
    isTVSelectable: js.UndefOr[Boolean] = js.undefined,
    itemHeight: Int | Double = null,
    itemWidth: Int | Double = null,
    keyboardDismissMode: none | interactive | `on-drag` = null,
    keyboardShouldPersistTaps: Boolean | always | never | handled = null,
    layout: typingsSlinky.reactNativeSnapCarousel.reactNativeSnapCarouselStrings.default | stack | tinder = null,
    layoutCardOffset: Int | Double = null,
    lockScrollTimeoutDuration: Int | Double = null,
    lockScrollWhileSnapping: js.UndefOr[Boolean] = js.undefined,
    loopClonesPerSide: Int | Double = null,
    maximumZoomScale: Int | Double = null,
    minimumZoomScale: Int | Double = null,
    nativeID: String = null,
    needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined,
    nestedScrollEnabled: js.UndefOr[Boolean] = js.undefined,
    onAccessibilityAction: SyntheticEvent[NodeHandle, ReadonlyactionNamestring] => Unit = null,
    onAccessibilityEscape: () => Unit = null,
    onAccessibilityTap: () => Unit = null,
    onBeforeSnapToItem: /* slideIndex */ Double => Unit = null,
    onContentSizeChange: (/* w */ Double, /* h */ Double) => Unit = null,
    onLayout: /* event */ LayoutChangeEvent => Unit = null,
    onMagicTap: () => Unit = null,
    onMomentumScrollBegin: SyntheticEvent[NodeHandle, NativeScrollEvent] => Unit = null,
    onMomentumScrollEnd: SyntheticEvent[NodeHandle, NativeScrollEvent] => Unit = null,
    onMoveShouldSetResponder: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean = null,
    onMoveShouldSetResponderCapture: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean = null,
    onResponderEnd: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onResponderGrant: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onResponderMove: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onResponderReject: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onResponderRelease: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onResponderStart: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onResponderTerminate: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onResponderTerminationRequest: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean = null,
    onScroll: SyntheticEvent[NodeHandle, NativeScrollEvent] => Unit = null,
    onScrollAnimationEnd: () => Unit = null,
    onScrollBeginDrag: SyntheticEvent[NodeHandle, NativeScrollEvent] => Unit = null,
    onScrollEndDrag: SyntheticEvent[NodeHandle, NativeScrollEvent] => Unit = null,
    onScrollToTop: SyntheticEvent[NodeHandle, NativeScrollEvent] => Unit = null,
    onSnapToItem: /* slideIndex */ Double => Unit = null,
    onStartShouldSetResponder: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean = null,
    onStartShouldSetResponderCapture: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean = null,
    onTouchCancel: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onTouchEnd: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onTouchEndCapture: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onTouchMove: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onTouchStart: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    overScrollMode: auto | always | never = null,
    pagingEnabled: js.UndefOr[Boolean] = js.undefined,
    pinchGestureEnabled: js.UndefOr[Boolean] = js.undefined,
    pointerEvents: `box-none` | none | `box-only` | auto = null,
    refreshControl: ReactElement = null,
    removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
    renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined,
    scrollEnabled: js.UndefOr[Boolean] = js.undefined,
    scrollEndDragDebounceValue: Int | Double = null,
    scrollEventThrottle: Int | Double = null,
    scrollIndicatorInsets: Insets = null,
    scrollInterpolator: (/* index */ Double, /* carouselProps */ CarouselProps[_]) => AnonInputRange = null,
    scrollPerfTag: String = null,
    scrollToOverflowEnabled: js.UndefOr[Boolean] = js.undefined,
    scrollsToTop: js.UndefOr[Boolean] = js.undefined,
    shouldOptimizeUpdates: js.UndefOr[Boolean] = js.undefined,
    shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined,
    showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.undefined,
    showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.undefined,
    slideInterpolatedStyle: (/* index */ Double, /* animatedValue */ AnimatedValue, /* carouselProps */ CarouselProps[_]) => StyleProp[ViewStyle] = null,
    slideStyle: StyleProp[ViewStyle] = null,
    sliderHeight: Int | Double = null,
    sliderWidth: Int | Double = null,
    snapToAlignment: typingsSlinky.reactNative.reactNativeStrings.start | typingsSlinky.reactNative.reactNativeStrings.center | typingsSlinky.reactNative.reactNativeStrings.end = null,
    snapToEnd: js.UndefOr[Boolean] = js.undefined,
    snapToInterval: Int | Double = null,
    snapToOffsets: js.Array[Double] = null,
    snapToStart: js.UndefOr[Boolean] = js.undefined,
    stickyHeaderIndices: js.Array[Double] = null,
    style: StyleProp[ViewStyle] = null,
    swipeThreshold: Int | Double = null,
    testID: String = null,
    tvParallaxMagnification: Int | Double = null,
    tvParallaxProperties: TVParallaxProperties = null,
    tvParallaxShiftDistanceX: Int | Double = null,
    tvParallaxShiftDistanceY: Int | Double = null,
    tvParallaxTiltAngle: Int | Double = null,
    useScrollView: js.UndefOr[Boolean] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined,
    zoomScale: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default[js.Any]] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], renderItem = js.Any.fromFunction2(renderItem))
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
    if (activeAnimationOptions != null) __obj.updateDynamic("activeAnimationOptions")(activeAnimationOptions.asInstanceOf[js.Any])
    if (activeAnimationType != null) __obj.updateDynamic("activeAnimationType")(activeAnimationType.asInstanceOf[js.Any])
    if (activeSlideAlignment != null) __obj.updateDynamic("activeSlideAlignment")(activeSlideAlignment.asInstanceOf[js.Any])
    if (activeSlideOffset != null) __obj.updateDynamic("activeSlideOffset")(activeSlideOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysBounceHorizontal)) __obj.updateDynamic("alwaysBounceHorizontal")(alwaysBounceHorizontal.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysBounceVertical)) __obj.updateDynamic("alwaysBounceVertical")(alwaysBounceVertical.asInstanceOf[js.Any])
    if (apparitionDelay != null) __obj.updateDynamic("apparitionDelay")(apparitionDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(automaticallyAdjustContentInsets)) __obj.updateDynamic("automaticallyAdjustContentInsets")(automaticallyAdjustContentInsets.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (autoplayDelay != null) __obj.updateDynamic("autoplayDelay")(autoplayDelay.asInstanceOf[js.Any])
    if (autoplayInterval != null) __obj.updateDynamic("autoplayInterval")(autoplayInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(bounces)) __obj.updateDynamic("bounces")(bounces.asInstanceOf[js.Any])
    if (!js.isUndefined(bouncesZoom)) __obj.updateDynamic("bouncesZoom")(bouncesZoom.asInstanceOf[js.Any])
    if (callbackOffsetMargin != null) __obj.updateDynamic("callbackOffsetMargin")(callbackOffsetMargin.asInstanceOf[js.Any])
    if (!js.isUndefined(canCancelContentTouches)) __obj.updateDynamic("canCancelContentTouches")(canCancelContentTouches.asInstanceOf[js.Any])
    if (!js.isUndefined(centerContent)) __obj.updateDynamic("centerContent")(centerContent.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsable)) __obj.updateDynamic("collapsable")(collapsable.asInstanceOf[js.Any])
    if (containerCustomStyle != null) __obj.updateDynamic("containerCustomStyle")(containerCustomStyle.asInstanceOf[js.Any])
    if (contentContainerCustomStyle != null) __obj.updateDynamic("contentContainerCustomStyle")(contentContainerCustomStyle.asInstanceOf[js.Any])
    if (contentContainerStyle != null) __obj.updateDynamic("contentContainerStyle")(contentContainerStyle.asInstanceOf[js.Any])
    if (contentInset != null) __obj.updateDynamic("contentInset")(contentInset.asInstanceOf[js.Any])
    if (contentInsetAdjustmentBehavior != null) __obj.updateDynamic("contentInsetAdjustmentBehavior")(contentInsetAdjustmentBehavior.asInstanceOf[js.Any])
    if (contentOffset != null) __obj.updateDynamic("contentOffset")(contentOffset.asInstanceOf[js.Any])
    if (decelerationRate != null) __obj.updateDynamic("decelerationRate")(decelerationRate.asInstanceOf[js.Any])
    if (!js.isUndefined(directionalLockEnabled)) __obj.updateDynamic("directionalLockEnabled")(directionalLockEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(disableIntervalMomentum)) __obj.updateDynamic("disableIntervalMomentum")(disableIntervalMomentum.asInstanceOf[js.Any])
    if (!js.isUndefined(disableScrollViewPanResponder)) __obj.updateDynamic("disableScrollViewPanResponder")(disableScrollViewPanResponder.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMomentum)) __obj.updateDynamic("enableMomentum")(enableMomentum.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSnap)) __obj.updateDynamic("enableSnap")(enableSnap.asInstanceOf[js.Any])
    if (endFillColor != null) __obj.updateDynamic("endFillColor")(endFillColor.asInstanceOf[js.Any])
    if (firstItem != null) __obj.updateDynamic("firstItem")(firstItem.asInstanceOf[js.Any])
    if (!js.isUndefined(hasParallaxImages)) __obj.updateDynamic("hasParallaxImages")(hasParallaxImages.asInstanceOf[js.Any])
    if (!js.isUndefined(hasTVPreferredFocus)) __obj.updateDynamic("hasTVPreferredFocus")(hasTVPreferredFocus.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (inactiveSlideOpacity != null) __obj.updateDynamic("inactiveSlideOpacity")(inactiveSlideOpacity.asInstanceOf[js.Any])
    if (inactiveSlideScale != null) __obj.updateDynamic("inactiveSlideScale")(inactiveSlideScale.asInstanceOf[js.Any])
    if (inactiveSlideShift != null) __obj.updateDynamic("inactiveSlideShift")(inactiveSlideShift.asInstanceOf[js.Any])
    if (indicatorStyle != null) __obj.updateDynamic("indicatorStyle")(indicatorStyle.asInstanceOf[js.Any])
    if (initialNumToRender != null) __obj.updateDynamic("initialNumToRender")(initialNumToRender.asInstanceOf[js.Any])
    if (!js.isUndefined(invertStickyHeaders)) __obj.updateDynamic("invertStickyHeaders")(invertStickyHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
    if (!js.isUndefined(isTVSelectable)) __obj.updateDynamic("isTVSelectable")(isTVSelectable.asInstanceOf[js.Any])
    if (itemHeight != null) __obj.updateDynamic("itemHeight")(itemHeight.asInstanceOf[js.Any])
    if (itemWidth != null) __obj.updateDynamic("itemWidth")(itemWidth.asInstanceOf[js.Any])
    if (keyboardDismissMode != null) __obj.updateDynamic("keyboardDismissMode")(keyboardDismissMode.asInstanceOf[js.Any])
    if (keyboardShouldPersistTaps != null) __obj.updateDynamic("keyboardShouldPersistTaps")(keyboardShouldPersistTaps.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (layoutCardOffset != null) __obj.updateDynamic("layoutCardOffset")(layoutCardOffset.asInstanceOf[js.Any])
    if (lockScrollTimeoutDuration != null) __obj.updateDynamic("lockScrollTimeoutDuration")(lockScrollTimeoutDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(lockScrollWhileSnapping)) __obj.updateDynamic("lockScrollWhileSnapping")(lockScrollWhileSnapping.asInstanceOf[js.Any])
    if (loopClonesPerSide != null) __obj.updateDynamic("loopClonesPerSide")(loopClonesPerSide.asInstanceOf[js.Any])
    if (maximumZoomScale != null) __obj.updateDynamic("maximumZoomScale")(maximumZoomScale.asInstanceOf[js.Any])
    if (minimumZoomScale != null) __obj.updateDynamic("minimumZoomScale")(minimumZoomScale.asInstanceOf[js.Any])
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID.asInstanceOf[js.Any])
    if (!js.isUndefined(needsOffscreenAlphaCompositing)) __obj.updateDynamic("needsOffscreenAlphaCompositing")(needsOffscreenAlphaCompositing.asInstanceOf[js.Any])
    if (!js.isUndefined(nestedScrollEnabled)) __obj.updateDynamic("nestedScrollEnabled")(nestedScrollEnabled.asInstanceOf[js.Any])
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(js.Any.fromFunction1(onAccessibilityAction))
    if (onAccessibilityEscape != null) __obj.updateDynamic("onAccessibilityEscape")(js.Any.fromFunction0(onAccessibilityEscape))
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(js.Any.fromFunction0(onAccessibilityTap))
    if (onBeforeSnapToItem != null) __obj.updateDynamic("onBeforeSnapToItem")(js.Any.fromFunction1(onBeforeSnapToItem))
    if (onContentSizeChange != null) __obj.updateDynamic("onContentSizeChange")(js.Any.fromFunction2(onContentSizeChange))
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1(onLayout))
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(js.Any.fromFunction0(onMagicTap))
    if (onMomentumScrollBegin != null) __obj.updateDynamic("onMomentumScrollBegin")(js.Any.fromFunction1(onMomentumScrollBegin))
    if (onMomentumScrollEnd != null) __obj.updateDynamic("onMomentumScrollEnd")(js.Any.fromFunction1(onMomentumScrollEnd))
    if (onMoveShouldSetResponder != null) __obj.updateDynamic("onMoveShouldSetResponder")(js.Any.fromFunction1(onMoveShouldSetResponder))
    if (onMoveShouldSetResponderCapture != null) __obj.updateDynamic("onMoveShouldSetResponderCapture")(js.Any.fromFunction1(onMoveShouldSetResponderCapture))
    if (onResponderEnd != null) __obj.updateDynamic("onResponderEnd")(js.Any.fromFunction1(onResponderEnd))
    if (onResponderGrant != null) __obj.updateDynamic("onResponderGrant")(js.Any.fromFunction1(onResponderGrant))
    if (onResponderMove != null) __obj.updateDynamic("onResponderMove")(js.Any.fromFunction1(onResponderMove))
    if (onResponderReject != null) __obj.updateDynamic("onResponderReject")(js.Any.fromFunction1(onResponderReject))
    if (onResponderRelease != null) __obj.updateDynamic("onResponderRelease")(js.Any.fromFunction1(onResponderRelease))
    if (onResponderStart != null) __obj.updateDynamic("onResponderStart")(js.Any.fromFunction1(onResponderStart))
    if (onResponderTerminate != null) __obj.updateDynamic("onResponderTerminate")(js.Any.fromFunction1(onResponderTerminate))
    if (onResponderTerminationRequest != null) __obj.updateDynamic("onResponderTerminationRequest")(js.Any.fromFunction1(onResponderTerminationRequest))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onScrollAnimationEnd != null) __obj.updateDynamic("onScrollAnimationEnd")(js.Any.fromFunction0(onScrollAnimationEnd))
    if (onScrollBeginDrag != null) __obj.updateDynamic("onScrollBeginDrag")(js.Any.fromFunction1(onScrollBeginDrag))
    if (onScrollEndDrag != null) __obj.updateDynamic("onScrollEndDrag")(js.Any.fromFunction1(onScrollEndDrag))
    if (onScrollToTop != null) __obj.updateDynamic("onScrollToTop")(js.Any.fromFunction1(onScrollToTop))
    if (onSnapToItem != null) __obj.updateDynamic("onSnapToItem")(js.Any.fromFunction1(onSnapToItem))
    if (onStartShouldSetResponder != null) __obj.updateDynamic("onStartShouldSetResponder")(js.Any.fromFunction1(onStartShouldSetResponder))
    if (onStartShouldSetResponderCapture != null) __obj.updateDynamic("onStartShouldSetResponderCapture")(js.Any.fromFunction1(onStartShouldSetResponderCapture))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(js.Any.fromFunction1(onTouchEndCapture))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (overScrollMode != null) __obj.updateDynamic("overScrollMode")(overScrollMode.asInstanceOf[js.Any])
    if (!js.isUndefined(pagingEnabled)) __obj.updateDynamic("pagingEnabled")(pagingEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(pinchGestureEnabled)) __obj.updateDynamic("pinchGestureEnabled")(pinchGestureEnabled.asInstanceOf[js.Any])
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (refreshControl != null) __obj.updateDynamic("refreshControl")(refreshControl.asInstanceOf[js.Any])
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews.asInstanceOf[js.Any])
    if (!js.isUndefined(renderToHardwareTextureAndroid)) __obj.updateDynamic("renderToHardwareTextureAndroid")(renderToHardwareTextureAndroid.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollEnabled)) __obj.updateDynamic("scrollEnabled")(scrollEnabled.asInstanceOf[js.Any])
    if (scrollEndDragDebounceValue != null) __obj.updateDynamic("scrollEndDragDebounceValue")(scrollEndDragDebounceValue.asInstanceOf[js.Any])
    if (scrollEventThrottle != null) __obj.updateDynamic("scrollEventThrottle")(scrollEventThrottle.asInstanceOf[js.Any])
    if (scrollIndicatorInsets != null) __obj.updateDynamic("scrollIndicatorInsets")(scrollIndicatorInsets.asInstanceOf[js.Any])
    if (scrollInterpolator != null) __obj.updateDynamic("scrollInterpolator")(js.Any.fromFunction2(scrollInterpolator))
    if (scrollPerfTag != null) __obj.updateDynamic("scrollPerfTag")(scrollPerfTag.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollToOverflowEnabled)) __obj.updateDynamic("scrollToOverflowEnabled")(scrollToOverflowEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollsToTop)) __obj.updateDynamic("scrollsToTop")(scrollsToTop.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldOptimizeUpdates)) __obj.updateDynamic("shouldOptimizeUpdates")(shouldOptimizeUpdates.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldRasterizeIOS)) __obj.updateDynamic("shouldRasterizeIOS")(shouldRasterizeIOS.asInstanceOf[js.Any])
    if (!js.isUndefined(showsHorizontalScrollIndicator)) __obj.updateDynamic("showsHorizontalScrollIndicator")(showsHorizontalScrollIndicator.asInstanceOf[js.Any])
    if (!js.isUndefined(showsVerticalScrollIndicator)) __obj.updateDynamic("showsVerticalScrollIndicator")(showsVerticalScrollIndicator.asInstanceOf[js.Any])
    if (slideInterpolatedStyle != null) __obj.updateDynamic("slideInterpolatedStyle")(js.Any.fromFunction3(slideInterpolatedStyle))
    if (slideStyle != null) __obj.updateDynamic("slideStyle")(slideStyle.asInstanceOf[js.Any])
    if (sliderHeight != null) __obj.updateDynamic("sliderHeight")(sliderHeight.asInstanceOf[js.Any])
    if (sliderWidth != null) __obj.updateDynamic("sliderWidth")(sliderWidth.asInstanceOf[js.Any])
    if (snapToAlignment != null) __obj.updateDynamic("snapToAlignment")(snapToAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(snapToEnd)) __obj.updateDynamic("snapToEnd")(snapToEnd.asInstanceOf[js.Any])
    if (snapToInterval != null) __obj.updateDynamic("snapToInterval")(snapToInterval.asInstanceOf[js.Any])
    if (snapToOffsets != null) __obj.updateDynamic("snapToOffsets")(snapToOffsets.asInstanceOf[js.Any])
    if (!js.isUndefined(snapToStart)) __obj.updateDynamic("snapToStart")(snapToStart.asInstanceOf[js.Any])
    if (stickyHeaderIndices != null) __obj.updateDynamic("stickyHeaderIndices")(stickyHeaderIndices.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (swipeThreshold != null) __obj.updateDynamic("swipeThreshold")(swipeThreshold.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (tvParallaxMagnification != null) __obj.updateDynamic("tvParallaxMagnification")(tvParallaxMagnification.asInstanceOf[js.Any])
    if (tvParallaxProperties != null) __obj.updateDynamic("tvParallaxProperties")(tvParallaxProperties.asInstanceOf[js.Any])
    if (tvParallaxShiftDistanceX != null) __obj.updateDynamic("tvParallaxShiftDistanceX")(tvParallaxShiftDistanceX.asInstanceOf[js.Any])
    if (tvParallaxShiftDistanceY != null) __obj.updateDynamic("tvParallaxShiftDistanceY")(tvParallaxShiftDistanceY.asInstanceOf[js.Any])
    if (tvParallaxTiltAngle != null) __obj.updateDynamic("tvParallaxTiltAngle")(tvParallaxTiltAngle.asInstanceOf[js.Any])
    if (!js.isUndefined(useScrollView)) __obj.updateDynamic("useScrollView")(useScrollView.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    if (zoomScale != null) __obj.updateDynamic("zoomScale")(zoomScale.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactNativeSnapCarousel.mod.default[js.Any]]]
  }
  type Props = CarouselProperties[js.Any]
}

