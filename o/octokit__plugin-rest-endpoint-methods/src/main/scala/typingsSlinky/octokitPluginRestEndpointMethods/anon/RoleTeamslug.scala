package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoleTeamslug extends js.Object {
  @JSName("org")
  var org_ : Required
  var page: Type
  var per_page: Type
  var role: Enum
  var team_slug: Required
}

object RoleTeamslug {
  @scala.inline
  def apply(org_ : Required, page: Type, per_page: Type, role: Enum, team_slug: Required): RoleTeamslug = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleTeamslug]
  }
}

