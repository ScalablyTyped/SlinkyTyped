package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.GlowFormat
import typingsSlinky.activexOffice.Office.SoftEdgeFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartFormat extends StObject {
  
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  
  val Creator: Double = js.native
  
  val Fill: FillFormat = js.native
  
  val Glow: GlowFormat = js.native
  
  val Line: LineFormat = js.native
  
  val Parent: js.Any = js.native
  
  val PictureFormat: typingsSlinky.activexPowerpoint.PowerPoint.PictureFormat = js.native
  
  @JSName("PowerPoint.ChartFormat_typekey")
  var PowerPointDotChartFormat_typekey: ChartFormat = js.native
  
  val Shadow: ShadowFormat = js.native
  
  val SoftEdge: SoftEdgeFormat = js.native
  
  val TextFrame2: typingsSlinky.activexPowerpoint.PowerPoint.TextFrame2 = js.native
  
  val ThreeD: ThreeDFormat = js.native
}
object ChartFormat {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Fill: FillFormat,
    Glow: GlowFormat,
    Line: LineFormat,
    Parent: js.Any,
    PictureFormat: PictureFormat,
    PowerPointDotChartFormat_typekey: ChartFormat,
    Shadow: ShadowFormat,
    SoftEdge: SoftEdgeFormat,
    TextFrame2: TextFrame2,
    ThreeD: ThreeDFormat
  ): ChartFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Glow = Glow.asInstanceOf[js.Any], Line = Line.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PictureFormat = PictureFormat.asInstanceOf[js.Any], Shadow = Shadow.asInstanceOf[js.Any], SoftEdge = SoftEdge.asInstanceOf[js.Any], TextFrame2 = TextFrame2.asInstanceOf[js.Any], ThreeD = ThreeD.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ChartFormat_typekey")(PowerPointDotChartFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartFormat]
  }
  
  @scala.inline
  implicit class ChartFormatMutableBuilder[Self <: ChartFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFill(value: FillFormat): Self = StObject.set(x, "Fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlow(value: GlowFormat): Self = StObject.set(x, "Glow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: LineFormat): Self = StObject.set(x, "Line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPictureFormat(value: PictureFormat): Self = StObject.set(x, "PictureFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotChartFormat_typekey(value: ChartFormat): Self = StObject.set(x, "PowerPoint.ChartFormat_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadow(value: ShadowFormat): Self = StObject.set(x, "Shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftEdge(value: SoftEdgeFormat): Self = StObject.set(x, "SoftEdge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextFrame2(value: TextFrame2): Self = StObject.set(x, "TextFrame2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreeD(value: ThreeDFormat): Self = StObject.set(x, "ThreeD", value.asInstanceOf[js.Any])
  }
}
