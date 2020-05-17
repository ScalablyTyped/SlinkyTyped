package typingsSlinky.reactGeosuggest.mod

import typingsSlinky.googlemaps.google.maps.GeocoderResult
import typingsSlinky.reactGeosuggest.anon.Lat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Suggest extends js.Object {
  var gmaps: js.UndefOr[GeocoderResult] = js.native
  var label: String = js.native
  var location: Lat = js.native
  var placeId: String = js.native
}

object Suggest {
  @scala.inline
  def apply(label: String, location: Lat, placeId: String): Suggest = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], placeId = placeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Suggest]
  }
  @scala.inline
  implicit class SuggestOps[Self <: Suggest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: Lat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGmaps(value: GeocoderResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGmaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmaps")(js.undefined)
        ret
    }
  }
  
}

