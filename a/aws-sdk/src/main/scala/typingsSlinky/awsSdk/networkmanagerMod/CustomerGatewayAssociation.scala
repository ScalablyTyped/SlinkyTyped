package typingsSlinky.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomerGatewayAssociation extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the customer gateway.
    */
  var CustomerGatewayArn: js.UndefOr[String] = js.native
  /**
    * The ID of the device.
    */
  var DeviceId: js.UndefOr[String] = js.native
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: js.UndefOr[String] = js.native
  /**
    * The ID of the link.
    */
  var LinkId: js.UndefOr[String] = js.native
  /**
    * The association state.
    */
  var State: js.UndefOr[CustomerGatewayAssociationState] = js.native
}

object CustomerGatewayAssociation {
  @scala.inline
  def apply(): CustomerGatewayAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerGatewayAssociation]
  }
  @scala.inline
  implicit class CustomerGatewayAssociationOps[Self <: CustomerGatewayAssociation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomerGatewayArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomerGatewayArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerGatewayArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomerGatewayArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceId")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalNetworkId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalNetworkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalNetworkId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalNetworkId")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkId")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: CustomerGatewayAssociationState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
  }
  
}

