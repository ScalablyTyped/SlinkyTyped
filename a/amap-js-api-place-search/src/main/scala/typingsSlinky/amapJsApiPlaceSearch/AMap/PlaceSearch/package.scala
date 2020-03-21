package typingsSlinky.amapJsApiPlaceSearch.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PlaceSearch {
  type Poi = typingsSlinky.amapJsApiPlaceSearch.AMap.PlaceSearch.PoiBase | typingsSlinky.amapJsApiPlaceSearch.AMap.PlaceSearch.PoiExt
  type PoiExt = typingsSlinky.amapJsApiPlaceSearch.AnonAdcode with typingsSlinky.amapJsApiPlaceSearch.AMap.PlaceSearch.PoiBase with (typingsSlinky.amapJsApiPlaceSearch.AnonIndoordata | typingsSlinky.amapJsApiPlaceSearch.AnonIndoormap) with (typingsSlinky.amapJsApiPlaceSearch.AnonCinema | typingsSlinky.amapJsApiPlaceSearch.AnonDeeptype | typingsSlinky.amapJsApiPlaceSearch.AnonScenic | typingsSlinky.amapJsApiPlaceSearch.AnonHotel)
  type SelectChangeEvent[N /* <: java.lang.String */, E] = typingsSlinky.amapJsApi.AMap.Event_[
    N, 
    typingsSlinky.amapJsApiPlaceSearch.AMap.PlaceSearch.SelectChangeEventData with typingsSlinky.amapJsApiPlaceSearch.AnonEvent[E]
  ]
}
