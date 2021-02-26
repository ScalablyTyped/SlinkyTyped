package typingsSlinky.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecreaseReplicaCountMessage extends StObject {
  
  /**
    * If True, the number of replica nodes is decreased immediately. ApplyImmediately=False is not currently supported.
    */
  var ApplyImmediately: Boolean = js.native
  
  /**
    * The number of read replica nodes you want at the completion of this operation. For Redis (cluster mode disabled) replication groups, this is the number of replica nodes in the replication group. For Redis (cluster mode enabled) replication groups, this is the number of replica nodes in each of the replication group's node groups. The minimum number of replicas in a shard or replication group is:   Redis (cluster mode disabled)   If Multi-AZ is enabled: 1   If Multi-AZ is not enabled: 0     Redis (cluster mode enabled): 0 (though you will not be able to failover to a replica if your primary node fails)  
    */
  var NewReplicaCount: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * A list of ConfigureShard objects that can be used to configure each shard in a Redis (cluster mode enabled) replication group. The ConfigureShard has three members: NewReplicaCount, NodeGroupId, and PreferredAvailabilityZones.
    */
  var ReplicaConfiguration: js.UndefOr[ReplicaConfigurationList] = js.native
  
  /**
    * A list of the node ids to remove from the replication group or node group (shard).
    */
  var ReplicasToRemove: js.UndefOr[RemoveReplicasList] = js.native
  
  /**
    * The id of the replication group from which you want to remove replica nodes.
    */
  var ReplicationGroupId: String = js.native
}
object DecreaseReplicaCountMessage {
  
  @scala.inline
  def apply(ApplyImmediately: Boolean, ReplicationGroupId: String): DecreaseReplicaCountMessage = {
    val __obj = js.Dynamic.literal(ApplyImmediately = ApplyImmediately.asInstanceOf[js.Any], ReplicationGroupId = ReplicationGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecreaseReplicaCountMessage]
  }
  
  @scala.inline
  implicit class DecreaseReplicaCountMessageMutableBuilder[Self <: DecreaseReplicaCountMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyImmediately(value: Boolean): Self = StObject.set(x, "ApplyImmediately", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewReplicaCount(value: IntegerOptional): Self = StObject.set(x, "NewReplicaCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewReplicaCountUndefined: Self = StObject.set(x, "NewReplicaCount", js.undefined)
    
    @scala.inline
    def setReplicaConfiguration(value: ReplicaConfigurationList): Self = StObject.set(x, "ReplicaConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicaConfigurationUndefined: Self = StObject.set(x, "ReplicaConfiguration", js.undefined)
    
    @scala.inline
    def setReplicaConfigurationVarargs(value: ConfigureShard*): Self = StObject.set(x, "ReplicaConfiguration", js.Array(value :_*))
    
    @scala.inline
    def setReplicasToRemove(value: RemoveReplicasList): Self = StObject.set(x, "ReplicasToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicasToRemoveUndefined: Self = StObject.set(x, "ReplicasToRemove", js.undefined)
    
    @scala.inline
    def setReplicasToRemoveVarargs(value: String*): Self = StObject.set(x, "ReplicasToRemove", js.Array(value :_*))
    
    @scala.inline
    def setReplicationGroupId(value: String): Self = StObject.set(x, "ReplicationGroupId", value.asInstanceOf[js.Any])
  }
}
