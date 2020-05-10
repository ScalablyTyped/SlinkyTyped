package typingsSlinky.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAutosuggestOptions extends js.Object {
  /** Specifies if street address suggestions should be returned. Default: true */
  var addressSuggestions: js.UndefOr[Boolean] = js.native
  /**
    * Specifies if the user’s location should be auto detected using their IP address, if no location information is provided
    * in the userLocation property. Default: true
    */
  var autoDetectLocation: js.UndefOr[Boolean] = js.native
  /**
    * A bounding box that is used to help influence the results such that locations that are in or near this bounding box
    * are given more weight than they would normally.
    */
  var bounds: js.UndefOr[LocationRect] = js.native
  /**
    * A string specifying the ISO 3166-1 alpha-2 country region code which is used to limit suggests to a single country.
    * https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2
    */
  var countryCode: js.UndefOr[String] = js.native
  /**
    * A reference to a map instance. If the useMapView property is set to true, the bounding box of the map view will be used
    * to influence the weight of suggestions.
    */
  var map: js.UndefOr[Map] = js.native
  /** The maximum number of results to return. Can be any value between 1 and 10. Default: 5 */
  var maxResults: js.UndefOr[Double] = js.native
  /** Specifies if place suggestions (city, landmark, etc.) should be returned. Default: true */
  var placeSuggestions: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if the maps bounding box should be used to influence the suggested results. Ignored if the bounds property is
    * set. Default: true
    */
  var useMapView: js.UndefOr[Boolean] = js.native
  /** A coordinate indicating where the user is located. This will influence the results to be more relevant to the user. */
  var userLocation: js.UndefOr[Location] = js.native
}

object IAutosuggestOptions {
  @scala.inline
  def apply(): IAutosuggestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAutosuggestOptions]
  }
  @scala.inline
  implicit class IAutosuggestOptionsOps[Self <: IAutosuggestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddressSuggestions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressSuggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddressSuggestions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressSuggestions")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoDetectLocation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDetectLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoDetectLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDetectLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withBounds(value: LocationRect): Self = {
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
    def withCountryCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountryCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryCode")(js.undefined)
        ret
    }
    @scala.inline
    def withMap(value: Map): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceSuggestions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeSuggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceSuggestions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeSuggestions")(js.undefined)
        ret
    }
    @scala.inline
    def withUseMapView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMapView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseMapView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMapView")(js.undefined)
        ret
    }
    @scala.inline
    def withUserLocation(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userLocation")(js.undefined)
        ret
    }
  }
  
}

