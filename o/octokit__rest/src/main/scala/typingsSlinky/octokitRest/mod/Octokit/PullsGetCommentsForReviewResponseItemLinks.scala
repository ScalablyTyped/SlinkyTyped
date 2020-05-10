package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullsGetCommentsForReviewResponseItemLinks extends js.Object {
  var html: PullsGetCommentsForReviewResponseItemLinksHtml = js.native
  var pull_request: PullsGetCommentsForReviewResponseItemLinksPullRequest = js.native
  var self: PullsGetCommentsForReviewResponseItemLinksSelf = js.native
}

object PullsGetCommentsForReviewResponseItemLinks {
  @scala.inline
  def apply(
    html: PullsGetCommentsForReviewResponseItemLinksHtml,
    pull_request: PullsGetCommentsForReviewResponseItemLinksPullRequest,
    self: PullsGetCommentsForReviewResponseItemLinksSelf
  ): PullsGetCommentsForReviewResponseItemLinks = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsGetCommentsForReviewResponseItemLinks]
  }
  @scala.inline
  implicit class PullsGetCommentsForReviewResponseItemLinksOps[Self <: PullsGetCommentsForReviewResponseItemLinks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHtml(value: PullsGetCommentsForReviewResponseItemLinksHtml): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPull_request(value: PullsGetCommentsForReviewResponseItemLinksPullRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull_request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelf(value: PullsGetCommentsForReviewResponseItemLinksSelf): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("self")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

