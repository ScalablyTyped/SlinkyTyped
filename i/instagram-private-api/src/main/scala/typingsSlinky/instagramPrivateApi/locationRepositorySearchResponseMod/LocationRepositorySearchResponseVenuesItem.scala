package typingsSlinky.instagramPrivateApi.locationRepositorySearchResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationRepositorySearchResponseVenuesItem extends js.Object {
  var address: String = js.native
  var external_id: String = js.native
  var external_id_source: String = js.native
  var lat: Double = js.native
  var lng: Double = js.native
  var minimum_age: Double = js.native
  var name: String = js.native
}

object LocationRepositorySearchResponseVenuesItem {
  @scala.inline
  def apply(
    address: String,
    external_id: String,
    external_id_source: String,
    lat: Double,
    lng: Double,
    minimum_age: Double,
    name: String
  ): LocationRepositorySearchResponseVenuesItem = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], external_id = external_id.asInstanceOf[js.Any], external_id_source = external_id_source.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any], minimum_age = minimum_age.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationRepositorySearchResponseVenuesItem]
  }
  @scala.inline
  implicit class LocationRepositorySearchResponseVenuesItemOps[Self <: LocationRepositorySearchResponseVenuesItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternal_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternal_id_source(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_id_source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLng(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lng")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimum_age(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum_age")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

