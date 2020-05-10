package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullsGetCommentsForReviewResponseItemLinksPullRequest extends js.Object {
  var href: String = js.native
}

object PullsGetCommentsForReviewResponseItemLinksPullRequest {
  @scala.inline
  def apply(href: String): PullsGetCommentsForReviewResponseItemLinksPullRequest = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsGetCommentsForReviewResponseItemLinksPullRequest]
  }
  @scala.inline
  implicit class PullsGetCommentsForReviewResponseItemLinksPullRequestOps[Self <: PullsGetCommentsForReviewResponseItemLinksPullRequest] (val x: Self) extends AnyVal {
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

