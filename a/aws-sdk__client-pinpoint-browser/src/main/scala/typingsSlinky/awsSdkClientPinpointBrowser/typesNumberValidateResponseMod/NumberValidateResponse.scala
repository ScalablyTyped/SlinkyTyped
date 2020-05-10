package typingsSlinky.awsSdkClientPinpointBrowser.typesNumberValidateResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberValidateResponse extends js.Object {
  /**
    * The carrier or servive provider that the phone number is currently registered with.
    */
  var Carrier: js.UndefOr[String] = js.native
  /**
    * The city where the phone number was originally registered.
    */
  var City: js.UndefOr[String] = js.native
  /**
    * The cleansed phone number, shown in E.164 format.
    */
  var CleansedPhoneNumberE164: js.UndefOr[String] = js.native
  /**
    * The cleansed phone number, shown in the local phone number format.
    */
  var CleansedPhoneNumberNational: js.UndefOr[String] = js.native
  /**
    * The country or region where the phone number was originally registered.
    */
  var Country: js.UndefOr[String] = js.native
  /**
    * The two-character ISO code for the country or region where the phone number was originally registered.
    */
  var CountryCodeIso2: js.UndefOr[String] = js.native
  /**
    * The numeric code for the country or region where the phone number was originally registered.
    */
  var CountryCodeNumeric: js.UndefOr[String] = js.native
  /**
    * The county where the phone number was originally registered.
    */
  var County: js.UndefOr[String] = js.native
  /**
    * The two-character code (in ISO 3166-1 alpha-2 format) for the country or region in the request body.
    */
  var OriginalCountryCodeIso2: js.UndefOr[String] = js.native
  /**
    * The phone number that you included in the request body.
    */
  var OriginalPhoneNumber: js.UndefOr[String] = js.native
  /**
    * A description of the phone type. Possible values are MOBILE, LANDLINE, VOIP, INVALID, PREPAID, and OTHER.
    */
  var PhoneType: js.UndefOr[String] = js.native
  /**
    * The phone type, represented by an integer. Possible values include 0 (MOBILE), 1 (LANDLINE), 2 (VOIP), 3 (INVALID), 4 (OTHER), and 5 (PREPAID).
    */
  var PhoneTypeCode: js.UndefOr[Double] = js.native
  /**
    * The time zone for the location where the phone number was originally registered.
    */
  var Timezone: js.UndefOr[String] = js.native
  /**
    * The postal code for the location where the phone number was originally registered.
    */
  var ZipCode: js.UndefOr[String] = js.native
}

object NumberValidateResponse {
  @scala.inline
  def apply(): NumberValidateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberValidateResponse]
  }
  @scala.inline
  implicit class NumberValidateResponseOps[Self <: NumberValidateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCarrier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Carrier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCarrier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Carrier")(js.undefined)
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
    def withCleansedPhoneNumberE164(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CleansedPhoneNumberE164")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCleansedPhoneNumberE164: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CleansedPhoneNumberE164")(js.undefined)
        ret
    }
    @scala.inline
    def withCleansedPhoneNumberNational(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CleansedPhoneNumberNational")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCleansedPhoneNumberNational: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CleansedPhoneNumberNational")(js.undefined)
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
    def withCountryCodeIso2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountryCodeIso2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountryCodeIso2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountryCodeIso2")(js.undefined)
        ret
    }
    @scala.inline
    def withCountryCodeNumeric(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountryCodeNumeric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountryCodeNumeric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountryCodeNumeric")(js.undefined)
        ret
    }
    @scala.inline
    def withCounty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("County")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCounty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("County")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalCountryCodeIso2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginalCountryCodeIso2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalCountryCodeIso2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginalCountryCodeIso2")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalPhoneNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginalPhoneNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalPhoneNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginalPhoneNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoneType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhoneType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoneType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhoneType")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoneTypeCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhoneTypeCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoneTypeCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhoneTypeCode")(js.undefined)
        ret
    }
    @scala.inline
    def withTimezone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimezone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timezone")(js.undefined)
        ret
    }
    @scala.inline
    def withZipCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZipCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZipCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZipCode")(js.undefined)
        ret
    }
  }
  
}

