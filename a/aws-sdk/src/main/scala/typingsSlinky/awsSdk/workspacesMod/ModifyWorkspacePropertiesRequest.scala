package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyWorkspacePropertiesRequest extends js.Object {
  /**
    * The identifier of the WorkSpace.
    */
  var WorkspaceId: typingsSlinky.awsSdk.workspacesMod.WorkspaceId = js.native
  /**
    * The properties of the WorkSpace.
    */
  var WorkspaceProperties: typingsSlinky.awsSdk.workspacesMod.WorkspaceProperties = js.native
}

object ModifyWorkspacePropertiesRequest {
  @scala.inline
  def apply(WorkspaceId: WorkspaceId, WorkspaceProperties: WorkspaceProperties): ModifyWorkspacePropertiesRequest = {
    val __obj = js.Dynamic.literal(WorkspaceId = WorkspaceId.asInstanceOf[js.Any], WorkspaceProperties = WorkspaceProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyWorkspacePropertiesRequest]
  }
  @scala.inline
  implicit class ModifyWorkspacePropertiesRequestOps[Self <: ModifyWorkspacePropertiesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWorkspaceId(value: WorkspaceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkspaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkspaceProperties(value: WorkspaceProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkspaceProperties")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

