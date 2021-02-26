package typingsSlinky.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheNode extends StObject {
  
  /**
    * The date and time when the cache node was created.
    */
  var CacheNodeCreateTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The cache node identifier. A node ID is a numeric identifier (0001, 0002, etc.). The combination of cluster ID and node ID uniquely identifies every cache node used in a customer's AWS account.
    */
  var CacheNodeId: js.UndefOr[String] = js.native
  
  /**
    * The current state of this cache node, one of the following values: available, creating, rebooting, or deleting.
    */
  var CacheNodeStatus: js.UndefOr[String] = js.native
  
  /**
    * The Availability Zone where this node was created and now resides.
    */
  var CustomerAvailabilityZone: js.UndefOr[String] = js.native
  
  /**
    * The customer outpost ARN of the cache node.
    */
  var CustomerOutpostArn: js.UndefOr[String] = js.native
  
  /**
    * The hostname for connecting to this cache node.
    */
  var Endpoint: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.Endpoint] = js.native
  
  /**
    * The status of the parameter group applied to this cache node.
    */
  var ParameterGroupStatus: js.UndefOr[String] = js.native
  
  /**
    * The ID of the primary node to which this read replica node is synchronized. If this field is empty, this node is not associated with a primary cluster.
    */
  var SourceCacheNodeId: js.UndefOr[String] = js.native
}
object CacheNode {
  
  @scala.inline
  def apply(): CacheNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheNode]
  }
  
  @scala.inline
  implicit class CacheNodeMutableBuilder[Self <: CacheNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheNodeCreateTime(value: js.Date): Self = StObject.set(x, "CacheNodeCreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheNodeCreateTimeUndefined: Self = StObject.set(x, "CacheNodeCreateTime", js.undefined)
    
    @scala.inline
    def setCacheNodeId(value: String): Self = StObject.set(x, "CacheNodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheNodeIdUndefined: Self = StObject.set(x, "CacheNodeId", js.undefined)
    
    @scala.inline
    def setCacheNodeStatus(value: String): Self = StObject.set(x, "CacheNodeStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheNodeStatusUndefined: Self = StObject.set(x, "CacheNodeStatus", js.undefined)
    
    @scala.inline
    def setCustomerAvailabilityZone(value: String): Self = StObject.set(x, "CustomerAvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerAvailabilityZoneUndefined: Self = StObject.set(x, "CustomerAvailabilityZone", js.undefined)
    
    @scala.inline
    def setCustomerOutpostArn(value: String): Self = StObject.set(x, "CustomerOutpostArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerOutpostArnUndefined: Self = StObject.set(x, "CustomerOutpostArn", js.undefined)
    
    @scala.inline
    def setEndpoint(value: Endpoint): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
    
    @scala.inline
    def setParameterGroupStatus(value: String): Self = StObject.set(x, "ParameterGroupStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterGroupStatusUndefined: Self = StObject.set(x, "ParameterGroupStatus", js.undefined)
    
    @scala.inline
    def setSourceCacheNodeId(value: String): Self = StObject.set(x, "SourceCacheNodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCacheNodeIdUndefined: Self = StObject.set(x, "SourceCacheNodeId", js.undefined)
  }
}
