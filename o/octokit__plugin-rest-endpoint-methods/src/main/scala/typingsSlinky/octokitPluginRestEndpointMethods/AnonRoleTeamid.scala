package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRoleTeamid extends js.Object {
  var role: AnonEnum
  var team_id: AnonRequired
  var username: AnonRequired
}

object AnonRoleTeamid {
  @scala.inline
  def apply(role: AnonEnum, team_id: AnonRequired, username: AnonRequired): AnonRoleTeamid = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRoleTeamid]
  }
}

