package typingsSlinky.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMsoUpBars extends StObject {
  
  val Application: js.Any = js.native
  
  val Border: IMsoBorder = js.native
  
  val Creator: Double = js.native
  
  def Delete(): js.Any = js.native
  
  val Fill: ChartFillFormat = js.native
  
  val Format: IMsoChartFormat = js.native
  
  val Interior: IMsoInterior = js.native
  
  val Name: String = js.native
  
  @JSName("Office.IMsoUpBars_typekey")
  var OfficeDotIMsoUpBars_typekey: IMsoUpBars = js.native
  
  val Parent: js.Any = js.native
  
  def Select(): js.Any = js.native
}
object IMsoUpBars {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Border: IMsoBorder,
    Creator: Double,
    Delete: () => js.Any,
    Fill: ChartFillFormat,
    Format: IMsoChartFormat,
    Interior: IMsoInterior,
    Name: String,
    OfficeDotIMsoUpBars_typekey: IMsoUpBars,
    Parent: js.Any,
    Select: () => js.Any
  ): IMsoUpBars = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Fill = Fill.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Office.IMsoUpBars_typekey")(OfficeDotIMsoUpBars_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoUpBars]
  }
  
  @scala.inline
  implicit class IMsoUpBarsMutableBuilder[Self <: IMsoUpBars] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorder(value: IMsoBorder): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => js.Any): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFill(value: ChartFillFormat): Self = StObject.set(x, "Fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: IMsoChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterior(value: IMsoInterior): Self = StObject.set(x, "Interior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotIMsoUpBars_typekey(value: IMsoUpBars): Self = StObject.set(x, "Office.IMsoUpBars_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: () => js.Any): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
  }
}
