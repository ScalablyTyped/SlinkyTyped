package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommits extends js.Object {
  var code: AnonParamsAnonOrder
  var commits: AnonMethodStringParamsAnonOrder
  var issues: AnonParamsAnonOrderUrlString
  var issuesAndPullRequests: AnonParamsAnonOrder
  var labels: AnonParamsAnonQ
  var repos: AnonParamsAnonOrder
  var topics: AnonParamsAnonQAnonRequired
  var users: AnonParamsAnonOrder
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
}

