package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Organizationpermission extends js.Object {
  var body: Type
  var name: Type
  var organization_permission: Type
  var `private`: Type
  var project_id: Required
  var state: Enum
}

object Organizationpermission {
  @scala.inline
  def apply(
    body: Type,
    name: Type,
    organization_permission: Type,
    `private`: Type,
    project_id: Required,
    state: Enum
  ): Organizationpermission = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], organization_permission = organization_permission.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Organizationpermission]
  }
}

