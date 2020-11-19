package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartArea extends js.Object {
  
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  
  var AutoScaleFont: js.Any = js.native
  
  val Border: typingsSlinky.activexExcel.Excel.Border = js.native
  
  def Clear(): js.Any = js.native
  
  def ClearContents(): js.Any = js.native
  
  def ClearFormats(): js.Any = js.native
  
  def Copy(): js.Any = js.native
  
  val Creator: XlCreator = js.native
  
  @JSName("Excel.ChartArea_typekey")
  var ExcelDotChartArea_typekey: ChartArea = js.native
  
  val Fill: ChartFillFormat = js.native
  
  val Font: typingsSlinky.activexExcel.Excel.Font = js.native
  
  val Format: ChartFormat = js.native
  
  var Height: Double = js.native
  
  val Interior: typingsSlinky.activexExcel.Excel.Interior = js.native
  
  var Left: Double = js.native
  
  val Name: String = js.native
  
  val Parent: js.Any = js.native
  
  var RoundedCorners: Boolean = js.native
  
  def Select(): js.Any = js.native
  
  var Shadow: Boolean = js.native
  
  var Top: Double = js.native
  
  var Width: Double = js.native
}
object ChartArea {
  
  @scala.inline
  def apply(
    Application: Application,
    AutoScaleFont: js.Any,
    Border: Border,
    Clear: () => js.Any,
    ClearContents: () => js.Any,
    ClearFormats: () => js.Any,
    Copy: () => js.Any,
    Creator: XlCreator,
    ExcelDotChartArea_typekey: ChartArea,
    Fill: ChartFillFormat,
    Font: Font,
    Format: ChartFormat,
    Height: Double,
    Interior: Interior,
    Left: Double,
    Name: String,
    Parent: js.Any,
    RoundedCorners: Boolean,
    Select: () => js.Any,
    Shadow: Boolean,
    Top: Double,
    Width: Double
  ): ChartArea = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoScaleFont = AutoScaleFont.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Clear = js.Any.fromFunction0(Clear), ClearContents = js.Any.fromFunction0(ClearContents), ClearFormats = js.Any.fromFunction0(ClearFormats), Copy = js.Any.fromFunction0(Copy), Creator = Creator.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RoundedCorners = RoundedCorners.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Shadow = Shadow.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.ChartArea_typekey")(ExcelDotChartArea_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartArea]
  }
  
  @scala.inline
  implicit class ChartAreaOps[Self <: ChartArea] (val x: Self) extends AnyVal {
    
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
    def setClear(value: () => js.Any): Self = this.set("Clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearContents(value: () => js.Any): Self = this.set("ClearContents", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearFormats(value: () => js.Any): Self = this.set("ClearFormats", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCopy(value: () => js.Any): Self = this.set("Copy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreator(value: XlCreator): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotChartArea_typekey(value: ChartArea): Self = this.set("Excel.ChartArea_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFill(value: ChartFillFormat): Self = this.set("Fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont(value: Font): Self = this.set("Font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: ChartFormat): Self = this.set("Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterior(value: Interior): Self = this.set("Interior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = this.set("Left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundedCorners(value: Boolean): Self = this.set("RoundedCorners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: () => js.Any): Self = this.set("Select", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShadow(value: Boolean): Self = this.set("Shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = this.set("Top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("Width", value.asInstanceOf[js.Any])
  }
}
