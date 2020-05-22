package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerpageRole extends js.Object {
  var page: Type
  var per_page: Type
  var role: Enum
  var team_id: Required
}

object PerpageRole {
  @scala.inline
  def apply(page: Type, per_page: Type, role: Enum, team_id: Required): PerpageRole = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerpageRole]
  }
}

