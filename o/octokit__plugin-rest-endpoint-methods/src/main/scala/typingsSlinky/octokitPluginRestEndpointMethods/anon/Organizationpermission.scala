package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Organizationpermission extends js.Object {
  var body: Type = js.native
  var name: Type = js.native
  var organization_permission: Type = js.native
  var `private`: Type = js.native
  var project_id: Required = js.native
  var state: Enum = js.native
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
  @scala.inline
  implicit class OrganizationpermissionOps[Self <: Organizationpermission] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrganization_permission(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organization_permission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivate(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("private")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProject_id(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: Enum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

