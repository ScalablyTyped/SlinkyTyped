package typingsSlinky.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleAction extends StObject {
  
  val ActionType: OlRuleActionType = js.native
  
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  var Enabled: Boolean = js.native
  
  @JSName("Outlook.RuleAction_typekey")
  var OutlookDotRuleAction_typekey: RuleAction = js.native
  
  val Parent: js.Any = js.native
  
  val Session: NameSpace = js.native
}
object RuleAction {
  
  @scala.inline
  def apply(
    ActionType: OlRuleActionType,
    Application: Application,
    Class: OlObjectClass,
    Enabled: Boolean,
    OutlookDotRuleAction_typekey: RuleAction,
    Parent: js.Any,
    Session: NameSpace
  ): RuleAction = {
    val __obj = js.Dynamic.literal(ActionType = ActionType.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.RuleAction_typekey")(OutlookDotRuleAction_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleAction]
  }
  
  @scala.inline
  implicit class RuleActionMutableBuilder[Self <: RuleAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionType(value: OlRuleActionType): Self = StObject.set(x, "ActionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotRuleAction_typekey(value: RuleAction): Self = StObject.set(x, "Outlook.RuleAction_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
