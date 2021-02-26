package typingsSlinky.pulumiAws.outputMod.networkfirewall

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleGroupRuleGroup extends StObject {
  
  /**
    * A configuration block that defines additional settings available to use in the rules defined in the rule group. See Rule Variables below for details.
    */
  var ruleVariables: js.UndefOr[RuleGroupRuleGroupRuleVariables] = js.native
  
  /**
    * A configuration block that defines the stateful or stateless rules for the rule group. See Rules Source below for details.
    */
  var rulesSource: RuleGroupRuleGroupRulesSource = js.native
}
object RuleGroupRuleGroup {
  
  @scala.inline
  def apply(rulesSource: RuleGroupRuleGroupRulesSource): RuleGroupRuleGroup = {
    val __obj = js.Dynamic.literal(rulesSource = rulesSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleGroup]
  }
  
  @scala.inline
  implicit class RuleGroupRuleGroupMutableBuilder[Self <: RuleGroupRuleGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRuleVariables(value: RuleGroupRuleGroupRuleVariables): Self = StObject.set(x, "ruleVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleVariablesUndefined: Self = StObject.set(x, "ruleVariables", js.undefined)
    
    @scala.inline
    def setRulesSource(value: RuleGroupRuleGroupRulesSource): Self = StObject.set(x, "rulesSource", value.asInstanceOf[js.Any])
  }
}
