package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullsCreateResponseLinks extends js.Object {
  var comments: PullsCreateResponseLinksComments = js.native
  var commits: PullsCreateResponseLinksCommits = js.native
  var html: PullsCreateResponseLinksHtml = js.native
  var issue: PullsCreateResponseLinksIssue = js.native
  var review_comment: PullsCreateResponseLinksReviewComment = js.native
  var review_comments: PullsCreateResponseLinksReviewComments = js.native
  var self: PullsCreateResponseLinksSelf = js.native
  var statuses: PullsCreateResponseLinksStatuses = js.native
}

object PullsCreateResponseLinks {
  @scala.inline
  def apply(
    comments: PullsCreateResponseLinksComments,
    commits: PullsCreateResponseLinksCommits,
    html: PullsCreateResponseLinksHtml,
    issue: PullsCreateResponseLinksIssue,
    review_comment: PullsCreateResponseLinksReviewComment,
    review_comments: PullsCreateResponseLinksReviewComments,
    self: PullsCreateResponseLinksSelf,
    statuses: PullsCreateResponseLinksStatuses
  ): PullsCreateResponseLinks = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], review_comment = review_comment.asInstanceOf[js.Any], review_comments = review_comments.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any], statuses = statuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsCreateResponseLinks]
  }
  @scala.inline
  implicit class PullsCreateResponseLinksOps[Self <: PullsCreateResponseLinks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComments(value: PullsCreateResponseLinksComments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommits(value: PullsCreateResponseLinksCommits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml(value: PullsCreateResponseLinksHtml): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssue(value: PullsCreateResponseLinksIssue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReview_comment(value: PullsCreateResponseLinksReviewComment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("review_comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReview_comments(value: PullsCreateResponseLinksReviewComments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("review_comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelf(value: PullsCreateResponseLinksSelf): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("self")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatuses(value: PullsCreateResponseLinksStatuses): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statuses")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

