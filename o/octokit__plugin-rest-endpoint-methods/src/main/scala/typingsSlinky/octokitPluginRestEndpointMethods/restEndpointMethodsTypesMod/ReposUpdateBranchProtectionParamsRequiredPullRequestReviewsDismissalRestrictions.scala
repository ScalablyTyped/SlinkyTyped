package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposUpdateBranchProtectionParamsRequiredPullRequestReviewsDismissalRestrictions extends js.Object {
  /**
    * The list of team `slug`s with dismissal access
    */
  var teams: js.UndefOr[js.Array[String]] = js.native
  /**
    * The list of user `login`s with dismissal access
    */
  var users: js.UndefOr[js.Array[String]] = js.native
}

object ReposUpdateBranchProtectionParamsRequiredPullRequestReviewsDismissalRestrictions {
  @scala.inline
  def apply(): ReposUpdateBranchProtectionParamsRequiredPullRequestReviewsDismissalRestrictions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReposUpdateBranchProtectionParamsRequiredPullRequestReviewsDismissalRestrictions]
  }
  @scala.inline
  implicit class ReposUpdateBranchProtectionParamsRequiredPullRequestReviewsDismissalRestrictionsOps[Self <: ReposUpdateBranchProtectionParamsRequiredPullRequestReviewsDismissalRestrictions] (val x: Self) extends AnyVal {
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

