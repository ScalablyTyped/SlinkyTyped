package typingsSlinky.amapJsApiPlaceSearch.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PlaceSearch {
  type PoiExt = typingsSlinky.amapJsApiPlaceSearch.anon.Adcode with typingsSlinky.amapJsApiPlaceSearch.AMap.PlaceSearch.PoiBase with (typingsSlinky.amapJsApiPlaceSearch.anon.Indoordata | typingsSlinky.amapJsApiPlaceSearch.anon.Indoormap) with (typingsSlinky.amapJsApiPlaceSearch.anon.Cinema | typingsSlinky.amapJsApiPlaceSearch.anon.Deeptype | typingsSlinky.amapJsApiPlaceSearch.anon.Scenic | typingsSlinky.amapJsApiPlaceSearch.anon.Hotel)
  type SelectChangeEvent[N /* <: java.lang.String */, E] = typingsSlinky.amapJsApi.AMap.Event_[
    N, 
    typingsSlinky.amapJsApiPlaceSearch.AMap.PlaceSearch.SelectChangeEventData with typingsSlinky.amapJsApiPlaceSearch.anon.Event[E]
  ]
}
