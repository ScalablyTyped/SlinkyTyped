package typingsSlinky.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CameraOptions extends js.Object {
  var allowEdit: js.UndefOr[Boolean] = js.native
  var correctOrientation: js.UndefOr[Boolean] = js.native
  var destinationType: js.UndefOr[Double] = js.native
  var encodingType: js.UndefOr[Double] = js.native
  var mediaType: js.UndefOr[Double] = js.native
  var popoverOptions: js.UndefOr[CameraPopoverOptions] = js.native
  var quality: js.UndefOr[Double] = js.native
  var saveToPhotoAlbum: js.UndefOr[Boolean] = js.native
  var sourceType: js.UndefOr[Double] = js.native
  var targetHeight: js.UndefOr[Double] = js.native
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

