package typingsSlinky.activexExcel.Excel

import typingsSlinky.activexOffice.Office.Crop
import typingsSlinky.activexOffice.Office.MsoPictureColorType
import typingsSlinky.activexOffice.Office.MsoRGBType
import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PictureFormat extends js.Object {
  val Application: js.Any = js.native
  var Brightness: Double = js.native
  var ColorType: MsoPictureColorType = js.native
  var Contrast: Double = js.native
  val Creator: Double = js.native
  val Crop: typingsSlinky.activexOffice.Office.Crop = js.native
  var CropBottom: Double = js.native
  var CropLeft: Double = js.native
  var CropRight: Double = js.native
  var CropTop: Double = js.native
  @JSName("Excel.PictureFormat_typekey")
  var ExcelDotPictureFormat_typekey: PictureFormat = js.native
  val Parent: js.Any = js.native
  var TransparencyColor: MsoRGBType = js.native
  var TransparentBackground: MsoTriState = js.native
  def IncrementBrightness(Increment: Double): Unit = js.native
  def IncrementContrast(Increment: Double): Unit = js.native
}

object PictureFormat {
  @scala.inline
  def apply(
    Application: js.Any,
    Brightness: Double,
    ColorType: MsoPictureColorType,
    Contrast: Double,
    Creator: Double,
    Crop: Crop,
    CropBottom: Double,
    CropLeft: Double,
    CropRight: Double,
    CropTop: Double,
    ExcelDotPictureFormat_typekey: PictureFormat,
    IncrementBrightness: Double => Unit,
    IncrementContrast: Double => Unit,
    Parent: js.Any,
    TransparencyColor: MsoRGBType,
    TransparentBackground: MsoTriState
  ): PictureFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Brightness = Brightness.asInstanceOf[js.Any], ColorType = ColorType.asInstanceOf[js.Any], Contrast = Contrast.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Crop = Crop.asInstanceOf[js.Any], CropBottom = CropBottom.asInstanceOf[js.Any], CropLeft = CropLeft.asInstanceOf[js.Any], CropRight = CropRight.asInstanceOf[js.Any], CropTop = CropTop.asInstanceOf[js.Any], IncrementBrightness = js.Any.fromFunction1(IncrementBrightness), IncrementContrast = js.Any.fromFunction1(IncrementContrast), Parent = Parent.asInstanceOf[js.Any], TransparencyColor = TransparencyColor.asInstanceOf[js.Any], TransparentBackground = TransparentBackground.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.PictureFormat_typekey")(ExcelDotPictureFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PictureFormat]
  }
  @scala.inline
  implicit class PictureFormatOps[Self <: PictureFormat] (val x: Self) extends AnyVal {
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
    def withColorType(value: MsoPictureColorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContrast(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Contrast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrop(value: Crop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Crop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCropBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CropBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCropLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CropLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCropRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CropRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCropTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CropTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcelDotPictureFormat_typekey(value: PictureFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.PictureFormat_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncrementBrightness(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncrementBrightness")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIncrementContrast(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncrementContrast")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransparencyColor(value: MsoRGBType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransparencyColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransparentBackground(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransparentBackground")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

