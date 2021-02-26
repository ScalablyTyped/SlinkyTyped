package typingsSlinky.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestFailoverMessage extends StObject {
  
  /**
    * The name of the node group (called shard in the console) in this replication group on which automatic failover is to be tested. You may test automatic failover on up to 5 node groups in any rolling 24-hour period.
    */
  var NodeGroupId: AllowedNodeGroupId = js.native
  
  /**
    * The name of the replication group (console: cluster) whose automatic failover is being tested by this operation.
    */
  var ReplicationGroupId: String = js.native
}
object TestFailoverMessage {
  
  @scala.inline
  def apply(NodeGroupId: AllowedNodeGroupId, ReplicationGroupId: String): TestFailoverMessage = {
    val __obj = js.Dynamic.literal(NodeGroupId = NodeGroupId.asInstanceOf[js.Any], ReplicationGroupId = ReplicationGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestFailoverMessage]
  }
  
  @scala.inline
  implicit class TestFailoverMessageMutableBuilder[Self <: TestFailoverMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeGroupId(value: AllowedNodeGroupId): Self = StObject.set(x, "NodeGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationGroupId(value: String): Self = StObject.set(x, "ReplicationGroupId", value.asInstanceOf[js.Any])
  }
}
