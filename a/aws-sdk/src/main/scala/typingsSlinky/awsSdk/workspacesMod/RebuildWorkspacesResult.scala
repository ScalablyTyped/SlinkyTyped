package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RebuildWorkspacesResult extends js.Object {
  /**
    * Information about the WorkSpace that could not be rebuilt.
    */
  var FailedRequests: js.UndefOr[FailedRebuildWorkspaceRequests] = js.native
}

object RebuildWorkspacesResult {
  @scala.inline
  def apply(): RebuildWorkspacesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RebuildWorkspacesResult]
  }
  @scala.inline
  implicit class RebuildWorkspacesResultOps[Self <: RebuildWorkspacesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailedRequests(value: FailedRebuildWorkspaceRequests): Self = {
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

