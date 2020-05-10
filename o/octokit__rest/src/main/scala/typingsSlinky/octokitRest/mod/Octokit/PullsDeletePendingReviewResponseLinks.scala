package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullsDeletePendingReviewResponseLinks extends js.Object {
  var html: PullsDeletePendingReviewResponseLinksHtml = js.native
  var pull_request: PullsDeletePendingReviewResponseLinksPullRequest = js.native
}

object PullsDeletePendingReviewResponseLinks {
  @scala.inline
  def apply(
    html: PullsDeletePendingReviewResponseLinksHtml,
    pull_request: PullsDeletePendingReviewResponseLinksPullRequest
  ): PullsDeletePendingReviewResponseLinks = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsDeletePendingReviewResponseLinks]
  }
  @scala.inline
  implicit class PullsDeletePendingReviewResponseLinksOps[Self <: PullsDeletePendingReviewResponseLinks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHtml(value: PullsDeletePendingReviewResponseLinksHtml): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPull_request(value: PullsDeletePendingReviewResponseLinksPullRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull_request")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

