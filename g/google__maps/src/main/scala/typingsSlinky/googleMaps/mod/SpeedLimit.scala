package typingsSlinky.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpeedLimit extends js.Object {
  /** A unique identifier for a place. All place IDs returned by the Roads API will correspond to road segments. */
  var placeId: String = js.native
  /** The speed limit for that road segment. */
  var speedLimit: Double = js.native
  /** Returns either `KPH` or `MPH`. */
  var units: SpeedLimitUnit = js.native
}

object SpeedLimit {
  @scala.inline
  def apply(placeId: String, speedLimit: Double, units: SpeedLimitUnit): SpeedLimit = {
    val __obj = js.Dynamic.literal(placeId = placeId.asInstanceOf[js.Any], speedLimit = speedLimit.asInstanceOf[js.Any], units = units.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeedLimit]
  }
  @scala.inline
  implicit class SpeedLimitOps[Self <: SpeedLimit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlaceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpeedLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speedLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnits(value: SpeedLimitUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

