package typingsSlinky.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleGroupReferenceStatement extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the entity.
    */
  var ARN: ResourceArn = js.native
  /**
    * The names of rules that are in the referenced rule group, but that you want AWS WAF to exclude from processing for this rule statement. 
    */
  var ExcludedRules: js.UndefOr[typingsSlinky.awsSdk.wafv2Mod.ExcludedRules] = js.native
}

object RuleGroupReferenceStatement {
  @scala.inline
  def apply(ARN: ResourceArn): RuleGroupReferenceStatement = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupReferenceStatement]
  }
  @scala.inline
  implicit class RuleGroupReferenceStatementOps[Self <: RuleGroupReferenceStatement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withARN(value: ResourceArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcludedRules(value: ExcludedRules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExcludedRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludedRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExcludedRules")(js.undefined)
        ret
    }
  }
  
}

