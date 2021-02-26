package typingsSlinky.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecreaseReplicationFactorResponse extends StObject {
  
  /**
    * A description of the DAX cluster, after you have decreased its replication factor.
    */
  var Cluster: js.UndefOr[typingsSlinky.awsSdk.daxMod.Cluster] = js.native
}
object DecreaseReplicationFactorResponse {
  
  @scala.inline
  def apply(): DecreaseReplicationFactorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecreaseReplicationFactorResponse]
  }
  
  @scala.inline
  implicit class DecreaseReplicationFactorResponseMutableBuilder[Self <: DecreaseReplicationFactorResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCluster(value: Cluster): Self = StObject.set(x, "Cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterUndefined: Self = StObject.set(x, "Cluster", js.undefined)
  }
}
