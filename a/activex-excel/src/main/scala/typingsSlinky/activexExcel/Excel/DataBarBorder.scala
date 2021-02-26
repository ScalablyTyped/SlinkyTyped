package typingsSlinky.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataBarBorder extends StObject {
  
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  
  val Color: FormatColor = js.native
  
  val Creator: XlCreator = js.native
  
  @JSName("Excel.DataBarBorder_typekey")
  var ExcelDotDataBarBorder_typekey: DataBarBorder = js.native
  
  val Parent: js.Any = js.native
  
  var Type: XlDataBarBorderType = js.native
}
object DataBarBorder {
  
  @scala.inline
  def apply(
    Application: Application,
    Color: FormatColor,
    Creator: XlCreator,
    ExcelDotDataBarBorder_typekey: DataBarBorder,
    Parent: js.Any,
    Type: XlDataBarBorderType
  ): DataBarBorder = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.DataBarBorder_typekey")(ExcelDotDataBarBorder_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataBarBorder]
  }
  
  @scala.inline
  implicit class DataBarBorderMutableBuilder[Self <: DataBarBorder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: FormatColor): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotDataBarBorder_typekey(value: DataBarBorder): Self = StObject.set(x, "Excel.DataBarBorder_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: XlDataBarBorderType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
