package typingsSlinky.amapJsApiPlaceSearch

import typingsSlinky.amapJsApiPlaceSearch.AMap.PlaceSearch.Cinema
import typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.CINEMA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCinema extends js.Object {
  /**
    * @deprecated 影院类深度信息
    */
  var cinema: Cinema
  var deep_type: CINEMA
}

object AnonCinema {
  @scala.inline
  def apply(cinema: Cinema, deep_type: CINEMA): AnonCinema = {
    val __obj = js.Dynamic.literal(cinema = cinema.asInstanceOf[js.Any], deep_type = deep_type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCinema]
  }
}

