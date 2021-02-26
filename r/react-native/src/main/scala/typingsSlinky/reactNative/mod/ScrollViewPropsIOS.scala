package typingsSlinky.reactNative.mod

import slinky.core.SyntheticEvent
import typingsSlinky.reactNative.anon.AutoscrollToTopThreshold
import typingsSlinky.reactNative.reactNativeStrings.always
import typingsSlinky.reactNative.reactNativeStrings.automatic
import typingsSlinky.reactNative.reactNativeStrings.black
import typingsSlinky.reactNative.reactNativeStrings.center
import typingsSlinky.reactNative.reactNativeStrings.default
import typingsSlinky.reactNative.reactNativeStrings.end
import typingsSlinky.reactNative.reactNativeStrings.never
import typingsSlinky.reactNative.reactNativeStrings.scrollableAxes
import typingsSlinky.reactNative.reactNativeStrings.start
import typingsSlinky.reactNative.reactNativeStrings.white
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollViewPropsIOS extends StObject {
  
  /**
    * When true the scroll view bounces horizontally when it reaches the end
    * even if the content is smaller than the scroll view itself. The default
    * value is true when `horizontal={true}` and false otherwise.
    */
  var alwaysBounceHorizontal: js.UndefOr[Boolean] = js.native
  
  /**
    * When true the scroll view bounces vertically when it reaches the end
    * even if the content is smaller than the scroll view itself. The default
    * value is false when `horizontal={true}` and true otherwise.
    */
  var alwaysBounceVertical: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls whether iOS should automatically adjust the content inset for scroll views that are placed behind a navigation bar or tab bar/ toolbar.
    * The default value is true.
    */
  var automaticallyAdjustContentInsets: js.UndefOr[Boolean] = js.native
  
  // true
  /**
    * When true the scroll view bounces when it reaches the end of the
    * content if the content is larger then the scroll view along the axis of
    * the scroll direction. When false it disables all bouncing even if
    * the `alwaysBounce*` props are true. The default value is true.
    */
  var bounces: js.UndefOr[Boolean] = js.native
  
  /**
    * When true gestures can drive zoom past min/max and the zoom will animate
    * to the min/max value at gesture end otherwise the zoom will not exceed
    * the limits.
    */
  var bouncesZoom: js.UndefOr[Boolean] = js.native
  
  /**
    * When false once tracking starts won't try to drag if the touch moves.
    * The default value is true.
    */
  var canCancelContentTouches: js.UndefOr[Boolean] = js.native
  
  /**
    * When true the scroll view automatically centers the content when the
    * content is smaller than the scroll view bounds; when the content is
    * larger than the scroll view this property has no effect. The default
    * value is false.
    */
  var centerContent: js.UndefOr[Boolean] = js.native
  
  /**
    * The amount by which the scroll view content is inset from the edges of the scroll view.
    * Defaults to {0, 0, 0, 0}.
    */
  var contentInset: js.UndefOr[Insets] = js.native
  
  // zeros
  /**
    * This property specifies how the safe area insets are used to modify the content area of the scroll view.
    * The default value of this property must be 'automatic'. But the default value is 'never' until RN@0.51.
    */
  var contentInsetAdjustmentBehavior: js.UndefOr[automatic | scrollableAxes | never | always] = js.native
  
  // zeros
  /**
    * Used to manually set the starting scroll offset.
    * The default value is {x: 0, y: 0}
    */
  var contentOffset: js.UndefOr[PointPropType] = js.native
  
  /**
    * When true the ScrollView will try to lock to only vertical or horizontal
    * scrolling while dragging.  The default value is false.
    */
  var directionalLockEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The style of the scroll indicators.
    * - default (the default), same as black.
    * - black, scroll indicator is black. This style is good against
    *   a white content background.
    * - white, scroll indicator is white. This style is good against
    *   a black content background.
    */
  var indicatorStyle: js.UndefOr[default | black | white] = js.native
  
  /**
    * When set, the scroll view will adjust the scroll position so that the first child
    * that is currently visible and at or beyond minIndexForVisible will not change position.
    * This is useful for lists that are loading content in both directions, e.g. a chat thread,
    * where new messages coming in might otherwise cause the scroll position to jump. A value
    * of 0 is common, but other values such as 1 can be used to skip loading spinners or other
    * content that should not maintain position.
    *
    * The optional autoscrollToTopThreshold can be used to make the content automatically scroll
    * to the top after making the adjustment if the user was within the threshold of the top
    * before the adjustment was made. This is also useful for chat-like applications where you
    * want to see new messages scroll into place, but not if the user has scrolled up a ways and
    * it would be disruptive to scroll a bunch.
    *
    * Caveat 1: Reordering elements in the scrollview with this enabled will probably cause
    * jumpiness and jank. It can be fixed, but there are currently no plans to do so. For now,
    * don't re-order the content of any ScrollViews or Lists that use this feature.
    *
    * Caveat 2: This uses contentOffset and frame.origin in native code to compute visibility.
    * Occlusion, transforms, and other complexity won't be taken into account as to whether
    * content is "visible" or not.
    */
  var maintainVisibleContentPosition: js.UndefOr[Null | AutoscrollToTopThreshold] = js.native
  
  /**
    * The maximum allowed zoom scale. The default value is 1.0.
    */
  var maximumZoomScale: js.UndefOr[Double] = js.native
  
  /**
    * The minimum allowed zoom scale. The default value is 1.0.
    */
  var minimumZoomScale: js.UndefOr[Double] = js.native
  
  /**
    * Called when a scrolling animation ends.
    */
  var onScrollAnimationEnd: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Fires when the scroll view scrolls to top after the status bar has been tapped
    * @platform ios
    */
  var onScrollToTop: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeScrollEvent], Unit]] = js.native
  
  /**
    * When true, ScrollView allows use of pinch gestures to zoom in and out.
    * The default value is true.
    */
  var pinchGestureEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * This controls how often the scroll event will be fired while scrolling (in events per seconds).
    * A higher number yields better accuracy for code that is tracking the scroll position,
    * but can lead to scroll performance problems due to the volume of information being send over the bridge.
    * The default value is zero, which means the scroll event will be sent only once each time the view is scrolled.
    */
  var scrollEventThrottle: js.UndefOr[Double] = js.native
  
  // null
  /**
    * The amount by which the scroll view indicators are inset from the edges of the scroll view.
    * This should normally be set to the same value as the contentInset.
    * Defaults to {0, 0, 0, 0}.
    */
  var scrollIndicatorInsets: js.UndefOr[Insets] = js.native
  
  //zeroes
  /**
    * When true, the scroll view can be programmatically scrolled beyond its
    * content size. The default value is false.
    * @platform ios
    */
  var scrollToOverflowEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * When true the scroll view scrolls to top when the status bar is tapped.
    * The default value is true.
    */
  var scrollsToTop: js.UndefOr[Boolean] = js.native
  
  /**
    * When `snapToInterval` is set, `snapToAlignment` will define the relationship of the the snapping to the scroll view.
    *      - `start` (the default) will align the snap at the left (horizontal) or top (vertical)
    *      - `center` will align the snap in the center
    *      - `end` will align the snap at the right (horizontal) or bottom (vertical)
    */
  var snapToAlignment: js.UndefOr[start | center | end] = js.native
  
  /**
    * The current scale of the scroll view content. The default value is 1.0.
    */
  var zoomScale: js.UndefOr[Double] = js.native
}
object ScrollViewPropsIOS {
  
  @scala.inline
  def apply(): ScrollViewPropsIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollViewPropsIOS]
  }
  
  @scala.inline
  implicit class ScrollViewPropsIOSMutableBuilder[Self <: ScrollViewPropsIOS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlwaysBounceHorizontal(value: Boolean): Self = StObject.set(x, "alwaysBounceHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlwaysBounceHorizontalUndefined: Self = StObject.set(x, "alwaysBounceHorizontal", js.undefined)
    
    @scala.inline
    def setAlwaysBounceVertical(value: Boolean): Self = StObject.set(x, "alwaysBounceVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlwaysBounceVerticalUndefined: Self = StObject.set(x, "alwaysBounceVertical", js.undefined)
    
    @scala.inline
    def setAutomaticallyAdjustContentInsets(value: Boolean): Self = StObject.set(x, "automaticallyAdjustContentInsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticallyAdjustContentInsetsUndefined: Self = StObject.set(x, "automaticallyAdjustContentInsets", js.undefined)
    
    @scala.inline
    def setBounces(value: Boolean): Self = StObject.set(x, "bounces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBouncesUndefined: Self = StObject.set(x, "bounces", js.undefined)
    
    @scala.inline
    def setBouncesZoom(value: Boolean): Self = StObject.set(x, "bouncesZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBouncesZoomUndefined: Self = StObject.set(x, "bouncesZoom", js.undefined)
    
    @scala.inline
    def setCanCancelContentTouches(value: Boolean): Self = StObject.set(x, "canCancelContentTouches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanCancelContentTouchesUndefined: Self = StObject.set(x, "canCancelContentTouches", js.undefined)
    
    @scala.inline
    def setCenterContent(value: Boolean): Self = StObject.set(x, "centerContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterContentUndefined: Self = StObject.set(x, "centerContent", js.undefined)
    
    @scala.inline
    def setContentInset(value: Insets): Self = StObject.set(x, "contentInset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentInsetAdjustmentBehavior(value: automatic | scrollableAxes | never | always): Self = StObject.set(x, "contentInsetAdjustmentBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentInsetAdjustmentBehaviorUndefined: Self = StObject.set(x, "contentInsetAdjustmentBehavior", js.undefined)
    
    @scala.inline
    def setContentInsetUndefined: Self = StObject.set(x, "contentInset", js.undefined)
    
    @scala.inline
    def setContentOffset(value: PointPropType): Self = StObject.set(x, "contentOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentOffsetUndefined: Self = StObject.set(x, "contentOffset", js.undefined)
    
    @scala.inline
    def setDirectionalLockEnabled(value: Boolean): Self = StObject.set(x, "directionalLockEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionalLockEnabledUndefined: Self = StObject.set(x, "directionalLockEnabled", js.undefined)
    
    @scala.inline
    def setIndicatorStyle(value: default | black | white): Self = StObject.set(x, "indicatorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicatorStyleUndefined: Self = StObject.set(x, "indicatorStyle", js.undefined)
    
    @scala.inline
    def setMaintainVisibleContentPosition(value: AutoscrollToTopThreshold): Self = StObject.set(x, "maintainVisibleContentPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintainVisibleContentPositionNull: Self = StObject.set(x, "maintainVisibleContentPosition", null)
    
    @scala.inline
    def setMaintainVisibleContentPositionUndefined: Self = StObject.set(x, "maintainVisibleContentPosition", js.undefined)
    
    @scala.inline
    def setMaximumZoomScale(value: Double): Self = StObject.set(x, "maximumZoomScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumZoomScaleUndefined: Self = StObject.set(x, "maximumZoomScale", js.undefined)
    
    @scala.inline
    def setMinimumZoomScale(value: Double): Self = StObject.set(x, "minimumZoomScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumZoomScaleUndefined: Self = StObject.set(x, "minimumZoomScale", js.undefined)
    
    @scala.inline
    def setOnScrollAnimationEnd(value: () => Unit): Self = StObject.set(x, "onScrollAnimationEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnScrollAnimationEndUndefined: Self = StObject.set(x, "onScrollAnimationEnd", js.undefined)
    
    @scala.inline
    def setOnScrollToTop(value: SyntheticEvent[NodeHandle, NativeScrollEvent] => Unit): Self = StObject.set(x, "onScrollToTop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnScrollToTopUndefined: Self = StObject.set(x, "onScrollToTop", js.undefined)
    
    @scala.inline
    def setPinchGestureEnabled(value: Boolean): Self = StObject.set(x, "pinchGestureEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinchGestureEnabledUndefined: Self = StObject.set(x, "pinchGestureEnabled", js.undefined)
    
    @scala.inline
    def setScrollEventThrottle(value: Double): Self = StObject.set(x, "scrollEventThrottle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollEventThrottleUndefined: Self = StObject.set(x, "scrollEventThrottle", js.undefined)
    
    @scala.inline
    def setScrollIndicatorInsets(value: Insets): Self = StObject.set(x, "scrollIndicatorInsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollIndicatorInsetsUndefined: Self = StObject.set(x, "scrollIndicatorInsets", js.undefined)
    
    @scala.inline
    def setScrollToOverflowEnabled(value: Boolean): Self = StObject.set(x, "scrollToOverflowEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollToOverflowEnabledUndefined: Self = StObject.set(x, "scrollToOverflowEnabled", js.undefined)
    
    @scala.inline
    def setScrollsToTop(value: Boolean): Self = StObject.set(x, "scrollsToTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollsToTopUndefined: Self = StObject.set(x, "scrollsToTop", js.undefined)
    
    @scala.inline
    def setSnapToAlignment(value: start | center | end): Self = StObject.set(x, "snapToAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapToAlignmentUndefined: Self = StObject.set(x, "snapToAlignment", js.undefined)
    
    @scala.inline
    def setZoomScale(value: Double): Self = StObject.set(x, "zoomScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomScaleUndefined: Self = StObject.set(x, "zoomScale", js.undefined)
  }
}
