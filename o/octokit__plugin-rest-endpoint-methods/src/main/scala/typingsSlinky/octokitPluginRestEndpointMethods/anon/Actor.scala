package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Actor extends js.Object {
  var actor: Type
  var branch: Type
  var event: Type
  var owner: Required
  var page: Type
  var per_page: Type
  var repo: Required
  var status: Enum
}

object Actor {
  @scala.inline
  def apply(
    actor: Type,
    branch: Type,
    event: Type,
    owner: Required,
    page: Type,
    per_page: Type,
    repo: Required,
    status: Enum
  ): Actor = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actor]
  }
}

