package typingsSlinky.ejWebAll.ej.Scroller

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Specifies the swipe scrolling speed(in millisecond).
    * @Default {600}
    */
  var animationSpeed: js.UndefOr[Double] = js.native
  /** Set true to hides the scrollbar, when mouseout the content area.
    * @Default {false}
    */
  var autoHide: js.UndefOr[Boolean] = js.native
  /** Specifies the height and width of button in the scrollbar.
    * @Default {18}
    */
  var buttonSize: js.UndefOr[Double] = js.native
  /** Fires when Scroller control is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Fires when Scroller control is destroyed.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** Save current model value to browser cookies for state maintenance. While refresh the page Rating control values are retained.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  /** Indicates the Right to Left direction to scroller
    * @Default {undefined}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** Enables or Disable the touch Scroll
    * @Default {true}
    */
  var enableTouchScroll: js.UndefOr[Boolean] = js.native
  /** Specifies to enable or disable the scroller
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /** Specifies the height of Scroll panel and scrollbars.
    * @Default {250}
    */
  var height: js.UndefOr[Double | String] = js.native
  /** The Scroller content and scrollbars move left with given value.
    * @Default {0}
    */
  var scrollLeft: js.UndefOr[Double] = js.native
  /** While press on the arrow key the scrollbar position added to the given pixel value.
    * @Default {57}
    */
  var scrollOneStepBy: js.UndefOr[Double] = js.native
  /** The Scroller content and scrollbars move to top position with specified value.
    * @Default {0}
    */
  var scrollTop: js.UndefOr[Double] = js.native
  /** If the scrollbar has vertical it set as width, else it will set as height of the handler.
    * @Default {18}
    */
  var scrollerSize: js.UndefOr[Double] = js.native
  /** Indicates the target area to which scroller have to appear.
    * @Default {null}
    */
  var targetPane: js.UndefOr[String] = js.native
  /** Fires when a thumb point is removed from the touch surface.
    */
  var thumbEnd: js.UndefOr[js.Function1[/* e */ ThumbEndEventArgs, Unit]] = js.native
  /** Fires when a thumb point is moved along the touch surface.
    */
  var thumbMove: js.UndefOr[js.Function1[/* e */ ThumbMoveEventArgs, Unit]] = js.native
  /** Fires when a thumb point is placed on the touch surface.
    */
  var thumbStart: js.UndefOr[js.Function1[/* e */ ThumbStartEventArgs, Unit]] = js.native
  /** It fires whenever the mouse wheel is rotated either in upwards or downwards.
    */
  var wheelMove: js.UndefOr[js.Function1[/* e */ WheelMoveEventArgs, Unit]] = js.native
  /** It will fire when mouse trackball has been start to wheel.
    */
  var wheelStart: js.UndefOr[js.Function1[/* e */ WheelStartEventArgs, Unit]] = js.native
  /** It will fire when mouse trackball has been stop to wheel.
    */
  var wheelStop: js.UndefOr[js.Function1[/* e */ WheelStopEventArgs, Unit]] = js.native
  /** Specifies the width of Scroll panel and scrollbars.
    * @Default {0}
    */
  var width: js.UndefOr[Double | String] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoHide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHide")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonSize")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(value: /* e */ CreateEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: /* e */ DestroyEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePersistence(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePersistence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePersistence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePersistence")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRTL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableTouchScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTouchScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTouchScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTouchScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
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
    def withScrollOneStepBy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollOneStepBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollOneStepBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollOneStepBy")(js.undefined)
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
    def withScrollerSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollerSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollerSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollerSize")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetPane(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetPane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetPane: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetPane")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbEnd(value: /* e */ ThumbEndEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutThumbEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbMove(value: /* e */ ThumbMoveEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutThumbMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbMove")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbStart(value: /* e */ ThumbStartEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutThumbStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbStart")(js.undefined)
        ret
    }
    @scala.inline
    def withWheelMove(value: /* e */ WheelMoveEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWheelMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelMove")(js.undefined)
        ret
    }
    @scala.inline
    def withWheelStart(value: /* e */ WheelStartEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWheelStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelStart")(js.undefined)
        ret
    }
    @scala.inline
    def withWheelStop(value: /* e */ WheelStopEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelStop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWheelStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelStop")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

