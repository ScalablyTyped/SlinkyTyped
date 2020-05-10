package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullsDismissReviewResponseLinks extends js.Object {
  var html: PullsDismissReviewResponseLinksHtml = js.native
  var pull_request: PullsDismissReviewResponseLinksPullRequest = js.native
}

object PullsDismissReviewResponseLinks {
  @scala.inline
  def apply(
    html: PullsDismissReviewResponseLinksHtml,
    pull_request: PullsDismissReviewResponseLinksPullRequest
  ): PullsDismissReviewResponseLinks = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsDismissReviewResponseLinks]
  }
  @scala.inline
  implicit class PullsDismissReviewResponseLinksOps[Self <: PullsDismissReviewResponseLinks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHtml(value: PullsDismissReviewResponseLinksHtml): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPull_request(value: PullsDismissReviewResponseLinksPullRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull_request")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

