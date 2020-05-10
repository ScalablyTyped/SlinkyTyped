package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchIssuesResponseItemsItemPullRequest extends js.Object {
  var diff_url: Null = js.native
  var html_url: Null = js.native
  var patch_url: Null = js.native
}

object SearchIssuesResponseItemsItemPullRequest {
  @scala.inline
  def apply(diff_url: Null, html_url: Null, patch_url: Null): SearchIssuesResponseItemsItemPullRequest = {
    val __obj = js.Dynamic.literal(diff_url = diff_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], patch_url = patch_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchIssuesResponseItemsItemPullRequest]
  }
  @scala.inline
  implicit class SearchIssuesResponseItemsItemPullRequestOps[Self <: SearchIssuesResponseItemsItemPullRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiff_url(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diff_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml_url(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPatch_url(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch_url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

