package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateWorkspacesRequest extends js.Object {
  /**
    * The WorkSpaces to create. You can specify up to 25 WorkSpaces.
    */
  var Workspaces: WorkspaceRequestList = js.native
}

object CreateWorkspacesRequest {
  @scala.inline
  def apply(Workspaces: WorkspaceRequestList): CreateWorkspacesRequest = {
    val __obj = js.Dynamic.literal(Workspaces = Workspaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkspacesRequest]
  }
  @scala.inline
  implicit class CreateWorkspacesRequestOps[Self <: CreateWorkspacesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWorkspaces(value: WorkspaceRequestList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Workspaces")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

