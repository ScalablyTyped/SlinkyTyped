package typingsSlinky.raspiBoard.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PinInfo extends js.Object {
  var gpio: Double = js.native
  var peripherals: js.Array[String] = js.native
  var pins: js.Array[String] = js.native
}

object PinInfo {
  @scala.inline
  def apply(gpio: Double, peripherals: js.Array[String], pins: js.Array[String]): PinInfo = {
    val __obj = js.Dynamic.literal(gpio = gpio.asInstanceOf[js.Any], peripherals = peripherals.asInstanceOf[js.Any], pins = pins.asInstanceOf[js.Any])
    __obj.asInstanceOf[PinInfo]
  }
  @scala.inline
  implicit class PinInfoOps[Self <: PinInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGpio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gpio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeripherals(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peripherals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPins(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pins")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

