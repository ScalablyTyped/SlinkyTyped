package typingsSlinky.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachLoadBalancerToSubnetsOutput extends StObject {
  
  /**
    * The IDs of the subnets attached to the load balancer.
    */
  var Subnets: js.UndefOr[typingsSlinky.awsSdk.elbMod.Subnets] = js.native
}
object AttachLoadBalancerToSubnetsOutput {
  
  @scala.inline
  def apply(): AttachLoadBalancerToSubnetsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachLoadBalancerToSubnetsOutput]
  }
  
  @scala.inline
  implicit class AttachLoadBalancerToSubnetsOutputMutableBuilder[Self <: AttachLoadBalancerToSubnetsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubnets(value: Subnets): Self = StObject.set(x, "Subnets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetsUndefined: Self = StObject.set(x, "Subnets", js.undefined)
    
    @scala.inline
    def setSubnetsVarargs(value: SubnetId*): Self = StObject.set(x, "Subnets", js.Array(value :_*))
  }
}
