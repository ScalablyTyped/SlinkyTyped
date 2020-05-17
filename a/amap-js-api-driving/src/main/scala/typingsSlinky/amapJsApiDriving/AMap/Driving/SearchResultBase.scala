package typingsSlinky.amapJsApiDriving.AMap.Driving

import typingsSlinky.amapJsApi.AMap.LngLat
import typingsSlinky.amapJsApiDriving.anon.PoiisWaypointboolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchResultBase
  extends SearchResultCommon
     with SearchResult {
  /**
    * 驾车规划终点
    */
  var end: Poi = js.native
  /**
    * 驾车规划起点
    */
  var start: Poi = js.native
  /**
    * 驾车规划途经点
    */
  var waypoints: js.Array[PoiisWaypointboolean] = js.native
}

object SearchResultBase {
  @scala.inline
  def apply(
    destination: LngLat,
    end: Poi,
    info: String,
    origin: LngLat,
    routes: js.Array[DriveRoute],
    start: Poi,
    waypoints: js.Array[PoiisWaypointboolean]
  ): SearchResultBase = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], waypoints = waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResultBase]
  }
  @scala.inline
  implicit class SearchResultBaseOps[Self <: SearchResultBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: Poi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: Poi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaypoints(value: js.Array[PoiisWaypointboolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waypoints")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

