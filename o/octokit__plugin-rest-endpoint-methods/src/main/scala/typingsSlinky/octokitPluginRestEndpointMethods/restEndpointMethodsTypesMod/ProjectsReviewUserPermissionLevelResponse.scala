package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectsReviewUserPermissionLevelResponse extends js.Object {
  var permission: String = js.native
  var user: ProjectsReviewUserPermissionLevelResponseUser = js.native
}

object ProjectsReviewUserPermissionLevelResponse {
  @scala.inline
  def apply(permission: String, user: ProjectsReviewUserPermissionLevelResponseUser): ProjectsReviewUserPermissionLevelResponse = {
    val __obj = js.Dynamic.literal(permission = permission.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsReviewUserPermissionLevelResponse]
  }
  @scala.inline
  implicit class ProjectsReviewUserPermissionLevelResponseOps[Self <: ProjectsReviewUserPermissionLevelResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPermission(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: ProjectsReviewUserPermissionLevelResponseUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

