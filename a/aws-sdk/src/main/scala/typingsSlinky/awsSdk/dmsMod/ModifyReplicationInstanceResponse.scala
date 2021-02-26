package typingsSlinky.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyReplicationInstanceResponse extends StObject {
  
  /**
    * The modified replication instance.
    */
  var ReplicationInstance: js.UndefOr[typingsSlinky.awsSdk.dmsMod.ReplicationInstance] = js.native
}
object ModifyReplicationInstanceResponse {
  
  @scala.inline
  def apply(): ModifyReplicationInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyReplicationInstanceResponse]
  }
  
  @scala.inline
  implicit class ModifyReplicationInstanceResponseMutableBuilder[Self <: ModifyReplicationInstanceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplicationInstance(value: ReplicationInstance): Self = StObject.set(x, "ReplicationInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationInstanceUndefined: Self = StObject.set(x, "ReplicationInstance", js.undefined)
  }
}
