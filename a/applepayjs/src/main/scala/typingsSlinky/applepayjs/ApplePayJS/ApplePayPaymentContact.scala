package typingsSlinky.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Encapsulates contact information needed for billing and shipping.
  */
@js.native
trait ApplePayPaymentContact extends js.Object {
  /**
    * The street portion of the address for the contact.
    */
  var addressLines: js.UndefOr[js.Array[String]] = js.native
  /**
    * The state for the contact.
    */
  var administrativeArea: js.UndefOr[String] = js.native
  /**
    * The name of the country for the contact.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * The contact’s two-letter ISO 3166 country code.
    */
  var countryCode: js.UndefOr[String] = js.native
  /**
    * An email address for the contact.
    */
  var emailAddress: js.UndefOr[String] = js.native
  /**
    * The contact's family name.
    */
  var familyName: js.UndefOr[String] = js.native
  /**
    * The contact's given name.
    */
  var givenName: js.UndefOr[String] = js.native
  /**
    * The city for the contact.
    */
  var locality: js.UndefOr[String] = js.native
  /**
    * A phone number for the contact.
    */
  var phoneNumber: js.UndefOr[String] = js.native
  /**
    * The phonetic spelling of the contact's family name.
    */
  var phoneticFamilyName: js.UndefOr[String] = js.native
  /**
    * The phonetic spelling of the contact's given name.
    */
  var phoneticGivenName: js.UndefOr[String] = js.native
  /**
    * The zip code or postal code, where applicable, for the contact.
    */
  var postalCode: js.UndefOr[String] = js.native
  /**
    * The subadministrative area (such as a county or other region) in a postal address.
    */
  var subAdministrativeArea: js.UndefOr[String] = js.native
  /**
    * Additional information associated with the location, typically defined at the city or town level (such as district or neighborhood), in a postal address.
    */
  var subLocality: js.UndefOr[String] = js.native
}

object ApplePayPaymentContact {
  @scala.inline
  def apply(): ApplePayPaymentContact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplePayPaymentContact]
  }
  @scala.inline
  implicit class ApplePayPaymentContactOps[Self <: ApplePayPaymentContact] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddressLines(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddressLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressLines")(js.undefined)
        ret
    }
    @scala.inline
    def withAdministrativeArea(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("administrativeArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdministrativeArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("administrativeArea")(js.undefined)
        ret
    }
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(js.undefined)
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
    def withEmailAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withFamilyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("familyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFamilyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("familyName")(js.undefined)
        ret
    }
    @scala.inline
    def withGivenName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("givenName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGivenName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("givenName")(js.undefined)
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
    def withPhoneticFamilyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneticFamilyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoneticFamilyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneticFamilyName")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoneticGivenName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneticGivenName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoneticGivenName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneticGivenName")(js.undefined)
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
    def withSubAdministrativeArea(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subAdministrativeArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubAdministrativeArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subAdministrativeArea")(js.undefined)
        ret
    }
    @scala.inline
    def withSubLocality(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subLocality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubLocality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subLocality")(js.undefined)
        ret
    }
  }
  
}

