package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOrganizationpermission extends js.Object {
  var body: AnonType
  var name: AnonType
  var organization_permission: AnonType
  var `private`: AnonType
  var project_id: AnonRequired
  var state: AnonEnum
}

object AnonOrganizationpermission {
  @scala.inline
  def apply(
    body: AnonType,
    name: AnonType,
    organization_permission: AnonType,
    `private`: AnonType,
    project_id: AnonRequired,
    state: AnonEnum
  ): AnonOrganizationpermission = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], organization_permission = organization_permission.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOrganizationpermission]
  }
}

