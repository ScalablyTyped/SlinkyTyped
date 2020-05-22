package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Commits extends js.Object {
  var code: ParamsOrder
  var commits: MethodStringParamsOrder
  var issues: ParamsOrderUrlString
  var issuesAndPullRequests: ParamsOrder
  var labels: ParamsQ
  var repos: ParamsOrder
  var topics: ParamsQRequired
  var users: ParamsOrder
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
}

