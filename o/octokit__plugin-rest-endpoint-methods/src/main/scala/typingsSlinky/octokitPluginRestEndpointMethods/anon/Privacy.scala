package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Privacy extends js.Object {
  var description: Type
  var name: Required
  @JSName("org")
  var org_ : Required
  var parent_team_id: Type
  var permission: Enum
  var privacy: Enum
  var team_slug: Required
}

object Privacy {
  @scala.inline
  def apply(
    description: Type,
    name: Required,
    org_ : Required,
    parent_team_id: Type,
    permission: Enum,
    privacy: Enum,
    team_slug: Required
  ): Privacy = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent_team_id = parent_team_id.asInstanceOf[js.Any], permission = permission.asInstanceOf[js.Any], privacy = privacy.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Privacy]
  }
}

