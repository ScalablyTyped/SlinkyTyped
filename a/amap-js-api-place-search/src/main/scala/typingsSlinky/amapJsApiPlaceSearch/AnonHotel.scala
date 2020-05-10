package typingsSlinky.amapJsApiPlaceSearch

import typingsSlinky.amapJsApiPlaceSearch.AMap.PlaceSearch.Hotel
import typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.HOTEL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHotel extends js.Object {
  var deep_type: HOTEL = js.native
  /**
    * @deprecated 酒店类深度信息
    */
  var hotel: Hotel = js.native
}

object AnonHotel {
  @scala.inline
  def apply(deep_type: HOTEL, hotel: Hotel): AnonHotel = {
    val __obj = js.Dynamic.literal(deep_type = deep_type.asInstanceOf[js.Any], hotel = hotel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHotel]
  }
  @scala.inline
  implicit class AnonHotelOps[Self <: AnonHotel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeep_type(value: HOTEL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHotel(value: Hotel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hotel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

