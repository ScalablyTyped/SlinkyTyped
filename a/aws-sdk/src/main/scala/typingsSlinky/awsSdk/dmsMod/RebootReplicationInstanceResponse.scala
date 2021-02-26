package typingsSlinky.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RebootReplicationInstanceResponse extends StObject {
  
  /**
    * The replication instance that is being rebooted. 
    */
  var ReplicationInstance: js.UndefOr[typingsSlinky.awsSdk.dmsMod.ReplicationInstance] = js.native
}
object RebootReplicationInstanceResponse {
  
  @scala.inline
  def apply(): RebootReplicationInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RebootReplicationInstanceResponse]
  }
  
  @scala.inline
  implicit class RebootReplicationInstanceResponseMutableBuilder[Self <: RebootReplicationInstanceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplicationInstance(value: ReplicationInstance): Self = StObject.set(x, "ReplicationInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationInstanceUndefined: Self = StObject.set(x, "ReplicationInstance", js.undefined)
  }
}
