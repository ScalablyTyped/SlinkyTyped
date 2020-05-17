package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomView extends js.Object {
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.CustomView_typekey")
  var ExcelDotCustomView_typekey: CustomView = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  val PrintSettings: Boolean = js.native
  val RowColSettings: Boolean = js.native
  def Delete(): Unit = js.native
  def Show(): Unit = js.native
}

object CustomView {
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    Delete: () => Unit,
    ExcelDotCustomView_typekey: CustomView,
    Name: String,
    Parent: js.Any,
    PrintSettings: Boolean,
    RowColSettings: Boolean,
    Show: () => Unit
  ): CustomView = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PrintSettings = PrintSettings.asInstanceOf[js.Any], RowColSettings = RowColSettings.asInstanceOf[js.Any], Show = js.Any.fromFunction0(Show))
    __obj.updateDynamic("Excel.CustomView_typekey")(ExcelDotCustomView_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomView]
  }
  @scala.inline
  implicit class CustomViewOps[Self <: CustomView] (val x: Self) extends AnyVal {
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
    def withDelete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExcelDotCustomView_typekey(value: CustomView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.CustomView_typekey")(value.asInstanceOf[js.Any])
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
    def withPrintSettings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrintSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowColSettings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowColSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Show")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

