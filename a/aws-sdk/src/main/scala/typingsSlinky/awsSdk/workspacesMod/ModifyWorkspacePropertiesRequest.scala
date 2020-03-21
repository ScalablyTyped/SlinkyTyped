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
}

