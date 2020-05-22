package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Newowner extends js.Object {
  var new_owner: Type
  var owner: Required
  var repo: Required
  var team_ids: Type
}

object Newowner {
  @scala.inline
  def apply(new_owner: Type, owner: Required, repo: Required, team_ids: Type): Newowner = {
    val __obj = js.Dynamic.literal(new_owner = new_owner.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], team_ids = team_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[Newowner]
  }
}

