package typingsSlinky.amapJsApiTransfer.AMap.Transfer

import typingsSlinky.amapJsApi.AMap.LngLat
import typingsSlinky.amapJsApiPlaceSearch.AMap.PlaceSearch.PoiExt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.amapJsApiTransfer.AMap.Transfer.SearchResultBase
  - typingsSlinky.amapJsApiTransfer.AMap.Transfer.SearchResultExt
*/
trait SearchResult extends js.Object
object SearchResult {
  
  @scala.inline
  def SearchResultBase(
    destination: LngLat,
    info: String,
    origin: LngLat,
    plans: js.Array[TransferPlan],
    taxi_cost: Double
  ): SearchResult = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], plans = plans.asInstanceOf[js.Any], taxi_cost = taxi_cost.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
  
  @scala.inline
  def SearchResultExt(
    destination: LngLat,
    destinationName: String,
    end: PoiExt,
    info: String,
    origin: LngLat,
    originName: String,
    plans: js.Array[TransferPlan],
    start: PoiExt,
    taxi_cost: Double
  ): SearchResult = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], destinationName = destinationName.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], originName = originName.asInstanceOf[js.Any], plans = plans.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], taxi_cost = taxi_cost.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
}
