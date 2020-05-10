package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposListPullRequestsAssociatedWithCommitResponseItemHead extends js.Object {
  var label: String = js.native
  var ref: String = js.native
  var repo: ReposListPullRequestsAssociatedWithCommitResponseItemHeadRepo = js.native
  var sha: String = js.native
  var user: ReposListPullRequestsAssociatedWithCommitResponseItemHeadUser = js.native
}

object ReposListPullRequestsAssociatedWithCommitResponseItemHead {
  @scala.inline
  def apply(
    label: String,
    ref: String,
    repo: ReposListPullRequestsAssociatedWithCommitResponseItemHeadRepo,
    sha: String,
    user: ReposListPullRequestsAssociatedWithCommitResponseItemHeadUser
  ): ReposListPullRequestsAssociatedWithCommitResponseItemHead = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListPullRequestsAssociatedWithCommitResponseItemHead]
  }
  @scala.inline
  implicit class ReposListPullRequestsAssociatedWithCommitResponseItemHeadOps[Self <: ReposListPullRequestsAssociatedWithCommitResponseItemHead] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: ReposListPullRequestsAssociatedWithCommitResponseItemHeadRepo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSha(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: ReposListPullRequestsAssociatedWithCommitResponseItemHeadUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

