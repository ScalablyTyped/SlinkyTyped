package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeWorkspacesConnectionStatusResult extends js.Object {
  /**
    * The token to use to retrieve the next set of results, or null if no more results are available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * Information about the connection status of the WorkSpace.
    */
  var WorkspacesConnectionStatus: js.UndefOr[WorkspaceConnectionStatusList] = js.native
}

object DescribeWorkspacesConnectionStatusResult {
  @scala.inline
  def apply(): DescribeWorkspacesConnectionStatusResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorkspacesConnectionStatusResult]
  }
  @scala.inline
  implicit class DescribeWorkspacesConnectionStatusResultOps[Self <: DescribeWorkspacesConnectionStatusResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: PaginationToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkspacesConnectionStatus(value: WorkspaceConnectionStatusList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkspacesConnectionStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkspacesConnectionStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkspacesConnectionStatus")(js.undefined)
        ret
    }
  }
  
}

