package typingsSlinky.amapJsApiTransfer.AMap.Transfer

import typingsSlinky.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WalkStep extends js.Object {
  /**
    * 本步行子路段完成后动作
    */
  var action: String = js.native
  /**
    * 步行子路段完成后辅助动作，一般为到达某个公交站点或目的地时返回
    */
  var assist_action: String = js.native
  /**
    * 步行子路段距离，单位：米
    */
  var distance: Double = js.native
  /**
    * 步行子路段描述
    */
  var instruction: String = js.native
  /**
    * 步行子路段坐标集合
    */
  var path: js.Array[LngLat] = js.native
  /**
    * 道路
    */
  var road: String = js.native
  /**
    * 步行子路段预计使用时间，单位：秒
    */
  var time: Double = js.native
}

object WalkStep {
  @scala.inline
  def apply(
    action: String,
    assist_action: String,
    distance: Double,
    instruction: String,
    path: js.Array[LngLat],
    road: String,
    time: Double
  ): WalkStep = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], assist_action = assist_action.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], road = road.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalkStep]
  }
  @scala.inline
  implicit class WalkStepOps[Self <: WalkStep] (val x: Self) extends AnyVal {
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
    def withAssist_action(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assist_action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstruction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instruction")(value.asInstanceOf[js.Any])
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
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

