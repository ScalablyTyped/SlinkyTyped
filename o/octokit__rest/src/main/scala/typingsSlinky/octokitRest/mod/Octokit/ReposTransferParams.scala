package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposTransferParams extends js.Object {
  /**
    * **Required:** The username or organization name the repository will be transferred to.
    */
  var new_owner: js.UndefOr[String] = js.native
  var owner: String = js.native
  var repo: String = js.native
  /**
    * ID of the team or teams to add to the repository. Teams can only be added to organization-owned repositories.
    */
  var team_ids: js.UndefOr[js.Array[Double]] = js.native
}

object ReposTransferParams {
  @scala.inline
  def apply(owner: String, repo: String): ReposTransferParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposTransferParams]
  }
  @scala.inline
  implicit class ReposTransferParamsOps[Self <: ReposTransferParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNew_owner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew_owner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_owner")(js.undefined)
        ret
    }
    @scala.inline
    def withTeam_ids(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeam_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team_ids")(js.undefined)
        ret
    }
  }
  
}

