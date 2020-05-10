package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullsUpdateCommentResponseLinksPullRequest extends js.Object {
  var href: String = js.native
}

object PullsUpdateCommentResponseLinksPullRequest {
  @scala.inline
  def apply(href: String): PullsUpdateCommentResponseLinksPullRequest = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsUpdateCommentResponseLinksPullRequest]
  }
  @scala.inline
  implicit class PullsUpdateCommentResponseLinksPullRequestOps[Self <: PullsUpdateCommentResponseLinksPullRequest] (val x: Self) extends AnyVal {
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

