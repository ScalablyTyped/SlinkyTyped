package typingsSlinky.activexMsforms.MSForms

import typingsSlinky.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Image extends js.Object {
  var AutoSize: Boolean = js.native
  var BackColor: Double = js.native
  var BackStyle: fmBackStyle = js.native
  var BorderColor: Double = js.native
  var BorderStyle: fmBorderStyle = js.native
  var Enabled: Boolean = js.native
  @JSName("MSForms.Image_typekey")
  var MSFormsDotImage_typekey: Image = js.native
  var MouseIcon: StdPicture = js.native
  var MousePointer: fmMousePointer = js.native
  var Picture: StdPicture = js.native
  var PictureAlignment: fmPictureAlignment = js.native
  var PictureSizeMode: fmPictureSizeMode = js.native
  var PictureTiling: Boolean = js.native
  var SpecialEffect: fmSpecialEffect = js.native
}

object Image {
  @scala.inline
  def apply(
    AutoSize: Boolean,
    BackColor: Double,
    BackStyle: fmBackStyle,
    BorderColor: Double,
    BorderStyle: fmBorderStyle,
    Enabled: Boolean,
    MSFormsDotImage_typekey: Image,
    MouseIcon: StdPicture,
    MousePointer: fmMousePointer,
    Picture: StdPicture,
    PictureAlignment: fmPictureAlignment,
    PictureSizeMode: fmPictureSizeMode,
    PictureTiling: Boolean,
    SpecialEffect: fmSpecialEffect
  ): Image = {
    val __obj = js.Dynamic.literal(AutoSize = AutoSize.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackStyle = BackStyle.asInstanceOf[js.Any], BorderColor = BorderColor.asInstanceOf[js.Any], BorderStyle = BorderStyle.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], Picture = Picture.asInstanceOf[js.Any], PictureAlignment = PictureAlignment.asInstanceOf[js.Any], PictureSizeMode = PictureSizeMode.asInstanceOf[js.Any], PictureTiling = PictureTiling.asInstanceOf[js.Any], SpecialEffect = SpecialEffect.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.Image_typekey")(MSFormsDotImage_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  @scala.inline
  implicit class ImageOps[Self <: Image] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackStyle(value: fmBackStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderStyle(value: fmBorderStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BorderStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMSFormsDotImage_typekey(value: Image): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSForms.Image_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseIcon(value: StdPicture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MouseIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMousePointer(value: fmMousePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MousePointer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPicture(value: StdPicture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Picture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPictureAlignment(value: fmPictureAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PictureAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPictureSizeMode(value: fmPictureSizeMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PictureSizeMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPictureTiling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PictureTiling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpecialEffect(value: fmSpecialEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpecialEffect")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

