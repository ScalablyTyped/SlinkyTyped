package typingsSlinky.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for the postal address of a building in Directory API.
  */
@js.native
trait SchemaBuildingAddress extends js.Object {
  /**
    * Unstructured address lines describing the lower levels of an address.
    */
  var addressLines: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional. Highest administrative subdivision which is used for postal
    * addresses of a country or region.
    */
  var administrativeArea: js.UndefOr[String] = js.native
  /**
    * Optional. BCP-47 language code of the contents of this address (if
    * known).
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * Optional. Generally refers to the city/town portion of the address.
    * Examples: US city, IT comune, UK post town. In regions of the world where
    * localities are not well defined or do not fit into this structure well,
    * leave locality empty and use addressLines.
    */
  var locality: js.UndefOr[String] = js.native
  /**
    * Optional. Postal code of the address.
    */
  var postalCode: js.UndefOr[String] = js.native
  /**
    * Required. CLDR region code of the country/region of the address.
    */
  var regionCode: js.UndefOr[String] = js.native
  /**
    * Optional. Sublocality of the address.
    */
  var sublocality: js.UndefOr[String] = js.native
}

object SchemaBuildingAddress {
  @scala.inline
  def apply(): SchemaBuildingAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildingAddress]
  }
  @scala.inline
  implicit class SchemaBuildingAddressOps[Self <: SchemaBuildingAddress] (val x: Self) extends AnyVal {
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
    def withLanguageCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(js.undefined)
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
    def withRegionCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegionCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionCode")(js.undefined)
        ret
    }
    @scala.inline
    def withSublocality(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sublocality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSublocality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sublocality")(js.undefined)
        ret
    }
  }
  
}

