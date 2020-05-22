package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectidTeamid extends js.Object {
  var project_id: Required
  var team_id: Required
}

object ProjectidTeamid {
  @scala.inline
  def apply(project_id: Required, team_id: Required): ProjectidTeamid = {
    val __obj = js.Dynamic.literal(project_id = project_id.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectidTeamid]
  }
}

