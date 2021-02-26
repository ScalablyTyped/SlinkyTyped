package typingsSlinky.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLoadBalancerAttributesOutput extends StObject {
  
  /**
    * Information about the load balancer attributes.
    */
  var LoadBalancerAttributes: js.UndefOr[typingsSlinky.awsSdk.elbMod.LoadBalancerAttributes] = js.native
}
object DescribeLoadBalancerAttributesOutput {
  
  @scala.inline
  def apply(): DescribeLoadBalancerAttributesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLoadBalancerAttributesOutput]
  }
  
  @scala.inline
  implicit class DescribeLoadBalancerAttributesOutputMutableBuilder[Self <: DescribeLoadBalancerAttributesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadBalancerAttributes(value: LoadBalancerAttributes): Self = StObject.set(x, "LoadBalancerAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerAttributesUndefined: Self = StObject.set(x, "LoadBalancerAttributes", js.undefined)
  }
}
