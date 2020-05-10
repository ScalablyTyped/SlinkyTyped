package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposUpdateProtectedBranchPullRequestReviewEnforcementParamsDismissalRestrictions extends js.Object {
  var teams: js.UndefOr[js.Array[String]] = js.native
  var users: js.UndefOr[js.Array[String]] = js.native
}

object ReposUpdateProtectedBranchPullRequestReviewEnforcementParamsDismissalRestrictions {
  @scala.inline
  def apply(): ReposUpdateProtectedBranchPullRequestReviewEnforcementParamsDismissalRestrictions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReposUpdateProtectedBranchPullRequestReviewEnforcementParamsDismissalRestrictions]
  }
  @scala.inline
  implicit class ReposUpdateProtectedBranchPullRequestReviewEnforcementParamsDismissalRestrictionsOps[Self <: ReposUpdateProtectedBranchPullRequestReviewEnforcementParamsDismissalRestrictions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTeams(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teams")(js.undefined)
        ret
    }
    @scala.inline
    def withUsers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(js.undefined)
        ret
    }
  }
  
}

