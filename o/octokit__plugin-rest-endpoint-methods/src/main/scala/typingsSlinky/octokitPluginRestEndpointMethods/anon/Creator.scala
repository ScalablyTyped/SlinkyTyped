package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Creator extends js.Object {
  var assignee: Type
  var creator: Type
  var direction: Enum
  var labels: Type
  var mentioned: Type
  var milestone: Type
  var owner: Required
  var page: Type
  var per_page: Type
  var repo: Required
  var since: Type
  var sort: Enum
  var state: Enum
}

object Creator {
  @scala.inline
  def apply(
    assignee: Type,
    creator: Type,
    direction: Enum,
    labels: Type,
    mentioned: Type,
    milestone: Type,
    owner: Required,
    page: Type,
    per_page: Type,
    repo: Required,
    since: Type,
    sort: Enum,
    state: Enum
  ): Creator = {
    val __obj = js.Dynamic.literal(assignee = assignee.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], mentioned = mentioned.asInstanceOf[js.Any], milestone = milestone.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Creator]
  }
}

