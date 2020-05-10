package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessEndpoint extends js.Object {
  /**
    * The type of interface endpoint.
    */
  var EndpointType: AccessEndpointType = js.native
  /**
    * The identifier (ID) of the VPC in which the interface endpoint is used.
    */
  var VpceId: js.UndefOr[String] = js.native
}

object AccessEndpoint {
  @scala.inline
  def apply(EndpointType: AccessEndpointType): AccessEndpoint = {
    val __obj = js.Dynamic.literal(EndpointType = EndpointType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessEndpoint]
  }
  @scala.inline
  implicit class AccessEndpointOps[Self <: AccessEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpointType(value: AccessEndpointType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVpceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpceId")(js.undefined)
        ret
    }
  }
  
}

