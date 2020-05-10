package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullsGetReviewResponseLinks extends js.Object {
  var html: PullsGetReviewResponseLinksHtml = js.native
  var pull_request: PullsGetReviewResponseLinksPullRequest = js.native
}

object PullsGetReviewResponseLinks {
  @scala.inline
  def apply(html: PullsGetReviewResponseLinksHtml, pull_request: PullsGetReviewResponseLinksPullRequest): PullsGetReviewResponseLinks = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsGetReviewResponseLinks]
  }
  @scala.inline
  implicit class PullsGetReviewResponseLinksOps[Self <: PullsGetReviewResponseLinks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHtml(value: PullsGetReviewResponseLinksHtml): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPull_request(value: PullsGetReviewResponseLinksPullRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull_request")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

