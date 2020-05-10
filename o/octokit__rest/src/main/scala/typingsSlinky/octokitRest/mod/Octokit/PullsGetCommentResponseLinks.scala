package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullsGetCommentResponseLinks extends js.Object {
  var html: PullsGetCommentResponseLinksHtml = js.native
  var pull_request: PullsGetCommentResponseLinksPullRequest = js.native
  var self: PullsGetCommentResponseLinksSelf = js.native
}

object PullsGetCommentResponseLinks {
  @scala.inline
  def apply(
    html: PullsGetCommentResponseLinksHtml,
    pull_request: PullsGetCommentResponseLinksPullRequest,
    self: PullsGetCommentResponseLinksSelf
  ): PullsGetCommentResponseLinks = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsGetCommentResponseLinks]
  }
  @scala.inline
  implicit class PullsGetCommentResponseLinksOps[Self <: PullsGetCommentResponseLinks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHtml(value: PullsGetCommentResponseLinksHtml): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPull_request(value: PullsGetCommentResponseLinksPullRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull_request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelf(value: PullsGetCommentResponseLinksSelf): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("self")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

