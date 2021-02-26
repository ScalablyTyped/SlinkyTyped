package typingsSlinky.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteClusterResponse extends StObject {
  
  /**
    * A description of the DAX cluster that is being deleted.
    */
  var Cluster: js.UndefOr[typingsSlinky.awsSdk.daxMod.Cluster] = js.native
}
object DeleteClusterResponse {
  
  @scala.inline
  def apply(): DeleteClusterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteClusterResponse]
  }
  
  @scala.inline
  implicit class DeleteClusterResponseMutableBuilder[Self <: DeleteClusterResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCluster(value: Cluster): Self = StObject.set(x, "Cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterUndefined: Self = StObject.set(x, "Cluster", js.undefined)
  }
}
