package typingsSlinky.pigpio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBits extends js.Object {
  /**
    * a bit mask indicating the GPIOs of interest, bit0 corresponds to GPIO0, bit1 corresponds to GPIO1, ..., bit31 corresponds to GPIO31.
    * If a bit is set, the corresponding GPIO will be monitored for state changes. (optional, no default)
    */
  var bits: Double = js.native
}

object AnonBits {
  @scala.inline
  def apply(bits: Double): AnonBits = {
    val __obj = js.Dynamic.literal(bits = bits.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBits]
  }
  @scala.inline
  implicit class AnonBitsOps[Self <: AnonBits] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bits")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

