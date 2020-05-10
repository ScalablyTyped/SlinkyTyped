package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCameraMake extends js.Object {
  var aperture: js.UndefOr[Double] = js.native
  var cameraMake: js.UndefOr[String] = js.native
  var cameraModel: js.UndefOr[String] = js.native
  var colorSpace: js.UndefOr[String] = js.native
  var exposureBias: js.UndefOr[Double] = js.native
  var exposureMode: js.UndefOr[String] = js.native
  var exposureTime: js.UndefOr[Double] = js.native
  var flashUsed: js.UndefOr[Boolean] = js.native
  var focalLength: js.UndefOr[Double] = js.native
  var height: js.UndefOr[Double] = js.native
  var isoSpeed: js.UndefOr[Double] = js.native
  var lens: js.UndefOr[String] = js.native
  var location: js.UndefOr[AnonAltitude] = js.native
  var maxApertureValue: js.UndefOr[Double] = js.native
  var meteringMode: js.UndefOr[String] = js.native
  var rotation: js.UndefOr[Double] = js.native
  var sensor: js.UndefOr[String] = js.native
  var subjectDistance: js.UndefOr[Double] = js.native
  var time: js.UndefOr[String] = js.native
  var whiteBalance: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object AnonCameraMake {
  @scala.inline
  def apply(): AnonCameraMake = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCameraMake]
  }
  @scala.inline
  implicit class AnonCameraMakeOps[Self <: AnonCameraMake] (val x: Self) extends AnyVal {
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
    def withoutAperture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aperture")(js.undefined)
        ret
    }
    @scala.inline
    def withCameraMake(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameraMake")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCameraMake: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameraMake")(js.undefined)
        ret
    }
    @scala.inline
    def withCameraModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameraModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCameraModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameraModel")(js.undefined)
        ret
    }
    @scala.inline
    def withColorSpace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorSpace")(js.undefined)
        ret
    }
    @scala.inline
    def withExposureBias(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposureBias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExposureBias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposureBias")(js.undefined)
        ret
    }
    @scala.inline
    def withExposureMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposureMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExposureMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposureMode")(js.undefined)
        ret
    }
    @scala.inline
    def withExposureTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposureTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExposureTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposureTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFlashUsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashUsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlashUsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashUsed")(js.undefined)
        ret
    }
    @scala.inline
    def withFocalLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focalLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocalLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focalLength")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withIsoSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isoSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsoSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isoSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withLens(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lens")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: AnonAltitude): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxApertureValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxApertureValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxApertureValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxApertureValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMeteringMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meteringMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeteringMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meteringMode")(js.undefined)
        ret
    }
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(js.undefined)
        ret
    }
    @scala.inline
    def withSensor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSensor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensor")(js.undefined)
        ret
    }
    @scala.inline
    def withSubjectDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subjectDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubjectDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subjectDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.undefined)
        ret
    }
    @scala.inline
    def withWhiteBalance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whiteBalance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhiteBalance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whiteBalance")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

