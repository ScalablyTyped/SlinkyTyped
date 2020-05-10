package typingsSlinky.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpeedLimitsResponse extends js.Object {
  /** an array of snapped points. This array is present only if the request contained a path parameter. */
  var snappedPoints: js.Array[SnappedPoint] = js.native
  /** An array of road metadata. */
  var speedLimits: js.Array[SpeedLimit] = js.native
}

object SpeedLimitsResponse {
  @scala.inline
  def apply(snappedPoints: js.Array[SnappedPoint], speedLimits: js.Array[SpeedLimit]): SpeedLimitsResponse = {
    val __obj = js.Dynamic.literal(snappedPoints = snappedPoints.asInstanceOf[js.Any], speedLimits = speedLimits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeedLimitsResponse]
  }
  @scala.inline
  implicit class SpeedLimitsResponseOps[Self <: SpeedLimitsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSnappedPoints(value: js.Array[SnappedPoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snappedPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpeedLimits(value: js.Array[SpeedLimit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speedLimits")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

