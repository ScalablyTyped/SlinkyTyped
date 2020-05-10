package typingsSlinky.leafletGeocoderMapzen.mod.Control_

import typingsSlinky.leaflet.mod.LatLngBounds_
import typingsSlinky.leaflet.mod.LatLng_
import typingsSlinky.leaflet.mod.MarkerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeocoderOptions extends js.Object {
  /**
    * Attribution text to include.
    * Set to blank or null to disable.
    *
    * Default value: 'Geocoding by <a href="https://mapzen.com/projects/search/">Mapzen</a>'
    */
  var attribution: js.UndefOr[String] = js.native
  /**
    * If true, suggested results are fetched on each keystroke.
    * If false, this is disabled and users must obtain results
    * by pressing the Enter key after typing in their query.
    *
    * Default value: true
    */
  var autocomplete: js.UndefOr[Boolean] = js.native
  /**
    * If true, search is bounded by the current map view.
    * You may also provide a custom bounding box in form of a LatLngBounds object.
    * Note: bounds is not supported by autocomplete.
    *
    * Default value: false.
    */
  var bounds: js.UndefOr[LatLngBounds_ | Boolean] = js.native
  /**
    * If true, the search input is always expanded.
    * It does not collapse into a button-only state.
    *
    * Default value: false
    */
  var expanded: js.UndefOr[Boolean] = js.native
  /**
    * If true, search and autocomplete prioritizes results near the center
    * of the current view.
    * You may also provide a custom LatLng value
    * (in any of the accepted Leaflet formats) to act as the center bias.
    *
    * Default value: 'true'.
    */
  var focus: js.UndefOr[LatLng_ | Boolean] = js.native
  /**
    * If true, the input box will expand to take up the full width of the map container.
    * If an integer breakpoint is provided,
    * the full width applies only if the map container width is below this breakpoint.
    *
    * Default value: 650
    */
  var fullWidth: js.UndefOr[Double | Boolean] = js.native
  /**
    * Filters results by layers (documentation).
    * If left blank, results will come from all available layers.
    *
    * Default value: null.
    */
  var layers: js.UndefOr[String | js.Array[_]] = js.native
  /**
    * If true, search results drops Leaflet's default blue markers onto the map.
    * You may customize this marker's appearance and
    * behavior using Leaflet marker options.
    *
    * Default value: true
    */
  var markers: js.UndefOr[MarkerOptions | Boolean] = js.native
  /**
    * If true, highlighting a search result pans the map to that location.
    *
    * Default value: true
    */
  var panToPoint: js.UndefOr[Boolean] = js.native
  /**
    * An object of key-value pairs which will be serialized
    * into query parameters that will be passed to the API.
    * This allows custom queries that are not already supported
    * by the convenience options listed above.
    * For a full list of supported parameters,
    * please read the Mapzen Search documentation.
    *
    * IMPORTANT: some parameters only work with the /search endpoint,
    * and do not apply to /autocomplete requests!
    * All supplied parameters are passed through;
    * this library doesn't know which are valid parameters and which are not.
    * In the event that other options conflict with parameters passed through params,
    * the params option takes precedence.
    *
    * Default value: null.
    */
  var params: js.UndefOr[js.Object] = js.native
  /**
    * If true, selected results will make a request to the service /place endpoint.
    * If false, this is disabled.
    * The geocoder does not handle responses to /place,
    * you will need to do handle it yourself in the results event listener (see below).
    *
    * Default value: false
    */
  var place: js.UndefOr[Boolean] = js.native
  /**
    * Placeholder text to display in the search input box.
    * Set to blank or null to disable.
    *
    * Default value: 'Search'
    */
  var placeholder: js.UndefOr[String] = js.native
  /**
    * If true, an icon is used to indicate a polygonal result,
    * matching any non-"venue" or non-"address" layer type.
    * If false, no icon is displayed.
    * For custom icons, pass a string containing a path to the image.
    *
    * Default value: true
    */
  var polygonIcon: js.UndefOr[Boolean | String] = js.native
  /**
    * The position of the control (one of the map corners).
    * Can be 'topleft', 'topright', 'bottomleft', or 'bottomright'.
    *
    * Default value: 'topleft'.
    */
  var position: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PositionString */ js.Any
  ] = js.native
  /**
    * Tooltip text to display on the search icon. Set to blank or null to disable.
    *
    * Default value: 'Search'
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Host endpoint for a Pelias-compatible search API.
    *
    * Default value: 'https://search.mapzen.com/v1'.
    */
  var url: js.UndefOr[String] = js.native
}

object GeocoderOptions {
  @scala.inline
  def apply(): GeocoderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeocoderOptions]
  }
  @scala.inline
  implicit class GeocoderOptionsOps[Self <: GeocoderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttribution(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttribution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribution")(js.undefined)
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
    def withBounds(value: LatLngBounds_ | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(js.undefined)
        ret
    }
    @scala.inline
    def withExpanded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(js.undefined)
        ret
    }
    @scala.inline
    def withFocus(value: LatLng_ | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.undefined)
        ret
    }
    @scala.inline
    def withFullWidth(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withLayers(value: String | js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkers(value: MarkerOptions | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markers")(js.undefined)
        ret
    }
    @scala.inline
    def withPanToPoint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panToPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanToPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panToPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withPlace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("place")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("place")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withPolygonIcon(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolygonIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PositionString */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
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
  }
  
}

