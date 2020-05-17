package typingsSlinky.amapJsApiPlaceSearch.anon

import typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.CINEMA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cinema extends js.Object {
  /**
    * @deprecated 影院类深度信息
    */
  var cinema: typingsSlinky.amapJsApiPlaceSearch.AMap.PlaceSearch.Cinema = js.native
  var deep_type: CINEMA = js.native
}

object Cinema {
  @scala.inline
  def apply(cinema: typingsSlinky.amapJsApiPlaceSearch.AMap.PlaceSearch.Cinema, deep_type: CINEMA): Cinema = {
    val __obj = js.Dynamic.literal(cinema = cinema.asInstanceOf[js.Any], deep_type = deep_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cinema]
  }
  @scala.inline
  implicit class CinemaOps[Self <: Cinema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCinema(value: typingsSlinky.amapJsApiPlaceSearch.AMap.PlaceSearch.Cinema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cinema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeep_type(value: CINEMA): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep_type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

