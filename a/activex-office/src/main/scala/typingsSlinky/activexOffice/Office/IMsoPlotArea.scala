package typingsSlinky.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMsoPlotArea extends StObject {
  
  val Application: js.Any = js.native
  
  val Border: IMsoBorder = js.native
  
  def ClearFormats(): js.Any = js.native
  
  val Creator: Double = js.native
  
  val Fill: ChartFillFormat = js.native
  
  val Format: IMsoChartFormat = js.native
  
  var Height: Double = js.native
  
  var InsideHeight: Double = js.native
  
  var InsideLeft: Double = js.native
  
  var InsideTop: Double = js.native
  
  var InsideWidth: Double = js.native
  
  val Interior: IMsoInterior = js.native
  
  var Left: Double = js.native
  
  val Name: String = js.native
  
  @JSName("Office.IMsoPlotArea_typekey")
  var OfficeDotIMsoPlotArea_typekey: IMsoPlotArea = js.native
  
  val Parent: js.Any = js.native
  
  var Position: XlChartElementPosition = js.native
  
  def Select(): js.Any = js.native
  
  var Top: Double = js.native
  
  var Width: Double = js.native
}
object IMsoPlotArea {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Border: IMsoBorder,
    ClearFormats: () => js.Any,
    Creator: Double,
    Fill: ChartFillFormat,
    Format: IMsoChartFormat,
    Height: Double,
    InsideHeight: Double,
    InsideLeft: Double,
    InsideTop: Double,
    InsideWidth: Double,
    Interior: IMsoInterior,
    Left: Double,
    Name: String,
    OfficeDotIMsoPlotArea_typekey: IMsoPlotArea,
    Parent: js.Any,
    Position: XlChartElementPosition,
    Select: () => js.Any,
    Top: Double,
    Width: Double
  ): IMsoPlotArea = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], ClearFormats = js.Any.fromFunction0(ClearFormats), Creator = Creator.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], InsideHeight = InsideHeight.asInstanceOf[js.Any], InsideLeft = InsideLeft.asInstanceOf[js.Any], InsideTop = InsideTop.asInstanceOf[js.Any], InsideWidth = InsideWidth.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Top = Top.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.IMsoPlotArea_typekey")(OfficeDotIMsoPlotArea_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoPlotArea]
  }
  
  @scala.inline
  implicit class IMsoPlotAreaMutableBuilder[Self <: IMsoPlotArea] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorder(value: IMsoBorder): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearFormats(value: () => js.Any): Self = StObject.set(x, "ClearFormats", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFill(value: ChartFillFormat): Self = StObject.set(x, "Fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: IMsoChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsideHeight(value: Double): Self = StObject.set(x, "InsideHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsideLeft(value: Double): Self = StObject.set(x, "InsideLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsideTop(value: Double): Self = StObject.set(x, "InsideTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsideWidth(value: Double): Self = StObject.set(x, "InsideWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterior(value: IMsoInterior): Self = StObject.set(x, "Interior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotIMsoPlotArea_typekey(value: IMsoPlotArea): Self = StObject.set(x, "Office.IMsoPlotArea_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: XlChartElementPosition): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: () => js.Any): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
