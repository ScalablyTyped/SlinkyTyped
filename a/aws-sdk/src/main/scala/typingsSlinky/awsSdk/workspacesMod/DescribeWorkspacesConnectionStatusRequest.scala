package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeWorkspacesConnectionStatusRequest extends js.Object {
  /**
    * If you received a NextToken from a previous call that was paginated, provide this token to receive the next set of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The identifiers of the WorkSpaces. You can specify up to 25 WorkSpaces.
    */
  var WorkspaceIds: js.UndefOr[WorkspaceIdList] = js.native
}

object DescribeWorkspacesConnectionStatusRequest {
  @scala.inline
  def apply(): DescribeWorkspacesConnectionStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorkspacesConnectionStatusRequest]
  }
  @scala.inline
  implicit class DescribeWorkspacesConnectionStatusRequestOps[Self <: DescribeWorkspacesConnectionStatusRequest] (val x: Self) extends AnyVal {
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
    def withWorkspaceIds(value: WorkspaceIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkspaceIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkspaceIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkspaceIds")(js.undefined)
        ret
    }
  }
  
}

