package typingsSlinky.amapJsApiRiding.AMap.Riding

import typingsSlinky.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchResultCommon extends js.Object {
  /**
    * 骑行导航路段数目
    */
  var count: Double = js.native
  /**
    * 骑行导航终点坐标
    */
  var destination: LngLat = js.native
  /**
    * 成功状态说明
    */
  var info: String = js.native
  /**
    * 骑行导航起点坐标
    */
  var origin: LngLat = js.native
  /**
    * 骑行规划路线列表
    */
  var routes: js.Array[RideRoute] = js.native
}

object SearchResultCommon {
  @scala.inline
  def apply(count: Double, destination: LngLat, info: String, origin: LngLat, routes: js.Array[RideRoute]): SearchResultCommon = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResultCommon]
  }
  @scala.inline
  implicit class SearchResultCommonOps[Self <: SearchResultCommon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestination(value: LngLat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrigin(value: LngLat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoutes(value: js.Array[RideRoute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

