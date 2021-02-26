package typingsSlinky.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspaceConnectionStatus extends StObject {
  
  /**
    * The connection state of the WorkSpace. The connection state is unknown if the WorkSpace is stopped.
    */
  var ConnectionState: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.ConnectionState] = js.native
  
  /**
    * The timestamp of the connection status check.
    */
  var ConnectionStateCheckTimestamp: js.UndefOr[js.Date] = js.native
  
  /**
    * The timestamp of the last known user connection.
    */
  var LastKnownUserConnectionTimestamp: js.UndefOr[js.Date] = js.native
  
  /**
    * The identifier of the WorkSpace.
    */
  var WorkspaceId: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.WorkspaceId] = js.native
}
object WorkspaceConnectionStatus {
  
  @scala.inline
  def apply(): WorkspaceConnectionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceConnectionStatus]
  }
  
  @scala.inline
  implicit class WorkspaceConnectionStatusMutableBuilder[Self <: WorkspaceConnectionStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionState(value: ConnectionState): Self = StObject.set(x, "ConnectionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionStateCheckTimestamp(value: js.Date): Self = StObject.set(x, "ConnectionStateCheckTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionStateCheckTimestampUndefined: Self = StObject.set(x, "ConnectionStateCheckTimestamp", js.undefined)
    
    @scala.inline
    def setConnectionStateUndefined: Self = StObject.set(x, "ConnectionState", js.undefined)
    
    @scala.inline
    def setLastKnownUserConnectionTimestamp(value: js.Date): Self = StObject.set(x, "LastKnownUserConnectionTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastKnownUserConnectionTimestampUndefined: Self = StObject.set(x, "LastKnownUserConnectionTimestamp", js.undefined)
    
    @scala.inline
    def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "WorkspaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceIdUndefined: Self = StObject.set(x, "WorkspaceId", js.undefined)
  }
}
