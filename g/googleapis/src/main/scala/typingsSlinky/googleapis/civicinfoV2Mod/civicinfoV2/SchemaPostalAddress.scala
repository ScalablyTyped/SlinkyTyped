package typingsSlinky.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPostalAddress extends js.Object {
  var addressLines: js.UndefOr[js.Array[String]] = js.native
  var administrativeAreaName: js.UndefOr[String] = js.native
  var countryName: js.UndefOr[String] = js.native
  var countryNameCode: js.UndefOr[String] = js.native
  var dependentLocalityName: js.UndefOr[String] = js.native
  var dependentThoroughfareName: js.UndefOr[String] = js.native
  var firmName: js.UndefOr[String] = js.native
  var isDisputed: js.UndefOr[Boolean] = js.native
  var languageCode: js.UndefOr[String] = js.native
  var localityName: js.UndefOr[String] = js.native
  var postBoxNumber: js.UndefOr[String] = js.native
  var postalCodeNumber: js.UndefOr[String] = js.native
  var postalCodeNumberExtension: js.UndefOr[String] = js.native
  var premiseName: js.UndefOr[String] = js.native
  var recipientName: js.UndefOr[String] = js.native
  var sortingCode: js.UndefOr[String] = js.native
  var subAdministrativeAreaName: js.UndefOr[String] = js.native
  var subPremiseName: js.UndefOr[String] = js.native
  var thoroughfareName: js.UndefOr[String] = js.native
  var thoroughfareNumber: js.UndefOr[String] = js.native
}

object SchemaPostalAddress {
  @scala.inline
  def apply(): SchemaPostalAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPostalAddress]
  }
  @scala.inline
  implicit class SchemaPostalAddressOps[Self <: SchemaPostalAddress] (val x: Self) extends AnyVal {
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
    def withAdministrativeAreaName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("administrativeAreaName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdministrativeAreaName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("administrativeAreaName")(js.undefined)
        ret
    }
    @scala.inline
    def withCountryName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountryName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryName")(js.undefined)
        ret
    }
    @scala.inline
    def withCountryNameCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryNameCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountryNameCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryNameCode")(js.undefined)
        ret
    }
    @scala.inline
    def withDependentLocalityName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependentLocalityName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDependentLocalityName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependentLocalityName")(js.undefined)
        ret
    }
    @scala.inline
    def withDependentThoroughfareName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependentThoroughfareName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDependentThoroughfareName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependentThoroughfareName")(js.undefined)
        ret
    }
    @scala.inline
    def withFirmName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firmName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirmName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firmName")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDisputed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDisputed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDisputed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDisputed")(js.undefined)
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
    def withLocalityName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localityName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalityName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localityName")(js.undefined)
        ret
    }
    @scala.inline
    def withPostBoxNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postBoxNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostBoxNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postBoxNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withPostalCodeNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCodeNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostalCodeNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCodeNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withPostalCodeNumberExtension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCodeNumberExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostalCodeNumberExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCodeNumberExtension")(js.undefined)
        ret
    }
    @scala.inline
    def withPremiseName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premiseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPremiseName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premiseName")(js.undefined)
        ret
    }
    @scala.inline
    def withRecipientName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipientName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientName")(js.undefined)
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
    @scala.inline
    def withSubAdministrativeAreaName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subAdministrativeAreaName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubAdministrativeAreaName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subAdministrativeAreaName")(js.undefined)
        ret
    }
    @scala.inline
    def withSubPremiseName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subPremiseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubPremiseName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subPremiseName")(js.undefined)
        ret
    }
    @scala.inline
    def withThoroughfareName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thoroughfareName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThoroughfareName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thoroughfareName")(js.undefined)
        ret
    }
    @scala.inline
    def withThoroughfareNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thoroughfareNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThoroughfareNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thoroughfareNumber")(js.undefined)
        ret
    }
  }
  
}

