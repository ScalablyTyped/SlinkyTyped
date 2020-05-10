package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullsCreateReviewCommentReplyResponseLinksPullRequest extends js.Object {
  var href: String = js.native
}

object PullsCreateReviewCommentReplyResponseLinksPullRequest {
  @scala.inline
  def apply(href: String): PullsCreateReviewCommentReplyResponseLinksPullRequest = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsCreateReviewCommentReplyResponseLinksPullRequest]
  }
  @scala.inline
  implicit class PullsCreateReviewCommentReplyResponseLinksPullRequestOps[Self <: PullsCreateReviewCommentReplyResponseLinksPullRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

