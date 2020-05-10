package typingsSlinky.mcustomscrollbar

import typingsSlinky.mcustomscrollbar.mcustomscrollbarStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAutoExpandHorizontalScroll extends js.Object {
  /**
    * Auto-expanding content's width on horizontal scrollbars, values: true, false. Set to true if you have horizontal scrollbr on content that change on-the-fly. Demo contains
    * blocks with images and horizontal scrollbars that use this option parameter
    */
  var autoExpandHorizontalScroll: js.UndefOr[Boolean] = js.native
  /**
    * Set the list of elements/selectors that will auto-scroll content to their position when focused.
    * For example, when pressing TAB key to focus input fields, if the field is out of the viewable area the content 
    * will scroll to its top/left position (same bahavior with browser’s native scrollbar).
    * To completely disable this functionality, set autoScrollOnFocus: false.
    * Default:
    *   "input,textarea,select,button,datalist,keygen,a[tabindex],area,object,[contenteditable='true']"
    */
  var autoScrollOnFocus: js.UndefOr[Boolean | String] = js.native
  /**
    * Set the auto-update timeout in milliseconds.
    * Default timeout: 60
    */            
  var autoUpdateTimeout: js.UndefOr[Double] = js.native
  /**
    * Add extra selector(s) that’ll release scrollbar dragging upon mouseup, pointerup, touchend etc.
    * Example: extraDraggableSelectors: ".myClass, #myID"
    */
  var extraDraggableSelectors: js.UndefOr[String] = js.native
  /**
    * Normalize mouse wheel delta (-1/1), values: true, false
    */
  var normalizeMouseWheelDelta: js.UndefOr[Boolean] = js.native
  /**
    * Add extra selector(s) that’ll allow scrollbar dragging upon mousemove/up, pointermove/up, touchend etc.
    * Example: releaseDraggableSelectors: ".myClass, #myID"
    */
  var releaseDraggableSelectors: js.UndefOr[String] = js.native
  /**
    * Update scrollbars on browser resize (for fluid content blocks and layouts based on percentages), values: true, false. Set to false only when you content has fixed dimensions
    */
  var updateOnBrowserResize: js.UndefOr[Boolean] = js.native
  /**
    * Auto-update scrollbars on content resize (useful when adding/changing content progrmatically), value: true, false. Setting this to true makes the script check for content
    * length changes (every few milliseconds) and automatically call plugin's update method to adjust the scrollbar accordingly
    */
  var updateOnContentResize: js.UndefOr[Boolean] = js.native
  /**
    * Update scrollbar(s) automatically each time an image inside the element is fully loaded.
    * Default value is auto which triggers the function only on "x" and "yx" axis (if needed).
    * The value should be true when your content contains images and you need the function to trigger on any axis.
    */
  var updateOnImageLoad: js.UndefOr[auto | Boolean] = js.native
  /**
    * Update scrollbar(s) automatically when the amount and size of specific selectors changes.
    * Useful when you need to update the scrollbar(s) automatically, each time a type of element is added, removed or changes its size.
    * For example, setting updateOnSelectorChange: "ul li" will update scrollbars each time list-items inside the element are changed.
    * Setting the value to true, will update scrollbars each time any element is changed.
    * To disable (default) set to false.
    */
  var updateOnSelectorChange: js.UndefOr[String | Boolean] = js.native
}

object AnonAutoExpandHorizontalScroll {
  @scala.inline
  def apply(): AnonAutoExpandHorizontalScroll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAutoExpandHorizontalScroll]
  }
  @scala.inline
  implicit class AnonAutoExpandHorizontalScrollOps[Self <: AnonAutoExpandHorizontalScroll] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoExpandHorizontalScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoExpandHorizontalScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoExpandHorizontalScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoExpandHorizontalScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoScrollOnFocus(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScrollOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScrollOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScrollOnFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoUpdateTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpdateTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoUpdateTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpdateTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraDraggableSelectors(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraDraggableSelectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraDraggableSelectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraDraggableSelectors")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalizeMouseWheelDelta(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeMouseWheelDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalizeMouseWheelDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeMouseWheelDelta")(js.undefined)
        ret
    }
    @scala.inline
    def withReleaseDraggableSelectors(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseDraggableSelectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReleaseDraggableSelectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseDraggableSelectors")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateOnBrowserResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOnBrowserResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateOnBrowserResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOnBrowserResize")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateOnContentResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOnContentResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateOnContentResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOnContentResize")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateOnImageLoad(value: auto | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOnImageLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateOnImageLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOnImageLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateOnSelectorChange(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOnSelectorChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateOnSelectorChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOnSelectorChange")(js.undefined)
        ret
    }
  }
  
}

