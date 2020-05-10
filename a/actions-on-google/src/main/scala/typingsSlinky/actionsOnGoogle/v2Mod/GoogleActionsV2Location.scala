package typingsSlinky.actionsOnGoogle.v2Mod

import typingsSlinky.actionsOnGoogle.argumentArgumentMod._Argument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2Location extends _Argument {
  /**
    * City.
    * Requires the DEVICE_PRECISE_LOCATION or
    * DEVICE_COARSE_LOCATION permission.
    */
  var city: js.UndefOr[String] = js.native
  /**
    * Geo coordinates.
    * Requires the DEVICE_PRECISE_LOCATION permission.
    */
  var coordinates: js.UndefOr[GoogleTypeLatLng] = js.native
  /**
    * Display address, e.g., \"1600 Amphitheatre Pkwy, Mountain View, CA 94043\".
    * Requires the DEVICE_PRECISE_LOCATION permission.
    */
  var formattedAddress: js.UndefOr[String] = js.native
  /**
    * Name of the place.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Notes about the location.
    */
  var notes: js.UndefOr[String] = js.native
  /**
    * Phone number of the location, e.g. contact number of business location or
    * phone number for delivery location.
    */
  var phoneNumber: js.UndefOr[String] = js.native
  /**
    * place_id is used with Places API to fetch details of a place.
    * See https://developers.google.com/places/web-service/place-id
    */
  var placeId: js.UndefOr[String] = js.native
  /**
    * Postal address.
    * Requires the DEVICE_PRECISE_LOCATION or
    * DEVICE_COARSE_LOCATION permission.
    */
  var postalAddress: js.UndefOr[GoogleTypePostalAddress] = js.native
  /**
    * Zip code.
    * Requires the DEVICE_PRECISE_LOCATION or
    * DEVICE_COARSE_LOCATION permission.
    */
  var zipCode: js.UndefOr[String] = js.native
}

object GoogleActionsV2Location {
  @scala.inline
  def apply(): GoogleActionsV2Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2Location]
  }
  @scala.inline
  implicit class GoogleActionsV2LocationOps[Self <: GoogleActionsV2Location] (val x: Self) extends AnyVal {
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
    def withCoordinates(value: GoogleTypeLatLng): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoordinates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinates")(js.undefined)
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNotes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoneNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoneNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeId")(js.undefined)
        ret
    }
    @scala.inline
    def withPostalAddress(value: GoogleTypePostalAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostalAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withZipCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zipCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZipCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zipCode")(js.undefined)
        ret
    }
  }
  
}

