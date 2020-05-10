package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullsCreateFromIssueResponseLinks extends js.Object {
  var comments: PullsCreateFromIssueResponseLinksComments = js.native
  var commits: PullsCreateFromIssueResponseLinksCommits = js.native
  var html: PullsCreateFromIssueResponseLinksHtml = js.native
  var issue: PullsCreateFromIssueResponseLinksIssue = js.native
  var review_comment: PullsCreateFromIssueResponseLinksReviewComment = js.native
  var review_comments: PullsCreateFromIssueResponseLinksReviewComments = js.native
  var self: PullsCreateFromIssueResponseLinksSelf = js.native
  var statuses: PullsCreateFromIssueResponseLinksStatuses = js.native
}

object PullsCreateFromIssueResponseLinks {
  @scala.inline
  def apply(
    comments: PullsCreateFromIssueResponseLinksComments,
    commits: PullsCreateFromIssueResponseLinksCommits,
    html: PullsCreateFromIssueResponseLinksHtml,
    issue: PullsCreateFromIssueResponseLinksIssue,
    review_comment: PullsCreateFromIssueResponseLinksReviewComment,
    review_comments: PullsCreateFromIssueResponseLinksReviewComments,
    self: PullsCreateFromIssueResponseLinksSelf,
    statuses: PullsCreateFromIssueResponseLinksStatuses
  ): PullsCreateFromIssueResponseLinks = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], review_comment = review_comment.asInstanceOf[js.Any], review_comments = review_comments.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any], statuses = statuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsCreateFromIssueResponseLinks]
  }
  @scala.inline
  implicit class PullsCreateFromIssueResponseLinksOps[Self <: PullsCreateFromIssueResponseLinks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComments(value: PullsCreateFromIssueResponseLinksComments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommits(value: PullsCreateFromIssueResponseLinksCommits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml(value: PullsCreateFromIssueResponseLinksHtml): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssue(value: PullsCreateFromIssueResponseLinksIssue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReview_comment(value: PullsCreateFromIssueResponseLinksReviewComment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("review_comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReview_comments(value: PullsCreateFromIssueResponseLinksReviewComments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("review_comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelf(value: PullsCreateFromIssueResponseLinksSelf): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("self")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatuses(value: PullsCreateFromIssueResponseLinksStatuses): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statuses")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

