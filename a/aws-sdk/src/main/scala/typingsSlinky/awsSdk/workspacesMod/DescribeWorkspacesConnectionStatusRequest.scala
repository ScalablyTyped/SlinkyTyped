package typingsSlinky.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeWorkspacesConnectionStatusRequest extends StObject {
  
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
  implicit class DescribeWorkspacesConnectionStatusRequestMutableBuilder[Self <: DescribeWorkspacesConnectionStatusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setWorkspaceIds(value: WorkspaceIdList): Self = StObject.set(x, "WorkspaceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceIdsUndefined: Self = StObject.set(x, "WorkspaceIds", js.undefined)
    
    @scala.inline
    def setWorkspaceIdsVarargs(value: WorkspaceId*): Self = StObject.set(x, "WorkspaceIds", js.Array(value :_*))
  }
}
