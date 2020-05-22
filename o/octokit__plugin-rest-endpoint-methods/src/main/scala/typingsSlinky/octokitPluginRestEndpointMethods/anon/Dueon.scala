package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dueon extends js.Object {
  var description: Type
  var due_on: Type
  var owner: Required
  var repo: Required
  var state: Enum
  var title: Required
}

object Dueon {
  @scala.inline
  def apply(description: Type, due_on: Type, owner: Required, repo: Required, state: Enum, title: Required): Dueon = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], due_on = due_on.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dueon]
  }
}

