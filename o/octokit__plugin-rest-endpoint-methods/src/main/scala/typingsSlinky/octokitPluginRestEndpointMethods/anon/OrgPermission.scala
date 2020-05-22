package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgPermission extends js.Object {
  @JSName("org")
  var org_ : Required
  var permission: Enum
  var project_id: Required
  var team_slug: Required
}

object OrgPermission {
  @scala.inline
  def apply(org_ : Required, permission: Enum, project_id: Required, team_slug: Required): OrgPermission = {
    val __obj = js.Dynamic.literal(permission = permission.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgPermission]
  }
}

