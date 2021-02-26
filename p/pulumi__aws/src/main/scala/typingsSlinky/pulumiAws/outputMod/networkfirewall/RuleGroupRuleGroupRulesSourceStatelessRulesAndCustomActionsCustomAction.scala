package typingsSlinky.pulumiAws.outputMod.networkfirewall

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomAction extends StObject {
  
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
  implicit class RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionMutableBuilder[Self <: RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionDefinition(value: RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinition): Self = StObject.set(x, "actionDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionName(value: String): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
  }
}
