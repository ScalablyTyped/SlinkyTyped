package typingsSlinky.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaNetworkEndpointGroupsListEndpointsRequest extends js.Object {
  /**
    * Optional query parameter for showing the health status of each network
    * endpoint. Valid options are SKIP or SHOW. If you don&#39;t specifiy this
    * parameter, the health status of network endpoints will not be provided.
    */
  var healthStatus: js.UndefOr[String] = js.native
}

object SchemaNetworkEndpointGroupsListEndpointsRequest {
  @scala.inline
  def apply(): SchemaNetworkEndpointGroupsListEndpointsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkEndpointGroupsListEndpointsRequest]
  }
  @scala.inline
  implicit class SchemaNetworkEndpointGroupsListEndpointsRequestOps[Self <: SchemaNetworkEndpointGroupsListEndpointsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHealthStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthStatus")(js.undefined)
        ret
    }
  }
  
}

