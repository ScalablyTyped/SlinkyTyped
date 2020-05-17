package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorBars extends js.Object {
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  val Border: typingsSlinky.activexExcel.Excel.Border = js.native
  val Creator: XlCreator = js.native
  var EndStyle: XlEndStyleCap = js.native
  @JSName("Excel.ErrorBars_typekey")
  var ExcelDotErrorBars_typekey: ErrorBars = js.native
  val Format: ChartFormat = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  def ClearFormats(): js.Any = js.native
  def Delete(): js.Any = js.native
  def Select(): js.Any = js.native
}

object ErrorBars {
  @scala.inline
  def apply(
    Application: Application,
    Border: Border,
    ClearFormats: () => js.Any,
    Creator: XlCreator,
    Delete: () => js.Any,
    EndStyle: XlEndStyleCap,
    ExcelDotErrorBars_typekey: ErrorBars,
    Format: ChartFormat,
    Name: String,
    Parent: js.Any,
    Select: () => js.Any
  ): ErrorBars = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], ClearFormats = js.Any.fromFunction0(ClearFormats), Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), EndStyle = EndStyle.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Excel.ErrorBars_typekey")(ExcelDotErrorBars_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorBars]
  }
  @scala.inline
  implicit class ErrorBarsOps[Self <: ErrorBars] (val x: Self) extends AnyVal {
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
    def withBorder(value: Border): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClearFormats(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClearFormats")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreator(value: XlCreator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEndStyle(value: XlEndStyleCap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcelDotErrorBars_typekey(value: ErrorBars): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.ErrorBars_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: ChartFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelect(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Select")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

