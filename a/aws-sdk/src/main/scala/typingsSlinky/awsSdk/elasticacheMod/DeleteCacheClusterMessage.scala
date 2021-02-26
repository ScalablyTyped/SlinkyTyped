package typingsSlinky.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteCacheClusterMessage extends StObject {
  
  /**
    * The cluster identifier for the cluster to be deleted. This parameter is not case sensitive.
    */
  var CacheClusterId: String = js.native
  
  /**
    * The user-supplied name of a final cluster snapshot. This is the unique name that identifies the snapshot. ElastiCache creates the snapshot, and then deletes the cluster immediately afterward.
    */
  var FinalSnapshotIdentifier: js.UndefOr[String] = js.native
}
object DeleteCacheClusterMessage {
  
  @scala.inline
  def apply(CacheClusterId: String): DeleteCacheClusterMessage = {
    val __obj = js.Dynamic.literal(CacheClusterId = CacheClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCacheClusterMessage]
  }
  
  @scala.inline
  implicit class DeleteCacheClusterMessageMutableBuilder[Self <: DeleteCacheClusterMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheClusterId(value: String): Self = StObject.set(x, "CacheClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalSnapshotIdentifier(value: String): Self = StObject.set(x, "FinalSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalSnapshotIdentifierUndefined: Self = StObject.set(x, "FinalSnapshotIdentifier", js.undefined)
  }
}
