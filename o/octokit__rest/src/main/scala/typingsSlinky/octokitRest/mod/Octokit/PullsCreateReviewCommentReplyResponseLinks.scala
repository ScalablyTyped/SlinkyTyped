package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullsCreateReviewCommentReplyResponseLinks extends js.Object {
  var html: PullsCreateReviewCommentReplyResponseLinksHtml = js.native
  var pull_request: PullsCreateReviewCommentReplyResponseLinksPullRequest = js.native
  var self: PullsCreateReviewCommentReplyResponseLinksSelf = js.native
}

object PullsCreateReviewCommentReplyResponseLinks {
  @scala.inline
  def apply(
    html: PullsCreateReviewCommentReplyResponseLinksHtml,
    pull_request: PullsCreateReviewCommentReplyResponseLinksPullRequest,
    self: PullsCreateReviewCommentReplyResponseLinksSelf
  ): PullsCreateReviewCommentReplyResponseLinks = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsCreateReviewCommentReplyResponseLinks]
  }
  @scala.inline
  implicit class PullsCreateReviewCommentReplyResponseLinksOps[Self <: PullsCreateReviewCommentReplyResponseLinks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHtml(value: PullsCreateReviewCommentReplyResponseLinksHtml): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPull_request(value: PullsCreateReviewCommentReplyResponseLinksPullRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull_request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelf(value: PullsCreateReviewCommentReplyResponseLinksSelf): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("self")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

