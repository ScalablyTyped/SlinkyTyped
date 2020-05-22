package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parentteamid extends js.Object {
  var description: Type
  var name: Required
  var parent_team_id: Type
  var permission: Enum
  var privacy: Enum
  var team_id: Required
}

object Parentteamid {
  @scala.inline
  def apply(
    description: Type,
    name: Required,
    parent_team_id: Type,
    permission: Enum,
    privacy: Enum,
    team_id: Required
  ): Parentteamid = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent_team_id = parent_team_id.asInstanceOf[js.Any], permission = permission.asInstanceOf[js.Any], privacy = privacy.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parentteamid]
  }
}

