package typingsSlinky.heremaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBaseTime extends js.Object {
  var baseTime: Double = js.native
  var distance: Double = js.native
  var flags: js.Array[String] = js.native
  var text: String = js.native
  var trafficTime: Double = js.native
  var travelTime: Double = js.native
}

object AnonBaseTime {
  @scala.inline
  def apply(
    baseTime: Double,
    distance: Double,
    flags: js.Array[String],
    text: String,
    trafficTime: Double,
    travelTime: Double
  ): AnonBaseTime = {
    val __obj = js.Dynamic.literal(baseTime = baseTime.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], trafficTime = trafficTime.asInstanceOf[js.Any], travelTime = travelTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBaseTime]
  }
  @scala.inline
  implicit class AnonBaseTimeOps[Self <: AnonBaseTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrafficTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trafficTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTravelTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("travelTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

