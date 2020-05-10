package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RebootWorkspacesResult extends js.Object {
  /**
    * Information about the WorkSpaces that could not be rebooted.
    */
  var FailedRequests: js.UndefOr[FailedRebootWorkspaceRequests] = js.native
}

object RebootWorkspacesResult {
  @scala.inline
  def apply(): RebootWorkspacesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RebootWorkspacesResult]
  }
  @scala.inline
  implicit class RebootWorkspacesResultOps[Self <: RebootWorkspacesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailedRequests(value: FailedRebootWorkspaceRequests): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedRequests")(js.undefined)
        ret
    }
  }
  
}

