package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTeamidUsername extends js.Object {
  var team_id: AnonRequired
  var username: AnonRequired
}

object AnonTeamidUsername {
  @scala.inline
  def apply(team_id: AnonRequired, username: AnonRequired): AnonTeamidUsername = {
    val __obj = js.Dynamic.literal(team_id = team_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTeamidUsername]
  }
}

