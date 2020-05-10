package typingsSlinky.cordovaPluginCamera

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CameraOptions extends js.Object {
  /** Allow simple editing of image before selection. */
  var allowEdit: js.UndefOr[Boolean] = js.native
  /**
    * Choose the camera to use (front- or back-facing).
    * Defined in navigator.camera.Direction. Default is BACK.
    *      FRONT: 0
    *      BACK: 1
    */
  var cameraDirection: js.UndefOr[Double] = js.native
  /** Rotate the image to correct for the orientation of the device during capture. */
  var correctOrientation: js.UndefOr[Boolean] = js.native
  /**
    * Choose the format of the return value.
    * Defined in navigator.camera.DestinationType. Default is FILE_URI.
    *      DATA_URL : 0,   Return image as base64-encoded string
    *      FILE_URI : 1,   Return image file URI
    *      NATIVE_URI : 2  Return image native URI
    *          (e.g., assets-library:// on iOS or content:// on Android)
    */
  var destinationType: js.UndefOr[Double] = js.native
  /**
    * Choose the returned image file's encoding.
    * Defined in navigator.camera.EncodingType. Default is JPEG
    *      JPEG : 0    Return JPEG encoded image
    *      PNG : 1     Return PNG encoded image
    */
  var encodingType: js.UndefOr[Double] = js.native
  /**
    * Set the type of media to select from. Only works when PictureSourceType
    * is PHOTOLIBRARY or SAVEDPHOTOALBUM. Defined in nagivator.camera.MediaType
    *      PICTURE: 0      allow selection of still pictures only. DEFAULT.
    *          Will return format specified via DestinationType
    *      VIDEO: 1        allow selection of video only, WILL ALWAYS RETURN FILE_URI
    *      ALLMEDIA : 2    allow selection from all media types
    */
  var mediaType: js.UndefOr[Double] = js.native
  /** iOS-only options that specify popover location in iPad. Defined in CameraPopoverOptions. */
  var popoverOptions: js.UndefOr[CameraPopoverOptions] = js.native
  /** Picture quality in range 0-100. Default is 50 */
  var quality: js.UndefOr[Double] = js.native
  /** Save the image to the photo album on the device after capture. */
  var saveToPhotoAlbum: js.UndefOr[Boolean] = js.native
  /**
    * Set the source of the picture.
    * Defined in navigator.camera.PictureSourceType. Default is CAMERA.
    *      PHOTOLIBRARY : 0,
    *      CAMERA : 1,
    *      SAVEDPHOTOALBUM : 2
    */
  var sourceType: js.UndefOr[Double] = js.native
  /**
    * Height in pixels to scale image. Must be used with targetWidth.
    * Aspect ratio remains constant.
    */
  var targetHeight: js.UndefOr[Double] = js.native
  /**
    * Width in pixels to scale image. Must be used with targetHeight.
    * Aspect ratio remains constant.
    */
  var targetWidth: js.UndefOr[Double] = js.native
}

object CameraOptions {
  @scala.inline
  def apply(): CameraOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraOptions]
  }
  @scala.inline
  implicit class CameraOptionsOps[Self <: CameraOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowEdit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withCameraDirection(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameraDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCameraDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameraDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withCorrectOrientation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correctOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorrectOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correctOrientation")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationType")(js.undefined)
        ret
    }
    @scala.inline
    def withEncodingType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncodingType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodingType")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaType")(js.undefined)
        ret
    }
    @scala.inline
    def withPopoverOptions(value: CameraPopoverOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popoverOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopoverOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popoverOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveToPhotoAlbum(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveToPhotoAlbum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveToPhotoAlbum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveToPhotoAlbum")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetWidth")(js.undefined)
        ret
    }
  }
  
}

