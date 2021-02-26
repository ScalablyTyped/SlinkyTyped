package typingsSlinky.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkFormat extends StObject {
  
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  
  var AutoUpdate: Boolean = js.native
  
  val Creator: XlCreator = js.native
  
  @JSName("Excel.LinkFormat_typekey")
  var ExcelDotLinkFormat_typekey: LinkFormat = js.native
  
  var Locked: Boolean = js.native
  
  val Parent: js.Any = js.native
  
  def Update(): Unit = js.native
}
object LinkFormat {
  
  @scala.inline
  def apply(
    Application: Application,
    AutoUpdate: Boolean,
    Creator: XlCreator,
    ExcelDotLinkFormat_typekey: LinkFormat,
    Locked: Boolean,
    Parent: js.Any,
    Update: () => Unit
  ): LinkFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoUpdate = AutoUpdate.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Update = js.Any.fromFunction0(Update))
    __obj.updateDynamic("Excel.LinkFormat_typekey")(ExcelDotLinkFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkFormat]
  }
  
  @scala.inline
  implicit class LinkFormatMutableBuilder[Self <: LinkFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoUpdate(value: Boolean): Self = StObject.set(x, "AutoUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotLinkFormat_typekey(value: LinkFormat): Self = StObject.set(x, "Excel.LinkFormat_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocked(value: Boolean): Self = StObject.set(x, "Locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = StObject.set(x, "Update", js.Any.fromFunction0(value))
  }
}
