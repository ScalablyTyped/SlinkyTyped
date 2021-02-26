package typingsSlinky.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderField extends StObject {
  
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  var IsDescending: Boolean = js.native
  
  @JSName("Outlook.OrderField_typekey")
  var OutlookDotOrderField_typekey: OrderField = js.native
  
  val Parent: js.Any = js.native
  
  val Session: NameSpace = js.native
  
  val ViewXMLSchemaName: String = js.native
}
object OrderField {
  
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    IsDescending: Boolean,
    OutlookDotOrderField_typekey: OrderField,
    Parent: js.Any,
    Session: NameSpace,
    ViewXMLSchemaName: String
  ): OrderField = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], IsDescending = IsDescending.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], ViewXMLSchemaName = ViewXMLSchemaName.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OrderField_typekey")(OutlookDotOrderField_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderField]
  }
  
  @scala.inline
  implicit class OrderFieldMutableBuilder[Self <: OrderField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDescending(value: Boolean): Self = StObject.set(x, "IsDescending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotOrderField_typekey(value: OrderField): Self = StObject.set(x, "Outlook.OrderField_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewXMLSchemaName(value: String): Self = StObject.set(x, "ViewXMLSchemaName", value.asInstanceOf[js.Any])
  }
}
