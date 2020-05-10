package typingsSlinky.amapJsApiDriving.AMap.Driving

import typingsSlinky.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DriveStep extends js.Object {
  /**
    * 本驾车子路段完成后动作
    */
  var action: String = js.native
  /**
    * 驾车子路段完成后辅助动作，一般为到达某个目的地时返回
    */
  var assistant_action: String = js.native
  /**
    * 途径城市列表
    */
  var cities: js.UndefOr[js.Array[ViaCity]] = js.native
  /**
    * 此路段距离，单位：米
    */
  var distance: Double = js.native
  /**
    * 此路段终点
    */
  var end_location: LngLat = js.native
  /**
    * 此路段说明
    */
  var instruction: String = js.native
  /**
    * 驾车方向
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
    * 此路段起点
    */
  var start_location: LngLat = js.native
  /**
    * 此路段预计使用时间，单位：秒
    */
  var time: Double = js.native
  /**
    * 实时交通信息列表
    */
  var tmcs: js.UndefOr[js.Array[TMC]] = js.native
  var tmcsPaths: js.UndefOr[js.Array[TMCsPath]] = js.native
  /**
    * 收费路段长度，单位：米
    */
  var toll_distance: Double = js.native
  /**
    * 主要收费道路
    */
  var toll_road: String = js.native
  /**
    * 此段收费，单位：元
    */
  var tolls: Double = js.native
}

object DriveStep {
  @scala.inline
  def apply(
    action: String,
    assistant_action: String,
    distance: Double,
    end_location: LngLat,
    instruction: String,
    orientation: String,
    path: js.Array[LngLat],
    road: String,
    start_location: LngLat,
    time: Double,
    toll_distance: Double,
    toll_road: String,
    tolls: Double
  ): DriveStep = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], assistant_action = assistant_action.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], end_location = end_location.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], road = road.asInstanceOf[js.Any], start_location = start_location.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], toll_distance = toll_distance.asInstanceOf[js.Any], toll_road = toll_road.asInstanceOf[js.Any], tolls = tolls.asInstanceOf[js.Any])
    __obj.asInstanceOf[DriveStep]
  }
  @scala.inline
  implicit class DriveStepOps[Self <: DriveStep] (val x: Self) extends AnyVal {
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
    def withAssistant_action(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assistant_action")(value.asInstanceOf[js.Any])
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
    def withToll_distance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toll_distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToll_road(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toll_road")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTolls(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tolls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCities(value: js.Array[ViaCity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cities")(js.undefined)
        ret
    }
    @scala.inline
    def withTmcs(value: js.Array[TMC]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tmcs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTmcs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tmcs")(js.undefined)
        ret
    }
    @scala.inline
    def withTmcsPaths(value: js.Array[TMCsPath]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tmcsPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTmcsPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tmcsPaths")(js.undefined)
        ret
    }
  }
  
}

