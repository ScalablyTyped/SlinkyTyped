package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposUpdateBranchProtectionParamsRestrictions extends js.Object {
  var apps: js.UndefOr[js.Array[String]] = js.native
  var teams: js.Array[String] = js.native
  var users: js.Array[String] = js.native
}

object ReposUpdateBranchProtectionParamsRestrictions {
  @scala.inline
  def apply(teams: js.Array[String], users: js.Array[String]): ReposUpdateBranchProtectionParamsRestrictions = {
    val __obj = js.Dynamic.literal(teams = teams.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateBranchProtectionParamsRestrictions]
  }
  @scala.inline
  implicit class ReposUpdateBranchProtectionParamsRestrictionsOps[Self <: ReposUpdateBranchProtectionParamsRestrictions] (val x: Self) extends AnyVal {
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
    def withUsers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApps(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apps")(js.undefined)
        ret
    }
  }
  
}

