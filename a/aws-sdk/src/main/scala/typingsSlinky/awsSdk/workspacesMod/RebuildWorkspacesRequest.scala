package typingsSlinky.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RebuildWorkspacesRequest extends StObject {
  
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
  implicit class RebuildWorkspacesRequestMutableBuilder[Self <: RebuildWorkspacesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRebuildWorkspaceRequests(value: RebuildWorkspaceRequests): Self = StObject.set(x, "RebuildWorkspaceRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRebuildWorkspaceRequestsVarargs(value: RebuildRequest*): Self = StObject.set(x, "RebuildWorkspaceRequests", js.Array(value :_*))
  }
}
