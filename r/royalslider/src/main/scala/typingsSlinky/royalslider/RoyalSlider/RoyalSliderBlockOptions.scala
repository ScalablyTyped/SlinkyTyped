package typingsSlinky.royalslider.RoyalSlider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoyalSliderBlockOptions extends js.Object {
  /**
    * Delay between each block show up, in ms. (default: 200)
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * Easing function of block animation.Read more in easing section of docs. (default: 'easeOutSine' )
    */
  var easing: js.UndefOr[String] = js.native
  /**
    * true or false  (default: true)
    */
  var fadeEffect: js.UndefOr[Boolean] = js.native
  /**
    * Move effect direction.Can be 'left', 'right', 'top', 'bottom' or 'none'. (default: 'top')
    */
  var moveEffect: js.UndefOr[String] = js.native
  /**
    * Distance for move effect in pixels. (default: 20)
    */
  var moveOffset: js.UndefOr[Double] = js.native
  /**
    * Transition speed of block, in ms. (default: 400)
    */
  var speed: js.UndefOr[Double] = js.native
}

object RoyalSliderBlockOptions {
  @scala.inline
  def apply(): RoyalSliderBlockOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoyalSliderBlockOptions]
  }
  @scala.inline
  implicit class RoyalSliderBlockOptionsOps[Self <: RoyalSliderBlockOptions] (val x: Self) extends AnyVal {
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
    def withEasing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.undefined)
        ret
    }
    @scala.inline
    def withFadeEffect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFadeEffect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeEffect")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveEffect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveEffect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveEffect")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(js.undefined)
        ret
    }
  }
  
}

