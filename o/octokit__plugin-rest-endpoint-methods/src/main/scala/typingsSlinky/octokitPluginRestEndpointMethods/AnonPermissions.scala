package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPermissions extends js.Object {
  var installation_id: AnonRequired = js.native
  var permissions: AnonType = js.native
  var repository_ids: AnonType = js.native
}

object AnonPermissions {
  @scala.inline
  def apply(installation_id: AnonRequired, permissions: AnonType, repository_ids: AnonType): AnonPermissions = {
    val __obj = js.Dynamic.literal(installation_id = installation_id.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], repository_ids = repository_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPermissions]
  }
  @scala.inline
  implicit class AnonPermissionsOps[Self <: AnonPermissions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstallation_id(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installation_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermissions(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepository_ids(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository_ids")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

