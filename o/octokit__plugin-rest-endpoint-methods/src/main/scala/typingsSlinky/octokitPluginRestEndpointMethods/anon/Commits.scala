package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Commits extends js.Object {
  var code: ParamsOrder = js.native
  var commits: MethodStringParamsOrder = js.native
  var issues: ParamsOrderUrlString = js.native
  var issuesAndPullRequests: ParamsOrder = js.native
  var labels: ParamsQ = js.native
  var repos: ParamsOrder = js.native
  var topics: ParamsQRequired = js.native
  var users: ParamsOrder = js.native
}

object Commits {
  @scala.inline
  def apply(
    code: ParamsOrder,
    commits: MethodStringParamsOrder,
    issues: ParamsOrderUrlString,
    issuesAndPullRequests: ParamsOrder,
    labels: ParamsQ,
    repos: ParamsOrder,
    topics: ParamsQRequired,
    users: ParamsOrder
  ): Commits = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], issuesAndPullRequests = issuesAndPullRequests.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], repos = repos.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commits]
  }
  @scala.inline
  implicit class CommitsOps[Self <: Commits] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: ParamsOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommits(value: MethodStringParamsOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssues(value: ParamsOrderUrlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssuesAndPullRequests(value: ParamsOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuesAndPullRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabels(value: ParamsQ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepos(value: ParamsOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopics(value: ParamsQRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsers(value: ParamsOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

