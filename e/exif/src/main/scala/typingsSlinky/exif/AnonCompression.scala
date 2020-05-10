package typingsSlinky.exif

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCompression extends js.Object {
  var Compression: js.UndefOr[Double] = js.native
  var Orientation: js.UndefOr[Double] = js.native
  var ResolutionUnit: js.UndefOr[Double] = js.native
  var ThumbnailLength: js.UndefOr[Double] = js.native
  var ThumbnailOffset: js.UndefOr[Double] = js.native
  var XResolution: js.UndefOr[Double] = js.native
  var YCbCrPositioning: js.UndefOr[Double] = js.native
  var YResolution: js.UndefOr[Double] = js.native
}

object AnonCompression {
  @scala.inline
  def apply(): AnonCompression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCompression]
  }
  @scala.inline
  implicit class AnonCompressionOps[Self <: AnonCompression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompression(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Compression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Compression")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withResolutionUnit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResolutionUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolutionUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResolutionUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnailLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThumbnailLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnailLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThumbnailLength")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnailOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThumbnailOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnailOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThumbnailOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withXResolution(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XResolution")(js.undefined)
        ret
    }
    @scala.inline
    def withYCbCrPositioning(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("YCbCrPositioning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYCbCrPositioning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("YCbCrPositioning")(js.undefined)
        ret
    }
    @scala.inline
    def withYResolution(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("YResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("YResolution")(js.undefined)
        ret
    }
  }
  
}

