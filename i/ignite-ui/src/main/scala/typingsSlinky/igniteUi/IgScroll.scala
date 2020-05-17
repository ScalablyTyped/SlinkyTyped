package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgScroll
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Sets or gets if the scrollbars should be always visible (on all environments). Otherwise it will be the default behavior. Note: this option is only for the custom scrollbars set through the scrollbarType option.
  	 *
  	 */
  var alwaysVisible: js.UndefOr[Boolean] = js.native
  /**
  	 * Sets gets the step of the default scrolling behavior when using any of the custom scrollbar track areas.
  	 *
  	 */
  var bigIncrementStep: js.UndefOr[Double] = js.native
  /**
  	 * Sets gets at least how many times the horizontal speed should be bigger so the inertia proceeds only horizontally without scrolling vertically. This is to improve interactions due to not perfectly swiping left/right with some deviation down/up
  	 *
  	 */
  var inertiaDeltaX: js.UndefOr[Double] = js.native
  /**
  	 * Sets gets at least how many times the vertical speed should be bigger so the inertia proceeds only vertically without scrolling horizontally. This is to improve interactions due to not perfectly swiping down/up with some deviation left/right
  	 *
  	 */
  var inertiaDeltaY: js.UndefOr[Double] = js.native
  /**
  	 * Sets gets the modifier for how long the inertia last on mobile devices
  	 *
  	 */
  var inertiaDuration: js.UndefOr[Double] = js.native
  /**
  	 * Sets gets the modifier for how much the inertia scrolls on mobile devices
  	 *
  	 */
  var inertiaStep: js.UndefOr[Double] = js.native
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.native
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.native
  /**
  	 * Sets or gets the minimum size of the thumb drag in pixels. For the vertical thumb it means its minimum height, for the horizontal thumb it means its minimum width. This affects only the custom scrollblar when scrollbarType is set to "custom".
  	 *
  	 */
  var minThumbSize: js.UndefOr[Double | String] = js.native
  /**
  	 * Sets or gets if igScroll can modify the DOM when it is initialized on certain element so that the content can be scrollable.
  	 *
  	 */
  var modifyDOM: js.UndefOr[Boolean] = js.native
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
  	 * Event which is raised after the scroller has been rendered fully
  	 */
  var rendered: js.UndefOr[RenderedEvent] = js.native
  /**
  	 * Event which is raised after the igScroll has finished resizing.
  	 * Function takes arguments evt and args.
  	 * Use evt.originalEvent (with validation for not null of evt) to obtain reference to event of browser.
  	 * Use args.owner to obtain reference to igScroll.
  	 */
  var resized: js.UndefOr[ResizedEvent] = js.native
  /**
  	 * Event which is raised when the igScroll detects that the element is reizing.
  	 * Function takes arguments evt and args.
  	 * Use evt.originalEvent (with validation for not null of evt) to obtain reference to event of browser.
  	 * Use args.owner to obtain reference to igScroll.
  	 */
  var resizing: js.UndefOr[ResizingEvent] = js.native
  /**
  	 * Sets custom value for how high is actually the content. Useful when wanting to scroll and update the shown content manually.
  	 *
  	 */
  var scrollHeight: js.UndefOr[Double] = js.native
  /**
  	 * Sets gets current horizontal position of the content.
  	 *
  	 */
  var scrollLeft: js.UndefOr[Double] = js.native
  /**
  	 * Sets gets if only the linked horizontal scrollbar should be used for horizontal scrolling. Note: The behavior when the linked scrollbar is scrolled in this case should be handled manually.
  	 *
  	 */
  var scrollOnlyHBar: js.UndefOr[Boolean] = js.native
  /**
  	 * Sets gets if only the linked vertical scrollbar should be used for vertical scrolling. Note: The behavior when the linked scrollbar is scrolled in this case should be handled manually.
  	 *
  	 */
  var scrollOnlyVBar: js.UndefOr[Boolean] = js.native
  /**
  	 * Sets gets current vertical position of the content.
  	 *
  	 */
  var scrollTop: js.UndefOr[Double] = js.native
  /**
  	 * Sets custom value for what width is actually the content. Useful when wanting to scroll and update the shown content manually.
  	 *
  	 */
  var scrollWidth: js.UndefOr[Double] = js.native
  /**
  	 * Sets gets html or jQuery element which is used for horizontal scrolling.
  	 *
  	 */
  var scrollbarH: js.UndefOr[String] = js.native
  /**
  	 * Sets gets html or jQuery element to which the horizontal scrollbar will be appended to.
  	 *
  	 */
  var scrollbarHParent: js.UndefOr[String] = js.native
  /**
  	 * Sets or gets what type of scrollbars should be using the igScroll (on all environments).
  	 *
  	 *
  	 * Valid values:
  	 * "custom" Custom scrollbars with custom ui and events.
  	 * "native" Native scrollbars
  	 * "none" No scrollbars should be visible
  	 */
  var scrollbarType: js.UndefOr[String] = js.native
  /**
  	 * Sets gets html or jQuery element which is used for vertical scrolling.
  	 *
  	 */
  var scrollbarV: js.UndefOr[String] = js.native
  /**
  	 * Sets gets html or jQuery element to which the vertical scrollbar will be appended to.
  	 *
  	 */
  var scrollbarVParent: js.UndefOr[String] = js.native
  /**
  	 * Event which is raised after scrolling has stopped.
  	 */
  var scrolled: js.UndefOr[ScrolledEvent] = js.native
  /**
  	 * Event which is raised before scrolling or before each step when having inertia.
  	 * Return false in order to cancel action.
  	 */
  var scrolling: js.UndefOr[ScrollingEvent] = js.native
  /**
  	 * Sets gets the step of the default scrolling behavior when using any of the custom scrollbar arrows
  	 *
  	 */
  var smallIncrementStep: js.UndefOr[Double] = js.native
  /**
  	 * Sets gets if smoother scrolling with small intertia should be used when using mouse wheel
  	 *
  	 */
  var smoothing: js.UndefOr[Boolean] = js.native
  /**
  	 * Sets or gets the modifier for how long the scroll ‘animation’ lasts when using the mouse wheel once. This is used only for the smooth scrolling behavior.
  	 *
  	 */
  var smoothingDuration: js.UndefOr[Double] = js.native
  /**
  	 * Sets or gets the modifier for how many pixels will be scrolled when using the mouse wheel once. This is used only for the smooth scrolling behavior.
  	 *
  	 */
  var smoothingStep: js.UndefOr[Double] = js.native
  /**
  	 * Sets gets how much pixels of toleration there will be when initially swiping horizontally. This is to improve swiping up/down without scrolling left/right when not intended due to small deviation left/right
  	 *
  	 */
  var swipeToleranceX: js.UndefOr[Double] = js.native
  /**
  	 * Sets gets elements that are linked to the main content horizontally. When the content is scrolled on X axis the linked elements scroll accordingly.
  	 *
  	 */
  var syncedElemsH: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Sets gets elements that are linked to the main content vertically. When the content is scrolled on Y axis the linked elements scroll accordingly.
  	 *
  	 */
  var syncedElemsV: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Event which is raised on mouse up from the scrollbar's thumb drag.
  	 */
  var thumbDragEnd: js.UndefOr[ThumbDragEndEvent] = js.native
  /**
  	 * Event which is raised when the thumb drag is being moved.
  	 */
  var thumbDragMove: js.UndefOr[ThumbDragMoveEvent] = js.native
  /**
  	 * Event which is raised when there is mouse click on the scrollbar's thumb drag.
  	 */
  var thumbDragStart: js.UndefOr[ThumbDragStartEvent] = js.native
  /**
  	 * Sets gets the step of the default scrolling behavior when using mouse wheel
  	 *
  	 */
  var wheelStep: js.UndefOr[Double] = js.native
}

object IgScroll {
  @scala.inline
  def apply(): IgScroll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgScroll]
  }
  @scala.inline
  implicit class IgScrollOps[Self <: IgScroll] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlwaysVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withBigIncrementStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bigIncrementStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBigIncrementStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bigIncrementStep")(js.undefined)
        ret
    }
    @scala.inline
    def withInertiaDeltaX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inertiaDeltaX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInertiaDeltaX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inertiaDeltaX")(js.undefined)
        ret
    }
    @scala.inline
    def withInertiaDeltaY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inertiaDeltaY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInertiaDeltaY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inertiaDeltaY")(js.undefined)
        ret
    }
    @scala.inline
    def withInertiaDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inertiaDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInertiaDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inertiaDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withInertiaStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inertiaStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInertiaStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inertiaStep")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withMinThumbSize(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minThumbSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinThumbSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minThumbSize")(js.undefined)
        ret
    }
    @scala.inline
    def withModifyDOM(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyDOM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifyDOM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyDOM")(js.undefined)
        ret
    }
    @scala.inline
    def withRegional(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(js.undefined)
        ret
    }
    @scala.inline
    def withRendered(value: (/* event */ Event, /* ui */ RenderedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendered")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendered")(js.undefined)
        ret
    }
    @scala.inline
    def withResized(value: (/* event */ Event, /* ui */ ResizedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resized")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutResized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resized")(js.undefined)
        ret
    }
    @scala.inline
    def withResizing(value: (/* event */ Event, /* ui */ ResizingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutResizing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizing")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollOnlyHBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollOnlyHBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollOnlyHBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollOnlyHBar")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollOnlyVBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollOnlyVBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollOnlyVBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollOnlyVBar")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTop")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollbarH(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollbarH: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarH")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollbarHParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarHParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollbarHParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarHParent")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollbarType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollbarType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarType")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollbarV(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarV")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollbarV: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarV")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollbarVParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarVParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollbarVParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarVParent")(js.undefined)
        ret
    }
    @scala.inline
    def withScrolled(value: (/* event */ Event, /* ui */ ScrolledEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrolled")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutScrolled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrolled")(js.undefined)
        ret
    }
    @scala.inline
    def withScrolling(value: (/* event */ Event, /* ui */ ScrollingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrolling")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutScrolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrolling")(js.undefined)
        ret
    }
    @scala.inline
    def withSmallIncrementStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallIncrementStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmallIncrementStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallIncrementStep")(js.undefined)
        ret
    }
    @scala.inline
    def withSmoothing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmoothing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothing")(js.undefined)
        ret
    }
    @scala.inline
    def withSmoothingDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothingDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmoothingDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothingDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withSmoothingStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothingStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmoothingStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothingStep")(js.undefined)
        ret
    }
    @scala.inline
    def withSwipeToleranceX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeToleranceX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipeToleranceX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeToleranceX")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncedElemsH(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncedElemsH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncedElemsH: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncedElemsH")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncedElemsV(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncedElemsV")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncedElemsV: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncedElemsV")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbDragEnd(value: (/* event */ Event, /* ui */ ThumbDragEndEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbDragEnd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutThumbDragEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbDragEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbDragMove(value: (/* event */ Event, /* ui */ ThumbDragMoveEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbDragMove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutThumbDragMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbDragMove")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbDragStart(value: (/* event */ Event, /* ui */ ThumbDragStartEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbDragStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutThumbDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withWheelStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWheelStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelStep")(js.undefined)
        ret
    }
  }
  
}

