package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDiscussionnumberTeamid extends js.Object {
  var discussion_number: AnonRequired
  var team_id: AnonRequired
}

object AnonDiscussionnumberTeamid {
  @scala.inline
  def apply(discussion_number: AnonRequired, team_id: AnonRequired): AnonDiscussionnumberTeamid = {
    val __obj = js.Dynamic.literal(discussion_number = discussion_number.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDiscussionnumberTeamid]
  }
}

