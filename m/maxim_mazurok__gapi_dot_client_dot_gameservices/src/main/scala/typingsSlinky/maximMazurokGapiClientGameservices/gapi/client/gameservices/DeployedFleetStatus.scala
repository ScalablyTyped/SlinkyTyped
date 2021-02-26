package typingsSlinky.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeployedFleetStatus extends StObject {
  
  /** The number of GameServer replicas in the ALLOCATED state in this fleet. */
  var allocatedReplicas: js.UndefOr[String] = js.native
  
  /** The number of GameServer replicas in the READY state in this fleet. */
  var readyReplicas: js.UndefOr[String] = js.native
  
  /** The total number of current GameServer replicas in this fleet. */
  var replicas: js.UndefOr[String] = js.native
  
  /** The number of GameServer replicas in the RESERVED state in this fleet. Reserved instances won't be deleted on scale down, but won't cause an autoscaler to scale up. */
  var reservedReplicas: js.UndefOr[String] = js.native
}
object DeployedFleetStatus {
  
  @scala.inline
  def apply(): DeployedFleetStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeployedFleetStatus]
  }
  
  @scala.inline
  implicit class DeployedFleetStatusMutableBuilder[Self <: DeployedFleetStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllocatedReplicas(value: String): Self = StObject.set(x, "allocatedReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllocatedReplicasUndefined: Self = StObject.set(x, "allocatedReplicas", js.undefined)
    
    @scala.inline
    def setReadyReplicas(value: String): Self = StObject.set(x, "readyReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadyReplicasUndefined: Self = StObject.set(x, "readyReplicas", js.undefined)
    
    @scala.inline
    def setReplicas(value: String): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicasUndefined: Self = StObject.set(x, "replicas", js.undefined)
    
    @scala.inline
    def setReservedReplicas(value: String): Self = StObject.set(x, "reservedReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedReplicasUndefined: Self = StObject.set(x, "reservedReplicas", js.undefined)
  }
}
