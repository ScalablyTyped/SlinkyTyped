package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiscussionnumberTeamid extends js.Object {
  var discussion_number: Required
  var team_id: Required
}

object DiscussionnumberTeamid {
  @scala.inline
  def apply(discussion_number: Required, team_id: Required): DiscussionnumberTeamid = {
    val __obj = js.Dynamic.literal(discussion_number = discussion_number.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscussionnumberTeamid]
  }
}

