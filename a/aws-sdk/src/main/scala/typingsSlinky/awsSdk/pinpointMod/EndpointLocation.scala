package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointLocation extends js.Object {
  /**
    * The name of the city where the endpoint is located.
    */
  var City: js.UndefOr[string] = js.native
  /**
    * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region where the endpoint is located. For example, US for the United States.
    */
  var Country: js.UndefOr[string] = js.native
  /**
    * The latitude coordinate of the endpoint location, rounded to one decimal place.
    */
  var Latitude: js.UndefOr[double] = js.native
  /**
    * The longitude coordinate of the endpoint location, rounded to one decimal place.
    */
  var Longitude: js.UndefOr[double] = js.native
  /**
    * The postal or ZIP code for the area where the endpoint is located.
    */
  var PostalCode: js.UndefOr[string] = js.native
  /**
    * The name of the region where the endpoint is located. For locations in the United States, this value is the name of a state.
    */
  var Region: js.UndefOr[string] = js.native
}

object EndpointLocation {
  @scala.inline
  def apply(): EndpointLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointLocation]
  }
  @scala.inline
  implicit class EndpointLocationOps[Self <: EndpointLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withLatitude(value: double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Latitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Latitude")(js.undefined)
        ret
    }
    @scala.inline
    def withLongitude(value: double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Longitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Longitude")(js.undefined)
        ret
    }
    @scala.inline
    def withPostalCode(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PostalCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostalCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PostalCode")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Region")(js.undefined)
        ret
    }
  }
  
}

