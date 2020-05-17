package typingsSlinky.amapJsApiDriving.AMap.Driving

import typingsSlinky.amapJsApi.AMap.LngLat
import typingsSlinky.amapJsApiDriving.anon.IsWaypoint
import typingsSlinky.amapJsApiPlaceSearch.AMap.PlaceSearch.PoiExt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchResultExt
  extends SearchResultCommon
     with SearchResult {
  /**
    * 驾车规划终点名称
    */
  var destinationName: String = js.native
  /**
    * 驾车规划终点
    */
  var end: PoiExt = js.native
  /**
    * 驾车规划起点名称
    */
  var originName: String = js.native
  /**
    * 驾车规划起点
    */
  var start: PoiExt = js.native
  /**
    * 驾车规划途经点
    */
  var waypoints: js.Array[PoiExt with IsWaypoint] = js.native
}

object SearchResultExt {
  @scala.inline
  def apply(
    destination: LngLat,
    destinationName: String,
    end: PoiExt,
    info: String,
    origin: LngLat,
    originName: String,
    routes: js.Array[DriveRoute],
    start: PoiExt,
    waypoints: js.Array[PoiExt with IsWaypoint]
  ): SearchResultExt = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], destinationName = destinationName.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], originName = originName.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], waypoints = waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResultExt]
  }
  @scala.inline
  implicit class SearchResultExtOps[Self <: SearchResultExt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: PoiExt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: PoiExt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaypoints(value: js.Array[PoiExt with IsWaypoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waypoints")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

