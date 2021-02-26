package typingsSlinky.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewField extends StObject {
  
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  val ColumnFormat: typingsSlinky.activexOutlook.Outlook.ColumnFormat = js.native
  
  @JSName("Outlook.ViewField_typekey")
  var OutlookDotViewField_typekey: ViewField = js.native
  
  val Parent: js.Any = js.native
  
  val Session: NameSpace = js.native
  
  val ViewXMLSchemaName: String = js.native
}
object ViewField {
  
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    ColumnFormat: ColumnFormat,
    OutlookDotViewField_typekey: ViewField,
    Parent: js.Any,
    Session: NameSpace,
    ViewXMLSchemaName: String
  ): ViewField = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ColumnFormat = ColumnFormat.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], ViewXMLSchemaName = ViewXMLSchemaName.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.ViewField_typekey")(OutlookDotViewField_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewField]
  }
  
  @scala.inline
  implicit class ViewFieldMutableBuilder[Self <: ViewField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnFormat(value: ColumnFormat): Self = StObject.set(x, "ColumnFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotViewField_typekey(value: ViewField): Self = StObject.set(x, "Outlook.ViewField_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewXMLSchemaName(value: String): Self = StObject.set(x, "ViewXMLSchemaName", value.asInstanceOf[js.Any])
  }
}
