package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CostCategoryRule extends js.Object {
  /**
    * An Expression object used to categorize costs. This supports dimensions, Tags, and nested expressions. Currently the only dimensions supported is LINKED_ACCOUNT. Root level OR is not supported. We recommend you create a separate rule instead.
    */
  var Rule: Expression = js.native
  var Value: CostCategoryValue = js.native
}

object CostCategoryRule {
  @scala.inline
  def apply(Rule: Expression, Value: CostCategoryValue): CostCategoryRule = {
    val __obj = js.Dynamic.literal(Rule = Rule.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CostCategoryRule]
  }
  @scala.inline
  implicit class CostCategoryRuleOps[Self <: CostCategoryRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRule(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: CostCategoryValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

