package typingsSlinky.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutlookBarGroup extends StObject {
  
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  var Name: String = js.native
  
  @JSName("Outlook.OutlookBarGroup_typekey")
  var OutlookDotOutlookBarGroup_typekey: OutlookBarGroup = js.native
  
  val Parent: js.Any = js.native
  
  val Session: NameSpace = js.native
  
  val Shortcuts: OutlookBarShortcuts = js.native
  
  var ViewType: OlOutlookBarViewType = js.native
}
object OutlookBarGroup {
  
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Name: String,
    OutlookDotOutlookBarGroup_typekey: OutlookBarGroup,
    Parent: js.Any,
    Session: NameSpace,
    Shortcuts: OutlookBarShortcuts,
    ViewType: OlOutlookBarViewType
  ): OutlookBarGroup = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Shortcuts = Shortcuts.asInstanceOf[js.Any], ViewType = ViewType.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OutlookBarGroup_typekey")(OutlookDotOutlookBarGroup_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutlookBarGroup]
  }
  
  @scala.inline
  implicit class OutlookBarGroupMutableBuilder[Self <: OutlookBarGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotOutlookBarGroup_typekey(value: OutlookBarGroup): Self = StObject.set(x, "Outlook.OutlookBarGroup_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortcuts(value: OutlookBarShortcuts): Self = StObject.set(x, "Shortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewType(value: OlOutlookBarViewType): Self = StObject.set(x, "ViewType", value.asInstanceOf[js.Any])
  }
}
