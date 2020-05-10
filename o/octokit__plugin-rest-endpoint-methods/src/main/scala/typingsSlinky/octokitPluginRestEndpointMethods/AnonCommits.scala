package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCommits extends js.Object {
  var code: AnonParamsAnonOrder = js.native
  var commits: AnonMethodStringParamsAnonOrder = js.native
  var issues: AnonParamsAnonOrderUrlString = js.native
  var issuesAndPullRequests: AnonParamsAnonOrder = js.native
  var labels: AnonParamsAnonQ = js.native
  var repos: AnonParamsAnonOrder = js.native
  var topics: AnonParamsAnonQAnonRequired = js.native
  var users: AnonParamsAnonOrder = js.native
}

object AnonCommits {
  @scala.inline
  def apply(
    code: AnonParamsAnonOrder,
    commits: AnonMethodStringParamsAnonOrder,
    issues: AnonParamsAnonOrderUrlString,
    issuesAndPullRequests: AnonParamsAnonOrder,
    labels: AnonParamsAnonQ,
    repos: AnonParamsAnonOrder,
    topics: AnonParamsAnonQAnonRequired,
    users: AnonParamsAnonOrder
  ): AnonCommits = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], issuesAndPullRequests = issuesAndPullRequests.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], repos = repos.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCommits]
  }
  @scala.inline
  implicit class AnonCommitsOps[Self <: AnonCommits] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: AnonParamsAnonOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommits(value: AnonMethodStringParamsAnonOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssues(value: AnonParamsAnonOrderUrlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssuesAndPullRequests(value: AnonParamsAnonOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuesAndPullRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabels(value: AnonParamsAnonQ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepos(value: AnonParamsAnonOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopics(value: AnonParamsAnonQAnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsers(value: AnonParamsAnonOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

