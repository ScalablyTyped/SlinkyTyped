package typingsSlinky.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaNetworkEndpointWithHealthStatus extends js.Object {
  /**
    * [Output only] The health status of network endpoint;
    */
  var healths: js.UndefOr[js.Array[SchemaHealthStatusForNetworkEndpoint]] = js.native
  /**
    * [Output only] The network endpoint;
    */
  var networkEndpoint: js.UndefOr[SchemaNetworkEndpoint] = js.native
}

object SchemaNetworkEndpointWithHealthStatus {
  @scala.inline
  def apply(): SchemaNetworkEndpointWithHealthStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkEndpointWithHealthStatus]
  }
  @scala.inline
  implicit class SchemaNetworkEndpointWithHealthStatusOps[Self <: SchemaNetworkEndpointWithHealthStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHealths(value: js.Array[SchemaHealthStatusForNetworkEndpoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healths")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkEndpoint(value: SchemaNetworkEndpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkEndpoint")(js.undefined)
        ret
    }
  }
  
}

