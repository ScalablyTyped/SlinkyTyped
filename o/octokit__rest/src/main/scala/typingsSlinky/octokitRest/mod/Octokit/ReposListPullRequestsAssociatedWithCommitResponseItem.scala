package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposListPullRequestsAssociatedWithCommitResponseItem extends js.Object {
  var _links: ReposListPullRequestsAssociatedWithCommitResponseItemLinks = js.native
  var active_lock_reason: String = js.native
  var assignee: ReposListPullRequestsAssociatedWithCommitResponseItemAssignee = js.native
  var assignees: js.Array[ReposListPullRequestsAssociatedWithCommitResponseItemAssigneesItem] = js.native
  var author_association: String = js.native
  var base: ReposListPullRequestsAssociatedWithCommitResponseItemBase = js.native
  var body: String = js.native
  var closed_at: String = js.native
  var comments_url: String = js.native
  var commits_url: String = js.native
  var created_at: String = js.native
  var diff_url: String = js.native
  var draft: Boolean = js.native
  var head: ReposListPullRequestsAssociatedWithCommitResponseItemHead = js.native
  var html_url: String = js.native
  var id: Double = js.native
  var issue_url: String = js.native
  var labels: js.Array[ReposListPullRequestsAssociatedWithCommitResponseItemLabelsItem] = js.native
  var locked: Boolean = js.native
  var merge_commit_sha: String = js.native
  var merged_at: String = js.native
  var milestone: ReposListPullRequestsAssociatedWithCommitResponseItemMilestone = js.native
  var node_id: String = js.native
  var number: Double = js.native
  var patch_url: String = js.native
  var requested_reviewers: js.Array[ReposListPullRequestsAssociatedWithCommitResponseItemRequestedReviewersItem] = js.native
  var requested_teams: js.Array[ReposListPullRequestsAssociatedWithCommitResponseItemRequestedTeamsItem] = js.native
  var review_comment_url: String = js.native
  var review_comments_url: String = js.native
  var state: String = js.native
  var statuses_url: String = js.native
  var title: String = js.native
  var updated_at: String = js.native
  var url: String = js.native
  var user: ReposListPullRequestsAssociatedWithCommitResponseItemUser = js.native
}

object ReposListPullRequestsAssociatedWithCommitResponseItem {
  @scala.inline
  def apply(
    _links: ReposListPullRequestsAssociatedWithCommitResponseItemLinks,
    active_lock_reason: String,
    assignee: ReposListPullRequestsAssociatedWithCommitResponseItemAssignee,
    assignees: js.Array[ReposListPullRequestsAssociatedWithCommitResponseItemAssigneesItem],
    author_association: String,
    base: ReposListPullRequestsAssociatedWithCommitResponseItemBase,
    body: String,
    closed_at: String,
    comments_url: String,
    commits_url: String,
    created_at: String,
    diff_url: String,
    draft: Boolean,
    head: ReposListPullRequestsAssociatedWithCommitResponseItemHead,
    html_url: String,
    id: Double,
    issue_url: String,
    labels: js.Array[ReposListPullRequestsAssociatedWithCommitResponseItemLabelsItem],
    locked: Boolean,
    merge_commit_sha: String,
    merged_at: String,
    milestone: ReposListPullRequestsAssociatedWithCommitResponseItemMilestone,
    node_id: String,
    number: Double,
    patch_url: String,
    requested_reviewers: js.Array[ReposListPullRequestsAssociatedWithCommitResponseItemRequestedReviewersItem],
    requested_teams: js.Array[ReposListPullRequestsAssociatedWithCommitResponseItemRequestedTeamsItem],
    review_comment_url: String,
    review_comments_url: String,
    state: String,
    statuses_url: String,
    title: String,
    updated_at: String,
    url: String,
    user: ReposListPullRequestsAssociatedWithCommitResponseItemUser
  ): ReposListPullRequestsAssociatedWithCommitResponseItem = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], active_lock_reason = active_lock_reason.asInstanceOf[js.Any], assignee = assignee.asInstanceOf[js.Any], assignees = assignees.asInstanceOf[js.Any], author_association = author_association.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], closed_at = closed_at.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commits_url = commits_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], diff_url = diff_url.asInstanceOf[js.Any], draft = draft.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issue_url = issue_url.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], merge_commit_sha = merge_commit_sha.asInstanceOf[js.Any], merged_at = merged_at.asInstanceOf[js.Any], milestone = milestone.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], patch_url = patch_url.asInstanceOf[js.Any], requested_reviewers = requested_reviewers.asInstanceOf[js.Any], requested_teams = requested_teams.asInstanceOf[js.Any], review_comment_url = review_comment_url.asInstanceOf[js.Any], review_comments_url = review_comments_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], statuses_url = statuses_url.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListPullRequestsAssociatedWithCommitResponseItem]
  }
  @scala.inline
  implicit class ReposListPullRequestsAssociatedWithCommitResponseItemOps[Self <: ReposListPullRequestsAssociatedWithCommitResponseItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_links(value: ReposListPullRequestsAssociatedWithCommitResponseItemLinks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActive_lock_reason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active_lock_reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssignee(value: ReposListPullRequestsAssociatedWithCommitResponseItemAssignee): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssignees(value: js.Array[ReposListPullRequestsAssociatedWithCommitResponseItemAssigneesItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignees")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthor_association(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author_association")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase(value: ReposListPullRequestsAssociatedWithCommitResponseItemBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClosed_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closed_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComments_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommits_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commits_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiff_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diff_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDraft(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHead(value: ReposListPullRequestsAssociatedWithCommitResponseItemHead): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("head")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssue_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issue_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabels(value: js.Array[ReposListPullRequestsAssociatedWithCommitResponseItemLabelsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMerge_commit_sha(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merge_commit_sha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMerged_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merged_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMilestone(value: ReposListPullRequestsAssociatedWithCommitResponseItemMilestone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("milestone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPatch_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequested_reviewers(value: js.Array[ReposListPullRequestsAssociatedWithCommitResponseItemRequestedReviewersItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requested_reviewers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequested_teams(value: js.Array[ReposListPullRequestsAssociatedWithCommitResponseItemRequestedTeamsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requested_teams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReview_comment_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("review_comment_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReview_comments_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("review_comments_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatuses_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statuses_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: ReposListPullRequestsAssociatedWithCommitResponseItemUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

