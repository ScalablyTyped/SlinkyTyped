package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GatewayInfo extends js.Object {
  /**
    * The ID of the Amazon EC2 instance that was used to launch the gateway.
    */
  var Ec2InstanceId: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.Ec2InstanceId] = js.native
  /**
    * The AWS Region where the Amazon EC2 instance is located.
    */
  var Ec2InstanceRegion: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.Ec2InstanceRegion] = js.native
  /**
    * The Amazon Resource Name (ARN) of the gateway. Use the ListGateways operation to return a list of gateways for your account and AWS Region.
    */
  var GatewayARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.GatewayARN] = js.native
  /**
    * The unique identifier assigned to your gateway during activation. This ID becomes part of the gateway Amazon Resource Name (ARN), which you use as input for other operations.
    */
  var GatewayId: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.GatewayId] = js.native
  /**
    * The name of the gateway.
    */
  var GatewayName: js.UndefOr[String] = js.native
  /**
    * The state of the gateway. Valid Values: DISABLED or ACTIVE
    */
  var GatewayOperationalState: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.GatewayOperationalState] = js.native
  /**
    * The type of the gateway.
    */
  var GatewayType: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.GatewayType] = js.native
}

object GatewayInfo {
  @scala.inline
  def apply(): GatewayInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatewayInfo]
  }
  @scala.inline
  implicit class GatewayInfoOps[Self <: GatewayInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEc2InstanceId(value: Ec2InstanceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ec2InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEc2InstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ec2InstanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withEc2InstanceRegion(value: Ec2InstanceRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ec2InstanceRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEc2InstanceRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ec2InstanceRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withGatewayARN(value: GatewayARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGatewayARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayARN")(js.undefined)
        ret
    }
    @scala.inline
    def withGatewayId(value: GatewayId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGatewayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayId")(js.undefined)
        ret
    }
    @scala.inline
    def withGatewayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGatewayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayName")(js.undefined)
        ret
    }
    @scala.inline
    def withGatewayOperationalState(value: GatewayOperationalState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayOperationalState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGatewayOperationalState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayOperationalState")(js.undefined)
        ret
    }
    @scala.inline
    def withGatewayType(value: GatewayType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGatewayType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayType")(js.undefined)
        ret
    }
  }
  
}

