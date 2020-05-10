package typingsSlinky.johnnyFive.mod

import typingsSlinky.johnnyFive.johnnyFiveStrings.DEFAULT
import typingsSlinky.johnnyFive.johnnyFiveStrings.FORWARD
import typingsSlinky.johnnyFive.johnnyFiveStrings.FORWARD_REVERSE
import typingsSlinky.johnnyFive.johnnyFiveStrings.FORWARD_REVERSE_BRAKE
import typingsSlinky.johnnyFive.johnnyFiveStrings.PCA9685
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ESCOption extends js.Object {
  var address: js.UndefOr[String] = js.native
  var controller: js.UndefOr[PCA9685 | DEFAULT] = js.native
  var device: js.UndefOr[FORWARD | FORWARD_REVERSE | FORWARD_REVERSE_BRAKE] = js.native
  var neutral: js.UndefOr[Double] = js.native
  var pin: Double | String = js.native
  var pwmRange: js.UndefOr[js.Array[Double]] = js.native
}

object ESCOption {
  @scala.inline
  def apply(pin: Double | String): ESCOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ESCOption]
  }
  @scala.inline
  implicit class ESCOptionOps[Self <: ESCOption] (val x: Self) extends AnyVal {
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
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.undefined)
        ret
    }
    @scala.inline
    def withController(value: PCA9685 | DEFAULT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutController: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controller")(js.undefined)
        ret
    }
    @scala.inline
    def withDevice(value: FORWARD | FORWARD_REVERSE | FORWARD_REVERSE_BRAKE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(js.undefined)
        ret
    }
    @scala.inline
    def withNeutral(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neutral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeutral: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neutral")(js.undefined)
        ret
    }
    @scala.inline
    def withPwmRange(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pwmRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPwmRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pwmRange")(js.undefined)
        ret
    }
  }
  
}

