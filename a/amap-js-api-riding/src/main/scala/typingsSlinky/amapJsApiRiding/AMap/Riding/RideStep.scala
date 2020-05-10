package typingsSlinky.amapJsApiRiding.AMap.Riding

import typingsSlinky.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RideStep extends js.Object {
  /**
    * 本骑行子路段完成后动作
    */
  var action: String = js.native
  /**
    * @deprecated
    * 本骑行子路段完成后辅助动作，一般为到达某个目的地时返回
    * 文档中有此字段但是实际代码中并没有返回
    */
  var assist_action: js.UndefOr[String] = js.native
  /**
    * 此路段距离，单位：米
    */
  var distance: Double = js.native
  /**
    * 本路段的终点坐标
    */
  var end_location: LngLat = js.native
  /**
    * 此路段说明，如“沿北京南站路骑行565米右转”
    */
  var instruction: String = js.native
  /**
    * 步行方向
    */
  var orientation: String = js.native
  /**
    * 此路段坐标集合
    */
  var path: js.Array[LngLat] = js.native
  /**
    * 道路
    */
  var road: String = js.native
  /**
    * 本路段的起点坐标
    */
  var start_location: LngLat = js.native
  /**
    * 此路段预计使用时间，单位：秒
    */
  var time: Double = js.native
}

object RideStep {
  @scala.inline
  def apply(
    action: String,
    distance: Double,
    end_location: LngLat,
    instruction: String,
    orientation: String,
    path: js.Array[LngLat],
    road: String,
    start_location: LngLat,
    time: Double
  ): RideStep = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], end_location = end_location.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], road = road.asInstanceOf[js.Any], start_location = start_location.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[RideStep]
  }
  @scala.inline
  implicit class RideStepOps[Self <: RideStep] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd_location(value: LngLat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstruction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instruction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: js.Array[LngLat]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoad(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("road")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart_location(value: LngLat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssist_action(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assist_action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssist_action: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assist_action")(js.undefined)
        ret
    }
  }
  
}

