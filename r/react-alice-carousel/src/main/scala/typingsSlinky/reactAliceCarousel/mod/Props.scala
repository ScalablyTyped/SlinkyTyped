package typingsSlinky.reactAliceCarousel.mod

import typingsSlinky.reactAliceCarousel.reactAliceCarouselStrings.responsive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  /**
    * Set auto height for the stage
    *
    * Default: false.
    */
  var autoHeight: js.UndefOr[Boolean] = js.native
  /**
    *  Set auto play mode
    *
    * Default: false.
    */
  var autoPlay: js.UndefOr[Boolean] = js.native
  /**
    * If this property is identified as true auto play animation will be stopped after clicking user on any gallery button
    *
    * Default: false.
    */
  var autoPlayActionDisabled: js.UndefOr[Boolean] = js.native
  /**
    * To run auto play in the left direction specify rtl value
    *
    * Default: 'ltr'.
    */
  var autoPlayDirection: js.UndefOr[String] = js.native
  /**
    * Interval of auto play animation (milliseconds). If specified, a larger value will be taken from comparing this property and the duration one
    *
    * Default: 250.
    */
  var autoPlayInterval: js.UndefOr[Double] = js.native
  /**
    * Disable buttons control
    *
    * Default: false.
    */
  var buttonsDisabled: js.UndefOr[Boolean] = js.native
  /** Defines the behavior strategy for controls.
    *
    * Default: 'default'
    *
    * If `responsive` is specified, dots navigation will be hidden if the number of gallery items is equal to the number of items on the slide
    */
  var controlsStrategy: js.UndefOr[typingsSlinky.reactAliceCarousel.reactAliceCarouselStrings.default | responsive] = js.native
  /**
    * If this property is identified as true auto play animation will be stopped after clicking user on any gallery button
    *
    * Default: false.
    */
  var disableAutoPlayOnAction: js.UndefOr[Boolean] = js.native
  /**
    * Disable dots navigation
    *
    * Default: false.
    */
  var dotsDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Duration of slides transition (milliseconds)
    *
    * Default: 250.
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * Enable fadeout animation. Fired when 1 item is in the slide
    *
    * Default: false.
    */
  var fadeOutAnimation: js.UndefOr[Boolean] = js.native
  /**
    * Disable infinite mode
    *
    * Default: true.
    */
  var infinite: js.UndefOr[Boolean] = js.native
  /**
    * Gallery items, preferable to use this property instead of children
    *
    * Default: [].
    */
  var items: js.UndefOr[js.Array[js.Object]] = js.native
  /**
    * Disable keys controls (left, right, space)
    *
    * Default: false.
    */
  var keysControlDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Enable mouse drag animation
    *
    * Default: false.
    */
  var mouseTrackingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Fired when the gallery was initialized / returns event object
    */
  var onInitialized: js.UndefOr[js.Function1[/* e */ EventObject, Unit]] = js.native
  /**
    * Fired when the gallery was resized / returns event object
    */
  var onResized: js.UndefOr[js.Function1[/* e */ EventObject, Unit]] = js.native
  /**
    * Fired when the event object is changing / returns event object
    */
  var onSlideChange: js.UndefOr[js.Function1[/* e */ EventObject, Unit]] = js.native
  /**
    * Fired when the event object was changed / returns event object
    */
  var onSlideChanged: js.UndefOr[js.Function1[/* e */ EventObject, Unit]] = js.native
  /**
    * Disable play/pause button
    *
    * Default: false.
    */
  var playButtonEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Prevent the browser's touchmove event when carousel is swiping
    *
    * Default: false.
    */
  var preventEventOnTouchMove: js.UndefOr[Boolean] = js.native
  /**
    * Number of items in the slide.
    *
    * Default: {}.
    */
  var responsive: js.UndefOr[js.Object] = js.native
  /**
    * Fired during resize event to determine whether the event handler should be called / return boolean
    */
  var shouldHandleResizeEvent: js.UndefOr[js.Function1[/* e */ js.Any, Boolean]] = js.native
  /**
    * Show slide info
    *
    * Default: false.
    */
  var showSlideInfo: js.UndefOr[Boolean] = js.native
  /**
    * Sets the carousel at the specified position
    *
    * Default: 0.
    */
  var slideToIndex: js.UndefOr[Double] = js.native
  /**
    * Padding left and right on the stage
    *
    * Default: {}.
    */
  var stagePadding: js.UndefOr[js.Object] = js.native
  /**
    * The starting index of the carousel
    *
    * Default: 0.
    */
  var startIndex: js.UndefOr[Double] = js.native
  /**
    * If this property is identified as false auto play animation won't stopped on hover
    *
    * Default: true.
    */
  var stopAutoPlayOnHover: js.UndefOr[Boolean] = js.native
  /**
    * Disable swipe handlers
    *
    * Default: false.
    */
  var swipeDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Enable touch tracking animation
    *
    * Default: false.
    */
  var touchTrackingEnabled: js.UndefOr[Boolean] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoPlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPlay")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoPlayActionDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPlayActionDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPlayActionDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPlayActionDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoPlayDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPlayDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPlayDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPlayDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoPlayInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPlayInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPlayInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPlayInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonsDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonsDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonsDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonsDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withControlsStrategy(value: typingsSlinky.reactAliceCarousel.reactAliceCarouselStrings.default | responsive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlsStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlsStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlsStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableAutoPlayOnAction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAutoPlayOnAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableAutoPlayOnAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAutoPlayOnAction")(js.undefined)
        ret
    }
    @scala.inline
    def withDotsDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotsDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotsDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotsDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withFadeOutAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeOutAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFadeOutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeOutAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withInfinite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infinite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfinite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infinite")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withKeysControlDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keysControlDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeysControlDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keysControlDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseTrackingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseTrackingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseTrackingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseTrackingEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInitialized(value: /* e */ EventObject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInitialized")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInitialized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInitialized")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResized(value: /* e */ EventObject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResized")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResized")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSlideChange(value: /* e */ EventObject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSlideChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSlideChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSlideChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSlideChanged(value: /* e */ EventObject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSlideChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSlideChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSlideChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withPlayButtonEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playButtonEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayButtonEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playButtonEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventEventOnTouchMove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventEventOnTouchMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventEventOnTouchMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventEventOnTouchMove")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsive(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldHandleResizeEvent(value: /* e */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldHandleResizeEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShouldHandleResizeEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldHandleResizeEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSlideInfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSlideInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSlideInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSlideInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideToIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideToIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideToIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideToIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withStagePadding(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stagePadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStagePadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stagePadding")(js.undefined)
        ret
    }
    @scala.inline
    def withStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withStopAutoPlayOnHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopAutoPlayOnHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopAutoPlayOnHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopAutoPlayOnHover")(js.undefined)
        ret
    }
    @scala.inline
    def withSwipeDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipeDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchTrackingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchTrackingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchTrackingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchTrackingEnabled")(js.undefined)
        ret
    }
  }
  
}

