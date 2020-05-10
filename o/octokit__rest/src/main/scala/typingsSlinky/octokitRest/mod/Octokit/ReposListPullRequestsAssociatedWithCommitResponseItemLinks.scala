package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposListPullRequestsAssociatedWithCommitResponseItemLinks extends js.Object {
  var comments: ReposListPullRequestsAssociatedWithCommitResponseItemLinksComments = js.native
  var commits: ReposListPullRequestsAssociatedWithCommitResponseItemLinksCommits = js.native
  var html: ReposListPullRequestsAssociatedWithCommitResponseItemLinksHtml = js.native
  var issue: ReposListPullRequestsAssociatedWithCommitResponseItemLinksIssue = js.native
  var review_comment: ReposListPullRequestsAssociatedWithCommitResponseItemLinksReviewComment = js.native
  var review_comments: ReposListPullRequestsAssociatedWithCommitResponseItemLinksReviewComments = js.native
  var self: ReposListPullRequestsAssociatedWithCommitResponseItemLinksSelf = js.native
  var statuses: ReposListPullRequestsAssociatedWithCommitResponseItemLinksStatuses = js.native
}

object ReposListPullRequestsAssociatedWithCommitResponseItemLinks {
  @scala.inline
  def apply(
    comments: ReposListPullRequestsAssociatedWithCommitResponseItemLinksComments,
    commits: ReposListPullRequestsAssociatedWithCommitResponseItemLinksCommits,
    html: ReposListPullRequestsAssociatedWithCommitResponseItemLinksHtml,
    issue: ReposListPullRequestsAssociatedWithCommitResponseItemLinksIssue,
    review_comment: ReposListPullRequestsAssociatedWithCommitResponseItemLinksReviewComment,
    review_comments: ReposListPullRequestsAssociatedWithCommitResponseItemLinksReviewComments,
    self: ReposListPullRequestsAssociatedWithCommitResponseItemLinksSelf,
    statuses: ReposListPullRequestsAssociatedWithCommitResponseItemLinksStatuses
  ): ReposListPullRequestsAssociatedWithCommitResponseItemLinks = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], review_comment = review_comment.asInstanceOf[js.Any], review_comments = review_comments.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any], statuses = statuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListPullRequestsAssociatedWithCommitResponseItemLinks]
  }
  @scala.inline
  implicit class ReposListPullRequestsAssociatedWithCommitResponseItemLinksOps[Self <: ReposListPullRequestsAssociatedWithCommitResponseItemLinks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComments(value: ReposListPullRequestsAssociatedWithCommitResponseItemLinksComments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommits(value: ReposListPullRequestsAssociatedWithCommitResponseItemLinksCommits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml(value: ReposListPullRequestsAssociatedWithCommitResponseItemLinksHtml): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssue(value: ReposListPullRequestsAssociatedWithCommitResponseItemLinksIssue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReview_comment(value: ReposListPullRequestsAssociatedWithCommitResponseItemLinksReviewComment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("review_comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReview_comments(value: ReposListPullRequestsAssociatedWithCommitResponseItemLinksReviewComments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("review_comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelf(value: ReposListPullRequestsAssociatedWithCommitResponseItemLinksSelf): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("self")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatuses(value: ReposListPullRequestsAssociatedWithCommitResponseItemLinksStatuses): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statuses")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

