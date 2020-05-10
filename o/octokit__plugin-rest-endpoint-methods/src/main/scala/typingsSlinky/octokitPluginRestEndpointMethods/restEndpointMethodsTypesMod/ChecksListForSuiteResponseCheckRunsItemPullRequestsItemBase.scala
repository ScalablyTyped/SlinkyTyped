package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChecksListForSuiteResponseCheckRunsItemPullRequestsItemBase extends js.Object {
  var ref: String = js.native
  var repo: ChecksListForSuiteResponseCheckRunsItemPullRequestsItemBaseRepo = js.native
  var sha: String = js.native
}

object ChecksListForSuiteResponseCheckRunsItemPullRequestsItemBase {
  @scala.inline
  def apply(ref: String, repo: ChecksListForSuiteResponseCheckRunsItemPullRequestsItemBaseRepo, sha: String): ChecksListForSuiteResponseCheckRunsItemPullRequestsItemBase = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksListForSuiteResponseCheckRunsItemPullRequestsItemBase]
  }
  @scala.inline
  implicit class ChecksListForSuiteResponseCheckRunsItemPullRequestsItemBaseOps[Self <: ChecksListForSuiteResponseCheckRunsItemPullRequestsItemBase] (val x: Self) extends AnyVal {
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
    def withRepo(value: ChecksListForSuiteResponseCheckRunsItemPullRequestsItemBaseRepo): Self = {
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

