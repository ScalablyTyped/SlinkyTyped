package typingsSlinky.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterTransitGatewayRequest extends js.Object {
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: String = js.native
  /**
    * The Amazon Resource Name (ARN) of the transit gateway.
    */
  var TransitGatewayArn: String = js.native
}

object DeregisterTransitGatewayRequest {
  @scala.inline
  def apply(GlobalNetworkId: String, TransitGatewayArn: String): DeregisterTransitGatewayRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any], TransitGatewayArn = TransitGatewayArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterTransitGatewayRequest]
  }
  @scala.inline
  implicit class DeregisterTransitGatewayRequestOps[Self <: DeregisterTransitGatewayRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlobalNetworkId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalNetworkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitGatewayArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitGatewayArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

