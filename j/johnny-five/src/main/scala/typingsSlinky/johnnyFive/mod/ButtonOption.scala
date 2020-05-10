package typingsSlinky.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonOption extends js.Object {
  var holdtime: js.UndefOr[Double] = js.native
  var invert: js.UndefOr[Boolean] = js.native
  var isPulldown: js.UndefOr[Boolean] = js.native
  var isPullup: js.UndefOr[Boolean] = js.native
  var pin: Double | String = js.native
}

object ButtonOption {
  @scala.inline
  def apply(pin: Double | String): ButtonOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonOption]
  }
  @scala.inline
  implicit class ButtonOptionOps[Self <: ButtonOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPin(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoldtime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holdtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoldtime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holdtime")(js.undefined)
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
    def withIsPulldown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPulldown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPulldown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPulldown")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPullup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPullup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPullup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPullup")(js.undefined)
        ret
    }
  }
  
}

