package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchCodeResponseItemsItemRepository extends js.Object {
  var archive_url: String = js.native
  var assignees_url: String = js.native
  var blobs_url: String = js.native
  var branches_url: String = js.native
  var collaborators_url: String = js.native
  var comments_url: String = js.native
  var commits_url: String = js.native
  var compare_url: String = js.native
  var contents_url: String = js.native
  var contributors_url: String = js.native
  var description: String = js.native
  var downloads_url: String = js.native
  var events_url: String = js.native
  var fork: Boolean = js.native
  var forks_url: String = js.native
  var full_name: String = js.native
  var git_commits_url: String = js.native
  var git_refs_url: String = js.native
  var git_tags_url: String = js.native
  var hooks_url: String = js.native
  var html_url: String = js.native
  var id: Double = js.native
  var issue_comment_url: String = js.native
  var issue_events_url: String = js.native
  var issues_url: String = js.native
  var keys_url: String = js.native
  var labels_url: String = js.native
  var languages_url: String = js.native
  var merges_url: String = js.native
  var milestones_url: String = js.native
  var name: String = js.native
  var node_id: String = js.native
  var notifications_url: String = js.native
  var owner: SearchCodeResponseItemsItemRepositoryOwner = js.native
  var `private`: Boolean = js.native
  var pulls_url: String = js.native
  var stargazers_url: String = js.native
  var statuses_url: String = js.native
  var subscribers_url: String = js.native
  var subscription_url: String = js.native
  var tags_url: String = js.native
  var teams_url: String = js.native
  var trees_url: String = js.native
  var url: String = js.native
}

object SearchCodeResponseItemsItemRepository {
  @scala.inline
  def apply(
    archive_url: String,
    assignees_url: String,
    blobs_url: String,
    branches_url: String,
    collaborators_url: String,
    comments_url: String,
    commits_url: String,
    compare_url: String,
    contents_url: String,
    contributors_url: String,
    description: String,
    downloads_url: String,
    events_url: String,
    fork: Boolean,
    forks_url: String,
    full_name: String,
    git_commits_url: String,
    git_refs_url: String,
    git_tags_url: String,
    hooks_url: String,
    html_url: String,
    id: Double,
    issue_comment_url: String,
    issue_events_url: String,
    issues_url: String,
    keys_url: String,
    labels_url: String,
    languages_url: String,
    merges_url: String,
    milestones_url: String,
    name: String,
    node_id: String,
    notifications_url: String,
    owner: SearchCodeResponseItemsItemRepositoryOwner,
    `private`: Boolean,
    pulls_url: String,
    stargazers_url: String,
    statuses_url: String,
    subscribers_url: String,
    subscription_url: String,
    tags_url: String,
    teams_url: String,
    trees_url: String,
    url: String
  ): SearchCodeResponseItemsItemRepository = {
    val __obj = js.Dynamic.literal(archive_url = archive_url.asInstanceOf[js.Any], assignees_url = assignees_url.asInstanceOf[js.Any], blobs_url = blobs_url.asInstanceOf[js.Any], branches_url = branches_url.asInstanceOf[js.Any], collaborators_url = collaborators_url.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commits_url = commits_url.asInstanceOf[js.Any], compare_url = compare_url.asInstanceOf[js.Any], contents_url = contents_url.asInstanceOf[js.Any], contributors_url = contributors_url.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], downloads_url = downloads_url.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], fork = fork.asInstanceOf[js.Any], forks_url = forks_url.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], git_commits_url = git_commits_url.asInstanceOf[js.Any], git_refs_url = git_refs_url.asInstanceOf[js.Any], git_tags_url = git_tags_url.asInstanceOf[js.Any], hooks_url = hooks_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issue_comment_url = issue_comment_url.asInstanceOf[js.Any], issue_events_url = issue_events_url.asInstanceOf[js.Any], issues_url = issues_url.asInstanceOf[js.Any], keys_url = keys_url.asInstanceOf[js.Any], labels_url = labels_url.asInstanceOf[js.Any], languages_url = languages_url.asInstanceOf[js.Any], merges_url = merges_url.asInstanceOf[js.Any], milestones_url = milestones_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], notifications_url = notifications_url.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pulls_url = pulls_url.asInstanceOf[js.Any], stargazers_url = stargazers_url.asInstanceOf[js.Any], statuses_url = statuses_url.asInstanceOf[js.Any], subscribers_url = subscribers_url.asInstanceOf[js.Any], subscription_url = subscription_url.asInstanceOf[js.Any], tags_url = tags_url.asInstanceOf[js.Any], teams_url = teams_url.asInstanceOf[js.Any], trees_url = trees_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchCodeResponseItemsItemRepository]
  }
  @scala.inline
  implicit class SearchCodeResponseItemsItemRepositoryOps[Self <: SearchCodeResponseItemsItemRepository] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArchive_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("archive_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssignees_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignees_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlobs_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blobs_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBranches_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branches_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollaborators_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collaborators_url")(value.asInstanceOf[js.Any])
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
    def withCompare_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compare_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContents_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contents_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContributors_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contributors_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownloads_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloads_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvents_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFork(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForks_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forks_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFull_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGit_commits_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("git_commits_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGit_refs_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("git_refs_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGit_tags_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("git_tags_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHooks_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hooks_url")(value.asInstanceOf[js.Any])
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
    def withIssue_comment_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issue_comment_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssue_events_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issue_events_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssues_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issues_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeys_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabels_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguages_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languages_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMerges_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merges_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMilestones_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("milestones_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotifications_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifications_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: SearchCodeResponseItemsItemRepositoryOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("private")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPulls_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pulls_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStargazers_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stargazers_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatuses_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statuses_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscribers_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribers_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscription_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeams_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teams_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrees_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trees_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

