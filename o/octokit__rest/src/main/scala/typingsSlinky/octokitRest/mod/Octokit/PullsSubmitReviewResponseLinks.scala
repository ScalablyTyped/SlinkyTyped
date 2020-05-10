package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullsSubmitReviewResponseLinks extends js.Object {
  var html: PullsSubmitReviewResponseLinksHtml = js.native
  var pull_request: PullsSubmitReviewResponseLinksPullRequest = js.native
}

object PullsSubmitReviewResponseLinks {
  @scala.inline
  def apply(html: PullsSubmitReviewResponseLinksHtml, pull_request: PullsSubmitReviewResponseLinksPullRequest): PullsSubmitReviewResponseLinks = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsSubmitReviewResponseLinks]
  }
  @scala.inline
  implicit class PullsSubmitReviewResponseLinksOps[Self <: PullsSubmitReviewResponseLinks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHtml(value: PullsSubmitReviewResponseLinksHtml): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPull_request(value: PullsSubmitReviewResponseLinksPullRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull_request")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

