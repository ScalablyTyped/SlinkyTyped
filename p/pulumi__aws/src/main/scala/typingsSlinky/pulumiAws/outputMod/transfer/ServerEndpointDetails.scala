package typingsSlinky.pulumiAws.outputMod.transfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerEndpointDetails extends js.Object {
  /**
    * The ID of the VPC endpoint.
    */
  var vpcEndpointId: String = js.native
}

object ServerEndpointDetails {
  @scala.inline
  def apply(vpcEndpointId: String): ServerEndpointDetails = {
    val __obj = js.Dynamic.literal(vpcEndpointId = vpcEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerEndpointDetails]
  }
  @scala.inline
  implicit class ServerEndpointDetailsOps[Self <: ServerEndpointDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVpcEndpointId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcEndpointId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

