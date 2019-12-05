package typingsSlinky.amapDashJsDashApiDashArrivalDashRange.AMap

import typingsSlinky.amapDashJsDashApi.AMap.EventEmitter
import typingsSlinky.amapDashJsDashApi.AMap.LocationValue
import typingsSlinky.amapDashJsDashApiDashArrivalDashRange.AMap.ArrivalRange.SearchOptions
import typingsSlinky.amapDashJsDashApiDashArrivalDashRange.AMap.ArrivalRange.SearchResult
import typingsSlinky.amapDashJsDashApiDashArrivalDashRange.AMap.ArrivalRange.SearchStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 公交到达圈展示
  */
@JSGlobal("AMap.ArrivalRange")
@js.native
class ArrivalRange_ () extends EventEmitter {
  /**
    * 计算某个时间段内用户通过公交出行可到达的距离范围
    * @param origin 起始点
    * @param time 时间
    * @param callback 回调
    * @param opts 选项
    */
  def search(
    origin: LocationValue,
    time: Double,
    callback: js.Function2[/* status */ SearchStatus, /* result */ String | SearchResult, Unit]
  ): Unit = js.native
  def search(
    origin: LocationValue,
    time: Double,
    callback: js.Function2[/* status */ SearchStatus, /* result */ String | SearchResult, Unit],
    opts: SearchOptions
  ): Unit = js.native
}

