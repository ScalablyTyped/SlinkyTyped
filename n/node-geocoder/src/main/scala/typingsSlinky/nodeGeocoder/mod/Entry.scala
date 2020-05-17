package typingsSlinky.nodeGeocoder.mod

import typingsSlinky.nodeGeocoder.anon.Confidence
import typingsSlinky.nodeGeocoder.anon.Level1long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entry extends js.Object {
  var administrativeLevels: js.UndefOr[Level1long] = js.native
  var building: js.UndefOr[String] = js.native
  var city: js.UndefOr[String] = js.native
  var country: js.UndefOr[String] = js.native
  var countryCode: js.UndefOr[String] = js.native
  var county: js.UndefOr[String] = js.native
  var district: js.UndefOr[String] = js.native
  var extra: js.UndefOr[Confidence] = js.native
  var formattedAddress: js.UndefOr[String] = js.native
  var latitude: js.UndefOr[Double] = js.native
  var longitude: js.UndefOr[Double] = js.native
  var provider: js.UndefOr[String] = js.native
  var state: js.UndefOr[String] = js.native
  var stateCode: js.UndefOr[String] = js.native
  var streetName: js.UndefOr[String] = js.native
  var streetNumber: js.UndefOr[String] = js.native
  var zipcode: js.UndefOr[String] = js.native
}

object Entry {
  @scala.inline
  def apply(): Entry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Entry]
  }
  @scala.inline
  implicit class EntryOps[Self <: Entry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdministrativeLevels(value: Level1long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("administrativeLevels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdministrativeLevels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("administrativeLevels")(js.undefined)
        ret
    }
    @scala.inline
    def withBuilding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("building")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuilding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("building")(js.undefined)
        ret
    }
    @scala.inline
    def withCity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(js.undefined)
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
    def withCounty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("county")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCounty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("county")(js.undefined)
        ret
    }
    @scala.inline
    def withDistrict(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("district")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("district")(js.undefined)
        ret
    }
    @scala.inline
    def withExtra(value: Confidence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtra: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(js.undefined)
        ret
    }
    @scala.inline
    def withFormattedAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormattedAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withLatitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(js.undefined)
        ret
    }
    @scala.inline
    def withLongitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(js.undefined)
        ret
    }
    @scala.inline
    def withProvider(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withStateCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateCode")(js.undefined)
        ret
    }
    @scala.inline
    def withStreetName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streetName")(js.undefined)
        ret
    }
    @scala.inline
    def withStreetNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streetNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreetNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streetNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withZipcode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zipcode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZipcode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zipcode")(js.undefined)
        ret
    }
  }
  
}

