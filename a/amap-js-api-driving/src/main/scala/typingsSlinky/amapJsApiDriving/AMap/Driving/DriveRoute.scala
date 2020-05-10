package typingsSlinky.amapJsApiDriving.AMap.Driving

import typingsSlinky.amapJsApiDriving.amapJsApiDrivingNumbers.`0`
import typingsSlinky.amapJsApiDriving.amapJsApiDrivingNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DriveRoute extends js.Object {
  /**
    * 起点到终点的驾车距离，单位：米
    */
  var distance: Double = js.native
  /**
    * 驾车规划策略
    */
  var policy: String = js.native
  /**
    * 限行结果
    * 0 代表限行已规避或未限行，即该路线没有限行路段
    * 1 代表限行无法规避，即该线路有限行路段
    */
  var restriction: `0` | `1` = js.native
  /**
    * 子路段DriveStep集合
    */
  var steps: js.Array[DriveStep] = js.native
  /**
    * 时间预计，单位：秒
    */
  var time: Double = js.native
  /**
    * 此驾车路线收费金额，单位：元
    */
  var tolls: Double = js.native
  /**
    * 收费路段长度，单位：米
    */
  var tolls_distance: Double = js.native
}

object DriveRoute {
  @scala.inline
  def apply(
    distance: Double,
    policy: String,
    restriction: `0` | `1`,
    steps: js.Array[DriveStep],
    time: Double,
    tolls: Double,
    tolls_distance: Double
  ): DriveRoute = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], restriction = restriction.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], tolls = tolls.asInstanceOf[js.Any], tolls_distance = tolls_distance.asInstanceOf[js.Any])
    __obj.asInstanceOf[DriveRoute]
  }
  @scala.inline
  implicit class DriveRouteOps[Self <: DriveRoute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestriction(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restriction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSteps(value: js.Array[DriveStep]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTolls(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tolls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTolls_distance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tolls_distance")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

