package typingsSlinky.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeGroup extends StObject {
  
  /**
    * The identifier for the node group (shard). A Redis (cluster mode disabled) replication group contains only 1 node group; therefore, the node group ID is 0001. A Redis (cluster mode enabled) replication group contains 1 to 90 node groups numbered 0001 to 0090. Optionally, the user can provide the id for a node group. 
    */
  var NodeGroupId: js.UndefOr[String] = js.native
  
  /**
    * A list containing information about individual nodes within the node group (shard).
    */
  var NodeGroupMembers: js.UndefOr[NodeGroupMemberList] = js.native
  
  /**
    * The endpoint of the primary node in this node group (shard).
    */
  var PrimaryEndpoint: js.UndefOr[Endpoint] = js.native
  
  /**
    * The endpoint of the replica nodes in this node group (shard).
    */
  var ReaderEndpoint: js.UndefOr[Endpoint] = js.native
  
  /**
    * The keyspace for this node group (shard).
    */
  var Slots: js.UndefOr[String] = js.native
  
  /**
    * The current state of this replication group - creating, available, modifying, deleting.
    */
  var Status: js.UndefOr[String] = js.native
}
object NodeGroup {
  
  @scala.inline
  def apply(): NodeGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeGroup]
  }
  
  @scala.inline
  implicit class NodeGroupMutableBuilder[Self <: NodeGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeGroupId(value: String): Self = StObject.set(x, "NodeGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeGroupIdUndefined: Self = StObject.set(x, "NodeGroupId", js.undefined)
    
    @scala.inline
    def setNodeGroupMembers(value: NodeGroupMemberList): Self = StObject.set(x, "NodeGroupMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeGroupMembersUndefined: Self = StObject.set(x, "NodeGroupMembers", js.undefined)
    
    @scala.inline
    def setNodeGroupMembersVarargs(value: NodeGroupMember*): Self = StObject.set(x, "NodeGroupMembers", js.Array(value :_*))
    
    @scala.inline
    def setPrimaryEndpoint(value: Endpoint): Self = StObject.set(x, "PrimaryEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryEndpointUndefined: Self = StObject.set(x, "PrimaryEndpoint", js.undefined)
    
    @scala.inline
    def setReaderEndpoint(value: Endpoint): Self = StObject.set(x, "ReaderEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReaderEndpointUndefined: Self = StObject.set(x, "ReaderEndpoint", js.undefined)
    
    @scala.inline
    def setSlots(value: String): Self = StObject.set(x, "Slots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotsUndefined: Self = StObject.set(x, "Slots", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
