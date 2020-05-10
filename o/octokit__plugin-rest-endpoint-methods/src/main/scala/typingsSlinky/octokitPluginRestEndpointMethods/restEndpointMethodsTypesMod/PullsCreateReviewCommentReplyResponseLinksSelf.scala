package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullsCreateReviewCommentReplyResponseLinksSelf extends js.Object {
  var href: String = js.native
}

object PullsCreateReviewCommentReplyResponseLinksSelf {
  @scala.inline
  def apply(href: String): PullsCreateReviewCommentReplyResponseLinksSelf = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsCreateReviewCommentReplyResponseLinksSelf]
  }
  @scala.inline
  implicit class PullsCreateReviewCommentReplyResponseLinksSelfOps[Self <: PullsCreateReviewCommentReplyResponseLinksSelf] (val x: Self) extends AnyVal {
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

