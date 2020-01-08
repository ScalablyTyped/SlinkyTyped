package typingsSlinky.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopWorkspacesRequest extends js.Object {
  /**
    * The WorkSpaces to stop. You can specify up to 25 WorkSpaces.
    */
  var StopWorkspaceRequests: typingsSlinky.awsDashSdk.clientsWorkspacesMod.StopWorkspaceRequests = js.native
}

object StopWorkspacesRequest {
  @scala.inline
  def apply(StopWorkspaceRequests: StopWorkspaceRequests): StopWorkspacesRequest = {
    val __obj = js.Dynamic.literal(StopWorkspaceRequests = StopWorkspaceRequests.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StopWorkspacesRequest]
  }
}

