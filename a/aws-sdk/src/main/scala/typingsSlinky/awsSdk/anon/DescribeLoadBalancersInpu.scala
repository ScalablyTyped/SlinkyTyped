package typingsSlinky.awsSdk.anon

import typingsSlinky.awsSdk.elbv2Mod.LoadBalancerArns
import typingsSlinky.awsSdk.elbv2Mod.LoadBalancerNames
import typingsSlinky.awsSdk.elbv2Mod.Marker
import typingsSlinky.awsSdk.elbv2Mod.PageSize
import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/elbv2.DescribeLoadBalancersInput & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeLoadBalancersInpu extends js.Object {
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
  implicit class DescribeLoadBalancersInpuOps[Self <: DescribeLoadBalancersInpu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$waiter(value: WaiterConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$waiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$waiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$waiter")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadBalancerArns(value: LoadBalancerArns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadBalancerArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadBalancerArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadBalancerArns")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: Marker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
        ret
    }
    @scala.inline
    def withNames(value: LoadBalancerNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Names")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: PageSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageSize")(js.undefined)
        ret
    }
  }
  
}

