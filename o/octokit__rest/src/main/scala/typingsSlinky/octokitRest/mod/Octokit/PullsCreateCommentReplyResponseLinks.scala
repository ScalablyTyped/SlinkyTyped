package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullsCreateCommentReplyResponseLinks extends js.Object {
  var html: PullsCreateCommentReplyResponseLinksHtml = js.native
  var pull_request: PullsCreateCommentReplyResponseLinksPullRequest = js.native
  var self: PullsCreateCommentReplyResponseLinksSelf = js.native
}

object PullsCreateCommentReplyResponseLinks {
  @scala.inline
  def apply(
    html: PullsCreateCommentReplyResponseLinksHtml,
    pull_request: PullsCreateCommentReplyResponseLinksPullRequest,
    self: PullsCreateCommentReplyResponseLinksSelf
  ): PullsCreateCommentReplyResponseLinks = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsCreateCommentReplyResponseLinks]
  }
  @scala.inline
  implicit class PullsCreateCommentReplyResponseLinksOps[Self <: PullsCreateCommentReplyResponseLinks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHtml(value: PullsCreateCommentReplyResponseLinksHtml): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPull_request(value: PullsCreateCommentReplyResponseLinksPullRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull_request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelf(value: PullsCreateCommentReplyResponseLinksSelf): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("self")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

