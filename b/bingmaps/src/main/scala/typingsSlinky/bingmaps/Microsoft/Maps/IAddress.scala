package typingsSlinky.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAddress extends js.Object {
  /**
    * The street line of an address. The addressLine property is the most precise, official line for an address relative to the postal agency
    * servicing the area specified by the locality or postalCode properties.
    */
  var addressLine: String = js.native
  /**
    * The subdivision name within the country or region for an address. This element is also commonly treated as the first order administrative
    * subdivision. An example is a US state, such as “Oregon”.
    */
  var adminDistrict: String = js.native
  /** The country or region name of the address. */
  var countryRegion: String = js.native
  /** A string specifying the two-letter ISO country code. */
  var countryRegionISO2: String = js.native
  /** The second, third, or fourth order subdivision within a country, dependency, or region. An example is a US county, such as “King”. */
  var district: String = js.native
  /** A nicely formatted address string for the result. */
  var formattedAddress: String = js.native
  /** The locality, such as the primary city, that corresponds to an address. An example is “Seattle”. */
  var locality: String = js.native
  /** The post code, postal code, or ZIP code of an address. An example is a US ZIP code, such as “98152”. */
  var postalCode: String = js.native
}

object IAddress {
  @scala.inline
  def apply(
    addressLine: String,
    adminDistrict: String,
    countryRegion: String,
    countryRegionISO2: String,
    district: String,
    formattedAddress: String,
    locality: String,
    postalCode: String
  ): IAddress = {
    val __obj = js.Dynamic.literal(addressLine = addressLine.asInstanceOf[js.Any], adminDistrict = adminDistrict.asInstanceOf[js.Any], countryRegion = countryRegion.asInstanceOf[js.Any], countryRegionISO2 = countryRegionISO2.asInstanceOf[js.Any], district = district.asInstanceOf[js.Any], formattedAddress = formattedAddress.asInstanceOf[js.Any], locality = locality.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAddress]
  }
  @scala.inline
  implicit class IAddressOps[Self <: IAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddressLine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdminDistrict(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adminDistrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountryRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountryRegionISO2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryRegionISO2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistrict(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("district")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormattedAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedAddress")(value.asInstanceOf[js.Any])
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
  }
  
}

