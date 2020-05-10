package typingsSlinky.amapJsApiTransfer.AMap.Transfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RailwayDetailsBase extends RailwayDetails {
  /**
    * 火车到站信息
    */
  var arrival_stop: RailStop = js.native
  /**
    * 火车始发站信息
    */
  var departure_stop: RailStop = js.native
  /**
    * 该换乘段的行车总距离
    */
  var distance: Double = js.native
  /**
    * 线路id编码
    */
  var id: String = js.native
  /**
    * 线路名称
    */
  var name: String = js.native
  /**
    * 仓位及价格信息
    */
  var spaces: js.Array[Space] = js.native
  /**
    * 该线路车段耗时
    */
  var time: Double = js.native
  /**
    * 线路车次号
    */
  var trip: String = js.native
  /**
    * 线路车次类型，参考火车路线类型列表
    */
  var `type`: String = js.native
}

object RailwayDetailsBase {
  @scala.inline
  def apply(
    arrival_stop: RailStop,
    departure_stop: RailStop,
    distance: Double,
    id: String,
    name: String,
    spaces: js.Array[Space],
    time: Double,
    trip: String,
    `type`: String
  ): RailwayDetailsBase = {
    val __obj = js.Dynamic.literal(arrival_stop = arrival_stop.asInstanceOf[js.Any], departure_stop = departure_stop.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], spaces = spaces.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], trip = trip.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RailwayDetailsBase]
  }
  @scala.inline
  implicit class RailwayDetailsBaseOps[Self <: RailwayDetailsBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrival_stop(value: RailStop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrival_stop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeparture_stop(value: RailStop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("departure_stop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaces(value: js.Array[Space]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

