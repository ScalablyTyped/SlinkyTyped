package typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PlaceSearch {
  import typingsSlinky.amapDashJsDashApi.AMap.Event
  import typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.Anon_Adcode
  import typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.Anon_CINEMA
  import typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.Anon_DINING
  import typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.Anon_Deeptype
  import typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.Anon_DeeptypeHOTEL
  import typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.Anon_EventE
  import typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.Anon_False
  import typingsSlinky.amapDashJsDashApiDashPlaceDashSearch.Anon_Indoordata

  type Poi = PoiBase | PoiExt
  type PoiExt = Anon_Adcode with PoiBase with (Anon_Indoordata | Anon_False) with (Anon_CINEMA | Anon_DINING | Anon_Deeptype | Anon_DeeptypeHOTEL)
  type SelectChangeEvent[N /* <: String */, E] = Event[N, SelectChangeEventData with Anon_EventE[E]]
}
