package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerpageTeamid extends js.Object {
  var page: Type
  var per_page: Type
  var team_id: Required
}

object PerpageTeamid {
  @scala.inline
  def apply(page: Type, per_page: Type, team_id: Required): PerpageTeamid = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerpageTeamid]
  }
}

