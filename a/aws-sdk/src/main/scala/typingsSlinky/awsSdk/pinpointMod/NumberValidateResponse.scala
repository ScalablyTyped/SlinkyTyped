package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberValidateResponse extends js.Object {
  /**
    * The carrier or service provider that the phone number is currently registered with. In some countries and regions, this value may be the carrier or service provider that the phone number was originally registered with.
    */
  var Carrier: js.UndefOr[string] = js.native
  /**
    * The name of the city where the phone number was originally registered.
    */
  var City: js.UndefOr[string] = js.native
  /**
    * The cleansed phone number, in E.164 format, for the location where the phone number was originally registered.
    */
  var CleansedPhoneNumberE164: js.UndefOr[string] = js.native
  /**
    * The cleansed phone number, in the format for the location where the phone number was originally registered.
    */
  var CleansedPhoneNumberNational: js.UndefOr[string] = js.native
  /**
    * The name of the country or region where the phone number was originally registered.
    */
  var Country: js.UndefOr[string] = js.native
  /**
    * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region where the phone number was originally registered.
    */
  var CountryCodeIso2: js.UndefOr[string] = js.native
  /**
    * The numeric code for the country or region where the phone number was originally registered.
    */
  var CountryCodeNumeric: js.UndefOr[string] = js.native
  /**
    * The name of the county where the phone number was originally registered.
    */
  var County: js.UndefOr[string] = js.native
  /**
    * The two-character code, in ISO 3166-1 alpha-2 format, that was sent in the request body.
    */
  var OriginalCountryCodeIso2: js.UndefOr[string] = js.native
  /**
    * The phone number that was sent in the request body.
    */
  var OriginalPhoneNumber: js.UndefOr[string] = js.native
  /**
    * The description of the phone type. Valid values are: MOBILE, LANDLINE, VOIP,
    INVALID, PREPAID, and OTHER.
    */
  var PhoneType: js.UndefOr[string] = js.native
  /**
    * The phone type, represented by an integer. Valid values are: 0 (mobile), 1 (landline), 2 (VoIP), 3 (invalid), 4 (other), and 5 (prepaid).
    */
  var PhoneTypeCode: js.UndefOr[integer] = js.native
  /**
    * The time zone for the location where the phone number was originally registered.
    */
  var Timezone: js.UndefOr[string] = js.native
  /**
    * The postal or ZIP code for the location where the phone number was originally registered.
    */
  var ZipCode: js.UndefOr[string] = js.native
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
    def withCarrier(value: string): Self = {
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
    def withCity(value: string): Self = {
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
    def withCleansedPhoneNumberE164(value: string): Self = {
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
    def withCleansedPhoneNumberNational(value: string): Self = {
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
    def withCountry(value: string): Self = {
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
    def withCountryCodeIso2(value: string): Self = {
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
    def withCountryCodeNumeric(value: string): Self = {
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
    def withCounty(value: string): Self = {
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
    def withOriginalCountryCodeIso2(value: string): Self = {
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
    def withOriginalPhoneNumber(value: string): Self = {
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
    def withPhoneType(value: string): Self = {
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
    def withPhoneTypeCode(value: integer): Self = {
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
    def withTimezone(value: string): Self = {
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
    def withZipCode(value: string): Self = {
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

