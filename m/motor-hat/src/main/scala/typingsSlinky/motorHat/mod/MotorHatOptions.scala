package typingsSlinky.motorHat.mod

import typingsSlinky.motorHat.AnonW2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MotorHatOptions extends js.Object {
  /**
    * i2c address of the PWM chip on the MotorHat.
    *
    * * 0x6F for knockoff HATs.
    *
    * * 0x60 for official AdaFruit HATs??
    */
  var address: js.UndefOr[Double] = js.native
  /**
    * i2c driver devfile number. Varies by RaspBerry version.
    * Should be automatically detected.
    */
  var busnum: js.UndefOr[Double] = js.native
  /**
    * Definition of the DC motors connected to the HAT.
    * At most 4 DCs, each should be one of following: 'M1', 'M2', 'M3', 'M4' depending on
    * port the motor is connected to.
    */
  var dcs: js.UndefOr[js.Array[Motor]] = js.native
  /**
    * Definition of the servos connected to the HAT.
    * List of the channels that have servos connected to them. 0 to 15.
    */
  var servos: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Definition of the stepper motors connected to the HAT.
    * At most 2 steppers, each motor is represented by either an object of the form
    * { W1: winding, W2: winding }. Each winding should be one of following: 'M1', 'M2', 'M3',
    * 'M4' depending on the port the stepper is connected to. Correct example: { W1: 'M3', W2: 'M1' }
    */
  var steppers: js.UndefOr[js.Array[AnonW2]] = js.native
}

object MotorHatOptions {
  @scala.inline
  def apply(): MotorHatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotorHatOptions]
  }
  @scala.inline
  implicit class MotorHatOptionsOps[Self <: MotorHatOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: Double): Self = {
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
    def withBusnum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("busnum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBusnum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("busnum")(js.undefined)
        ret
    }
    @scala.inline
    def withDcs(value: js.Array[Motor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dcs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDcs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dcs")(js.undefined)
        ret
    }
    @scala.inline
    def withServos(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servos")(js.undefined)
        ret
    }
    @scala.inline
    def withSteppers(value: js.Array[AnonW2]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steppers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSteppers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steppers")(js.undefined)
        ret
    }
  }
  
}

