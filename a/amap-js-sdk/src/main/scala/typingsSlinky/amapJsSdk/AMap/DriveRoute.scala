package typingsSlinky.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DriveRoute extends js.Object {
  var distance: Double = js.native
  var policy: String = js.native
  var steps: js.Array[DriveStep] = js.native
  var time: Double = js.native
  var tolls: Double = js.native
  var tolls_distance: Double = js.native
}

object DriveRoute {
  @scala.inline
  def apply(
    distance: Double,
    policy: String,
    steps: js.Array[DriveStep],
    time: Double,
    tolls: Double,
    tolls_distance: Double
  ): DriveRoute = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], tolls = tolls.asInstanceOf[js.Any], tolls_distance = tolls_distance.asInstanceOf[js.Any])
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

