package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Labels extends js.Object {
  var assignee: Type
  var assignees: Type
  var body: Type
  var labels: Type
  var milestone: Type
  var owner: Required
  var repo: Required
  var title: Required
}

object Labels {
  @scala.inline
  def apply(
    assignee: Type,
    assignees: Type,
    body: Type,
    labels: Type,
    milestone: Type,
    owner: Required,
    repo: Required,
    title: Required
  ): Labels = {
    val __obj = js.Dynamic.literal(assignee = assignee.asInstanceOf[js.Any], assignees = assignees.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], milestone = milestone.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Labels]
  }
}

