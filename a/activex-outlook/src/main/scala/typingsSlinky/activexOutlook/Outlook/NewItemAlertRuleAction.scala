package typingsSlinky.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewItemAlertRuleAction extends StObject {
  
  val ActionType: OlRuleActionType = js.native
  
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  var Enabled: Boolean = js.native
  
  @JSName("Outlook.NewItemAlertRuleAction_typekey")
  var OutlookDotNewItemAlertRuleAction_typekey: NewItemAlertRuleAction = js.native
  
  val Parent: js.Any = js.native
  
  val Session: NameSpace = js.native
  
  var Text: String = js.native
}
object NewItemAlertRuleAction {
  
  @scala.inline
  def apply(
    ActionType: OlRuleActionType,
    Application: Application,
    Class: OlObjectClass,
    Enabled: Boolean,
    OutlookDotNewItemAlertRuleAction_typekey: NewItemAlertRuleAction,
    Parent: js.Any,
    Session: NameSpace,
    Text: String
  ): NewItemAlertRuleAction = {
    val __obj = js.Dynamic.literal(ActionType = ActionType.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.NewItemAlertRuleAction_typekey")(OutlookDotNewItemAlertRuleAction_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewItemAlertRuleAction]
  }
  
  @scala.inline
  implicit class NewItemAlertRuleActionMutableBuilder[Self <: NewItemAlertRuleAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionType(value: OlRuleActionType): Self = StObject.set(x, "ActionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotNewItemAlertRuleAction_typekey(value: NewItemAlertRuleAction): Self = StObject.set(x, "Outlook.NewItemAlertRuleAction_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
