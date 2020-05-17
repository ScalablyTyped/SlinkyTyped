package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NegativeBarFormat extends js.Object {
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  val BorderColor: FormatColor = js.native
  var BorderColorType: XlDataBarNegativeColorType = js.native
  val Color: FormatColor = js.native
  var ColorType: XlDataBarNegativeColorType = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.NegativeBarFormat_typekey")
  var ExcelDotNegativeBarFormat_typekey: NegativeBarFormat = js.native
  val Parent: js.Any = js.native
}

object NegativeBarFormat {
  @scala.inline
  def apply(
    Application: Application,
    BorderColor: FormatColor,
    BorderColorType: XlDataBarNegativeColorType,
    Color: FormatColor,
    ColorType: XlDataBarNegativeColorType,
    Creator: XlCreator,
    ExcelDotNegativeBarFormat_typekey: NegativeBarFormat,
    Parent: js.Any
  ): NegativeBarFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BorderColor = BorderColor.asInstanceOf[js.Any], BorderColorType = BorderColorType.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorType = ColorType.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.NegativeBarFormat_typekey")(ExcelDotNegativeBarFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NegativeBarFormat]
  }
  @scala.inline
  implicit class NegativeBarFormatOps[Self <: NegativeBarFormat] (val x: Self) extends AnyVal {
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
    def withBorderColor(value: FormatColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderColorType(value: XlDataBarNegativeColorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BorderColorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: FormatColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorType(value: XlDataBarNegativeColorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: XlCreator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcelDotNegativeBarFormat_typekey(value: NegativeBarFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.NegativeBarFormat_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

