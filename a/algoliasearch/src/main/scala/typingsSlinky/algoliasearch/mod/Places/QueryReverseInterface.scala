package typingsSlinky.algoliasearch.mod.Places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Params for endpoint reverse.
  * https://community.algolia.com/places/api-clients.html#reverse-geocoding
  */
@js.native
trait QueryReverseInterface extends js.Object {
  /**
    * Force to first search around a specific latitude longitude.
    * The option value must be provided as a string: latitude,longitude like 12.232,23.1.
    * The default is to search around the location of the user determined via their IP address (geoip).
    * https://community.algolia.com/places/api-clients.html#api-options-aroundLatLng
    */
  var aroundLatLng: String = js.native
  /**
    * Restrict the search results to a specific type.
    * https://community.algolia.com/places/api-clients.html#api-options-type
    */
  var hitsPerPage: js.UndefOr[Double] = js.native
}

object QueryReverseInterface {
  @scala.inline
  def apply(aroundLatLng: String): QueryReverseInterface = {
    val __obj = js.Dynamic.literal(aroundLatLng = aroundLatLng.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryReverseInterface]
  }
  @scala.inline
  implicit class QueryReverseInterfaceOps[Self <: QueryReverseInterface] (val x: Self) extends AnyVal {
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
  }
  
}

