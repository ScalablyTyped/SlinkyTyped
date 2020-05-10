package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeElasticLoadBalancersRequest extends js.Object {
  /**
    * A list of layer IDs. The action describes the Elastic Load Balancing instances for the specified layers.
    */
  var LayerIds: js.UndefOr[Strings] = js.native
  /**
    * A stack ID. The action describes the stack's Elastic Load Balancing instances.
    */
  var StackId: js.UndefOr[String] = js.native
}

object DescribeElasticLoadBalancersRequest {
  @scala.inline
  def apply(): DescribeElasticLoadBalancersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeElasticLoadBalancersRequest]
  }
  @scala.inline
  implicit class DescribeElasticLoadBalancersRequestOps[Self <: DescribeElasticLoadBalancersRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayerIds(value: Strings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayerIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayerIds")(js.undefined)
        ret
    }
    @scala.inline
    def withStackId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackId")(js.undefined)
        ret
    }
  }
  
}

