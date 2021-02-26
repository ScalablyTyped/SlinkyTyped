package typingsSlinky.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Server extends StObject {
  
  /**
    * The ID of the replication job.
    */
  var replicationJobId: js.UndefOr[ReplicationJobId] = js.native
  
  /**
    * Indicates whether the replication job is deleted or failed.
    */
  var replicationJobTerminated: js.UndefOr[ReplicationJobTerminated] = js.native
  
  /**
    * The ID of the server.
    */
  var serverId: js.UndefOr[ServerId] = js.native
  
  /**
    * The type of server.
    */
  var serverType: js.UndefOr[ServerType] = js.native
  
  /**
    * Information about the VM server.
    */
  var vmServer: js.UndefOr[VmServer] = js.native
}
object Server {
  
  @scala.inline
  def apply(): Server = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Server]
  }
  
  @scala.inline
  implicit class ServerMutableBuilder[Self <: Server] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplicationJobId(value: ReplicationJobId): Self = StObject.set(x, "replicationJobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationJobIdUndefined: Self = StObject.set(x, "replicationJobId", js.undefined)
    
    @scala.inline
    def setReplicationJobTerminated(value: ReplicationJobTerminated): Self = StObject.set(x, "replicationJobTerminated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationJobTerminatedUndefined: Self = StObject.set(x, "replicationJobTerminated", js.undefined)
    
    @scala.inline
    def setServerId(value: ServerId): Self = StObject.set(x, "serverId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerIdUndefined: Self = StObject.set(x, "serverId", js.undefined)
    
    @scala.inline
    def setServerType(value: ServerType): Self = StObject.set(x, "serverType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerTypeUndefined: Self = StObject.set(x, "serverType", js.undefined)
    
    @scala.inline
    def setVmServer(value: VmServer): Self = StObject.set(x, "vmServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmServerUndefined: Self = StObject.set(x, "vmServer", js.undefined)
  }
}
