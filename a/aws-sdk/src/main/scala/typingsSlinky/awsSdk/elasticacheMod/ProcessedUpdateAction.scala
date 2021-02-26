package typingsSlinky.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessedUpdateAction extends StObject {
  
  /**
    * The ID of the cache cluster
    */
  var CacheClusterId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the replication group
    */
  var ReplicationGroupId: js.UndefOr[String] = js.native
  
  /**
    * The unique ID of the service update
    */
  var ServiceUpdateName: js.UndefOr[String] = js.native
  
  /**
    * The status of the update action on the Redis cluster
    */
  var UpdateActionStatus: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.UpdateActionStatus] = js.native
}
object ProcessedUpdateAction {
  
  @scala.inline
  def apply(): ProcessedUpdateAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessedUpdateAction]
  }
  
  @scala.inline
  implicit class ProcessedUpdateActionMutableBuilder[Self <: ProcessedUpdateAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheClusterId(value: String): Self = StObject.set(x, "CacheClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheClusterIdUndefined: Self = StObject.set(x, "CacheClusterId", js.undefined)
    
    @scala.inline
    def setReplicationGroupId(value: String): Self = StObject.set(x, "ReplicationGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationGroupIdUndefined: Self = StObject.set(x, "ReplicationGroupId", js.undefined)
    
    @scala.inline
    def setServiceUpdateName(value: String): Self = StObject.set(x, "ServiceUpdateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUpdateNameUndefined: Self = StObject.set(x, "ServiceUpdateName", js.undefined)
    
    @scala.inline
    def setUpdateActionStatus(value: UpdateActionStatus): Self = StObject.set(x, "UpdateActionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateActionStatusUndefined: Self = StObject.set(x, "UpdateActionStatus", js.undefined)
  }
}
