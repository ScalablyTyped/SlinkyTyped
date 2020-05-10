package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeElasticLoadBalancersResult extends js.Object {
  /**
    * A list of ElasticLoadBalancer objects that describe the specified Elastic Load Balancing instances.
    */
  var ElasticLoadBalancers: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.ElasticLoadBalancers] = js.native
}

object DescribeElasticLoadBalancersResult {
  @scala.inline
  def apply(): DescribeElasticLoadBalancersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeElasticLoadBalancersResult]
  }
  @scala.inline
  implicit class DescribeElasticLoadBalancersResultOps[Self <: DescribeElasticLoadBalancersResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElasticLoadBalancers(value: ElasticLoadBalancers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticLoadBalancers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticLoadBalancers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticLoadBalancers")(js.undefined)
        ret
    }
  }
  
}

