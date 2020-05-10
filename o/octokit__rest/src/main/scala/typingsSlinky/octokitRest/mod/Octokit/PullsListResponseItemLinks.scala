package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullsListResponseItemLinks extends js.Object {
  var comments: PullsListResponseItemLinksComments = js.native
  var commits: PullsListResponseItemLinksCommits = js.native
  var html: PullsListResponseItemLinksHtml = js.native
  var issue: PullsListResponseItemLinksIssue = js.native
  var review_comment: PullsListResponseItemLinksReviewComment = js.native
  var review_comments: PullsListResponseItemLinksReviewComments = js.native
  var self: PullsListResponseItemLinksSelf = js.native
  var statuses: PullsListResponseItemLinksStatuses = js.native
}

object PullsListResponseItemLinks {
  @scala.inline
  def apply(
    comments: PullsListResponseItemLinksComments,
    commits: PullsListResponseItemLinksCommits,
    html: PullsListResponseItemLinksHtml,
    issue: PullsListResponseItemLinksIssue,
    review_comment: PullsListResponseItemLinksReviewComment,
    review_comments: PullsListResponseItemLinksReviewComments,
    self: PullsListResponseItemLinksSelf,
    statuses: PullsListResponseItemLinksStatuses
  ): PullsListResponseItemLinks = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], review_comment = review_comment.asInstanceOf[js.Any], review_comments = review_comments.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any], statuses = statuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsListResponseItemLinks]
  }
  @scala.inline
  implicit class PullsListResponseItemLinksOps[Self <: PullsListResponseItemLinks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComments(value: PullsListResponseItemLinksComments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommits(value: PullsListResponseItemLinksCommits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml(value: PullsListResponseItemLinksHtml): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssue(value: PullsListResponseItemLinksIssue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReview_comment(value: PullsListResponseItemLinksReviewComment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("review_comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReview_comments(value: PullsListResponseItemLinksReviewComments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("review_comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelf(value: PullsListResponseItemLinksSelf): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("self")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatuses(value: PullsListResponseItemLinksStatuses): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statuses")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

