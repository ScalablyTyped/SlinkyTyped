package typingsSlinky.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterTransitGatewayResponse extends js.Object {
  /**
    * The transit gateway registration information.
    */
  var TransitGatewayRegistration: js.UndefOr[typingsSlinky.awsSdk.networkmanagerMod.TransitGatewayRegistration] = js.native
}

object DeregisterTransitGatewayResponse {
  @scala.inline
  def apply(): DeregisterTransitGatewayResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterTransitGatewayResponse]
  }
  @scala.inline
  implicit class DeregisterTransitGatewayResponseOps[Self <: DeregisterTransitGatewayResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransitGatewayRegistration(value: TransitGatewayRegistration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitGatewayRegistration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitGatewayRegistration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitGatewayRegistration")(js.undefined)
        ret
    }
  }
  
}

