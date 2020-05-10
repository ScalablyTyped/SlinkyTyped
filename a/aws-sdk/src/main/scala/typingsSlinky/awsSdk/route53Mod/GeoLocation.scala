package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoLocation extends js.Object {
  /**
    * The two-letter code for the continent. Valid values: AF | AN | AS | EU | OC | NA | SA  Constraint: Specifying ContinentCode with either CountryCode or SubdivisionCode returns an InvalidInput error.
    */
  var ContinentCode: js.UndefOr[GeoLocationContinentCode] = js.native
  /**
    * The two-letter code for the country.
    */
  var CountryCode: js.UndefOr[GeoLocationCountryCode] = js.native
  /**
    * The code for the subdivision. Route 53 currently supports only states in the United States.
    */
  var SubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.native
}

object GeoLocation {
  @scala.inline
  def apply(): GeoLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoLocation]
  }
  @scala.inline
  implicit class GeoLocationOps[Self <: GeoLocation] (val x: Self) extends AnyVal {
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
  }
  
}

