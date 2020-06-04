package typingsSlinky.expo.aRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CapturedDepthData extends js.Object {
  var cameraCalibrationData: CameraCalibrationData
  var depthDataAccuracy: DepthDataAccuracy
  var depthDataFiltered: Boolean
  var depthDataQuality: DepthDataQuality
  var timestamp: Double
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCameraCalibrationData(value: CameraCalibrationData): Self = this.set("cameraCalibrationData", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepthDataAccuracy(value: DepthDataAccuracy): Self = this.set("depthDataAccuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepthDataFiltered(value: Boolean): Self = this.set("depthDataFiltered", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepthDataQuality(value: DepthDataQuality): Self = this.set("depthDataQuality", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

