package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableInsightRulesInput extends js.Object {
  
  /**
    * An array of the rule names to disable. If you need to find out the names of your rules, use DescribeInsightRules.
    */
  var RuleNames: InsightRuleNames = js.native
}
object DisableInsightRulesInput {
  
  @scala.inline
  def apply(RuleNames: InsightRuleNames): DisableInsightRulesInput = {
    val __obj = js.Dynamic.literal(RuleNames = RuleNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableInsightRulesInput]
  }
  
  @scala.inline
  implicit class DisableInsightRulesInputOps[Self <: DisableInsightRulesInput] (val x: Self) extends AnyVal {
    
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
    def setRuleNamesVarargs(value: InsightRuleName*): Self = this.set("RuleNames", js.Array(value :_*))
    
    @scala.inline
    def setRuleNames(value: InsightRuleNames): Self = this.set("RuleNames", value.asInstanceOf[js.Any])
  }
}
