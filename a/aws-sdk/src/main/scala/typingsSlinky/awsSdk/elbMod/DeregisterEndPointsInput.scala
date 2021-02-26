package typingsSlinky.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeregisterEndPointsInput extends StObject {
  
  /**
    * The IDs of the instances.
    */
  var Instances: typingsSlinky.awsSdk.elbMod.Instances = js.native
  
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName = js.native
}
object DeregisterEndPointsInput {
  
  @scala.inline
  def apply(Instances: Instances, LoadBalancerName: AccessPointName): DeregisterEndPointsInput = {
    val __obj = js.Dynamic.literal(Instances = Instances.asInstanceOf[js.Any], LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterEndPointsInput]
  }
  
  @scala.inline
  implicit class DeregisterEndPointsInputMutableBuilder[Self <: DeregisterEndPointsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstances(value: Instances): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesVarargs(value: Instance*): Self = StObject.set(x, "Instances", js.Array(value :_*))
    
    @scala.inline
    def setLoadBalancerName(value: AccessPointName): Self = StObject.set(x, "LoadBalancerName", value.asInstanceOf[js.Any])
  }
}
