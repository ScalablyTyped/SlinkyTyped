package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionRepo extends js.Object {
  var owner: Required
  var permission: Enum
  var repo: Required
  var team_id: Required
}

object PermissionRepo {
  @scala.inline
  def apply(owner: Required, permission: Enum, repo: Required, team_id: Required): PermissionRepo = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], permission = permission.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionRepo]
  }
}

