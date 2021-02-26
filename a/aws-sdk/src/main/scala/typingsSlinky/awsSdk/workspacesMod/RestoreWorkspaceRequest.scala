package typingsSlinky.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreWorkspaceRequest extends StObject {
  
  /**
    * The identifier of the WorkSpace.
    */
  var WorkspaceId: typingsSlinky.awsSdk.workspacesMod.WorkspaceId = js.native
}
object RestoreWorkspaceRequest {
  
  @scala.inline
  def apply(WorkspaceId: WorkspaceId): RestoreWorkspaceRequest = {
    val __obj = js.Dynamic.literal(WorkspaceId = WorkspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreWorkspaceRequest]
  }
  
  @scala.inline
  implicit class RestoreWorkspaceRequestMutableBuilder[Self <: RestoreWorkspaceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "WorkspaceId", value.asInstanceOf[js.Any])
  }
}
