package typingsSlinky.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LeaderLines extends StObject {
  
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  
  val Border: typingsSlinky.activexExcel.Excel.Border = js.native
  
  val Creator: XlCreator = js.native
  
  def Delete(): Unit = js.native
  
  @JSName("Excel.LeaderLines_typekey")
  var ExcelDotLeaderLines_typekey: LeaderLines = js.native
  
  val Format: ChartFormat = js.native
  
  val Parent: js.Any = js.native
  
  def Select(): Unit = js.native
}
object LeaderLines {
  
  @scala.inline
  def apply(
    Application: Application,
    Border: Border,
    Creator: XlCreator,
    Delete: () => Unit,
    ExcelDotLeaderLines_typekey: LeaderLines,
    Format: ChartFormat,
    Parent: js.Any,
    Select: () => Unit
  ): LeaderLines = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Format = Format.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Excel.LeaderLines_typekey")(ExcelDotLeaderLines_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeaderLines]
  }
  
  @scala.inline
  implicit class LeaderLinesMutableBuilder[Self <: LeaderLines] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorder(value: Border): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExcelDotLeaderLines_typekey(value: LeaderLines): Self = StObject.set(x, "Excel.LeaderLines_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: ChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: () => Unit): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
  }
}
