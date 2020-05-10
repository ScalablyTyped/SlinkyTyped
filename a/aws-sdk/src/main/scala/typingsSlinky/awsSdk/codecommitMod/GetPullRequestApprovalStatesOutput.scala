package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPullRequestApprovalStatesOutput extends js.Object {
  /**
    * Information about users who have approved the pull request.
    */
  var approvals: js.UndefOr[ApprovalList] = js.native
}

object GetPullRequestApprovalStatesOutput {
  @scala.inline
  def apply(): GetPullRequestApprovalStatesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPullRequestApprovalStatesOutput]
  }
  @scala.inline
  implicit class GetPullRequestApprovalStatesOutputOps[Self <: GetPullRequestApprovalStatesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApprovals(value: ApprovalList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApprovals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvals")(js.undefined)
        ret
    }
  }
  
}

