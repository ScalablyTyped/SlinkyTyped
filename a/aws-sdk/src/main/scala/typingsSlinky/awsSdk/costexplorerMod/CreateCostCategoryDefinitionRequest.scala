package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCostCategoryDefinitionRequest extends js.Object {
  var Name: CostCategoryName = js.native
  var RuleVersion: CostCategoryRuleVersion = js.native
  /**
    *  CreateCostCategoryDefinition supports dimensions, Tags, and nested expressions. Currently the only dimensions supported is LINKED_ACCOUNT. Root level OR is not supported. We recommend you create a separate rule instead. Rules are processed in order. If there are multiple rules that match the line item, then the first rule to match is used to determine that Cost Category value. 
    */
  var Rules: CostCategoryRulesList = js.native
}

object CreateCostCategoryDefinitionRequest {
  @scala.inline
  def apply(Name: CostCategoryName, RuleVersion: CostCategoryRuleVersion, Rules: CostCategoryRulesList): CreateCostCategoryDefinitionRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RuleVersion = RuleVersion.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCostCategoryDefinitionRequest]
  }
  @scala.inline
  implicit class CreateCostCategoryDefinitionRequestOps[Self <: CreateCostCategoryDefinitionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: CostCategoryName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuleVersion(value: CostCategoryRuleVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRules(value: CostCategoryRulesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rules")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

