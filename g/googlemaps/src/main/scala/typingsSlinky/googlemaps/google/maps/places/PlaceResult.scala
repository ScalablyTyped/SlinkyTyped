package typingsSlinky.googlemaps.google.maps.places

import typingsSlinky.googlemaps.google.maps.GeocoderAddressComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaceResult extends js.Object {
  var address_components: js.UndefOr[js.Array[GeocoderAddressComponent]] = js.native
  var adr_address: js.UndefOr[String] = js.native
  var aspects: js.UndefOr[js.Array[PlaceAspectRating]] = js.native
  var formatted_address: js.UndefOr[String] = js.native
  var formatted_phone_number: js.UndefOr[String] = js.native
  var geometry: js.UndefOr[PlaceGeometry] = js.native
  var html_attributions: js.UndefOr[js.Array[String]] = js.native
  var icon: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var international_phone_number: js.UndefOr[String] = js.native
  var name: String = js.native
  var opening_hours: js.UndefOr[OpeningHours] = js.native
  var permanently_closed: js.UndefOr[Boolean] = js.native
  var photos: js.UndefOr[js.Array[PlacePhoto]] = js.native
  var place_id: js.UndefOr[String] = js.native
  var plus_code: js.UndefOr[PlacePlusCode] = js.native
  var price_level: js.UndefOr[Double] = js.native
  var rating: js.UndefOr[Double] = js.native
  var reviews: js.UndefOr[js.Array[PlaceReview]] = js.native
  var types: js.UndefOr[js.Array[String]] = js.native
  var url: js.UndefOr[String] = js.native
  var user_ratings_total: js.UndefOr[Double] = js.native
  /**
    * @deprecated utc_offset is deprecated as of November 2019 and will be turned off in November 2020.
    *      Use PlaceResult.utc_offset_minutes instead.
    */
  var utc_offset: js.UndefOr[Double] = js.native
  var utc_offset_minutes: js.UndefOr[Double] = js.native
  var vicinity: js.UndefOr[String] = js.native
  var website: js.UndefOr[String] = js.native
}

object PlaceResult {
  @scala.inline
  def apply(name: String): PlaceResult = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceResult]
  }
  @scala.inline
  implicit class PlaceResultOps[Self <: PlaceResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddress_components(value: js.Array[GeocoderAddressComponent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress_components: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_components")(js.undefined)
        ret
    }
    @scala.inline
    def withAdr_address(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adr_address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdr_address: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adr_address")(js.undefined)
        ret
    }
    @scala.inline
    def withAspects(value: js.Array[PlaceAspectRating]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAspects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspects")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatted_address(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatted_address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatted_address: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatted_address")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatted_phone_number(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatted_phone_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatted_phone_number: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatted_phone_number")(js.undefined)
        ret
    }
    @scala.inline
    def withGeometry(value: PlaceGeometry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeometry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml_attributions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html_attributions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml_attributions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html_attributions")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInternational_phone_number(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("international_phone_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInternational_phone_number: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("international_phone_number")(js.undefined)
        ret
    }
    @scala.inline
    def withOpening_hours(value: OpeningHours): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opening_hours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpening_hours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opening_hours")(js.undefined)
        ret
    }
    @scala.inline
    def withPermanently_closed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permanently_closed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermanently_closed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permanently_closed")(js.undefined)
        ret
    }
    @scala.inline
    def withPhotos(value: js.Array[PlacePhoto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhotos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photos")(js.undefined)
        ret
    }
    @scala.inline
    def withPlace_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("place_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlace_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("place_id")(js.undefined)
        ret
    }
    @scala.inline
    def withPlus_code(value: PlacePlusCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plus_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlus_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plus_code")(js.undefined)
        ret
    }
    @scala.inline
    def withPrice_level(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price_level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrice_level: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price_level")(js.undefined)
        ret
    }
    @scala.inline
    def withRating(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rating")(js.undefined)
        ret
    }
    @scala.inline
    def withReviews(value: js.Array[PlaceReview]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReviews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviews")(js.undefined)
        ret
    }
    @scala.inline
    def withTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withUser_ratings_total(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_ratings_total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser_ratings_total: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_ratings_total")(js.undefined)
        ret
    }
    @scala.inline
    def withUtc_offset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utc_offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtc_offset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utc_offset")(js.undefined)
        ret
    }
    @scala.inline
    def withUtc_offset_minutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utc_offset_minutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtc_offset_minutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utc_offset_minutes")(js.undefined)
        ret
    }
    @scala.inline
    def withVicinity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vicinity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVicinity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vicinity")(js.undefined)
        ret
    }
    @scala.inline
    def withWebsite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("website")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebsite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("website")(js.undefined)
        ret
    }
  }
  
}

