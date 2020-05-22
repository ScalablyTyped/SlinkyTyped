package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Title extends js.Object {
  var description: Type
  var due_on: Type
  var milestone_number: Required
  var number: Alias
  var owner: Required
  var repo: Required
  var state: Enum
  var title: Type
}

object Title {
  @scala.inline
  def apply(
    description: Type,
    due_on: Type,
    milestone_number: Required,
    number: Alias,
    owner: Required,
    repo: Required,
    state: Enum,
    title: Type
  ): Title = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], due_on = due_on.asInstanceOf[js.Any], milestone_number = milestone_number.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Title]
  }
}

