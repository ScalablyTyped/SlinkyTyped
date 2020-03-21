package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminateRequest extends js.Object {
  /**
    * The identifier of the WorkSpace.
    */
  var WorkspaceId: typingsSlinky.awsSdk.workspacesMod.WorkspaceId = js.native
}

object TerminateRequest {
  @scala.inline
  def apply(WorkspaceId: WorkspaceId): TerminateRequest = {
    val __obj = js.Dynamic.literal(WorkspaceId = WorkspaceId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TerminateRequest]
  }
}

