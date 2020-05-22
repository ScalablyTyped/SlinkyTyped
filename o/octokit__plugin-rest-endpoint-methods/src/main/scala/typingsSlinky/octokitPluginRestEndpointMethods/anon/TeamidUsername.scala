package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamidUsername extends js.Object {
  var team_id: Required
  var username: Required
}

object TeamidUsername {
  @scala.inline
  def apply(team_id: Required, username: Required): TeamidUsername = {
    val __obj = js.Dynamic.literal(team_id = team_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamidUsername]
  }
}

