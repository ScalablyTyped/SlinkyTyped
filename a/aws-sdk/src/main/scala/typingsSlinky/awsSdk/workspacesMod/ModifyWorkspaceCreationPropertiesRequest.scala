package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyWorkspaceCreationPropertiesRequest extends js.Object {
  /**
    * The identifier of the directory.
    */
  var ResourceId: DirectoryId = js.native
  /**
    * The default properties for creating WorkSpaces.
    */
  var WorkspaceCreationProperties: typingsSlinky.awsSdk.workspacesMod.WorkspaceCreationProperties = js.native
}

object ModifyWorkspaceCreationPropertiesRequest {
  @scala.inline
  def apply(ResourceId: DirectoryId, WorkspaceCreationProperties: WorkspaceCreationProperties): ModifyWorkspaceCreationPropertiesRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], WorkspaceCreationProperties = WorkspaceCreationProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyWorkspaceCreationPropertiesRequest]
  }
  @scala.inline
  implicit class ModifyWorkspaceCreationPropertiesRequestOps[Self <: ModifyWorkspaceCreationPropertiesRequest] (val x: Self) extends AnyVal {
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
    def withWorkspaceCreationProperties(value: WorkspaceCreationProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkspaceCreationProperties")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

