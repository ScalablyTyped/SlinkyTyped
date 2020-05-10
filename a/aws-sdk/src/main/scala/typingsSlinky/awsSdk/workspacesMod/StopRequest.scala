package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopRequest extends js.Object {
  /**
    * The identifier of the WorkSpace.
    */
  var WorkspaceId: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.WorkspaceId] = js.native
}

object StopRequest {
  @scala.inline
  def apply(): StopRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopRequest]
  }
  @scala.inline
  implicit class StopRequestOps[Self <: StopRequest] (val x: Self) extends AnyVal {
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
    def withoutWorkspaceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkspaceId")(js.undefined)
        ret
    }
  }
  
}

