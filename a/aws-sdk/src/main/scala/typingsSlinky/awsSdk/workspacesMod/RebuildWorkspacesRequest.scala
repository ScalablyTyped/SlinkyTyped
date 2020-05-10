package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RebuildWorkspacesRequest extends js.Object {
  /**
    * The WorkSpace to rebuild. You can specify a single WorkSpace.
    */
  var RebuildWorkspaceRequests: typingsSlinky.awsSdk.workspacesMod.RebuildWorkspaceRequests = js.native
}

object RebuildWorkspacesRequest {
  @scala.inline
  def apply(RebuildWorkspaceRequests: RebuildWorkspaceRequests): RebuildWorkspacesRequest = {
    val __obj = js.Dynamic.literal(RebuildWorkspaceRequests = RebuildWorkspaceRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebuildWorkspacesRequest]
  }
  @scala.inline
  implicit class RebuildWorkspacesRequestOps[Self <: RebuildWorkspacesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRebuildWorkspaceRequests(value: RebuildWorkspaceRequests): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RebuildWorkspaceRequests")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

