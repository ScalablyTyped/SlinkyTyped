package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullsListReviewsResponseItemLinksPullRequest extends js.Object {
  var href: String = js.native
}

object PullsListReviewsResponseItemLinksPullRequest {
  @scala.inline
  def apply(href: String): PullsListReviewsResponseItemLinksPullRequest = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsListReviewsResponseItemLinksPullRequest]
  }
  @scala.inline
  implicit class PullsListReviewsResponseItemLinksPullRequestOps[Self <: PullsListReviewsResponseItemLinksPullRequest] (val x: Self) extends AnyVal {
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

