package typingsSlinky.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Address extends js.Object {
  /**
    * The unique ID for an address.
    */
  var AddressId: js.UndefOr[typingsSlinky.awsSdk.snowballMod.AddressId] = js.native
  /**
    * The city in an address that a Snowball is to be delivered to.
    */
  var City: js.UndefOr[String] = js.native
  /**
    * The name of the company to receive a Snowball at an address.
    */
  var Company: js.UndefOr[String] = js.native
  /**
    * The country in an address that a Snowball is to be delivered to.
    */
  var Country: js.UndefOr[String] = js.native
  /**
    * If the address you are creating is a primary address, then set this option to true. This field is not supported in most regions.
    */
  var IsRestricted: js.UndefOr[Boolean] = js.native
  /**
    * This field is no longer used and the value is ignored.
    */
  var Landmark: js.UndefOr[String] = js.native
  /**
    * The name of a person to receive a Snowball at an address.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The phone number associated with an address that a Snowball is to be delivered to.
    */
  var PhoneNumber: js.UndefOr[String] = js.native
  /**
    * The postal code in an address that a Snowball is to be delivered to.
    */
  var PostalCode: js.UndefOr[String] = js.native
  /**
    * This field is no longer used and the value is ignored.
    */
  var PrefectureOrDistrict: js.UndefOr[String] = js.native
  /**
    * The state or province in an address that a Snowball is to be delivered to.
    */
  var StateOrProvince: js.UndefOr[String] = js.native
  /**
    * The first line in a street address that a Snowball is to be delivered to.
    */
  var Street1: js.UndefOr[String] = js.native
  /**
    * The second line in a street address that a Snowball is to be delivered to.
    */
  var Street2: js.UndefOr[String] = js.native
  /**
    * The third line in a street address that a Snowball is to be delivered to.
    */
  var Street3: js.UndefOr[String] = js.native
}

object Address {
  @scala.inline
  def apply(): Address = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Address]
  }
  @scala.inline
  implicit class AddressOps[Self <: Address] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddressId(value: AddressId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddressId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddressId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddressId")(js.undefined)
        ret
    }
    @scala.inline
    def withCity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("City")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("City")(js.undefined)
        ret
    }
    @scala.inline
    def withCompany(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Company")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompany: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Company")(js.undefined)
        ret
    }
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Country")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRestricted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsRestricted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRestricted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsRestricted")(js.undefined)
        ret
    }
    @scala.inline
    def withLandmark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Landmark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLandmark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Landmark")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoneNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhoneNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoneNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhoneNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withPostalCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PostalCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostalCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PostalCode")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefectureOrDistrict(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrefectureOrDistrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefectureOrDistrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrefectureOrDistrict")(js.undefined)
        ret
    }
    @scala.inline
    def withStateOrProvince(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateOrProvince")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateOrProvince: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateOrProvince")(js.undefined)
        ret
    }
    @scala.inline
    def withStreet1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Street1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreet1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Street1")(js.undefined)
        ret
    }
    @scala.inline
    def withStreet2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Street2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreet2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Street2")(js.undefined)
        ret
    }
    @scala.inline
    def withStreet3(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Street3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreet3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Street3")(js.undefined)
        ret
    }
  }
  
}

