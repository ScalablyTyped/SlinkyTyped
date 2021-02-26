package typingsSlinky.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyLoadBalancerAttributesInput extends StObject {
  
  /**
    * The attributes for the load balancer.
    */
  var LoadBalancerAttributes: typingsSlinky.awsSdk.elbMod.LoadBalancerAttributes = js.native
  
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName = js.native
}
object ModifyLoadBalancerAttributesInput {
  
  @scala.inline
  def apply(LoadBalancerAttributes: LoadBalancerAttributes, LoadBalancerName: AccessPointName): ModifyLoadBalancerAttributesInput = {
    val __obj = js.Dynamic.literal(LoadBalancerAttributes = LoadBalancerAttributes.asInstanceOf[js.Any], LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyLoadBalancerAttributesInput]
  }
  
  @scala.inline
  implicit class ModifyLoadBalancerAttributesInputMutableBuilder[Self <: ModifyLoadBalancerAttributesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadBalancerAttributes(value: LoadBalancerAttributes): Self = StObject.set(x, "LoadBalancerAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerName(value: AccessPointName): Self = StObject.set(x, "LoadBalancerName", value.asInstanceOf[js.Any])
  }
}
