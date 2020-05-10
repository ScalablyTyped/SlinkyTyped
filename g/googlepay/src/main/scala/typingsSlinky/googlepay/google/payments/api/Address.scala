package typingsSlinky.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Description of a user's address.
  */
@js.native
trait Address extends js.Object {
  /**
    * The first line of the address.
    *
    * Will be set to empty string if the address does not have a first
    * line.
    *
    * @default ""
    */
  var address1: js.UndefOr[String] = js.native
  /**
    * The second line of the address.
    *
    * Will be set to empty string if the address does not have a second
    * line.
    *
    * @default ""
    */
  var address2: js.UndefOr[String] = js.native
  /**
    * The third line of the address.
    *
    * Will be set to empty string if the address does not have a third
    * line.
    *
    * @default ""
    */
  var address3: js.UndefOr[String] = js.native
  /**
    * The administrative area (e.g. state or province).
    */
  var administrativeArea: String = js.native
  /**
    * The two-letter ISO-3166 country code.
    */
  var countryCode: String = js.native
  /**
    * The locality (e.g. city or town).
    */
  var locality: String = js.native
  /**
    * Name of the recipient at this address.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The phone number.
    *
    * This field will only be present if the caller requested that a phone
    * number be returned.
    */
  var phoneNumber: js.UndefOr[String] = js.native
  /**
    * The postal code (also known in some places as ZIP code).
    *
    * Note: some regions do not have postal codes. In those cases
    * this field will be set to an empty string.
    */
  var postalCode: String = js.native
  /**
    * The sorting code.
    *
    * Note: some regions do not have sorting codes. In those cases
    * this field will be set to an empty string.
    */
  var sortingCode: js.UndefOr[String] = js.native
}

object Address {
  @scala.inline
  def apply(administrativeArea: String, countryCode: String, locality: String, postalCode: String): Address = {
    val __obj = js.Dynamic.literal(administrativeArea = administrativeArea.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], locality = locality.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  @scala.inline
  implicit class AddressOps[Self <: Address] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdministrativeArea(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("administrativeArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountryCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocality(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostalCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddress1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address1")(js.undefined)
        ret
    }
    @scala.inline
    def withAddress2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address2")(js.undefined)
        ret
    }
    @scala.inline
    def withAddress3(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address3")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoneNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoneNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withSortingCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortingCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortingCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortingCode")(js.undefined)
        ret
    }
  }
  
}

