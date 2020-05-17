package typingsSlinky.mcustomscrollbar.MCustomScrollbar

import typingsSlinky.mcustomscrollbar.anon.AlwaysTriggerOffsets
import typingsSlinky.mcustomscrollbar.anon.AutoExpandHorizontalScroll
import typingsSlinky.mcustomscrollbar.anon.Axis
import typingsSlinky.mcustomscrollbar.anon.Enable
import typingsSlinky.mcustomscrollbar.anon.ScrollAmount
import typingsSlinky.mcustomscrollbar.mcustomscrollbarStrings.inside
import typingsSlinky.mcustomscrollbar.mcustomscrollbarStrings.outside
import typingsSlinky.mcustomscrollbar.mcustomscrollbarStrings.x
import typingsSlinky.mcustomscrollbar.mcustomscrollbarStrings.y
import typingsSlinky.mcustomscrollbar.mcustomscrollbarStrings.yx
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomScrollbarOptions extends js.Object {
  var advanced: js.UndefOr[AutoExpandHorizontalScroll] = js.native
  /**
    * Always keep scrollbar(s) visible, even when there’s nothing to scroll.
    * 0 – disable (default)
    * 1 – keep dragger rail visible
    * 2 – keep all scrollbar components (dragger, rail, buttons etc.) visible
    */
  var alwaysShowScrollbar: js.UndefOr[Double] = js.native
  /**
    * Auto-adjust scrollbar height/width according to content, values: true, false
    */
  var autoDraggerLength: js.UndefOr[Boolean] = js.native
  /**
    * Enable or disable auto-expanding the scrollbar when cursor is over or dragging the scrollbar.
    */
  var autoExpandScrollbar: js.UndefOr[Boolean] = js.native
  /**
    * Automatically hide the scrollbar when idle or mouse is not over the content
    */
  var autoHideScrollbar: js.UndefOr[Boolean] = js.native
  /**
    * Define content’s scrolling axis (the type of scrollbars added to the element: vertical and/of horizontal).
    * Available values: "y", "x", "yx". y -vertical, x - horizontal, yx - vertical and horizontal
    */
  var axis: js.UndefOr[x | y | yx] = js.native
  /**
    * All of the following callbacks option have examples in the callback demo - http://manos.malihu.gr/tuts/custom-scrollbar-plugin/callbacks_example.html
    */
  var callbacks: js.UndefOr[AlwaysTriggerOffsets] = js.native
  /**
    * Enable or disable content touch-swipe scrolling for touch-enabled devices.
    * To completely disable, set contentTouchScroll: false.
    * Integer values define the axis-specific minimum amount required for scrolling momentum (default: 25).
    */
  var contentTouchScroll: js.UndefOr[Boolean | Double] = js.native
  /**
    * Enable or disable document touch-swipe scrolling for touch-enabled devices.
    */
  var documentTouchScroll: js.UndefOr[Boolean] = js.native
  /**
    * Keyboard support 
    */
  var keyboard: js.UndefOr[Enable] = js.native
  /**
    * Enable or disable applying scrollbar(s) on all elements matching the current selector, now and in the future.
    * Set live: true when you need to add scrollbar(s) on elements that do not yet exist in the page. 
    * These could be elements added by other scripts or plugins after some action by the user takes place (e.g. lightbox markup may not exist untill the user clicks a link).
    * If you need at any time to disable or enable the live option, set live: "off" and "on" respectively.
    * You can also tell the script to disable live option after the first invocation by setting live: "once".
    */
  var live: js.UndefOr[String | Boolean] = js.native
  /**
    * Set the matching set of elements (instead of the current selector) to add scrollbar(s), now and in the future.
    */
  var liveSelector: js.UndefOr[String] = js.native
  /**
    * Mouse wheel support
    */
  var mouseWheel: js.UndefOr[Axis] = js.native
  /**
    * Mouse wheel scrolling pixels amount, value in pixels (integer) or "auto" (script calculates and sets pixels amount according to content length)
    */
  var mouseWheelPixels: js.UndefOr[js.Any] = js.native
  var scrollButtons: js.UndefOr[ScrollAmount] = js.native
  /**
    * Scrolling inertia (easing), value in milliseconds (0 for no scrolling inertia)
    */
  var scrollInertia: js.UndefOr[Double] = js.native
  /**
    * Set the position of scrollbar in relation to content.
    * Available values: "inside", "outside".
    * Setting scrollbarPosition: "inside" (default) makes scrollbar appear inside the element. 
    * Setting scrollbarPosition: "outside" makes scrollbar appear outside the element. 
    * Note that setting the value to "outside" requires your element (or parent elements) 
    * to have CSS position: relative (otherwise the scrollbar will be positioned in relation to document’s root element).
    */
  var scrollbarPosition: js.UndefOr[inside | outside] = js.native
  /**
    * Set the height of your content (overwirtes CSS height), value in pixels (integer) or percentage (string)
    */
  var setHeight: js.UndefOr[Boolean | Double | String] = js.native
  /**
    * Set the initial css top property of content, accepts string values (css top position).
    * Example: setTop: "-100px".
    */
  var setLeft: js.UndefOr[Double | String] = js.native
  /**
    * Set the initial css top property of content, accepts string values (css top position).
    * Example: setTop: "-100px".
    */
  var setTop: js.UndefOr[Double | String] = js.native
  /**
    * Set the width of your content (overwrites CSS width), value in pixels (integer) or percentage (string)
    */
  var setWidth: js.UndefOr[Boolean | Double | String] = js.native
  /**
    * Make scrolling snap to a multiple of a fixed number of pixels. Useful in cases like scrolling tabular data, 
    * image thumbnails or slides and you need to prevent scrolling from stopping half-way your elements. 
    * Note that your elements must be of equal width or height in order for this to work properly.
    * To set different values for vertical and horizontal scrolling, use an array: [y,x]
    */
  var snapAmount: js.UndefOr[Double | (js.Tuple2[Double, Double])] = js.native
  /**
    * Set an offset (in pixels) for the snapAmount option. Useful when for example you need to offset the 
    * snap amount of table rows by the table header.
    */
  var snapOffset: js.UndefOr[Double] = js.native
  /**
    * Set a scrollbar ready-to-use theme. See themes demo for all themes - http://manos.malihu.gr/tuts/custom-scrollbar-plugin/scrollbar_themes_demo.html
    */
  var theme: js.UndefOr[String] = js.native
}

object CustomScrollbarOptions {
  @scala.inline
  def apply(): CustomScrollbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomScrollbarOptions]
  }
  @scala.inline
  implicit class CustomScrollbarOptionsOps[Self <: CustomScrollbarOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdvanced(value: AutoExpandHorizontalScroll): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advanced")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvanced: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advanced")(js.undefined)
        ret
    }
    @scala.inline
    def withAlwaysShowScrollbar(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysShowScrollbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysShowScrollbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysShowScrollbar")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoDraggerLength(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDraggerLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoDraggerLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDraggerLength")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoExpandScrollbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoExpandScrollbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoExpandScrollbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoExpandScrollbar")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoHideScrollbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHideScrollbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHideScrollbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHideScrollbar")(js.undefined)
        ret
    }
    @scala.inline
    def withAxis(value: typingsSlinky.mcustomscrollbar.mcustomscrollbarStrings.x | y | yx): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(js.undefined)
        ret
    }
    @scala.inline
    def withCallbacks(value: AlwaysTriggerOffsets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallbacks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbacks")(js.undefined)
        ret
    }
    @scala.inline
    def withContentTouchScroll(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentTouchScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentTouchScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentTouchScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentTouchScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentTouchScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentTouchScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentTouchScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboard(value: Enable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(js.undefined)
        ret
    }
    @scala.inline
    def withLive(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("live")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("live")(js.undefined)
        ret
    }
    @scala.inline
    def withLiveSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiveSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseWheel(value: Axis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseWheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseWheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseWheel")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseWheelPixels(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseWheelPixels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseWheelPixels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseWheelPixels")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollButtons(value: ScrollAmount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollInertia(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollInertia")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollInertia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollInertia")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollbarPosition(value: inside | outside): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollbarPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHeight(value: Boolean | Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLeft(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTop(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTop")(js.undefined)
        ret
    }
    @scala.inline
    def withSetWidth(value: Boolean | Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapAmount(value: Double | (js.Tuple2[Double, Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

