package typingsSlinky.activexExcel.Excel

import typingsSlinky.activexOffice.Office.MsoPictureColorType
import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// there is no way to use the Globals class from within Javascript
@js.native
trait Graphic extends js.Object {
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  var Brightness: Double = js.native
  var ColorType: MsoPictureColorType = js.native
  var Contrast: Double = js.native
  val Creator: XlCreator = js.native
  var CropBottom: Double = js.native
  var CropLeft: Double = js.native
  var CropRight: Double = js.native
  var CropTop: Double = js.native
  @JSName("Excel.Graphic_typekey")
  var ExcelDotGraphic_typekey: Graphic = js.native
  var Filename: String = js.native
  var Height: Double = js.native
  var LockAspectRatio: MsoTriState = js.native
  val Parent: js.Any = js.native
  var Width: Double = js.native
}

object Graphic {
  @scala.inline
  def apply(
    Application: Application,
    Brightness: Double,
    ColorType: MsoPictureColorType,
    Contrast: Double,
    Creator: XlCreator,
    CropBottom: Double,
    CropLeft: Double,
    CropRight: Double,
    CropTop: Double,
    ExcelDotGraphic_typekey: Graphic,
    Filename: String,
    Height: Double,
    LockAspectRatio: MsoTriState,
    Parent: js.Any,
    Width: Double
  ): Graphic = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Brightness = Brightness.asInstanceOf[js.Any], ColorType = ColorType.asInstanceOf[js.Any], Contrast = Contrast.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], CropBottom = CropBottom.asInstanceOf[js.Any], CropLeft = CropLeft.asInstanceOf[js.Any], CropRight = CropRight.asInstanceOf[js.Any], CropTop = CropTop.asInstanceOf[js.Any], Filename = Filename.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], LockAspectRatio = LockAspectRatio.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Graphic_typekey")(ExcelDotGraphic_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Graphic]
  }
  @scala.inline
  implicit class GraphicOps[Self <: Graphic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: Application): Self = {
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
    def withCreator(value: XlCreator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
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
    def withExcelDotGraphic_typekey(value: Graphic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.Graphic_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLockAspectRatio(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LockAspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

