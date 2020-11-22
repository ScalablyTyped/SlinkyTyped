package typingsSlinky.pulumiAws.outputMod.networkfirewall

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActions extends js.Object {
  
  /**
    * Set of configuration blocks containing custom action definitions that are available for use by the set of `stateless rule`. See Custom Action below for details.
    */
  var customActions: js.UndefOr[
    js.Array[RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomAction]
  ] = js.native
  
  /**
    * Set of configuration blocks containing the stateless rules for use in the stateless rule group. See Stateless Rule below for details.
    */
  var statelessRules: js.Array[RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRule] = js.native
}
object RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActions {
  
  @scala.inline
  def apply(statelessRules: js.Array[RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRule]): RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActions = {
    val __obj = js.Dynamic.literal(statelessRules = statelessRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActions]
  }
  
  @scala.inline
  implicit class RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsOps[Self <: RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActions] (val x: Self) extends AnyVal {
    
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
    def setStatelessRulesVarargs(value: RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRule*): Self = this.set("statelessRules", js.Array(value :_*))
    
    @scala.inline
    def setStatelessRules(value: js.Array[RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRule]): Self = this.set("statelessRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomActionsVarargs(value: RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomAction*): Self = this.set("customActions", js.Array(value :_*))
    
    @scala.inline
    def setCustomActions(value: js.Array[RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomAction]): Self = this.set("customActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomActions: Self = this.set("customActions", js.undefined)
  }
}
