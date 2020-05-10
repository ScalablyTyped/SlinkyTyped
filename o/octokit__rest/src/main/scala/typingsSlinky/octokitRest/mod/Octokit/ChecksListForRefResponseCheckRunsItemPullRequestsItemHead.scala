package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChecksListForRefResponseCheckRunsItemPullRequestsItemHead extends js.Object {
  var ref: String = js.native
  var repo: ChecksListForRefResponseCheckRunsItemPullRequestsItemHeadRepo = js.native
  var sha: String = js.native
}

object ChecksListForRefResponseCheckRunsItemPullRequestsItemHead {
  @scala.inline
  def apply(ref: String, repo: ChecksListForRefResponseCheckRunsItemPullRequestsItemHeadRepo, sha: String): ChecksListForRefResponseCheckRunsItemPullRequestsItemHead = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksListForRefResponseCheckRunsItemPullRequestsItemHead]
  }
  @scala.inline
  implicit class ChecksListForRefResponseCheckRunsItemPullRequestsItemHeadOps[Self <: ChecksListForRefResponseCheckRunsItemPullRequestsItemHead] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: ChecksListForRefResponseCheckRunsItemPullRequestsItemHeadRepo): Self = {
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
  }
  
}

