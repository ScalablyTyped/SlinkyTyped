package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifySelfservicePermissionsRequest extends js.Object {
  /**
    * The identifier of the directory.
    */
  var ResourceId: DirectoryId = js.native
  /**
    * The permissions to enable or disable self-service capabilities.
    */
  var SelfservicePermissions: typingsSlinky.awsSdk.workspacesMod.SelfservicePermissions = js.native
}

object ModifySelfservicePermissionsRequest {
  @scala.inline
  def apply(ResourceId: DirectoryId, SelfservicePermissions: SelfservicePermissions): ModifySelfservicePermissionsRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], SelfservicePermissions = SelfservicePermissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifySelfservicePermissionsRequest]
  }
  @scala.inline
  implicit class ModifySelfservicePermissionsRequestOps[Self <: ModifySelfservicePermissionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceId(value: DirectoryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelfservicePermissions(value: SelfservicePermissions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelfservicePermissions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

