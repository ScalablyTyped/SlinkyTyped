package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Permissions extends js.Object {
  var installation_id: Required = js.native
  var permissions: Type = js.native
  var repository_ids: Type = js.native
}

object Permissions {
  @scala.inline
  def apply(installation_id: Required, permissions: Type, repository_ids: Type): Permissions = {
    val __obj = js.Dynamic.literal(installation_id = installation_id.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], repository_ids = repository_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[Permissions]
  }
  @scala.inline
  implicit class PermissionsOps[Self <: Permissions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstallation_id(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installation_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermissions(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepository_ids(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository_ids")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

