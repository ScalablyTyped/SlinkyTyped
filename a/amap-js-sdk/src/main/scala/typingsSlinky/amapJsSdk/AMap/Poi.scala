package typingsSlinky.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Poi extends js.Object {
  var adcode: String = js.native
  var address: String = js.native
  var adname: String = js.native
  var citycode: String = js.native
  var cityname: String = js.native
  var discount: Boolean = js.native
  var distance: Double = js.native
  var email: String = js.native
  var entr_location: LngLat = js.native
  var exit_location: LngLat = js.native
  var groupbuy: Boolean = js.native
  var id: String = js.native
  var location: LngLat = js.native
  var name: String = js.native
  var pcode: String = js.native
  var pname: String = js.native
  var postcode: String = js.native
  var tel: String = js.native
  var `type`: String = js.native
  var website: String = js.native
}

object Poi {
  @scala.inline
  def apply(
    adcode: String,
    address: String,
    adname: String,
    citycode: String,
    cityname: String,
    discount: Boolean,
    distance: Double,
    email: String,
    entr_location: LngLat,
    exit_location: LngLat,
    groupbuy: Boolean,
    id: String,
    location: LngLat,
    name: String,
    pcode: String,
    pname: String,
    postcode: String,
    tel: String,
    `type`: String,
    website: String
  ): Poi = {
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], adname = adname.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], cityname = cityname.asInstanceOf[js.Any], discount = discount.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], entr_location = entr_location.asInstanceOf[js.Any], exit_location = exit_location.asInstanceOf[js.Any], groupbuy = groupbuy.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pcode = pcode.asInstanceOf[js.Any], pname = pname.asInstanceOf[js.Any], postcode = postcode.asInstanceOf[js.Any], tel = tel.asInstanceOf[js.Any], website = website.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Poi]
  }
  @scala.inline
  implicit class PoiOps[Self <: Poi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdcode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adcode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCitycode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("citycode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCityname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cityname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiscount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntr_location(value: LngLat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entr_location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExit_location(value: LngLat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit_location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupbuy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupbuy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: LngLat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPcode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pcode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostcode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postcode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebsite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("website")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

