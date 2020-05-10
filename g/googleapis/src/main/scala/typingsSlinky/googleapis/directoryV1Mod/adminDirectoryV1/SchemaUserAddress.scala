package typingsSlinky.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for address.
  */
@js.native
trait SchemaUserAddress extends js.Object {
  /**
    * Country.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * Country code.
    */
  var countryCode: js.UndefOr[String] = js.native
  /**
    * Custom type.
    */
  var customType: js.UndefOr[String] = js.native
  /**
    * Extended Address.
    */
  var extendedAddress: js.UndefOr[String] = js.native
  /**
    * Formatted address.
    */
  var formatted: js.UndefOr[String] = js.native
  /**
    * Locality.
    */
  var locality: js.UndefOr[String] = js.native
  /**
    * Other parts of address.
    */
  var poBox: js.UndefOr[String] = js.native
  /**
    * Postal code.
    */
  var postalCode: js.UndefOr[String] = js.native
  /**
    * If this is user&#39;s primary address. Only one entry could be marked as
    * primary.
    */
  var primary: js.UndefOr[Boolean] = js.native
  /**
    * Region.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * User supplied address was structured. Structured addresses are NOT
    * supported at this time. You might be able to write structured addresses,
    * but any values will eventually be clobbered.
    */
  var sourceIsStructured: js.UndefOr[Boolean] = js.native
  /**
    * Street.
    */
  var streetAddress: js.UndefOr[String] = js.native
  /**
    * Each entry can have a type which indicates standard values of that entry.
    * For example address could be of home, work etc. In addition to the
    * standard type, an entry can have a custom type and can take any value.
    * Such type should have the CUSTOM value as type and also have a customType
    * value.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaUserAddress {
  @scala.inline
  def apply(): SchemaUserAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserAddress]
  }
  @scala.inline
  implicit class SchemaUserAddressOps[Self <: SchemaUserAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withCustomType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customType")(js.undefined)
        ret
    }
    @scala.inline
    def withExtendedAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtendedAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatted(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatted")(js.undefined)
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
    def withPoBox(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poBox")(js.undefined)
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
    def withPrimary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(js.undefined)
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
    @scala.inline
    def withSourceIsStructured(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceIsStructured")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceIsStructured: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceIsStructured")(js.undefined)
        ret
    }
    @scala.inline
    def withStreetAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streetAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreetAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streetAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

