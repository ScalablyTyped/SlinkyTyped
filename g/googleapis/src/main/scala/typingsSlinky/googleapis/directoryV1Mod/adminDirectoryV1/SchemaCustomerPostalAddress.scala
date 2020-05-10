package typingsSlinky.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for postal address of a customer.
  */
@js.native
trait SchemaCustomerPostalAddress extends js.Object {
  /**
    * A customer&#39;s physical address. The address can be composed of one to
    * three lines.
    */
  var addressLine1: js.UndefOr[String] = js.native
  /**
    * Address line 2 of the address.
    */
  var addressLine2: js.UndefOr[String] = js.native
  /**
    * Address line 3 of the address.
    */
  var addressLine3: js.UndefOr[String] = js.native
  /**
    * The customer contact&#39;s name.
    */
  var contactName: js.UndefOr[String] = js.native
  /**
    * This is a required property. For countryCode information see the ISO 3166
    * country code elements.
    */
  var countryCode: js.UndefOr[String] = js.native
  /**
    * Name of the locality. An example of a locality value is the city of San
    * Francisco.
    */
  var locality: js.UndefOr[String] = js.native
  /**
    * The company or company division name.
    */
  var organizationName: js.UndefOr[String] = js.native
  /**
    * The postal code. A postalCode example is a postal zip code such as 10009.
    * This is in accordance with -
    * http://portablecontacts.net/draft-spec.html#address_element.
    */
  var postalCode: js.UndefOr[String] = js.native
  /**
    * Name of the region. An example of a region value is NY for the state of
    * New York.
    */
  var region: js.UndefOr[String] = js.native
}

object SchemaCustomerPostalAddress {
  @scala.inline
  def apply(): SchemaCustomerPostalAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomerPostalAddress]
  }
  @scala.inline
  implicit class SchemaCustomerPostalAddressOps[Self <: SchemaCustomerPostalAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddressLine1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressLine1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddressLine1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressLine1")(js.undefined)
        ret
    }
    @scala.inline
    def withAddressLine2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressLine2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddressLine2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressLine2")(js.undefined)
        ret
    }
    @scala.inline
    def withAddressLine3(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressLine3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddressLine3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressLine3")(js.undefined)
        ret
    }
    @scala.inline
    def withContactName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactName")(js.undefined)
        ret
    }
    @scala.inline
    def withCountryCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountryCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryCode")(js.undefined)
        ret
    }
    @scala.inline
    def withLocality(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locality")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganizationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganizationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizationName")(js.undefined)
        ret
    }
    @scala.inline
    def withPostalCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostalCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCode")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
  }
  
}

