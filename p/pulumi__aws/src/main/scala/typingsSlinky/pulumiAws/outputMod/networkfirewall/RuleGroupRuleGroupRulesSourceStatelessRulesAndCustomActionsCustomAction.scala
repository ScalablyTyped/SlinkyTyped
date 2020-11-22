package typingsSlinky.pulumiAws.outputMod.networkfirewall

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomAction extends js.Object {
  
  /**
    * A configuration block describing the custom action associated with the `actionName`. See Action Definition below for details.
    */
  var actionDefinition: RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinition = js.native
  
  /**
    * A friendly name of the custom action.
    */
  var actionName: String = js.native
}
object RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomAction {
  
  @scala.inline
  def apply(
    actionDefinition: RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinition,
    actionName: String
  ): RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomAction = {
    val __obj = js.Dynamic.literal(actionDefinition = actionDefinition.asInstanceOf[js.Any], actionName = actionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomAction]
  }
  
  @scala.inline
  implicit class RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionOps[Self <: RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActionDefinition(value: RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinition): Self = this.set("actionDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionName(value: String): Self = this.set("actionName", value.asInstanceOf[js.Any])
  }
}
