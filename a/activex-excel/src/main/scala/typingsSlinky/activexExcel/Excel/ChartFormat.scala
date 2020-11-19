package typingsSlinky.activexExcel.Excel

import typingsSlinky.activexOffice.Office.GlowFormat
import typingsSlinky.activexOffice.Office.SoftEdgeFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartFormat extends js.Object {
  
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  
  val Creator: XlCreator = js.native
  
  @JSName("Excel.ChartFormat_typekey")
  var ExcelDotChartFormat_typekey: ChartFormat = js.native
  
  val Fill: FillFormat = js.native
  
  val Glow: GlowFormat = js.native
  
  val Line: LineFormat = js.native
  
  val Parent: js.Any = js.native
  
  val PictureFormat: typingsSlinky.activexExcel.Excel.PictureFormat = js.native
  
  val Shadow: ShadowFormat = js.native
  
  val SoftEdge: SoftEdgeFormat = js.native
  
  val TextFrame2: typingsSlinky.activexExcel.Excel.TextFrame2 = js.native
  
  val ThreeD: ThreeDFormat = js.native
}
object ChartFormat {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    ExcelDotChartFormat_typekey: ChartFormat,
    Fill: FillFormat,
    Glow: GlowFormat,
    Line: LineFormat,
    Parent: js.Any,
    PictureFormat: PictureFormat,
    Shadow: ShadowFormat,
    SoftEdge: SoftEdgeFormat,
    TextFrame2: TextFrame2,
    ThreeD: ThreeDFormat
  ): ChartFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Glow = Glow.asInstanceOf[js.Any], Line = Line.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PictureFormat = PictureFormat.asInstanceOf[js.Any], Shadow = Shadow.asInstanceOf[js.Any], SoftEdge = SoftEdge.asInstanceOf[js.Any], TextFrame2 = TextFrame2.asInstanceOf[js.Any], ThreeD = ThreeD.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.ChartFormat_typekey")(ExcelDotChartFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartFormat]
  }
  
  @scala.inline
  implicit class ChartFormatOps[Self <: ChartFormat] (val x: Self) extends AnyVal {
    
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
    def setCreator(value: XlCreator): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotChartFormat_typekey(value: ChartFormat): Self = this.set("Excel.ChartFormat_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFill(value: FillFormat): Self = this.set("Fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlow(value: GlowFormat): Self = this.set("Glow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: LineFormat): Self = this.set("Line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPictureFormat(value: PictureFormat): Self = this.set("PictureFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadow(value: ShadowFormat): Self = this.set("Shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftEdge(value: SoftEdgeFormat): Self = this.set("SoftEdge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextFrame2(value: TextFrame2): Self = this.set("TextFrame2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreeD(value: ThreeDFormat): Self = this.set("ThreeD", value.asInstanceOf[js.Any])
  }
}
