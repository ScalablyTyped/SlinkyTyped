package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorFormat extends js.Object {
  val Application: js.Any = js.native
  var Brightness: Double = js.native
  val Creator: Double = js.native
  var ObjectThemeColor: MsoThemeColorIndex = js.native
  @JSName("Office.ColorFormat_typekey")
  var OfficeDotColorFormat_typekey: ColorFormat = js.native
  val Parent: js.Any = js.native
  var RGB: Double = js.native
  var SchemeColor: Double = js.native
  var TintAndShade: Double = js.native
  val Type: MsoColorType = js.native
}

object ColorFormat {
  @scala.inline
  def apply(
    Application: js.Any,
    Brightness: Double,
    Creator: Double,
    ObjectThemeColor: MsoThemeColorIndex,
    OfficeDotColorFormat_typekey: ColorFormat,
    Parent: js.Any,
    RGB: Double,
    SchemeColor: Double,
    TintAndShade: Double,
    Type: MsoColorType
  ): ColorFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Brightness = Brightness.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], ObjectThemeColor = ObjectThemeColor.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RGB = RGB.asInstanceOf[js.Any], SchemeColor = SchemeColor.asInstanceOf[js.Any], TintAndShade = TintAndShade.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.ColorFormat_typekey")(OfficeDotColorFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorFormat]
  }
  @scala.inline
  implicit class ColorFormatOps[Self <: ColorFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrightness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Brightness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectThemeColor(value: MsoThemeColorIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectThemeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficeDotColorFormat_typekey(value: ColorFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.ColorFormat_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRGB(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RGB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchemeColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTintAndShade(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TintAndShade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: MsoColorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

