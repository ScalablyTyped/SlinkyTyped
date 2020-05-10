package typingsSlinky.algoliasearch.mod.Places

import typingsSlinky.algoliasearch.algoliasearchStrings.address
import typingsSlinky.algoliasearch.algoliasearchStrings.airport
import typingsSlinky.algoliasearch.algoliasearchStrings.busStop
import typingsSlinky.algoliasearch.algoliasearchStrings.city
import typingsSlinky.algoliasearch.algoliasearchStrings.country
import typingsSlinky.algoliasearch.algoliasearchStrings.townhall
import typingsSlinky.algoliasearch.algoliasearchStrings.trainStation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Restrict the search results to a specific type.
  * https://community.algolia.com/places/api-clients.html#api-options-type
  */
@js.native
trait QueryInterface extends js.Object {
  /**
    * Force to first search around a specific latitude longitude.
    * The option value must be provided as a string: latitude,longitude like 12.232,23.1.
    * The default is to search around the location of the user determined via their IP address (geoip).
    * https://community.algolia.com/places/api-clients.html#api-options-aroundLatLng
    */
  var aroundLatLng: js.UndefOr[String] = js.native
  /**
    * Whether or not to first search around the geolocation of the user found via their IP address. This is true by default.
    * https://community.algolia.com/places/api-clients.html#api-options-aroundLatLngViaIP
    */
  var aroundLatLngViaIP: js.UndefOr[String] = js.native
  /**
    * Radius in meters to search around the latitude/longitude. Otherwise a default radius is automatically computed given the area density.
    * https://community.algolia.com/places/api-clients.html#api-options-aroundRadius
    */
  var aroundRadius: js.UndefOr[Double] = js.native
  /**
    * If specified, restrict the search results to a specific list of comma-separated countries. You can pass two letters country codes (ISO 3166-1).
    * Default: Search on the whole planet.
    * Warning: country codes must be lower-cased.
    * https://community.algolia.com/places/api-clients.html#api-options-countries
    */
  var countries: js.UndefOr[String] = js.native
  /**
    * Controls whether the _rankingInfo object should be included in the hits. This defaults to false.
    * The _rankingInfo object for a Places query is slightly different from a regular Algolia query
    * and you can read up more about the difference and how to leverage them in our guide.
    * https://community.algolia.com/places/api-clients.html#api-options-getRankingInfo
    */
  var getRankingInfo: js.UndefOr[Boolean] = js.native
  /**
    * Restrict the search results to a specific type.
    * https://community.algolia.com/places/api-clients.html#api-options-type
    */
  var hitsPerPage: js.UndefOr[Double] = js.native
  /**
    * Query used to perform the search.
    */
  var query: js.UndefOr[String] = js.native
  /**
    * Restrict the search results to a specific type.
    * https://community.algolia.com/places/api-clients.html#api-options-type
    */
  var `type`: js.UndefOr[city | country | address | busStop | trainStation | townhall | airport] = js.native
}

object QueryInterface {
  @scala.inline
  def apply(): QueryInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryInterface]
  }
  @scala.inline
  implicit class QueryInterfaceOps[Self <: QueryInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAroundLatLng(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aroundLatLng")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAroundLatLng: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aroundLatLng")(js.undefined)
        ret
    }
    @scala.inline
    def withAroundLatLngViaIP(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aroundLatLngViaIP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAroundLatLngViaIP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aroundLatLngViaIP")(js.undefined)
        ret
    }
    @scala.inline
    def withAroundRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aroundRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAroundRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aroundRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withCountries(value: String): Self = {
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
    def withGetRankingInfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRankingInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetRankingInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRankingInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withHitsPerPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitsPerPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHitsPerPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitsPerPage")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: city | country | address | busStop | trainStation | townhall | airport): Self = {
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

