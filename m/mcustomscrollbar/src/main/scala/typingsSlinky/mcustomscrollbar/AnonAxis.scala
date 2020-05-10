package typingsSlinky.mcustomscrollbar

import typingsSlinky.mcustomscrollbar.mcustomscrollbarStrings.auto
import typingsSlinky.mcustomscrollbar.mcustomscrollbarStrings.x
import typingsSlinky.mcustomscrollbar.mcustomscrollbarStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAxis extends js.Object {
  /**
    * Define the mouse-wheel scrolling axis when both vertical and horizontal scrollbars are present.
    * Set axis: "y" (default) for vertical or axis: "x" for horizontal scrolling.
    */
  var axis: js.UndefOr[x | y] = js.native
  /**
    * Set the number of pixels one wheel notch scrolls. The default value “auto” uses the OS/browser value.
    */
  var deltaFactor: js.UndefOr[Double] = js.native
  /**
    * Set the tags that disable mouse-wheel when cursor is over them.
    * Default value: ["select","option","keygen","datalist","textarea"]
    */
  var disableOver: js.UndefOr[js.Array[String]] = js.native
  /**
    * Enable or disable content scrolling via mouse-wheel.
    */
  var enable: js.UndefOr[Boolean] = js.native
  /**
    * Invert mouse-wheel scrolling direction.
    * Set to true to scroll down or right when mouse-wheel is turned upwards.
    */
  var invert: js.UndefOr[Boolean] = js.native
  /**
    * Enable or disable mouse-wheel (delta) acceleration.
    * Setting normalizeDelta: true translates mouse-wheel delta value to -1 or 1.
    */
  var normalizeDelta: js.UndefOr[Boolean] = js.native
  /**
    * Prevent the default behaviour which automatically scrolls the parent element when end
    * or beginning of scrolling is reached (same bahavior with browser’s native scrollbar).
    */
  var preventDefault: js.UndefOr[Boolean] = js.native
  /**
    * Set the mouse-wheel scrolling amount (in pixels).
    * The default value "auto" adjusts scrolling amount according to scrollable content length.
    */
  var scrollAmount: js.UndefOr[auto | Double] = js.native
}

object AnonAxis {
  @scala.inline
  def apply(): AnonAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAxis]
  }
  @scala.inline
  implicit class AnonAxisOps[Self <: AnonAxis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxis(value: x | y): Self = {
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
    def withDeltaFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeltaFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableOver(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableOver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableOver")(js.undefined)
        ret
    }
    @scala.inline
    def withEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.undefined)
        ret
    }
    @scala.inline
    def withInvert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invert")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalizeDelta(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalizeDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeDelta")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollAmount(value: auto | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollAmount")(js.undefined)
        ret
    }
  }
  
}

