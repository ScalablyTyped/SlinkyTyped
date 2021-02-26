package typingsSlinky.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeGroupMemberUpdateStatus extends StObject {
  
  /**
    * The cache cluster ID
    */
  var CacheClusterId: js.UndefOr[String] = js.native
  
  /**
    * The node ID of the cache cluster
    */
  var CacheNodeId: js.UndefOr[String] = js.native
  
  /**
    * The deletion date of the node
    */
  var NodeDeletionDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The end date of the update for a node
    */
  var NodeUpdateEndDate: js.UndefOr[js.Date] = js.native
  
  /**
    * Reflects whether the update was initiated by the customer or automatically applied
    */
  var NodeUpdateInitiatedBy: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.NodeUpdateInitiatedBy] = js.native
  
  /**
    * The date when the update is triggered
    */
  var NodeUpdateInitiatedDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The start date of the update for a node
    */
  var NodeUpdateStartDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The update status of the node
    */
  var NodeUpdateStatus: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.NodeUpdateStatus] = js.native
  
  /**
    * The date when the NodeUpdateStatus was last modified
    */
  var NodeUpdateStatusModifiedDate: js.UndefOr[js.Date] = js.native
}
object NodeGroupMemberUpdateStatus {
  
  @scala.inline
  def apply(): NodeGroupMemberUpdateStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeGroupMemberUpdateStatus]
  }
  
  @scala.inline
  implicit class NodeGroupMemberUpdateStatusMutableBuilder[Self <: NodeGroupMemberUpdateStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheClusterId(value: String): Self = StObject.set(x, "CacheClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheClusterIdUndefined: Self = StObject.set(x, "CacheClusterId", js.undefined)
    
    @scala.inline
    def setCacheNodeId(value: String): Self = StObject.set(x, "CacheNodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheNodeIdUndefined: Self = StObject.set(x, "CacheNodeId", js.undefined)
    
    @scala.inline
    def setNodeDeletionDate(value: js.Date): Self = StObject.set(x, "NodeDeletionDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeDeletionDateUndefined: Self = StObject.set(x, "NodeDeletionDate", js.undefined)
    
    @scala.inline
    def setNodeUpdateEndDate(value: js.Date): Self = StObject.set(x, "NodeUpdateEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeUpdateEndDateUndefined: Self = StObject.set(x, "NodeUpdateEndDate", js.undefined)
    
    @scala.inline
    def setNodeUpdateInitiatedBy(value: NodeUpdateInitiatedBy): Self = StObject.set(x, "NodeUpdateInitiatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeUpdateInitiatedByUndefined: Self = StObject.set(x, "NodeUpdateInitiatedBy", js.undefined)
    
    @scala.inline
    def setNodeUpdateInitiatedDate(value: js.Date): Self = StObject.set(x, "NodeUpdateInitiatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeUpdateInitiatedDateUndefined: Self = StObject.set(x, "NodeUpdateInitiatedDate", js.undefined)
    
    @scala.inline
    def setNodeUpdateStartDate(value: js.Date): Self = StObject.set(x, "NodeUpdateStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeUpdateStartDateUndefined: Self = StObject.set(x, "NodeUpdateStartDate", js.undefined)
    
    @scala.inline
    def setNodeUpdateStatus(value: NodeUpdateStatus): Self = StObject.set(x, "NodeUpdateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeUpdateStatusModifiedDate(value: js.Date): Self = StObject.set(x, "NodeUpdateStatusModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeUpdateStatusModifiedDateUndefined: Self = StObject.set(x, "NodeUpdateStatusModifiedDate", js.undefined)
    
    @scala.inline
    def setNodeUpdateStatusUndefined: Self = StObject.set(x, "NodeUpdateStatus", js.undefined)
  }
}
