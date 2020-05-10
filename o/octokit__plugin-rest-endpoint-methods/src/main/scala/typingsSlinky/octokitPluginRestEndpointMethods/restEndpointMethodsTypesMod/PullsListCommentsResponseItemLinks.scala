package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullsListCommentsResponseItemLinks extends js.Object {
  var html: PullsListCommentsResponseItemLinksHtml = js.native
  var pull_request: PullsListCommentsResponseItemLinksPullRequest = js.native
  var self: PullsListCommentsResponseItemLinksSelf = js.native
}

object PullsListCommentsResponseItemLinks {
  @scala.inline
  def apply(
    html: PullsListCommentsResponseItemLinksHtml,
    pull_request: PullsListCommentsResponseItemLinksPullRequest,
    self: PullsListCommentsResponseItemLinksSelf
  ): PullsListCommentsResponseItemLinks = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsListCommentsResponseItemLinks]
  }
  @scala.inline
  implicit class PullsListCommentsResponseItemLinksOps[Self <: PullsListCommentsResponseItemLinks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHtml(value: PullsListCommentsResponseItemLinksHtml): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPull_request(value: PullsListCommentsResponseItemLinksPullRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull_request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelf(value: PullsListCommentsResponseItemLinksSelf): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("self")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

