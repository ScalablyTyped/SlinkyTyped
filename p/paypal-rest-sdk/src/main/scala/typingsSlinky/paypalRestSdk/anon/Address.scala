package typingsSlinky.paypalRestSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Address extends js.Object {
  var address: typingsSlinky.paypalRestSdk.mod.Address = js.native
  var business_name: js.UndefOr[String] = js.native
  var first_name: String = js.native
  var last_name: String = js.native
}

object Address {
  @scala.inline
  def apply(address: typingsSlinky.paypalRestSdk.mod.Address, first_name: String, last_name: String): Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], first_name = first_name.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  @scala.inline
  implicit class AddressOps[Self <: Address] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: typingsSlinky.paypalRestSdk.mod.Address): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirst_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBusiness_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("business_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBusiness_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("business_name")(js.undefined)
        ret
    }
  }
  
}

