package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTable extends js.Object {
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  var AutoScaleFont: js.Any = js.native
  val Border: typingsSlinky.activexExcel.Excel.Border = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.DataTable_typekey")
  var ExcelDotDataTable_typekey: DataTable = js.native
  val Font: typingsSlinky.activexExcel.Excel.Font = js.native
  val Format: ChartFormat = js.native
  var HasBorderHorizontal: Boolean = js.native
  var HasBorderOutline: Boolean = js.native
  var HasBorderVertical: Boolean = js.native
  val Parent: js.Any = js.native
  var ShowLegendKey: Boolean = js.native
  def Delete(): Unit = js.native
  def Select(): Unit = js.native
}

object DataTable {
  @scala.inline
  def apply(
    Application: Application,
    AutoScaleFont: js.Any,
    Border: Border,
    Creator: XlCreator,
    Delete: () => Unit,
    ExcelDotDataTable_typekey: DataTable,
    Font: Font,
    Format: ChartFormat,
    HasBorderHorizontal: Boolean,
    HasBorderOutline: Boolean,
    HasBorderVertical: Boolean,
    Parent: js.Any,
    Select: () => Unit,
    ShowLegendKey: Boolean
  ): DataTable = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoScaleFont = AutoScaleFont.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Font = Font.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], HasBorderHorizontal = HasBorderHorizontal.asInstanceOf[js.Any], HasBorderOutline = HasBorderOutline.asInstanceOf[js.Any], HasBorderVertical = HasBorderVertical.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), ShowLegendKey = ShowLegendKey.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.DataTable_typekey")(ExcelDotDataTable_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTable]
  }
  @scala.inline
  implicit class DataTableOps[Self <: DataTable] (val x: Self) extends AnyVal {
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
    def withAutoScaleFont(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScaleFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorder(value: Border): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Border")(value.asInstanceOf[js.Any])
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
    def withExcelDotDataTable_typekey(value: DataTable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.DataTable_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFont(value: Font): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: ChartFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasBorderHorizontal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasBorderHorizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasBorderOutline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasBorderOutline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasBorderVertical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasBorderVertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Select")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShowLegendKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowLegendKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

