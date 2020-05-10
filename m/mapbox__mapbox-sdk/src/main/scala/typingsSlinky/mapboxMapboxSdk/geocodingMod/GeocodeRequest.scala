package typingsSlinky.mapboxMapboxSdk.geocodingMod

import typingsSlinky.mapboxGl.mod.LngLatLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeocodeRequest extends js.Object {
  /**
    * Forward geocoding only. Return autocomplete results or not. Options are  true or  false and the default is  true .
    */
  var autocomplete: js.UndefOr[Boolean] = js.native
  /**
    * Forward geocoding only. Limit results to a bounding box. Options are in the format  minX,minY,maxX,maxY .
    */
  var bbox: js.UndefOr[BoundingBox] = js.native
  /**
    * Limit results to one or more countries. Options are ISO 3166 alpha 2 country codes
    */
  var countries: js.UndefOr[js.Array[String]] = js.native
  /**
    * Specify the language to use for response text and, for forward geocoding, query result weighting.
    * Options are IETF language tags comprised of a mandatory ISO 639-1 language code and optionally one or more
    * IETF subtags for country or script.
    */
  var language: js.UndefOr[js.Array[String]] = js.native
  /**
    * Limit the number of results returned. The default is  5 for forward geocoding and  1 for reverse geocoding.
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * Either  mapbox.places for ephemeral geocoding, or  mapbox.places-permanent for storing results and batch geocoding.
    */
  var mode: GeocodeMode = js.native
  /**
    * Bias local results based on a provided location. Options are  longitude,latitude coordinates.
    */
  var proximity: js.UndefOr[js.Array[Double]] = js.native
  /**
    * A location. This will be a place name for forward geocoding or a coordinate pair (longitude, latitude) for reverse geocoding.
    */
  var query: String | LngLatLike = js.native
  /**
    * Filter results by one or more feature types
    */
  var types: js.UndefOr[js.Array[GeocodeQueryType]] = js.native
}

object GeocodeRequest {
  @scala.inline
  def apply(mode: GeocodeMode, query: String | LngLatLike): GeocodeRequest = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocodeRequest]
  }
  @scala.inline
  implicit class GeocodeRequestOps[Self <: GeocodeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(value: GeocodeMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: String | LngLatLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutocomplete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocomplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutocomplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocomplete")(js.undefined)
        ret
    }
    @scala.inline
    def withBbox(value: BoundingBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bbox")(js.undefined)
        ret
    }
    @scala.inline
    def withCountries(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countries")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: js.Array[String]): Self = {
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
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withProximity(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proximity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProximity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proximity")(js.undefined)
        ret
    }
    @scala.inline
    def withTypes(value: js.Array[GeocodeQueryType]): Self = {
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
  }
  
}

