package typingsSlinky.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyGlobalReplicationGroupMessage extends StObject {
  
  /**
    * This parameter causes the modifications in this request and any pending modifications to be applied, asynchronously and as soon as possible. Modifications to Global Replication Groups cannot be requested to be applied in PreferredMaintenceWindow. 
    */
  var ApplyImmediately: Boolean = js.native
  
  /**
    * Determines whether a read replica is automatically promoted to read/write primary if the existing primary encounters a failure. 
    */
  var AutomaticFailoverEnabled: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * A valid cache node type that you want to scale this Global Datastore to.
    */
  var CacheNodeType: js.UndefOr[String] = js.native
  
  /**
    * The upgraded version of the cache engine to be run on the clusters in the Global Datastore. 
    */
  var EngineVersion: js.UndefOr[String] = js.native
  
  /**
    * A description of the Global Datastore
    */
  var GlobalReplicationGroupDescription: js.UndefOr[String] = js.native
  
  /**
    * The name of the Global Datastore
    */
  var GlobalReplicationGroupId: String = js.native
}
object ModifyGlobalReplicationGroupMessage {
  
  @scala.inline
  def apply(ApplyImmediately: Boolean, GlobalReplicationGroupId: String): ModifyGlobalReplicationGroupMessage = {
    val __obj = js.Dynamic.literal(ApplyImmediately = ApplyImmediately.asInstanceOf[js.Any], GlobalReplicationGroupId = GlobalReplicationGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyGlobalReplicationGroupMessage]
  }
  
  @scala.inline
  implicit class ModifyGlobalReplicationGroupMessageMutableBuilder[Self <: ModifyGlobalReplicationGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyImmediately(value: Boolean): Self = StObject.set(x, "ApplyImmediately", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticFailoverEnabled(value: BooleanOptional): Self = StObject.set(x, "AutomaticFailoverEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticFailoverEnabledUndefined: Self = StObject.set(x, "AutomaticFailoverEnabled", js.undefined)
    
    @scala.inline
    def setCacheNodeType(value: String): Self = StObject.set(x, "CacheNodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheNodeTypeUndefined: Self = StObject.set(x, "CacheNodeType", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    @scala.inline
    def setGlobalReplicationGroupDescription(value: String): Self = StObject.set(x, "GlobalReplicationGroupDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalReplicationGroupDescriptionUndefined: Self = StObject.set(x, "GlobalReplicationGroupDescription", js.undefined)
    
    @scala.inline
    def setGlobalReplicationGroupId(value: String): Self = StObject.set(x, "GlobalReplicationGroupId", value.asInstanceOf[js.Any])
  }
}
