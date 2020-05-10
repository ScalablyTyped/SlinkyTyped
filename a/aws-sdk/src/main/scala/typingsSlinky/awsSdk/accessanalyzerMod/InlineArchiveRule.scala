package typingsSlinky.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InlineArchiveRule extends js.Object {
  /**
    * The condition and values for a criterion.
    */
  var filter: FilterCriteriaMap = js.native
  /**
    * The name of the rule.
    */
  var ruleName: Name = js.native
}

object InlineArchiveRule {
  @scala.inline
  def apply(filter: FilterCriteriaMap, ruleName: Name): InlineArchiveRule = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineArchiveRule]
  }
  @scala.inline
  implicit class InlineArchiveRuleOps[Self <: InlineArchiveRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilter(value: FilterCriteriaMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuleName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

