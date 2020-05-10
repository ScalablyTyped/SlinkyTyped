package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignInLocation extends js.Object {
  /**
    * Provides the city where the sign-in originated. This is calculated using latitude/longitude information from the
    * sign-in activity.
    */
  var city: js.UndefOr[String] = js.native
  /**
    * Provides the country code info (2 letter code) where the sign-in originated. This is calculated using
    * latitude/longitude information from the sign-in activity.
    */
  var countryOrRegion: js.UndefOr[String] = js.native
  // Provides the latitude, longitude and altitude where the sign-in originated.
  var geoCoordinates: js.UndefOr[GeoCoordinates] = js.native
  /**
    * Provides the State where the sign-in originated. This is calculated using latitude/longitude information from the
    * sign-in activity.
    */
  var state: js.UndefOr[String] = js.native
}

object SignInLocation {
  @scala.inline
  def apply(): SignInLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignInLocation]
  }
  @scala.inline
  implicit class SignInLocationOps[Self <: SignInLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withCountryOrRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryOrRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountryOrRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryOrRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withGeoCoordinates(value: GeoCoordinates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoCoordinates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeoCoordinates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoCoordinates")(js.undefined)
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
  }
  
}

