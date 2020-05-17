package typingsSlinky.gapiDrive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Aperture extends js.Object {
  var aperture: Double = js.native
  var cameraMake: String = js.native
  var cameraModel: String = js.native
  var colorSpace: String = js.native
  var date: String = js.native
  var exposureBias: Double = js.native
  var exposureMode: String = js.native
  var exposureTime: Double = js.native
  var flashUsed: Boolean = js.native
  var focalLength: Double = js.native
  var height: Double = js.native
  var isoSpeed: Double = js.native
  var lens: String = js.native
  var location: Altitude = js.native
  var maxApertureValue: Double = js.native
  var meteringMode: String = js.native
  var rotation: Double = js.native
  var sensor: String = js.native
  var subjectDistance: Double = js.native
  var whiteBalance: String = js.native
  var width: Double = js.native
}

object Aperture {
  @scala.inline
  def apply(
    aperture: Double,
    cameraMake: String,
    cameraModel: String,
    colorSpace: String,
    date: String,
    exposureBias: Double,
    exposureMode: String,
    exposureTime: Double,
    flashUsed: Boolean,
    focalLength: Double,
    height: Double,
    isoSpeed: Double,
    lens: String,
    location: Altitude,
    maxApertureValue: Double,
    meteringMode: String,
    rotation: Double,
    sensor: String,
    subjectDistance: Double,
    whiteBalance: String,
    width: Double
  ): Aperture = {
    val __obj = js.Dynamic.literal(aperture = aperture.asInstanceOf[js.Any], cameraMake = cameraMake.asInstanceOf[js.Any], cameraModel = cameraModel.asInstanceOf[js.Any], colorSpace = colorSpace.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], exposureBias = exposureBias.asInstanceOf[js.Any], exposureMode = exposureMode.asInstanceOf[js.Any], exposureTime = exposureTime.asInstanceOf[js.Any], flashUsed = flashUsed.asInstanceOf[js.Any], focalLength = focalLength.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isoSpeed = isoSpeed.asInstanceOf[js.Any], lens = lens.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], maxApertureValue = maxApertureValue.asInstanceOf[js.Any], meteringMode = meteringMode.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], sensor = sensor.asInstanceOf[js.Any], subjectDistance = subjectDistance.asInstanceOf[js.Any], whiteBalance = whiteBalance.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aperture]
  }
  @scala.inline
  implicit class ApertureOps[Self <: Aperture] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAperture(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aperture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCameraMake(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameraMake")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCameraModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameraModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorSpace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExposureBias(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposureBias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExposureMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposureMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExposureTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposureTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlashUsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashUsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocalLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focalLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsoSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isoSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLens(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: Altitude): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxApertureValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxApertureValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeteringMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meteringMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSensor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubjectDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subjectDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWhiteBalance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whiteBalance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

