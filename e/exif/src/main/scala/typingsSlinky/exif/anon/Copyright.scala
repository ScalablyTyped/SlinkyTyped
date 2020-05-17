package typingsSlinky.exif.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Copyright extends js.Object {
  var Copyright: js.UndefOr[String] = js.native
  var ExifOffset: js.UndefOr[Double] = js.native
  var ImageHeight: js.UndefOr[Double] = js.native
  var ImageWidth: js.UndefOr[Double] = js.native
  var Make: js.UndefOr[String] = js.native
  var Model: js.UndefOr[String] = js.native
  var ModifyDate: js.UndefOr[String] = js.native
  var Orientation: js.UndefOr[Double] = js.native
  var ResolutionUnit: js.UndefOr[Double] = js.native
  var Software: js.UndefOr[String] = js.native
  var XResolution: js.UndefOr[Double] = js.native
  var YCbCrPositioning: js.UndefOr[Double] = js.native
  var YResolution: js.UndefOr[Double] = js.native
}

object Copyright {
  @scala.inline
  def apply(): Copyright = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Copyright]
  }
  @scala.inline
  implicit class CopyrightOps[Self <: Copyright] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopyright(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Copyright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyright: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Copyright")(js.undefined)
        ret
    }
    @scala.inline
    def withExifOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExifOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExifOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExifOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withImageHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withImageWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMake(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Make")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMake: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Make")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Model")(js.undefined)
        ret
    }
    @scala.inline
    def withModifyDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModifyDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifyDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModifyDate")(js.undefined)
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
    def withSoftware(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Software")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSoftware: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Software")(js.undefined)
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

