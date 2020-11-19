package typingsSlinky.amapJsApiRiding.AMap.Riding

import typingsSlinky.amapJsApi.AMap.LngLat
import typingsSlinky.amapJsApiPlaceSearch.AMap.PlaceSearch.PoiExt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.amapJsApiRiding.AMap.Riding.SearchResultBase
  - typingsSlinky.amapJsApiRiding.AMap.Riding.SearchResultExt
*/
trait SearchResult extends js.Object
object SearchResult {
  
  @scala.inline
  def SearchResultBase(count: Double, destination: LngLat, info: String, origin: LngLat, routes: js.Array[RideRoute]): SearchResult = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
  
  @scala.inline
  def SearchResultExt(
    count: Double,
    destination: LngLat,
    destinationName: String,
    end: PoiExt,
    info: String,
    origin: LngLat,
    originName: String,
    routes: js.Array[RideRoute],
    start: PoiExt
  ): SearchResult = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], destinationName = destinationName.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], originName = originName.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
}
