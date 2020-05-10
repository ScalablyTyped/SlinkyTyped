package typingsSlinky.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEndpointGroupResponse extends js.Object {
  /**
    * The information about the endpoint group that was created.
    */
  var EndpointGroup: js.UndefOr[typingsSlinky.awsSdk.globalacceleratorMod.EndpointGroup] = js.native
}

object CreateEndpointGroupResponse {
  @scala.inline
  def apply(): CreateEndpointGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEndpointGroupResponse]
  }
  @scala.inline
  implicit class CreateEndpointGroupResponseOps[Self <: CreateEndpointGroupResponse] (val x: Self) extends AnyVal {
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

