package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullsUpdateResponseLinks extends js.Object {
  var comments: PullsUpdateResponseLinksComments = js.native
  var commits: PullsUpdateResponseLinksCommits = js.native
  var html: PullsUpdateResponseLinksHtml = js.native
  var issue: PullsUpdateResponseLinksIssue = js.native
  var review_comment: PullsUpdateResponseLinksReviewComment = js.native
  var review_comments: PullsUpdateResponseLinksReviewComments = js.native
  var self: PullsUpdateResponseLinksSelf = js.native
  var statuses: PullsUpdateResponseLinksStatuses = js.native
}

object PullsUpdateResponseLinks {
  @scala.inline
  def apply(
    comments: PullsUpdateResponseLinksComments,
    commits: PullsUpdateResponseLinksCommits,
    html: PullsUpdateResponseLinksHtml,
    issue: PullsUpdateResponseLinksIssue,
    review_comment: PullsUpdateResponseLinksReviewComment,
    review_comments: PullsUpdateResponseLinksReviewComments,
    self: PullsUpdateResponseLinksSelf,
    statuses: PullsUpdateResponseLinksStatuses
  ): PullsUpdateResponseLinks = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], review_comment = review_comment.asInstanceOf[js.Any], review_comments = review_comments.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any], statuses = statuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsUpdateResponseLinks]
  }
  @scala.inline
  implicit class PullsUpdateResponseLinksOps[Self <: PullsUpdateResponseLinks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComments(value: PullsUpdateResponseLinksComments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommits(value: PullsUpdateResponseLinksCommits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml(value: PullsUpdateResponseLinksHtml): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssue(value: PullsUpdateResponseLinksIssue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReview_comment(value: PullsUpdateResponseLinksReviewComment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("review_comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReview_comments(value: PullsUpdateResponseLinksReviewComments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("review_comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelf(value: PullsUpdateResponseLinksSelf): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("self")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatuses(value: PullsUpdateResponseLinksStatuses): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statuses")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

