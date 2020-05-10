package typingsSlinky.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DriveStep extends js.Object {
  var action: String = js.native
  var assist_action: String = js.native
  var cities: js.UndefOr[js.Array[ViaCity]] = js.native
  var distance: Double = js.native
  var end_location: LngLat = js.native
  var instruction: String = js.native
  var orientation: String = js.native
  var path: js.Array[LngLat] = js.native
  var road: String = js.native
  var start_location: LngLat = js.native
  var time: Double = js.native
  var tmcs: js.UndefOr[js.Array[TMC]] = js.native
  var toll_road: String = js.native
  var tolls: Double = js.native
  var tolls_distance: Double = js.native
}

object DriveStep {
  @scala.inline
  def apply(
    action: String,
    assist_action: String,
    distance: Double,
    end_location: LngLat,
    instruction: String,
    orientation: String,
    path: js.Array[LngLat],
    road: String,
    start_location: LngLat,
    time: Double,
    toll_road: String,
    tolls: Double,
    tolls_distance: Double
  ): DriveStep = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], assist_action = assist_action.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], end_location = end_location.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], road = road.asInstanceOf[js.Any], start_location = start_location.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], toll_road = toll_road.asInstanceOf[js.Any], tolls = tolls.asInstanceOf[js.Any], tolls_distance = tolls_distance.asInstanceOf[js.Any])
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
    def withTolls_distance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tolls_distance")(value.asInstanceOf[js.Any])
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
  }
  
}

