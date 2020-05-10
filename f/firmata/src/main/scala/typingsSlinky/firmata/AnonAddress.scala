package typingsSlinky.firmata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddress extends js.Object {
  var address: Double = js.native
  var bus: Double = js.native
}

object AnonAddress {
  @scala.inline
  def apply(address: Double, bus: Double): AnonAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], bus = bus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddress]
  }
  @scala.inline
  implicit class AnonAddressOps[Self <: AnonAddress] (val x: Self) extends AnyVal {
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
    def withBus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bus")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

