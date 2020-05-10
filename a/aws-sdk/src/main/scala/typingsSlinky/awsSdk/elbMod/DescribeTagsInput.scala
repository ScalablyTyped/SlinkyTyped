package typingsSlinky.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTagsInput extends js.Object {
  /**
    * The names of the load balancers.
    */
  var LoadBalancerNames: LoadBalancerNamesMax20 = js.native
}

object DescribeTagsInput {
  @scala.inline
  def apply(LoadBalancerNames: LoadBalancerNamesMax20): DescribeTagsInput = {
    val __obj = js.Dynamic.literal(LoadBalancerNames = LoadBalancerNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTagsInput]
  }
  @scala.inline
  implicit class DescribeTagsInputOps[Self <: DescribeTagsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadBalancerNames(value: LoadBalancerNamesMax20): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadBalancerNames")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

