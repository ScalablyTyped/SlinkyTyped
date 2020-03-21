package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTitle extends js.Object {
  var description: AnonType
  var due_on: AnonType
  var milestone_number: AnonRequired
  var number: AnonAlias
  var owner: AnonRequired
  var repo: AnonRequired
  var state: AnonEnum
  var title: AnonType
}

object AnonTitle {
  @scala.inline
  def apply(
    description: AnonType,
    due_on: AnonType,
    milestone_number: AnonRequired,
    number: AnonAlias,
    owner: AnonRequired,
    repo: AnonRequired,
    state: AnonEnum,
    title: AnonType
  ): AnonTitle = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], due_on = due_on.asInstanceOf[js.Any], milestone_number = milestone_number.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTitle]
  }
}

