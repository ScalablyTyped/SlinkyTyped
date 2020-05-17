package typingsSlinky.googleMaps.anon

import typingsSlinky.googleMaps.mod.AddressGeometry
import typingsSlinky.googleMaps.mod.AlternativePlaceId
import typingsSlinky.googleMaps.mod.OpeningHours
import typingsSlinky.googleMaps.mod.PlaceIdScope
import typingsSlinky.googleMaps.mod.PlacePhoto
import typingsSlinky.googleMaps.mod.PlaceType1
import typingsSlinky.googleMaps.mod.PlaceType2
import typingsSlinky.googleMaps.mod.PlusCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@google/maps.@google/maps.PlaceSearchResult> */
@js.native
trait PartialPlaceSearchResult extends js.Object {
  var alt_ids: js.UndefOr[js.Array[AlternativePlaceId]] = js.native
  var formatted_address: js.UndefOr[String] = js.native
  var geometry: js.UndefOr[AddressGeometry] = js.native
  var icon: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var opening_hours: js.UndefOr[OpeningHours] = js.native
  var permanently_closed: js.UndefOr[Boolean] = js.native
  var photos: js.UndefOr[js.Array[PlacePhoto]] = js.native
  var place_id: js.UndefOr[String] = js.native
  var plus_code: js.UndefOr[PlusCode] = js.native
  var price_level: js.UndefOr[Double] = js.native
  var rating: js.UndefOr[Double] = js.native
  var scope: js.UndefOr[PlaceIdScope] = js.native
  var types: js.UndefOr[js.Array[PlaceType1 | PlaceType2]] = js.native
  var vicinity: js.UndefOr[String] = js.native
}

object PartialPlaceSearchResult {
  @scala.inline
  def apply(): PartialPlaceSearchResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPlaceSearchResult]
  }
  @scala.inline
  implicit class PartialPlaceSearchResultOps[Self <: PartialPlaceSearchResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlt_ids(value: js.Array[AlternativePlaceId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlt_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt_ids")(js.undefined)
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
    def withGeometry(value: AddressGeometry): Self = {
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
    def withPlus_code(value: PlusCode): Self = {
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
    def withScope(value: PlaceIdScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withTypes(value: js.Array[PlaceType1 | PlaceType2]): Self = {
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
  }
  
}

