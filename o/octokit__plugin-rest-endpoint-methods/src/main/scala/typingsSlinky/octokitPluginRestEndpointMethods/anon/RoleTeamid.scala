package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoleTeamid extends js.Object {
  var role: Enum
  var team_id: Required
  var username: Required
}

object RoleTeamid {
  @scala.inline
  def apply(role: Enum, team_id: Required, username: Required): RoleTeamid = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleTeamid]
  }
}

