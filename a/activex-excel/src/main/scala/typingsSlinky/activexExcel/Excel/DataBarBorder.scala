package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataBarBorder extends js.Object {
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  val Color: FormatColor = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.DataBarBorder_typekey")
  var ExcelDotDataBarBorder_typekey: DataBarBorder = js.native
  val Parent: js.Any = js.native
  var Type: XlDataBarBorderType = js.native
}

object DataBarBorder {
  @scala.inline
  def apply(
    Application: Application,
    Color: FormatColor,
    Creator: XlCreator,
    ExcelDotDataBarBorder_typekey: DataBarBorder,
    Parent: js.Any,
    Type: XlDataBarBorderType
  ): DataBarBorder = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.DataBarBorder_typekey")(ExcelDotDataBarBorder_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataBarBorder]
  }
  @scala.inline
  implicit class DataBarBorderOps[Self <: DataBarBorder] (val x: Self) extends AnyVal {
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
    def withColor(value: FormatColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: XlCreator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcelDotDataBarBorder_typekey(value: DataBarBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.DataBarBorder_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: XlDataBarBorderType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

