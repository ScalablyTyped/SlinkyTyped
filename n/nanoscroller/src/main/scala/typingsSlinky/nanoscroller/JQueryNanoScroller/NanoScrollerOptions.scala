package typingsSlinky.nanoscroller.JQueryNanoScroller

import typingsSlinky.nanoscroller.JQuery
import typingsSlinky.nanoscroller.nanoscrollerStrings.bottom
import typingsSlinky.nanoscroller.nanoscrollerStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NanoScrollerOptions extends js.Object {
  /**
    *
    * If you change this setting, you also have to change it in the plugin's CSS file.
    * @default 'active'
    */
  var activeClass: js.UndefOr[String] = js.native
  /**
    * Set to true to stop the scrollbar from auto-hiding itself.
    * @default false
    */
  var alwaysVisible: js.UndefOr[Boolean] = js.native
  /**
    * A classname for your content div.
    * If you change this setting, you also have to change it in the plugin's CSS file.
    * @default 'nano-content'
    */
  var contentClass: js.UndefOr[String] = js.native
  /**
    * Destroys nanoScroller and restores browser's native scrollbar.
    */
  var destroy: js.UndefOr[Boolean] = js.native
  /**
    * Set to true to disable the resize from nanoscroller.
    * Useful if you want total control of the resize event.
    * If you set this option to true remember to call the reset method so that the scroll don't have strange behavior.
    * @default false
    */
  var disableResize: js.UndefOr[Boolean] = js.native
  /**
    * A classname for scrollbar enabled mode.
    * If you change this setting, you also have to change it in the plugin's CSS file.
    * @default 'has-scrollbar'
    */
  var enabledClass: js.UndefOr[String] = js.native
  /**
    * To flash the scrollbar gadget for an amount of time defined in plugin settings (defaults to 1,5s).
    * Useful if you want to show the user that there is more content waiting for them.
    */
  var flash: js.UndefOr[Boolean] = js.native
  /**
    * Use this setting to specify the scrollbar hide delay in milliseconds if you have enabled the flash option.
    * @default 1500
    */
  var flashDelay: js.UndefOr[Double] = js.native
  /**
    * A classname for scrollbar flashed mode.
    * If you change this setting, you also have to change it in the plugin's CSS file.
    * @default 'flashed'
    */
  var flashedClass: js.UndefOr[String] = js.native
  /**
    * Set to true if you want to use native scrolling in iOS 5+.
    * This will disable your custom nanoScroller scrollbar in iOS 5+ and use the native one instead.
    * While the native iOS scrollbar usually works much better, there could possibly be bugs in certain situations.
    * @default false
    */
  var iOSNativeScrolling: js.UndefOr[Boolean] = js.native
  /**
    * A classname for scrollbar track element.
    * If you change this setting, you also have to change it in the plugin's CSS file.
    * @default 'nano-pane'
    */
  var paneClass: js.UndefOr[String] = js.native
  /**
    * Set to true to prevent page scrolling when top or bottom inside the content div is reached.
    * @default false
    */
  var preventPageScrolling: js.UndefOr[Boolean] = js.native
  /**
    * To scroll at the top or bottom.
    */
  var scroll: js.UndefOr[top | bottom] = js.native
  /**
    * To scroll at the bottom with an offset value.
    */
  var scrollBottom: js.UndefOr[Double] = js.native
  /**
    * To scroll to an element.
    */
  var scrollTo: js.UndefOr[JQuery] = js.native
  /**
    * To scroll at the top with an offset value.
    */
  var scrollTop: js.UndefOr[Double] = js.native
  /**
    * A classname for scrollbar thumb element.
    * If you change this setting, you also have to change it in the plugin's CSS file.
    * @default 'nano-slider'
    */
  var sliderClass: js.UndefOr[String] = js.native
  /**
    * Sets the maximum height of the slider element.
    * @default null
    */
  var sliderMaxHeight: js.UndefOr[Double | Null] = js.native
  /**
    * Sets the minimum height of the slider element.
    * @default 20
    */
  var sliderMinHeight: js.UndefOr[Double] = js.native
  /**
    * To stop the operation.
    * This option will tell the plugin to disable all event bindings and hide the gadget scrollbar from the UI.
    */
  var stop: js.UndefOr[Boolean] = js.native
  /**
    * Set the tab order of the scrollable content.
    * Set to -1 to skip over the scrollable content when tabbing.
    * @default 0
    */
  var tabIndex: js.UndefOr[Double] = js.native
}

object NanoScrollerOptions {
  @scala.inline
  def apply(): NanoScrollerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NanoScrollerOptions]
  }
  @scala.inline
  implicit class NanoScrollerOptionsOps[Self <: NanoScrollerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeClass")(js.undefined)
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
    def withContentClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentClass")(js.undefined)
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
    def withDisableResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableResize")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabledClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabledClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledClass")(js.undefined)
        ret
    }
    @scala.inline
    def withFlash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flash")(js.undefined)
        ret
    }
    @scala.inline
    def withFlashDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlashDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withFlashedClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashedClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlashedClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashedClass")(js.undefined)
        ret
    }
    @scala.inline
    def withIOSNativeScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iOSNativeScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIOSNativeScrolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iOSNativeScrolling")(js.undefined)
        ret
    }
    @scala.inline
    def withPaneClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paneClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaneClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paneClass")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventPageScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventPageScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventPageScrolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventPageScrolling")(js.undefined)
        ret
    }
    @scala.inline
    def withScroll(value: top | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollTo(value: JQuery): Self = {
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
    def withSliderClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSliderClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderClass")(js.undefined)
        ret
    }
    @scala.inline
    def withSliderMaxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderMaxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSliderMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderMaxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSliderMaxHeightNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderMaxHeight")(null)
        ret
    }
    @scala.inline
    def withSliderMinHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderMinHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSliderMinHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderMinHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withStop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.undefined)
        ret
    }
    @scala.inline
    def withTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(js.undefined)
        ret
    }
  }
  
}

