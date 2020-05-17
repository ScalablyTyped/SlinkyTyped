package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgSlider
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Get or set whether the slide handle will animate when it is moved.
  	 */
  var animate: js.UndefOr[Boolean] = js.native
  /**
  	 * Defines the slider bookmark click event. Fired when a bookmark is clicked.
  	 */
  var bookmarkClick: js.UndefOr[BookmarkClickEvent] = js.native
  /**
  	 * Defines the slider bookmark hit event. Fired when the slider handle passes after the bookmark value.
  	 */
  var bookmarkHit: js.UndefOr[BookmarkHitEvent] = js.native
  /**
  	 * Get or set the bookmarks array.
  	 */
  var bookmarks: js.UndefOr[IgSliderBookmarks] = js.native
  /**
  	 * Defines the slider value change event. Fired when the value of the slider changes. It fires after the slide event.
  	 */
  var change: js.UndefOr[ChangeEvent] = js.native
  /**
  	 * Get or set the slider range maximum value.
  	 */
  var max: js.UndefOr[Double] = js.native
  /**
  	 * Get or set the slider range minimum value.
  	 */
  var min: js.UndefOr[Double] = js.native
  /**
  	 * Get or set the slider orientation.
  	 */
  var orientation: js.UndefOr[js.Any] = js.native
  /**
  	 * Get or set the whether to show bookmarks title on bookmark hover or not.
  	 */
  var showBookmarkTitle: js.UndefOr[Boolean] = js.native
  /**
  	 * Defines the slide event. Fired when the user is sliding with mouse.
  	 */
  var slide: js.UndefOr[SlideEvent] = js.native
  /**
  	 * Defines the slide start event.
  	 */
  var start: js.UndefOr[StartEvent] = js.native
  /**
  	 * Get or set the step with which the value is increased.
  	 */
  var step: js.UndefOr[Double] = js.native
  /**
  	 * Defines the slide stop event. Fired to mark the end of a sliding action.
  	 */
  var stop: js.UndefOr[StopEvent] = js.native
  /**
  	 * Get or set whether the handle will be moved to the bookmark position when a bookmark is clicked.
  	 */
  var syncHandleWithBookmark: js.UndefOr[Boolean] = js.native
  /**
  	 * Get or set the slider value.
  	 */
  var value: js.UndefOr[Double] = js.native
}

object IgSlider {
  @scala.inline
  def apply(): IgSlider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgSlider]
  }
  @scala.inline
  implicit class IgSliderOps[Self <: IgSlider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.undefined)
        ret
    }
    @scala.inline
    def withBookmarkClick(value: (/* event */ Event, /* ui */ BookmarkClickEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookmarkClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBookmarkClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookmarkClick")(js.undefined)
        ret
    }
    @scala.inline
    def withBookmarkHit(value: (/* event */ Event, /* ui */ BookmarkHitEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookmarkHit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBookmarkHit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookmarkHit")(js.undefined)
        ret
    }
    @scala.inline
    def withBookmarks(value: IgSliderBookmarks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookmarks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBookmarks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookmarks")(js.undefined)
        ret
    }
    @scala.inline
    def withChange(value: (/* event */ Event, /* ui */ ChangeEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withShowBookmarkTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBookmarkTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowBookmarkTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBookmarkTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withSlide(value: (/* event */ Event, /* ui */ SlideEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slide")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSlide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slide")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: (/* event */ Event, /* ui */ StartEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
    @scala.inline
    def withStop(value: (/* event */ Event, /* ui */ StopEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncHandleWithBookmark(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncHandleWithBookmark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncHandleWithBookmark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncHandleWithBookmark")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

