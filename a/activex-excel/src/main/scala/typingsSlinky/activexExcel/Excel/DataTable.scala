package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataTable extends js.Object {
  
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  
  var AutoScaleFont: js.Any = js.native
  
  val Border: typingsSlinky.activexExcel.Excel.Border = js.native
  
  val Creator: XlCreator = js.native
  
  def Delete(): Unit = js.native
  
  @JSName("Excel.DataTable_typekey")
  var ExcelDotDataTable_typekey: DataTable = js.native
  
  val Font: typingsSlinky.activexExcel.Excel.Font = js.native
  
  val Format: ChartFormat = js.native
  
  var HasBorderHorizontal: Boolean = js.native
  
  var HasBorderOutline: Boolean = js.native
  
  var HasBorderVertical: Boolean = js.native
  
  val Parent: js.Any = js.native
  
  def Select(): Unit = js.native
  
  var ShowLegendKey: Boolean = js.native
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScaleFont(value: js.Any): Self = this.set("AutoScaleFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorder(value: Border): Self = this.set("Border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExcelDotDataTable_typekey(value: DataTable): Self = this.set("Excel.DataTable_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont(value: Font): Self = this.set("Font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: ChartFormat): Self = this.set("Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasBorderHorizontal(value: Boolean): Self = this.set("HasBorderHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasBorderOutline(value: Boolean): Self = this.set("HasBorderOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasBorderVertical(value: Boolean): Self = this.set("HasBorderVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: () => Unit): Self = this.set("Select", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowLegendKey(value: Boolean): Self = this.set("ShowLegendKey", value.asInstanceOf[js.Any])
  }
}
