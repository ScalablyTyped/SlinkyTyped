package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullsCreateReviewRequestResponseLinks extends js.Object {
  var comments: PullsCreateReviewRequestResponseLinksComments = js.native
  var commits: PullsCreateReviewRequestResponseLinksCommits = js.native
  var html: PullsCreateReviewRequestResponseLinksHtml = js.native
  var issue: PullsCreateReviewRequestResponseLinksIssue = js.native
  var review_comment: PullsCreateReviewRequestResponseLinksReviewComment = js.native
  var review_comments: PullsCreateReviewRequestResponseLinksReviewComments = js.native
  var self: PullsCreateReviewRequestResponseLinksSelf = js.native
  var statuses: PullsCreateReviewRequestResponseLinksStatuses = js.native
}

object PullsCreateReviewRequestResponseLinks {
  @scala.inline
  def apply(
    comments: PullsCreateReviewRequestResponseLinksComments,
    commits: PullsCreateReviewRequestResponseLinksCommits,
    html: PullsCreateReviewRequestResponseLinksHtml,
    issue: PullsCreateReviewRequestResponseLinksIssue,
    review_comment: PullsCreateReviewRequestResponseLinksReviewComment,
    review_comments: PullsCreateReviewRequestResponseLinksReviewComments,
    self: PullsCreateReviewRequestResponseLinksSelf,
    statuses: PullsCreateReviewRequestResponseLinksStatuses
  ): PullsCreateReviewRequestResponseLinks = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], review_comment = review_comment.asInstanceOf[js.Any], review_comments = review_comments.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any], statuses = statuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsCreateReviewRequestResponseLinks]
  }
  @scala.inline
  implicit class PullsCreateReviewRequestResponseLinksOps[Self <: PullsCreateReviewRequestResponseLinks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComments(value: PullsCreateReviewRequestResponseLinksComments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommits(value: PullsCreateReviewRequestResponseLinksCommits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml(value: PullsCreateReviewRequestResponseLinksHtml): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssue(value: PullsCreateReviewRequestResponseLinksIssue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReview_comment(value: PullsCreateReviewRequestResponseLinksReviewComment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("review_comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReview_comments(value: PullsCreateReviewRequestResponseLinksReviewComments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("review_comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelf(value: PullsCreateReviewRequestResponseLinksSelf): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("self")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatuses(value: PullsCreateReviewRequestResponseLinksStatuses): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statuses")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

