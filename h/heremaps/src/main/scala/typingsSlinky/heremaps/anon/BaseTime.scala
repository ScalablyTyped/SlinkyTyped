package typingsSlinky.heremaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseTime extends js.Object {
  var baseTime: Double = js.native
  var distance: Double = js.native
  var flags: js.Array[String] = js.native
  var text: String = js.native
  var trafficTime: Double = js.native
  var travelTime: Double = js.native
}

object BaseTime {
  @scala.inline
  def apply(
    baseTime: Double,
    distance: Double,
    flags: js.Array[String],
    text: String,
    trafficTime: Double,
    travelTime: Double
  ): BaseTime = {
    val __obj = js.Dynamic.literal(baseTime = baseTime.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], trafficTime = trafficTime.asInstanceOf[js.Any], travelTime = travelTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseTime]
  }
  @scala.inline
  implicit class BaseTimeOps[Self <: BaseTime] (val x: Self) extends AnyVal {
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

