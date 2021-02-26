package typingsSlinky.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateWorkspacesRequest extends StObject {
  
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
  implicit class CreateWorkspacesRequestMutableBuilder[Self <: CreateWorkspacesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWorkspaces(value: WorkspaceRequestList): Self = StObject.set(x, "Workspaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspacesVarargs(value: WorkspaceRequest*): Self = StObject.set(x, "Workspaces", js.Array(value :_*))
  }
}
