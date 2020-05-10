package typingsSlinky.mcustomscrollbar.MCustomScrollbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollToParameterOptions extends js.Object {
  /**
    * Trigger user defined callback after scroll-to completes, value: true, false
    */
  var callbacks: js.UndefOr[Boolean] = js.native
  /**
    * Scroll scrollbar dragger (instead of content) to a number of pixels, values: true, false
    */
  var moveDragger: js.UndefOr[Boolean] = js.native
  /**
    * Scroll-to animation easing, values: "linear", "easeOut", "easeInOut".
    */
  var scrollEasing: js.UndefOr[String] = js.native
  /**
    * Scroll-to animation speed, value in milliseconds
    */
  var scrollInertia: js.UndefOr[Double] = js.native
  /**
    * Set a timeout for the method (the default timeout is 60 ms in order to work with automatic scrollbar update), value in milliseconds.
    */
  var timeout: js.UndefOr[Double] = js.native
}

object ScrollToParameterOptions {
  @scala.inline
  def apply(): ScrollToParameterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollToParameterOptions]
  }
  @scala.inline
  implicit class ScrollToParameterOptionsOps[Self <: ScrollToParameterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallbacks(value: Boolean): Self = {
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
    def withMoveDragger(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveDragger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveDragger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveDragger")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollEasing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollEasing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollEasing")(js.undefined)
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
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

