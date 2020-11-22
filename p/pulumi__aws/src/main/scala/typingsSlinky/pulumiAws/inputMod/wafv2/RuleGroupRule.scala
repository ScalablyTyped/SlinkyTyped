package typingsSlinky.pulumiAws.inputMod.wafv2

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleGroupRule extends js.Object {
  
  /**
    * The action that AWS WAF should take on a web request when it matches the rule's statement. Settings at the `aws.wafv2.WebAcl` level can override the rule action setting. See Action below for details.
    */
  var action: Input[RuleGroupRuleAction] = js.native
  
  /**
    * A friendly name of the rule.
    */
  var name: Input[String] = js.native
  
  /**
    * If you define more than one Rule in a WebACL, AWS WAF evaluates each request against the `rules` in order based on the value of `priority`. AWS WAF processes rules with lower priority first.
    */
  var priority: Input[Double] = js.native
  
  /**
    * The AWS WAF processing statement for the rule, for example `byteMatchStatement` or `geoMatchStatement`. See Statement below for details.
    */
  var statement: Input[RuleGroupRuleStatement] = js.native
  
  /**
    * Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
    */
  var visibilityConfig: Input[RuleGroupRuleVisibilityConfig] = js.native
}
object RuleGroupRule {
  
  @scala.inline
  def apply(
    action: Input[RuleGroupRuleAction],
    name: Input[String],
    priority: Input[Double],
    statement: Input[RuleGroupRuleStatement],
    visibilityConfig: Input[RuleGroupRuleVisibilityConfig]
  ): RuleGroupRule = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], statement = statement.asInstanceOf[js.Any], visibilityConfig = visibilityConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRule]
  }
  
  @scala.inline
  implicit class RuleGroupRuleOps[Self <: RuleGroupRule] (val x: Self) extends AnyVal {
    
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
    def setAction(value: Input[RuleGroupRuleAction]): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Input[Double]): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatement(value: Input[RuleGroupRuleStatement]): Self = this.set("statement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityConfig(value: Input[RuleGroupRuleVisibilityConfig]): Self = this.set("visibilityConfig", value.asInstanceOf[js.Any])
  }
}
