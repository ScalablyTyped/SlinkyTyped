package typingsSlinky.royalslider.RoyalSlider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoyalSliderVisibleOptions extends js.Object {
  /**
    * Used for responsive design. Changes centerArea value to breakpointCenterArea when width of slider is less then value in this option. Set to 0 to disable. (default: 0)
    */
  var breakpoint: js.UndefOr[Double] = js.native
  /**
    * Same as centerArea option, just for breakpoint. Can be changed dynamically via `sliderInstance.st.breakpointCenterArea`. (default: 0.8)
    */
  var breakpointCenterArea: js.UndefOr[Double] = js.native
  /**
    * Alignment of center image, if you set it to false center image will be aligned to left. (default: true)
    */
  var center: js.UndefOr[Boolean] = js.native
  /**
    * Ratio that determines area of center image.For example for 0.6 - 60 % of slider area will get center image and 20% for two images on sides. (default: 0.6)
    */
  var centerArea: js.UndefOr[Double] = js.native
  /**
    * Enable visible-nearby. (default: true)
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Disables navigation to next slide by clicking on current slide (if navigateByClick is true). (default: true)
    */
  var navigateByCenterClick: js.UndefOr[Boolean] = js.native
}

object RoyalSliderVisibleOptions {
  @scala.inline
  def apply(): RoyalSliderVisibleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoyalSliderVisibleOptions]
  }
  @scala.inline
  implicit class RoyalSliderVisibleOptionsOps[Self <: RoyalSliderVisibleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreakpoint(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withBreakpointCenterArea(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpointCenterArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakpointCenterArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpointCenterArea")(js.undefined)
        ret
    }
    @scala.inline
    def withCenter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.undefined)
        ret
    }
    @scala.inline
    def withCenterArea(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerArea")(js.undefined)
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
    def withNavigateByCenterClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigateByCenterClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigateByCenterClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigateByCenterClick")(js.undefined)
        ret
    }
  }
  
}

