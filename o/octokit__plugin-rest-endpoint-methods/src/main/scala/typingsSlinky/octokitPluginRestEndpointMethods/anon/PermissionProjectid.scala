package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionProjectid extends js.Object {
  var permission: Enum
  var project_id: Required
  var team_id: Required
}

object PermissionProjectid {
  @scala.inline
  def apply(permission: Enum, project_id: Required, team_id: Required): PermissionProjectid = {
    val __obj = js.Dynamic.literal(permission = permission.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionProjectid]
  }
}

