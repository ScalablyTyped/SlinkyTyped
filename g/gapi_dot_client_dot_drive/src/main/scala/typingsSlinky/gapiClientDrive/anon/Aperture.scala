package typingsSlinky.gapiClientDrive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Aperture extends js.Object {
  /** The aperture used to create the photo (f-number). */
  var aperture: js.UndefOr[Double] = js.native
  /** The make of the camera used to create the photo. */
  var cameraMake: js.UndefOr[String] = js.native
  /** The model of the camera used to create the photo. */
  var cameraModel: js.UndefOr[String] = js.native
  /** The color space of the photo. */
  var colorSpace: js.UndefOr[String] = js.native
  /** The exposure bias of the photo (APEX value). */
  var exposureBias: js.UndefOr[Double] = js.native
  /** The exposure mode used to create the photo. */
  var exposureMode: js.UndefOr[String] = js.native
  /** The length of the exposure, in seconds. */
  var exposureTime: js.UndefOr[Double] = js.native
  /** Whether a flash was used to create the photo. */
  var flashUsed: js.UndefOr[Boolean] = js.native
  /** The focal length used to create the photo, in millimeters. */
  var focalLength: js.UndefOr[Double] = js.native
  /** The height of the image in pixels. */
  var height: js.UndefOr[Double] = js.native
  /** The ISO speed used to create the photo. */
  var isoSpeed: js.UndefOr[Double] = js.native
  /** The lens used to create the photo. */
  var lens: js.UndefOr[String] = js.native
  /** Geographic location information stored in the image. */
  var location: js.UndefOr[Altitude] = js.native
  /** The smallest f-number of the lens at the focal length used to create the photo (APEX value). */
  var maxApertureValue: js.UndefOr[Double] = js.native
  /** The metering mode used to create the photo. */
  var meteringMode: js.UndefOr[String] = js.native
  /** The rotation in clockwise degrees from the image's original orientation. */
  var rotation: js.UndefOr[Double] = js.native
  /** The type of sensor used to create the photo. */
  var sensor: js.UndefOr[String] = js.native
  /** The distance to the subject of the photo, in meters. */
  var subjectDistance: js.UndefOr[Double] = js.native
  /** The date and time the photo was taken (EXIF DateTime). */
  var time: js.UndefOr[String] = js.native
  /** The white balance mode used to create the photo. */
  var whiteBalance: js.UndefOr[String] = js.native
  /** The width of the image in pixels. */
  var width: js.UndefOr[Double] = js.native
}

object Aperture {
  @scala.inline
  def apply(): Aperture = {
    val __obj = js.Dynamic.literal()
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
    def withLocation(value: Altitude): Self = {
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

