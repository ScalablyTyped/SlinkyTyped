package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogSheetView extends SheetView {
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.DialogSheetView_typekey")
  var ExcelDotDialogSheetView_typekey: DialogSheetView = js.native
  val Parent: js.Any = js.native
  val Sheet: DialogSheet = js.native
}

object DialogSheetView {
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    ExcelDotDialogSheetView_typekey: DialogSheetView,
    Parent: js.Any,
    Sheet: DialogSheet
  ): DialogSheetView = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Sheet = Sheet.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.DialogSheetView_typekey")(ExcelDotDialogSheetView_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogSheetView]
  }
  @scala.inline
  implicit class DialogSheetViewOps[Self <: DialogSheetView] (val x: Self) extends AnyVal {
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
    def withExcelDotDialogSheetView_typekey(value: DialogSheetView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.DialogSheetView_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSheet(value: DialogSheet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sheet")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

