package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullsCreateCommentResponseLinks extends js.Object {
  var html: PullsCreateCommentResponseLinksHtml = js.native
  var pull_request: PullsCreateCommentResponseLinksPullRequest = js.native
  var self: PullsCreateCommentResponseLinksSelf = js.native
}

object PullsCreateCommentResponseLinks {
  @scala.inline
  def apply(
    html: PullsCreateCommentResponseLinksHtml,
    pull_request: PullsCreateCommentResponseLinksPullRequest,
    self: PullsCreateCommentResponseLinksSelf
  ): PullsCreateCommentResponseLinks = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsCreateCommentResponseLinks]
  }
  @scala.inline
  implicit class PullsCreateCommentResponseLinksOps[Self <: PullsCreateCommentResponseLinks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHtml(value: PullsCreateCommentResponseLinksHtml): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPull_request(value: PullsCreateCommentResponseLinksPullRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull_request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelf(value: PullsCreateCommentResponseLinksSelf): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("self")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

