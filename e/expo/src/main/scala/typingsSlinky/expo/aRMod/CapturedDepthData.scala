package typingsSlinky.expo.aRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CapturedDepthData extends js.Object {
  var cameraCalibrationData: CameraCalibrationData = js.native
  var depthDataAccuracy: DepthDataAccuracy = js.native
  var depthDataFiltered: Boolean = js.native
  var depthDataQuality: DepthDataQuality = js.native
  var timestamp: Double = js.native
}

object CapturedDepthData {
  @scala.inline
  def apply(
    cameraCalibrationData: CameraCalibrationData,
    depthDataAccuracy: DepthDataAccuracy,
    depthDataFiltered: Boolean,
    depthDataQuality: DepthDataQuality,
    timestamp: Double
  ): CapturedDepthData = {
    val __obj = js.Dynamic.literal(cameraCalibrationData = cameraCalibrationData.asInstanceOf[js.Any], depthDataAccuracy = depthDataAccuracy.asInstanceOf[js.Any], depthDataFiltered = depthDataFiltered.asInstanceOf[js.Any], depthDataQuality = depthDataQuality.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapturedDepthData]
  }
  @scala.inline
  implicit class CapturedDepthDataOps[Self <: CapturedDepthData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCameraCalibrationData(value: CameraCalibrationData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameraCalibrationData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepthDataAccuracy(value: DepthDataAccuracy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthDataAccuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepthDataFiltered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthDataFiltered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepthDataQuality(value: DepthDataQuality): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthDataQuality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

