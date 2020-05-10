package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminateWorkspacesRequest extends js.Object {
  /**
    * The WorkSpaces to terminate. You can specify up to 25 WorkSpaces.
    */
  var TerminateWorkspaceRequests: typingsSlinky.awsSdk.workspacesMod.TerminateWorkspaceRequests = js.native
}

object TerminateWorkspacesRequest {
  @scala.inline
  def apply(TerminateWorkspaceRequests: TerminateWorkspaceRequests): TerminateWorkspacesRequest = {
    val __obj = js.Dynamic.literal(TerminateWorkspaceRequests = TerminateWorkspaceRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminateWorkspacesRequest]
  }
  @scala.inline
  implicit class TerminateWorkspacesRequestOps[Self <: TerminateWorkspacesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTerminateWorkspaceRequests(value: TerminateWorkspaceRequests): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TerminateWorkspaceRequests")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

