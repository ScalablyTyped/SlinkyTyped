package typingsSlinky.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlacesNearbyRequest extends js.Object {
  /**
    * A term to be matched against all content that Google has indexed for this place, including but not limited to
    * name, type, and address, as well as customer reviews and other third-party content.
    */
  var keyword: js.UndefOr[String] = js.native
  /**
    * The language code, indicating in which language the results should be returned, if possible.
    * Note that we often update supported languages so this list may not be exhaustive.
    */
  var language: js.UndefOr[Language] = js.native
  /** The latitude/longitude around which to retrieve place information. This must be specified as latitude,longitude. */
  var location: LatLng = js.native
  /**
    * Restricts results to only those places within the specified range.
    * Valid values range between 0 (most affordable) to 4 (most expensive), inclusive.
    * The exact amount indicated by a specific value will vary from region to region.
    */
  var maxprice: js.UndefOr[Double] = js.native
  /**
    * Restricts results to only those places within the specified range.
    * Valid values range between 0 (most affordable) to 4 (most expensive), inclusive.
    * The exact amount indicated by a specific value will vary from region to region.
    */
  var minprice: js.UndefOr[Double] = js.native
  /**
    * A term to be matched against all content that Google has indexed for this place.
    * Equivalent to `keyword`. The `name` field is no longer restricted to place names.
    * Values in this field are combined with values in the `keyword` field and passed as part of the same search string.
    * We recommend using only the `keyword` parameter for all search terms.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Returns only those places that are open for business at the time the query is sent.
    * Places that do not specify opening hours in the Google Places database will not be returned if you include this parameter in your query.
    */
  var opennow: js.UndefOr[Boolean] = js.native
  /**
    * Returns the next 20 results from a previously run search.
    * Setting a pagetoken parameter will execute a search with the same parameters used previously —
    * all parameters other than pagetoken will be ignored.
    */
  var pagetoken: js.UndefOr[String] = js.native
  /**
    * Defines the distance (in meters) within which to return place results.
    * The maximum allowed radius is 50 000 meters.
    * Note that `radius` must not be included if `rankby=distance` is specified.
    */
  var radius: js.UndefOr[Double] = js.native
  /**
    * Specifies the order in which results are listed.
    * Note that `rankby` must not be included if `radius` is specified.
    *
    * @default PlacesNearbyRanking.prominence
    */
  var rankby: js.UndefOr[PlacesNearbyRanking] = js.native
  /**
    * Restricts the results to places matching the specified type.
    * Only one type may be specified (if more than one type is provided, all types following the first entry are ignored).
    */
  var `type`: js.UndefOr[PlaceType1 | PlaceType2] = js.native
}

object PlacesNearbyRequest {
  @scala.inline
  def apply(location: LatLng): PlacesNearbyRequest = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacesNearbyRequest]
  }
  @scala.inline
  implicit class PlacesNearbyRequestOps[Self <: PlacesNearbyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocation(value: LatLng): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyword")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: Language): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxprice(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxprice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxprice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxprice")(js.undefined)
        ret
    }
    @scala.inline
    def withMinprice(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minprice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinprice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minprice")(js.undefined)
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
    def withOpennow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opennow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpennow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opennow")(js.undefined)
        ret
    }
    @scala.inline
    def withPagetoken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagetoken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagetoken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagetoken")(js.undefined)
        ret
    }
    @scala.inline
    def withRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(js.undefined)
        ret
    }
    @scala.inline
    def withRankby(value: PlacesNearbyRanking): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rankby")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRankby: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rankby")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: PlaceType1 | PlaceType2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

