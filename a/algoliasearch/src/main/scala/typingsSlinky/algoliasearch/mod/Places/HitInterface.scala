package typingsSlinky.algoliasearch.mod.Places

import typingsSlinky.algoliasearch.anon.Administrative
import typingsSlinky.algoliasearch.anon.Default
import typingsSlinky.algoliasearch.anon.Dictkey
import typingsSlinky.algoliasearch.anon.Lat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Hit of search.
  * https://community.algolia.com/places/api-clients.html#api-suggestion-name
  */
@js.native
trait HitInterface extends js.Object {
  /**
    * Associated list of latitude and longitude.
    * https://community.algolia.com/places/api-clients.html#api-suggestion-latlng
    */
  var _geoloc: Lat = js.native
  /**
    * The associated highlighting information.
    * https://community.algolia.com/places/api-clients.html#api-suggestion-highlightResult
    */
  var _highlightResult: Administrative = js.native
  var _tags: js.Array[String] = js.native
  var admin_level: Double = js.native
  /**
    * List of associated administrative region names.
    * https://community.algolia.com/places/api-clients.html#api-suggestion-administrative
    */
  var administrative: js.UndefOr[js.Array[String]] = js.native
  /**
    * https://community.algolia.com/places/api-clients.html#api-suggestion-city
    * List of the associated city names. If no language parameter is specified, retrieves all of them.
    */
  var city: js.UndefOr[Default] = js.native
  /**
    * Associated country name.
    * https://community.algolia.com/places/api-clients.html#api-suggestion-country
    */
  var country: Dictkey = js.native
  /**
    * Two letters country code (ISO 639-1).
    * https://community.algolia.com/places/api-clients.html#api-suggestion-countryCode
    */
  var country_code: String = js.native
  /**
    * List of the associated county names. If no language parameter is specified, retrieves all of them.
    * https://community.algolia.com/places/api-clients.html#api-suggestion-county
    */
  var county: js.UndefOr[Default] = js.native
  var district: js.UndefOr[String] = js.native
  var importance: Double = js.native
  var is_city: Boolean = js.native
  var is_country: Boolean = js.native
  var is_highway: Boolean = js.native
  var is_popular: Boolean = js.native
  var is_suburb: Boolean = js.native
  /**
    * https://community.algolia.com/places/api-clients.html#api-suggestion-name
    * List of names of the place. If no language parameter is specified, retrieves all of them.
    */
  var locale_names: Default = js.native
  var objectID: String = js.native
  /**
    * Associated population.
    * https://community.algolia.com/places/api-clients.html#api-suggestion-population
    */
  var population: js.UndefOr[Double] = js.native
  /**
    * List of associated postcodes.
    * https://community.algolia.com/places/api-clients.html#api-suggestion-postcode
    */
  var postcode: js.UndefOr[js.Array[String]] = js.native
}

object HitInterface {
  @scala.inline
  def apply(
    _geoloc: Lat,
    _highlightResult: Administrative,
    _tags: js.Array[String],
    admin_level: Double,
    country: Dictkey,
    country_code: String,
    importance: Double,
    is_city: Boolean,
    is_country: Boolean,
    is_highway: Boolean,
    is_popular: Boolean,
    is_suburb: Boolean,
    locale_names: Default,
    objectID: String
  ): HitInterface = {
    val __obj = js.Dynamic.literal(_geoloc = _geoloc.asInstanceOf[js.Any], _highlightResult = _highlightResult.asInstanceOf[js.Any], _tags = _tags.asInstanceOf[js.Any], admin_level = admin_level.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], country_code = country_code.asInstanceOf[js.Any], importance = importance.asInstanceOf[js.Any], is_city = is_city.asInstanceOf[js.Any], is_country = is_country.asInstanceOf[js.Any], is_highway = is_highway.asInstanceOf[js.Any], is_popular = is_popular.asInstanceOf[js.Any], is_suburb = is_suburb.asInstanceOf[js.Any], locale_names = locale_names.asInstanceOf[js.Any], objectID = objectID.asInstanceOf[js.Any])
    __obj.asInstanceOf[HitInterface]
  }
  @scala.inline
  implicit class HitInterfaceOps[Self <: HitInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_geoloc(value: Lat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_geoloc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_highlightResult(value: Administrative): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_highlightResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_tags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdmin_level(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("admin_level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountry(value: Dictkey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountry_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImportance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_city(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_country(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_highway(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_highway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_popular(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_popular")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_suburb(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_suburb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocale_names(value: Default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale_names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdministrative(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("administrative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdministrative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("administrative")(js.undefined)
        ret
    }
    @scala.inline
    def withCity(value: Default): Self = {
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
    def withCounty(value: Default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("county")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCounty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("county")(js.undefined)
        ret
    }
    @scala.inline
    def withDistrict(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("district")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("district")(js.undefined)
        ret
    }
    @scala.inline
    def withPopulation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("population")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopulation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("population")(js.undefined)
        ret
    }
    @scala.inline
    def withPostcode(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postcode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostcode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postcode")(js.undefined)
        ret
    }
  }
  
}

