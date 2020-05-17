package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorksheetView extends SheetView {
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  var DisplayFormulas: Boolean = js.native
  var DisplayGridlines: Boolean = js.native
  var DisplayHeadings: Boolean = js.native
  var DisplayOutline: Boolean = js.native
  var DisplayZeros: Boolean = js.native
  @JSName("Excel.WorksheetView_typekey")
  var ExcelDotWorksheetView_typekey: WorksheetView = js.native
  val Parent: js.Any = js.native
  val Sheet: Worksheet = js.native
}

object WorksheetView {
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    DisplayFormulas: Boolean,
    DisplayGridlines: Boolean,
    DisplayHeadings: Boolean,
    DisplayOutline: Boolean,
    DisplayZeros: Boolean,
    ExcelDotWorksheetView_typekey: WorksheetView,
    Parent: js.Any,
    Sheet: Worksheet
  ): WorksheetView = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DisplayFormulas = DisplayFormulas.asInstanceOf[js.Any], DisplayGridlines = DisplayGridlines.asInstanceOf[js.Any], DisplayHeadings = DisplayHeadings.asInstanceOf[js.Any], DisplayOutline = DisplayOutline.asInstanceOf[js.Any], DisplayZeros = DisplayZeros.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Sheet = Sheet.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.WorksheetView_typekey")(ExcelDotWorksheetView_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetView]
  }
  @scala.inline
  implicit class WorksheetViewOps[Self <: WorksheetView] (val x: Self) extends AnyVal {
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
    def withCreator(value: XlCreator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayFormulas(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayFormulas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayGridlines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayGridlines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayHeadings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayHeadings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayOutline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayOutline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayZeros(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayZeros")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcelDotWorksheetView_typekey(value: WorksheetView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.WorksheetView_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSheet(value: Worksheet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sheet")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

