package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Evaluation extends js.Object {
  /**
    * The names of the approval rules that have not had their conditions met.
    */
  var approvalRulesNotSatisfied: js.UndefOr[ApprovalRulesNotSatisfiedList] = js.native
  /**
    * The names of the approval rules that have had their conditions met.
    */
  var approvalRulesSatisfied: js.UndefOr[ApprovalRulesSatisfiedList] = js.native
  /**
    * Whether the state of the pull request is approved.
    */
  var approved: js.UndefOr[Approved] = js.native
  /**
    * Whether the approval rule requirements for the pull request have been overridden and no longer need to be met.
    */
  var overridden: js.UndefOr[Overridden] = js.native
}

object Evaluation {
  @scala.inline
  def apply(): Evaluation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Evaluation]
  }
  @scala.inline
  implicit class EvaluationOps[Self <: Evaluation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApprovalRulesNotSatisfied(value: ApprovalRulesNotSatisfiedList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalRulesNotSatisfied")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApprovalRulesNotSatisfied: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalRulesNotSatisfied")(js.undefined)
        ret
    }
    @scala.inline
    def withApprovalRulesSatisfied(value: ApprovalRulesSatisfiedList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalRulesSatisfied")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApprovalRulesSatisfied: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalRulesSatisfied")(js.undefined)
        ret
    }
    @scala.inline
    def withApproved(value: Approved): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApproved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approved")(js.undefined)
        ret
    }
    @scala.inline
    def withOverridden(value: Overridden): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overridden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverridden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overridden")(js.undefined)
        ret
    }
  }
  
}

