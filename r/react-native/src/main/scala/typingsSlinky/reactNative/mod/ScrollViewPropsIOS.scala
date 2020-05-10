package typingsSlinky.reactNative.mod

import slinky.core.SyntheticEvent
import typingsSlinky.reactNative.reactNativeStrings.always
import typingsSlinky.reactNative.reactNativeStrings.automatic
import typingsSlinky.reactNative.reactNativeStrings.black
import typingsSlinky.reactNative.reactNativeStrings.default
import typingsSlinky.reactNative.reactNativeStrings.fast
import typingsSlinky.reactNative.reactNativeStrings.never
import typingsSlinky.reactNative.reactNativeStrings.normal_
import typingsSlinky.reactNative.reactNativeStrings.scrollableAxes
import typingsSlinky.reactNative.reactNativeStrings.white
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollViewPropsIOS extends js.Object {
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
    * A floating-point number that determines how quickly the scroll view
    * decelerates after the user lifts their finger. Reasonable choices include
    *   - Normal: 0.998 (the default)
    *   - Fast: 0.9
    */
  var decelerationRate: js.UndefOr[fast | normal_ | Double] = js.native
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
    * An array of child indices determining which children get docked to the
    * top of the screen when scrolling. For example passing
    * `stickyHeaderIndices={[0]}` will cause the first child to be fixed to the
    * top of the scroll view. This property is not supported in conjunction
    * with `horizontal={true}`.
    */
  var stickyHeaderIndices: js.UndefOr[js.Array[Double]] = js.native
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
  implicit class ScrollViewPropsIOSOps[Self <: ScrollViewPropsIOS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlwaysBounceHorizontal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysBounceHorizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysBounceHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysBounceHorizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withAlwaysBounceVertical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysBounceVertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysBounceVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysBounceVertical")(js.undefined)
        ret
    }
    @scala.inline
    def withAutomaticallyAdjustContentInsets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticallyAdjustContentInsets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomaticallyAdjustContentInsets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticallyAdjustContentInsets")(js.undefined)
        ret
    }
    @scala.inline
    def withBounces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounces")(js.undefined)
        ret
    }
    @scala.inline
    def withBouncesZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bouncesZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBouncesZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bouncesZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withCanCancelContentTouches(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canCancelContentTouches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanCancelContentTouches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canCancelContentTouches")(js.undefined)
        ret
    }
    @scala.inline
    def withCenterContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerContent")(js.undefined)
        ret
    }
    @scala.inline
    def withContentInset(value: Insets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentInset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentInset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentInset")(js.undefined)
        ret
    }
    @scala.inline
    def withContentInsetAdjustmentBehavior(value: automatic | scrollableAxes | never | always): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentInsetAdjustmentBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentInsetAdjustmentBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentInsetAdjustmentBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withContentOffset(value: PointPropType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withDecelerationRate(value: fast | normal_ | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decelerationRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecelerationRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decelerationRate")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectionalLockEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalLockEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectionalLockEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalLockEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIndicatorStyle(value: default | black | white): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndicatorStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumZoomScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumZoomScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumZoomScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumZoomScale")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumZoomScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumZoomScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumZoomScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumZoomScale")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScrollAnimationEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollAnimationEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnScrollAnimationEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollAnimationEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScrollToTop(value: SyntheticEvent[NodeHandle, NativeScrollEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollToTop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnScrollToTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollToTop")(js.undefined)
        ret
    }
    @scala.inline
    def withPinchGestureEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinchGestureEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinchGestureEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinchGestureEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollEventThrottle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollEventThrottle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollEventThrottle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollEventThrottle")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollIndicatorInsets(value: Insets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollIndicatorInsets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollIndicatorInsets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollIndicatorInsets")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollToOverflowEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToOverflowEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollToOverflowEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToOverflowEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollsToTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollsToTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollsToTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollsToTop")(js.undefined)
        ret
    }
    @scala.inline
    def withStickyHeaderIndices(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyHeaderIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStickyHeaderIndices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyHeaderIndices")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomScale")(js.undefined)
        ret
    }
  }
  
}

