package typingsSlinky.navermaps.naver.maps.Service

import typingsSlinky.navermaps.AnonCountry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddressItem extends js.Object {
  var addrdetail: AnonCountry = js.native
  var address: String = js.native
}

object AddressItem {
  @scala.inline
  def apply(addrdetail: AnonCountry, address: String): AddressItem = {
    val __obj = js.Dynamic.literal(addrdetail = addrdetail.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressItem]
  }
  @scala.inline
  implicit class AddressItemOps[Self <: AddressItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddrdetail(value: AnonCountry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addrdetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

