package typingsSlinky.gapiClientIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationsResource extends js.Object {
  var roles: RolesResource = js.native
}

object OrganizationsResource {
  @scala.inline
  def apply(roles: RolesResource): OrganizationsResource = {
    val __obj = js.Dynamic.literal(roles = roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationsResource]
  }
  @scala.inline
  implicit class OrganizationsResourceOps[Self <: OrganizationsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoles(value: RolesResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roles")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

