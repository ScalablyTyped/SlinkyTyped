package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgRole extends js.Object {
  @JSName("org")
  var org_ : Required
  var role: Enum
  var team_slug: Required
  var username: Required
}

object OrgRole {
  @scala.inline
  def apply(org_ : Required, role: Enum, team_slug: Required, username: Required): OrgRole = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgRole]
  }
}

