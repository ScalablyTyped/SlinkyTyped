package typingsSlinky.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Photo extends js.Object {
  /** Aperture f number of the camera lens with which the photo was taken. */
  var apertureFNumber: js.UndefOr[Double] = js.native
  /** Brand of the camera with which the photo was taken. */
  var cameraMake: js.UndefOr[String] = js.native
  /** Model of the camera with which the photo was taken. */
  var cameraModel: js.UndefOr[String] = js.native
  /** Exposure time of the camera aperture when the photo was taken. */
  var exposureTime: js.UndefOr[String] = js.native
  /** Focal length of the camera lens with which the photo was taken. */
  var focalLength: js.UndefOr[Double] = js.native
  /** ISO of the camera with which the photo was taken. */
  var isoEquivalent: js.UndefOr[Double] = js.native
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
    def withApertureFNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apertureFNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApertureFNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apertureFNumber")(js.undefined)
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
    def withExposureTime(value: String): Self = {
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
    def withIsoEquivalent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isoEquivalent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsoEquivalent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isoEquivalent")(js.undefined)
        ret
    }
  }
  
}

