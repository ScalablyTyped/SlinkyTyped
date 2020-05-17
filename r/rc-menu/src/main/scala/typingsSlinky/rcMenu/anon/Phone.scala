package typingsSlinky.rcMenu.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Phone extends js.Object {
  var device: js.Any = js.native
  var phone: js.Any = js.native
  var tablet: js.Any = js.native
}

object Phone {
  @scala.inline
  def apply(device: js.Any, phone: js.Any, tablet: js.Any): Phone = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], tablet = tablet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Phone]
  }
  @scala.inline
  implicit class PhoneOps[Self <: Phone] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDevice(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhone(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTablet(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tablet")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

