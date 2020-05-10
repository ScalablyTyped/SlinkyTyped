package typingsSlinky.mangopay2NodejsSdk.mod.address

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddressData extends _AddressType {
  var AddressLine1: String = js.native
  var AddressLine2: String = js.native
  var City: String = js.native
  var Country: String = js.native
  var PostalCode: String = js.native
  var Region: String = js.native
}

object AddressData {
  @scala.inline
  def apply(
    AddressLine1: String,
    AddressLine2: String,
    City: String,
    Country: String,
    PostalCode: String,
    Region: String
  ): AddressData = {
    val __obj = js.Dynamic.literal(AddressLine1 = AddressLine1.asInstanceOf[js.Any], AddressLine2 = AddressLine2.asInstanceOf[js.Any], City = City.asInstanceOf[js.Any], Country = Country.asInstanceOf[js.Any], PostalCode = PostalCode.asInstanceOf[js.Any], Region = Region.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressData]
  }
  @scala.inline
  implicit class AddressDataOps[Self <: AddressData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddressLine1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddressLine1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddressLine2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddressLine2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("City")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostalCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PostalCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Region")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

