package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGatewayInformationInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Amazon CloudWatch log group that you want to use to monitor and log events in the gateway.  For more information, see What Is Amazon CloudWatch Logs?.
    */
  var CloudWatchLogGroupARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.CloudWatchLogGroupARN] = js.native
  var GatewayARN: typingsSlinky.awsSdk.storagegatewayMod.GatewayARN = js.native
  var GatewayName: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.GatewayName] = js.native
  /**
    * A value that indicates the time zone of the gateway.
    */
  var GatewayTimezone: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.GatewayTimezone] = js.native
}

object UpdateGatewayInformationInput {
  @scala.inline
  def apply(GatewayARN: GatewayARN): UpdateGatewayInformationInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGatewayInformationInput]
  }
  @scala.inline
  implicit class UpdateGatewayInformationInputOps[Self <: UpdateGatewayInformationInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGatewayARN(value: GatewayARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloudWatchLogGroupARN(value: CloudWatchLogGroupARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchLogGroupARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudWatchLogGroupARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchLogGroupARN")(js.undefined)
        ret
    }
    @scala.inline
    def withGatewayName(value: GatewayName): Self = {
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
    def withGatewayTimezone(value: GatewayTimezone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayTimezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGatewayTimezone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayTimezone")(js.undefined)
        ret
    }
  }
  
}

