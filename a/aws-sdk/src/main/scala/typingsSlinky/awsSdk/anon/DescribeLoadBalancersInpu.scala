package typingsSlinky.awsSdk.anon

import typingsSlinky.awsSdk.elbv2Mod.LoadBalancerArn
import typingsSlinky.awsSdk.elbv2Mod.LoadBalancerArns
import typingsSlinky.awsSdk.elbv2Mod.LoadBalancerName
import typingsSlinky.awsSdk.elbv2Mod.LoadBalancerNames
import typingsSlinky.awsSdk.elbv2Mod.Marker
import typingsSlinky.awsSdk.elbv2Mod.PageSize
import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/elbv2.DescribeLoadBalancersInput & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
@js.native
trait DescribeLoadBalancersInpu extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  
  /**
    * The Amazon Resource Names (ARN) of the load balancers. You can specify up to 20 load balancers in a single call.
    */
  var LoadBalancerArns: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.LoadBalancerArns] = js.native
  
  /**
    * The marker for the next set of results. (You received this marker from a previous call.)
    */
  var Marker: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.Marker] = js.native
  
  /**
    * The names of the load balancers.
    */
  var Names: js.UndefOr[LoadBalancerNames] = js.native
  
  /**
    * The maximum number of results to return with this call.
    */
  var PageSize: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.PageSize] = js.native
}
object DescribeLoadBalancersInpu {
  
  @scala.inline
  def apply(): DescribeLoadBalancersInpu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLoadBalancersInpu]
  }
  
  @scala.inline
  implicit class DescribeLoadBalancersInpuMutableBuilder[Self <: DescribeLoadBalancersInpu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    @scala.inline
    def setLoadBalancerArns(value: LoadBalancerArns): Self = StObject.set(x, "LoadBalancerArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerArnsUndefined: Self = StObject.set(x, "LoadBalancerArns", js.undefined)
    
    @scala.inline
    def setLoadBalancerArnsVarargs(value: LoadBalancerArn*): Self = StObject.set(x, "LoadBalancerArns", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setNames(value: LoadBalancerNames): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesUndefined: Self = StObject.set(x, "Names", js.undefined)
    
    @scala.inline
    def setNamesVarargs(value: LoadBalancerName*): Self = StObject.set(x, "Names", js.Array(value :_*))
    
    @scala.inline
    def setPageSize(value: PageSize): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
  }
}
