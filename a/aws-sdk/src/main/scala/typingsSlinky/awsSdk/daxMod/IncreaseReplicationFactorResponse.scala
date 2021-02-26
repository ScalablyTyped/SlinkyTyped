package typingsSlinky.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncreaseReplicationFactorResponse extends StObject {
  
  /**
    * A description of the DAX cluster. with its new replication factor.
    */
  var Cluster: js.UndefOr[typingsSlinky.awsSdk.daxMod.Cluster] = js.native
}
object IncreaseReplicationFactorResponse {
  
  @scala.inline
  def apply(): IncreaseReplicationFactorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncreaseReplicationFactorResponse]
  }
  
  @scala.inline
  implicit class IncreaseReplicationFactorResponseMutableBuilder[Self <: IncreaseReplicationFactorResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCluster(value: Cluster): Self = StObject.set(x, "Cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterUndefined: Self = StObject.set(x, "Cluster", js.undefined)
  }
}
