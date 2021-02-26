package typingsSlinky.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompleteMigrationResponse extends StObject {
  
  var ReplicationGroup: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.ReplicationGroup] = js.native
}
object CompleteMigrationResponse {
  
  @scala.inline
  def apply(): CompleteMigrationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompleteMigrationResponse]
  }
  
  @scala.inline
  implicit class CompleteMigrationResponseMutableBuilder[Self <: CompleteMigrationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplicationGroup(value: ReplicationGroup): Self = StObject.set(x, "ReplicationGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationGroupUndefined: Self = StObject.set(x, "ReplicationGroup", js.undefined)
  }
}
