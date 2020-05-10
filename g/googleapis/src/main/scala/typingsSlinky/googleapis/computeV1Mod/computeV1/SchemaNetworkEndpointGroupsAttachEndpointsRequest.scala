package typingsSlinky.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaNetworkEndpointGroupsAttachEndpointsRequest extends js.Object {
  /**
    * The list of network endpoints to be attached.
    */
  var networkEndpoints: js.UndefOr[js.Array[SchemaNetworkEndpoint]] = js.native
}

object SchemaNetworkEndpointGroupsAttachEndpointsRequest {
  @scala.inline
  def apply(): SchemaNetworkEndpointGroupsAttachEndpointsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkEndpointGroupsAttachEndpointsRequest]
  }
  @scala.inline
  implicit class SchemaNetworkEndpointGroupsAttachEndpointsRequestOps[Self <: SchemaNetworkEndpointGroupsAttachEndpointsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNetworkEndpoints(value: js.Array[SchemaNetworkEndpoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkEndpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkEndpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkEndpoints")(js.undefined)
        ret
    }
  }
  
}

