package typingsSlinky.mangopay2NodejsSdk.mod

import typingsSlinky.mangopay2NodejsSdk.mod.address.AddressData
import typingsSlinky.mangopay2NodejsSdk.mod.models.Address
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BillingData extends js.Object {
  var Address: typingsSlinky.mangopay2NodejsSdk.mod.models.Address | AddressData | String = js.native
}

object BillingData {
  @scala.inline
  def apply(Address: Address | AddressData | String): BillingData = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingData]
  }
  @scala.inline
  implicit class BillingDataOps[Self <: BillingData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: Address | AddressData | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Address")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

