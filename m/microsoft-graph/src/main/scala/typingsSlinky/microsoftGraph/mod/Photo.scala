package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Photo extends js.Object {
  // Camera manufacturer. Read-only.
  var cameraMake: js.UndefOr[String] = js.native
  // Camera model. Read-only.
  var cameraModel: js.UndefOr[String] = js.native
  // The denominator for the exposure time fraction from the camera. Read-only.
  var exposureDenominator: js.UndefOr[Double] = js.native
  // The numerator for the exposure time fraction from the camera. Read-only.
  var exposureNumerator: js.UndefOr[Double] = js.native
  // The F-stop value from the camera. Read-only.
  var fNumber: js.UndefOr[Double] = js.native
  // The focal length from the camera. Read-only.
  var focalLength: js.UndefOr[Double] = js.native
  // The ISO value from the camera. Read-only.
  var iso: js.UndefOr[Double] = js.native
  // Represents the date and time the photo was taken. Read-only.
  var takenDateTime: js.UndefOr[String] = js.native
}

object Photo {
  @scala.inline
  def apply(): Photo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Photo]
  }
  @scala.inline
  implicit class PhotoOps[Self <: Photo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withExposureDenominator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposureDenominator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExposureDenominator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposureDenominator")(js.undefined)
        ret
    }
    @scala.inline
    def withExposureNumerator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposureNumerator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExposureNumerator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposureNumerator")(js.undefined)
        ret
    }
    @scala.inline
    def withFNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fNumber")(js.undefined)
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
    def withIso(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iso")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIso: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iso")(js.undefined)
        ret
    }
    @scala.inline
    def withTakenDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("takenDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTakenDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("takenDateTime")(js.undefined)
        ret
    }
  }
  
}

