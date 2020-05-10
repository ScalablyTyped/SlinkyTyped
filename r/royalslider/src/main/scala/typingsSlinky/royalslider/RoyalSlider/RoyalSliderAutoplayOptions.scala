package typingsSlinky.royalslider.RoyalSlider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoyalSliderAutoplayOptions extends js.Object {
  /**
    * Delay between items in ms. (default: 300)
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * Enable autoplay or not. (default: false)
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Pause autoplay on hover. (default: true)
    */
  var pauseOnHover: js.UndefOr[Boolean] = js.native
  /**
    * Stop autoplay at first user action. (default: true)
    */
  var stopAtAction: js.UndefOr[Boolean] = js.native
}

object RoyalSliderAutoplayOptions {
  @scala.inline
  def apply(): RoyalSliderAutoplayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoyalSliderAutoplayOptions]
  }
  @scala.inline
  implicit class RoyalSliderAutoplayOptionsOps[Self <: RoyalSliderAutoplayOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
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
    def withPauseOnHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseOnHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPauseOnHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseOnHover")(js.undefined)
        ret
    }
    @scala.inline
    def withStopAtAction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopAtAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopAtAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopAtAction")(js.undefined)
        ret
    }
  }
  
}

