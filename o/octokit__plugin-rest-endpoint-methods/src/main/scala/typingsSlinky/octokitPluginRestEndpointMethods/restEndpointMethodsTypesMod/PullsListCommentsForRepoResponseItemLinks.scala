package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullsListCommentsForRepoResponseItemLinks extends js.Object {
  var html: PullsListCommentsForRepoResponseItemLinksHtml = js.native
  var pull_request: PullsListCommentsForRepoResponseItemLinksPullRequest = js.native
  var self: PullsListCommentsForRepoResponseItemLinksSelf = js.native
}

object PullsListCommentsForRepoResponseItemLinks {
  @scala.inline
  def apply(
    html: PullsListCommentsForRepoResponseItemLinksHtml,
    pull_request: PullsListCommentsForRepoResponseItemLinksPullRequest,
    self: PullsListCommentsForRepoResponseItemLinksSelf
  ): PullsListCommentsForRepoResponseItemLinks = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsListCommentsForRepoResponseItemLinks]
  }
  @scala.inline
  implicit class PullsListCommentsForRepoResponseItemLinksOps[Self <: PullsListCommentsForRepoResponseItemLinks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHtml(value: PullsListCommentsForRepoResponseItemLinksHtml): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPull_request(value: PullsListCommentsForRepoResponseItemLinksPullRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull_request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelf(value: PullsListCommentsForRepoResponseItemLinksSelf): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("self")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

