package typingsSlinky.reactNavigation.components

import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.anon.AutoscrollToTopThreshold
import typingsSlinky.reactNative.anon.Layout
import typingsSlinky.reactNative.anon.ReadonlyactionNamestring
import typingsSlinky.reactNative.mod.AccessibilityActionInfo
import typingsSlinky.reactNative.mod.AccessibilityRole
import typingsSlinky.reactNative.mod.AccessibilityState
import typingsSlinky.reactNative.mod.AccessibilityTrait
import typingsSlinky.reactNative.mod.AccessibilityValue
import typingsSlinky.reactNative.mod.ColorValue
import typingsSlinky.reactNative.mod.Insets
import typingsSlinky.reactNative.mod.NativeScrollEvent
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.PointPropType
import typingsSlinky.reactNative.mod.ScrollViewProps
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
import typingsSlinky.reactNative.reactNativeStrings.center
import typingsSlinky.reactNative.reactNativeStrings.default
import typingsSlinky.reactNative.reactNativeStrings.end
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
import typingsSlinky.reactNative.reactNativeStrings.start
import typingsSlinky.reactNative.reactNativeStrings.white
import typingsSlinky.reactNative.reactNativeStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScrollView {
  
  @JSImport("react-navigation", "ScrollView")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNavigation.mod.ScrollView] {
    
    @scala.inline
    def accessibilityActions(value: js.Array[AccessibilityActionInfo]): this.type = set("accessibilityActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityActionsVarargs(value: AccessibilityActionInfo*): this.type = set("accessibilityActions", js.Array(value :_*))
    
    @scala.inline
    def accessibilityComponentType(value: none | button | radiobutton_checked | radiobutton_unchecked): this.type = set("accessibilityComponentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityElementsHidden(value: Boolean): this.type = set("accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityHint(value: String): this.type = set("accessibilityHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityIgnoresInvertColors(value: Boolean): this.type = set("accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityLiveRegion(value: none | polite | assertive): this.type = set("accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityRole(value: AccessibilityRole): this.type = set("accessibilityRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityState(value: AccessibilityState): this.type = set("accessibilityState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityTraits(value: AccessibilityTrait | js.Array[AccessibilityTrait]): this.type = set("accessibilityTraits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityTraitsVarargs(value: AccessibilityTrait*): this.type = set("accessibilityTraits", js.Array(value :_*))
    
    @scala.inline
    def accessibilityValue(value: AccessibilityValue): this.type = set("accessibilityValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityViewIsModal(value: Boolean): this.type = set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessible(value: Boolean): this.type = set("accessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def alwaysBounceHorizontal(value: Boolean): this.type = set("alwaysBounceHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def alwaysBounceVertical(value: Boolean): this.type = set("alwaysBounceVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def automaticallyAdjustContentInsets(value: Boolean): this.type = set("automaticallyAdjustContentInsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bounces(value: Boolean): this.type = set("bounces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bouncesZoom(value: Boolean): this.type = set("bouncesZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def canCancelContentTouches(value: Boolean): this.type = set("canCancelContentTouches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def centerContent(value: Boolean): this.type = set("centerContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def collapsable(value: Boolean): this.type = set("collapsable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentContainerStyle(value: StyleProp[ViewStyle]): this.type = set("contentContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentContainerStyleNull: this.type = set("contentContainerStyle", null)
    
    @scala.inline
    def contentInset(value: Insets): this.type = set("contentInset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentInsetAdjustmentBehavior(value: automatic | scrollableAxes | never | always): this.type = set("contentInsetAdjustmentBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentOffset(value: PointPropType): this.type = set("contentOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def decelerationRate(value: fast | normal_ | Double): this.type = set("decelerationRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def directionalLockEnabled(value: Boolean): this.type = set("directionalLockEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableIntervalMomentum(value: Boolean): this.type = set("disableIntervalMomentum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableScrollViewPanResponder(value: Boolean): this.type = set("disableScrollViewPanResponder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def endFillColor(value: ColorValue): this.type = set("endFillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fadingEdgeLength(value: Double): this.type = set("fadingEdgeLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def focusable(value: Boolean): this.type = set("focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hasTVPreferredFocus(value: Boolean): this.type = set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hitSlop(value: Insets): this.type = set("hitSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def horizontalNull: this.type = set("horizontal", null)
    
    @scala.inline
    def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def indicatorStyle(value: default | black | white): this.type = set("indicatorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def invertStickyHeaders(value: Boolean): this.type = set("invertStickyHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isTVSelectable(value: Boolean): this.type = set("isTVSelectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def keyboardDismissMode(value: none | interactive | `on-drag`): this.type = set("keyboardDismissMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def keyboardShouldPersistTaps(value: Boolean | always | never | handled): this.type = set("keyboardShouldPersistTaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maintainVisibleContentPosition(value: AutoscrollToTopThreshold): this.type = set("maintainVisibleContentPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maintainVisibleContentPositionNull: this.type = set("maintainVisibleContentPosition", null)
    
    @scala.inline
    def maximumZoomScale(value: Double): this.type = set("maximumZoomScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minimumZoomScale(value: Double): this.type = set("minimumZoomScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nativeID(value: String): this.type = set("nativeID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def needsOffscreenAlphaCompositing(value: Boolean): this.type = set("needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nestedScrollEnabled(value: Boolean): this.type = set("nestedScrollEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAccessibilityAction(value: SyntheticEvent[NodeHandle, ReadonlyactionNamestring] => Unit): this.type = set("onAccessibilityAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAccessibilityEscape(value: () => Unit): this.type = set("onAccessibilityEscape", js.Any.fromFunction0(value))
    
    @scala.inline
    def onAccessibilityTap(value: () => Unit): this.type = set("onAccessibilityTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def onContentSizeChange(value: (/* w */ Double, /* h */ Double) => Unit): this.type = set("onContentSizeChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def onLayout(value: SyntheticEvent[NodeHandle, Layout] => Unit): this.type = set("onLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMagicTap(value: () => Unit): this.type = set("onMagicTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def onMomentumScrollBegin(value: SyntheticEvent[NodeHandle, NativeScrollEvent] => Unit): this.type = set("onMomentumScrollBegin", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMomentumScrollEnd(value: SyntheticEvent[NodeHandle, NativeScrollEvent] => Unit): this.type = set("onMomentumScrollEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMoveShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onMoveShouldSetResponder", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMoveShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderEnd(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderGrant(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderGrant", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderMove(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderReject(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderReject", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderRelease(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderRelease", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderStart(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderTerminate(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderTerminate", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResponderTerminationRequest(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onResponderTerminationRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def onScroll(value: SyntheticEvent[NodeHandle, NativeScrollEvent] => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def onScrollAnimationEnd(value: () => Unit): this.type = set("onScrollAnimationEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def onScrollBeginDrag(value: SyntheticEvent[NodeHandle, NativeScrollEvent] => Unit): this.type = set("onScrollBeginDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def onScrollEndDrag(value: SyntheticEvent[NodeHandle, NativeScrollEvent] => Unit): this.type = set("onScrollEndDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def onScrollToTop(value: SyntheticEvent[NodeHandle, NativeScrollEvent] => Unit): this.type = set("onScrollToTop", js.Any.fromFunction1(value))
    
    @scala.inline
    def onStartShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onStartShouldSetResponder", js.Any.fromFunction1(value))
    
    @scala.inline
    def onStartShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchCancel(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchEnd(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchEndCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchEndCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchMove(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchStart(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def overScrollMode(value: auto | always | never): this.type = set("overScrollMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pagingEnabled(value: Boolean): this.type = set("pagingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def persistentScrollbar(value: Boolean): this.type = set("persistentScrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pinchGestureEnabled(value: Boolean): this.type = set("pinchGestureEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pointerEvents(value: `box-none` | none | `box-only` | auto): this.type = set("pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def refreshControl(value: ReactElement): this.type = set("refreshControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def removeClippedSubviews(value: Boolean): this.type = set("removeClippedSubviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderToHardwareTextureAndroid(value: Boolean): this.type = set("renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollEnabled(value: Boolean): this.type = set("scrollEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollEventThrottle(value: Double): this.type = set("scrollEventThrottle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollIndicatorInsets(value: Insets): this.type = set("scrollIndicatorInsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollPerfTag(value: String): this.type = set("scrollPerfTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollToOverflowEnabled(value: Boolean): this.type = set("scrollToOverflowEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollsToTop(value: Boolean): this.type = set("scrollsToTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shouldRasterizeIOS(value: Boolean): this.type = set("shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showsHorizontalScrollIndicator(value: Boolean): this.type = set("showsHorizontalScrollIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showsVerticalScrollIndicator(value: Boolean): this.type = set("showsVerticalScrollIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def snapToAlignment(value: start | center | end): this.type = set("snapToAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def snapToEnd(value: Boolean): this.type = set("snapToEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def snapToInterval(value: Double): this.type = set("snapToInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def snapToOffsets(value: js.Array[Double]): this.type = set("snapToOffsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def snapToOffsetsVarargs(value: Double*): this.type = set("snapToOffsets", js.Array(value :_*))
    
    @scala.inline
    def snapToStart(value: Boolean): this.type = set("snapToStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stickyHeaderIndices(value: js.Array[Double]): this.type = set("stickyHeaderIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stickyHeaderIndicesVarargs(value: Double*): this.type = set("stickyHeaderIndices", js.Array(value :_*))
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tvParallaxMagnification(value: Double): this.type = set("tvParallaxMagnification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tvParallaxProperties(value: TVParallaxProperties): this.type = set("tvParallaxProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tvParallaxShiftDistanceX(value: Double): this.type = set("tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tvParallaxShiftDistanceY(value: Double): this.type = set("tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tvParallaxTiltAngle(value: Double): this.type = set("tvParallaxTiltAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def zoomScale(value: Double): this.type = set("zoomScale", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ScrollView.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ScrollViewProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
