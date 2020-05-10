package typingsSlinky.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEndpointGroupResponse extends js.Object {
  /**
    * The description of an endpoint group.
    */
  var EndpointGroup: js.UndefOr[typingsSlinky.awsSdk.globalacceleratorMod.EndpointGroup] = js.native
}

object DescribeEndpointGroupResponse {
  @scala.inline
  def apply(): DescribeEndpointGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEndpointGroupResponse]
  }
  @scala.inline
  implicit class DescribeEndpointGroupResponseOps[Self <: DescribeEndpointGroupResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpointGroup(value: EndpointGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointGroup")(js.undefined)
        ret
    }
  }
  
}

