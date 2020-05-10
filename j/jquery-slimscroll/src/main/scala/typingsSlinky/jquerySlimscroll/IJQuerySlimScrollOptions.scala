package typingsSlinky.jquerySlimscroll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IJQuerySlimScrollOptions extends js.Object {
  /**
    * check if mousewheel should scroll the window if we reach top/bottom
    */
  var allowPageScroll: js.UndefOr[Boolean] = js.native
  /**
    * enables always-on mode for the scrollbar
    */
  var alwaysVisible: js.UndefOr[Boolean] = js.native
  /**
    * default CSS class of the slimscroll bar
    */
  var barClass: js.UndefOr[String] = js.native
  /**
    * sets border radius
    */
  var borderRadius: js.UndefOr[String] = js.native
  /**
    * scrollbar color, accepts any hex/color value
    */
  var color: js.UndefOr[String] = js.native
  /**
    * release resources held by the plugin
    */
  var destroy: js.UndefOr[Boolean] = js.native
  /**
    * check if we should hide the scrollbar when user is hovering over
    */
  var disableFadeOut: js.UndefOr[Boolean] = js.native
  /**
    * distance in pixels between the side edge and the scrollbar
    */
  var distance: js.UndefOr[String] = js.native
  /**
    * height in pixels of the visible scroll area
    */
  var height: js.UndefOr[String] = js.native
  /**
    * sets scrollbar opacity
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * scrollbar position - left/right
    */
  var position: js.UndefOr[String] = js.native
  /**
    * sets border radius of the rail
    */
  var railBorderRadius: js.UndefOr[String] = js.native
  /**
    * default CSS class of the slimscroll rail
    */
  var railClass: js.UndefOr[String] = js.native
  /**
    * sets rail color
    */
  var railColor: js.UndefOr[String] = js.native
  /**
    * whether  we should use jQuery UI Draggable to enable bar dragging
    */
  var railDraggable: js.UndefOr[Boolean] = js.native
  /**
    * sets rail opacity
    */
  var railOpacity: js.UndefOr[Double] = js.native
  /**
    * sets visibility of the rail
    */
  var railVisible: js.UndefOr[Boolean] = js.native
  /**
    * increases/decreases current scroll value by specified amount
    */
  var scrollBy: js.UndefOr[String] = js.native
  /**
    * jumps to the specified scroll value
    */
  var scrollTo: js.UndefOr[String] = js.native
  /**
    * width in pixels of the scrollbar and rail
    */
  var size: js.UndefOr[String] = js.native
  /**
    * default scroll position on load - top / bottom / $('selector')
    */
  var start: js.UndefOr[js.Any] = js.native
  /**
    * scroll amount applied when user is using gestures
    */
  var touchScrollStep: js.UndefOr[Double] = js.native
  /**
    * scroll amount applied to each mouse wheel step
    */
  var wheelStep: js.UndefOr[Double] = js.native
  /**
    * width in pixels of the visible scroll area
    */
  var width: js.UndefOr[String] = js.native
  /**
    * default CSS class of the slimscroll wrapper
    */
  var wrapperClass: js.UndefOr[String] = js.native
}

object IJQuerySlimScrollOptions {
  @scala.inline
  def apply(): IJQuerySlimScrollOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IJQuerySlimScrollOptions]
  }
  @scala.inline
  implicit class IJQuerySlimScrollOptionsOps[Self <: IJQuerySlimScrollOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowPageScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPageScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowPageScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPageScroll")(js.undefined)
        ret
    }
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
    def withBarClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barClass")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderRadius(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableFadeOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFadeOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableFadeOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFadeOut")(js.undefined)
        ret
    }
    @scala.inline
    def withDistance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String): Self = {
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
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withRailBorderRadius(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("railBorderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRailBorderRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("railBorderRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withRailClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("railClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRailClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("railClass")(js.undefined)
        ret
    }
    @scala.inline
    def withRailColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("railColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRailColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("railColor")(js.undefined)
        ret
    }
    @scala.inline
    def withRailDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("railDraggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRailDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("railDraggable")(js.undefined)
        ret
    }
    @scala.inline
    def withRailOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("railOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRailOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("railOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withRailVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("railVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRailVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("railVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollBy")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTo")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchScrollStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchScrollStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchScrollStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchScrollStep")(js.undefined)
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
    @scala.inline
    def withWidth(value: String): Self = {
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
    @scala.inline
    def withWrapperClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapperClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperClass")(js.undefined)
        ret
    }
  }
  
}

