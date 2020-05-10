package typingsSlinky.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAccessPointsOutput extends js.Object {
  /**
    * Information about the load balancers.
    */
  var LoadBalancerDescriptions: js.UndefOr[typingsSlinky.awsSdk.elbMod.LoadBalancerDescriptions] = js.native
  /**
    * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
    */
  var NextMarker: js.UndefOr[Marker] = js.native
}

object DescribeAccessPointsOutput {
  @scala.inline
  def apply(): DescribeAccessPointsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccessPointsOutput]
  }
  @scala.inline
  implicit class DescribeAccessPointsOutputOps[Self <: DescribeAccessPointsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadBalancerDescriptions(value: LoadBalancerDescriptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadBalancerDescriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadBalancerDescriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadBalancerDescriptions")(js.undefined)
        ret
    }
    @scala.inline
    def withNextMarker(value: Marker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextMarker")(js.undefined)
        ret
    }
  }
  
}

