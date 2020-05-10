package typingsSlinky.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeocodingComponents extends js.Object {
  /** matches all the administrative_area levels. */
  var administrative_area: js.UndefOr[String] = js.native
  /**
    * matches a country name or a two letter [ISO 3166-1](https://en.wikipedia.org/wiki/ISO_3166-1) country code.
    * **Note:** The API follows the ISO standard for defining countries, and the filtering works best when using
    * the corresponding ISO code of the country
    */
  var country: js.UndefOr[String | js.Array[String]] = js.native
  /** matches against `locality` and `sublocality` types. */
  var locality: js.UndefOr[String] = js.native
  /** matches `postal_code` and `postal_code_prefix`. */
  var postal_code: js.UndefOr[String] = js.native
  /** matches the long or short name of a route. */
  var route: js.UndefOr[String] = js.native
}

object GeocodingComponents {
  @scala.inline
  def apply(): GeocodingComponents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeocodingComponents]
  }
  @scala.inline
  implicit class GeocodingComponentsOps[Self <: GeocodingComponents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdministrative_area(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("administrative_area")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdministrative_area: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("administrative_area")(js.undefined)
        ret
    }
    @scala.inline
    def withCountry(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(js.undefined)
        ret
    }
    @scala.inline
    def withLocality(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locality")(js.undefined)
        ret
    }
    @scala.inline
    def withPostal_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postal_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostal_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postal_code")(js.undefined)
        ret
    }
    @scala.inline
    def withRoute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route")(js.undefined)
        ret
    }
  }
  
}

