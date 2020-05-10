package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullsListReviewsResponseItemLinks extends js.Object {
  var html: PullsListReviewsResponseItemLinksHtml = js.native
  var pull_request: PullsListReviewsResponseItemLinksPullRequest = js.native
}

object PullsListReviewsResponseItemLinks {
  @scala.inline
  def apply(
    html: PullsListReviewsResponseItemLinksHtml,
    pull_request: PullsListReviewsResponseItemLinksPullRequest
  ): PullsListReviewsResponseItemLinks = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsListReviewsResponseItemLinks]
  }
  @scala.inline
  implicit class PullsListReviewsResponseItemLinksOps[Self <: PullsListReviewsResponseItemLinks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHtml(value: PullsListReviewsResponseItemLinksHtml): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPull_request(value: PullsListReviewsResponseItemLinksPullRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull_request")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

