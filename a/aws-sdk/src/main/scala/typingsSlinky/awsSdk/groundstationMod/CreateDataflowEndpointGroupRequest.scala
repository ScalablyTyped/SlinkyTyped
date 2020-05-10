package typingsSlinky.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDataflowEndpointGroupRequest extends js.Object {
  /**
    * Endpoint details of each endpoint in the dataflow endpoint group.
    */
  var endpointDetails: EndpointDetailsList = js.native
  /**
    * Tags of a dataflow endpoint group.
    */
  var tags: js.UndefOr[TagsMap] = js.native
}

object CreateDataflowEndpointGroupRequest {
  @scala.inline
  def apply(endpointDetails: EndpointDetailsList): CreateDataflowEndpointGroupRequest = {
    val __obj = js.Dynamic.literal(endpointDetails = endpointDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataflowEndpointGroupRequest]
  }
  @scala.inline
  implicit class CreateDataflowEndpointGroupRequestOps[Self <: CreateDataflowEndpointGroupRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpointDetails(value: EndpointDetailsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: TagsMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

