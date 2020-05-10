package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoLocationDetails extends js.Object {
  /**
    * The two-letter code for the continent.
    */
  var ContinentCode: js.UndefOr[GeoLocationContinentCode] = js.native
  /**
    * The full name of the continent.
    */
  var ContinentName: js.UndefOr[GeoLocationContinentName] = js.native
  /**
    * The two-letter code for the country.
    */
  var CountryCode: js.UndefOr[GeoLocationCountryCode] = js.native
  /**
    * The name of the country.
    */
  var CountryName: js.UndefOr[GeoLocationCountryName] = js.native
  /**
    * The code for the subdivision. Route 53 currently supports only states in the United States.
    */
  var SubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.native
  /**
    * The full name of the subdivision. Route 53 currently supports only states in the United States.
    */
  var SubdivisionName: js.UndefOr[GeoLocationSubdivisionName] = js.native
}

object GeoLocationDetails {
  @scala.inline
  def apply(): GeoLocationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoLocationDetails]
  }
  @scala.inline
  implicit class GeoLocationDetailsOps[Self <: GeoLocationDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContinentCode(value: GeoLocationContinentCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContinentCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinentCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContinentCode")(js.undefined)
        ret
    }
    @scala.inline
    def withContinentName(value: GeoLocationContinentName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContinentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContinentName")(js.undefined)
        ret
    }
    @scala.inline
    def withCountryCode(value: GeoLocationCountryCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountryCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountryCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountryCode")(js.undefined)
        ret
    }
    @scala.inline
    def withCountryName(value: GeoLocationCountryName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountryName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountryName")(js.undefined)
        ret
    }
    @scala.inline
    def withSubdivisionCode(value: GeoLocationSubdivisionCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubdivisionCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubdivisionCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubdivisionCode")(js.undefined)
        ret
    }
    @scala.inline
    def withSubdivisionName(value: GeoLocationSubdivisionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubdivisionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubdivisionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubdivisionName")(js.undefined)
        ret
    }
  }
  
}

