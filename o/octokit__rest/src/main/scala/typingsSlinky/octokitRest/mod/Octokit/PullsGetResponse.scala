package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullsGetResponse extends js.Object {
  var _links: PullsGetResponseLinks = js.native
  var active_lock_reason: String = js.native
  var additions: Double = js.native
  var assignee: PullsGetResponseAssignee = js.native
  var assignees: js.Array[PullsGetResponseAssigneesItem] = js.native
  var author_association: String = js.native
  var base: PullsGetResponseBase = js.native
  var body: String = js.native
  var changed_files: Double = js.native
  var closed_at: String = js.native
  var comments: Double = js.native
  var comments_url: String = js.native
  var commits: Double = js.native
  var commits_url: String = js.native
  var created_at: String = js.native
  var deletions: Double = js.native
  var diff_url: String = js.native
  var draft: Boolean = js.native
  var head: PullsGetResponseHead = js.native
  var html_url: String = js.native
  var id: Double = js.native
  var issue_url: String = js.native
  var labels: js.Array[PullsGetResponseLabelsItem] = js.native
  var locked: Boolean = js.native
  var maintainer_can_modify: Boolean = js.native
  var merge_commit_sha: String = js.native
  var mergeable: Boolean = js.native
  var mergeable_state: String = js.native
  var merged: Boolean = js.native
  var merged_at: String = js.native
  var merged_by: PullsGetResponseMergedBy = js.native
  var milestone: PullsGetResponseMilestone = js.native
  var node_id: String = js.native
  var number: Double = js.native
  var patch_url: String = js.native
  var rebaseable: Boolean = js.native
  var requested_reviewers: js.Array[PullsGetResponseRequestedReviewersItem] = js.native
  var requested_teams: js.Array[PullsGetResponseRequestedTeamsItem] = js.native
  var review_comment_url: String = js.native
  var review_comments: Double = js.native
  var review_comments_url: String = js.native
  var state: String = js.native
  var statuses_url: String = js.native
  var title: String = js.native
  var updated_at: String = js.native
  var url: String = js.native
  var user: PullsGetResponseUser = js.native
}

object PullsGetResponse {
  @scala.inline
  def apply(
    _links: PullsGetResponseLinks,
    active_lock_reason: String,
    additions: Double,
    assignee: PullsGetResponseAssignee,
    assignees: js.Array[PullsGetResponseAssigneesItem],
    author_association: String,
    base: PullsGetResponseBase,
    body: String,
    changed_files: Double,
    closed_at: String,
    comments: Double,
    comments_url: String,
    commits: Double,
    commits_url: String,
    created_at: String,
    deletions: Double,
    diff_url: String,
    draft: Boolean,
    head: PullsGetResponseHead,
    html_url: String,
    id: Double,
    issue_url: String,
    labels: js.Array[PullsGetResponseLabelsItem],
    locked: Boolean,
    maintainer_can_modify: Boolean,
    merge_commit_sha: String,
    mergeable: Boolean,
    mergeable_state: String,
    merged: Boolean,
    merged_at: String,
    merged_by: PullsGetResponseMergedBy,
    milestone: PullsGetResponseMilestone,
    node_id: String,
    number: Double,
    patch_url: String,
    rebaseable: Boolean,
    requested_reviewers: js.Array[PullsGetResponseRequestedReviewersItem],
    requested_teams: js.Array[PullsGetResponseRequestedTeamsItem],
    review_comment_url: String,
    review_comments: Double,
    review_comments_url: String,
    state: String,
    statuses_url: String,
    title: String,
    updated_at: String,
    url: String,
    user: PullsGetResponseUser
  ): PullsGetResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], active_lock_reason = active_lock_reason.asInstanceOf[js.Any], additions = additions.asInstanceOf[js.Any], assignee = assignee.asInstanceOf[js.Any], assignees = assignees.asInstanceOf[js.Any], author_association = author_association.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], changed_files = changed_files.asInstanceOf[js.Any], closed_at = closed_at.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], commits_url = commits_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], deletions = deletions.asInstanceOf[js.Any], diff_url = diff_url.asInstanceOf[js.Any], draft = draft.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issue_url = issue_url.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], maintainer_can_modify = maintainer_can_modify.asInstanceOf[js.Any], merge_commit_sha = merge_commit_sha.asInstanceOf[js.Any], mergeable = mergeable.asInstanceOf[js.Any], mergeable_state = mergeable_state.asInstanceOf[js.Any], merged = merged.asInstanceOf[js.Any], merged_at = merged_at.asInstanceOf[js.Any], merged_by = merged_by.asInstanceOf[js.Any], milestone = milestone.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], patch_url = patch_url.asInstanceOf[js.Any], rebaseable = rebaseable.asInstanceOf[js.Any], requested_reviewers = requested_reviewers.asInstanceOf[js.Any], requested_teams = requested_teams.asInstanceOf[js.Any], review_comment_url = review_comment_url.asInstanceOf[js.Any], review_comments = review_comments.asInstanceOf[js.Any], review_comments_url = review_comments_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], statuses_url = statuses_url.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsGetResponse]
  }
  @scala.inline
  implicit class PullsGetResponseOps[Self <: PullsGetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_links(value: PullsGetResponseLinks): Self = {
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
    def withAdditions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssignee(value: PullsGetResponseAssignee): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssignees(value: js.Array[PullsGetResponseAssigneesItem]): Self = {
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
    def withBase(value: PullsGetResponseBase): Self = {
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
    def withChanged_files(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changed_files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClosed_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closed_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComments(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComments_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commits")(value.asInstanceOf[js.Any])
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
    def withDeletions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletions")(value.asInstanceOf[js.Any])
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
    def withHead(value: PullsGetResponseHead): Self = {
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
    def withLabels(value: js.Array[PullsGetResponseLabelsItem]): Self = {
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
    def withMaintainer_can_modify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintainer_can_modify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMerge_commit_sha(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merge_commit_sha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMergeable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMergeable_state(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeable_state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMerged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMerged_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merged_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMerged_by(value: PullsGetResponseMergedBy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merged_by")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMilestone(value: PullsGetResponseMilestone): Self = {
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
    def withRebaseable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rebaseable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequested_reviewers(value: js.Array[PullsGetResponseRequestedReviewersItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requested_reviewers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequested_teams(value: js.Array[PullsGetResponseRequestedTeamsItem]): Self = {
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
    def withReview_comments(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("review_comments")(value.asInstanceOf[js.Any])
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
    def withUser(value: PullsGetResponseUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

