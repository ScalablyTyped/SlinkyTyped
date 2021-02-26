package typingsSlinky.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomProperty extends StObject {
  
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  
  val Creator: XlCreator = js.native
  
  def Delete(): Unit = js.native
  
  @JSName("Excel.CustomProperty_typekey")
  var ExcelDotCustomProperty_typekey: CustomProperty = js.native
  
  var Name: String = js.native
  
  val Parent: js.Any = js.native
  
  var Value: js.Any = js.native
  
  val _Default: js.Any = js.native
}
object CustomProperty {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    Delete: () => Unit,
    ExcelDotCustomProperty_typekey: CustomProperty,
    Name: String,
    Parent: js.Any,
    Value: js.Any,
    _Default: js.Any
  ): CustomProperty = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], _Default = _Default.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.CustomProperty_typekey")(ExcelDotCustomProperty_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  
  @scala.inline
  implicit class CustomPropertyMutableBuilder[Self <: CustomProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExcelDotCustomProperty_typekey(value: CustomProperty): Self = StObject.set(x, "Excel.CustomProperty_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_Default(value: js.Any): Self = StObject.set(x, "_Default", value.asInstanceOf[js.Any])
  }
}
