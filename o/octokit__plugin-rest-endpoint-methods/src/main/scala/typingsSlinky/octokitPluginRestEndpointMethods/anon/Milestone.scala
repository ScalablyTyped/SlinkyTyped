package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Milestone extends js.Object {
  var assignee: Type
  var assignees: Type
  var body: Type
  var issue_number: Required
  var labels: Type
  var milestone: AllowNull
  var number: Alias
  var owner: Required
  var repo: Required
  var state: Enum
  var title: Type
}

object Milestone {
  @scala.inline
  def apply(
    assignee: Type,
    assignees: Type,
    body: Type,
    issue_number: Required,
    labels: Type,
    milestone: AllowNull,
    number: Alias,
    owner: Required,
    repo: Required,
    state: Enum,
    title: Type
  ): Milestone = {
    val __obj = js.Dynamic.literal(assignee = assignee.asInstanceOf[js.Any], assignees = assignees.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], issue_number = issue_number.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], milestone = milestone.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Milestone]
  }
}

