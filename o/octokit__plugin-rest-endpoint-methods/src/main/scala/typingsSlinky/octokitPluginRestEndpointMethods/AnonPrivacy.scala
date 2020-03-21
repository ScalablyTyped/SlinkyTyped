package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrivacy extends js.Object {
  var description: AnonType
  var name: AnonRequired
  var org: AnonRequired
  var parent_team_id: AnonType
  var permission: AnonEnum
  var privacy: AnonEnum
  var team_slug: AnonRequired
}

object AnonPrivacy {
  @scala.inline
  def apply(
    description: AnonType,
    name: AnonRequired,
    org: AnonRequired,
    parent_team_id: AnonType,
    permission: AnonEnum,
    privacy: AnonEnum,
    team_slug: AnonRequired
  ): AnonPrivacy = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any], parent_team_id = parent_team_id.asInstanceOf[js.Any], permission = permission.asInstanceOf[js.Any], privacy = privacy.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPrivacy]
  }
}

