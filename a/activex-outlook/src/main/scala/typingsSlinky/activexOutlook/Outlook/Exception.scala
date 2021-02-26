package typingsSlinky.activexOutlook.Outlook

import typingsSlinky.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Exception extends StObject {
  
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  
  val AppointmentItem: typingsSlinky.activexOutlook.Outlook.AppointmentItem = js.native
  
  val Class: OlObjectClass = js.native
  
  val Deleted: Boolean = js.native
  
  val ItemProperties: typingsSlinky.activexOutlook.Outlook.ItemProperties = js.native
  
  val OriginalDate: VarDate = js.native
  
  @JSName("Outlook.Exception_typekey")
  var OutlookDotException_typekey: Exception = js.native
  
  val Parent: js.Any = js.native
  
  val Session: NameSpace = js.native
}
object Exception {
  
  @scala.inline
  def apply(
    Application: Application,
    AppointmentItem: AppointmentItem,
    Class: OlObjectClass,
    Deleted: Boolean,
    ItemProperties: ItemProperties,
    OriginalDate: VarDate,
    OutlookDotException_typekey: Exception,
    Parent: js.Any,
    Session: NameSpace
  ): Exception = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AppointmentItem = AppointmentItem.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Deleted = Deleted.asInstanceOf[js.Any], ItemProperties = ItemProperties.asInstanceOf[js.Any], OriginalDate = OriginalDate.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Exception_typekey")(OutlookDotException_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exception]
  }
  
  @scala.inline
  implicit class ExceptionMutableBuilder[Self <: Exception] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppointmentItem(value: AppointmentItem): Self = StObject.set(x, "AppointmentItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "Deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemProperties(value: ItemProperties): Self = StObject.set(x, "ItemProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalDate(value: VarDate): Self = StObject.set(x, "OriginalDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotException_typekey(value: Exception): Self = StObject.set(x, "Outlook.Exception_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
