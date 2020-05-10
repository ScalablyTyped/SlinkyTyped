package typingsSlinky.pulumiAws.storagegatewayGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.storagegateway.GatewaySmbActiveDirectorySettings
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GatewayArgs extends js.Object {
  /**
    * Gateway activation key during resource creation. Conflicts with `gatewayIpAddress`. Additional information is available in the [Storage Gateway User Guide](https://docs.aws.amazon.com/storagegateway/latest/userguide/get-activation-key.html).
    */
  val activationKey: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon CloudWatch log group to use to monitor and log events in the gateway.
    */
  val cloudwatchLogGroupArn: js.UndefOr[Input[String]] = js.native
  /**
    * Gateway IP address to retrieve activation key during resource creation. Conflicts with `activationKey`. Gateway must be accessible on port 80 from where this provider is running. Additional information is available in the [Storage Gateway User Guide](https://docs.aws.amazon.com/storagegateway/latest/userguide/get-activation-key.html).
    */
  val gatewayIpAddress: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the gateway.
    */
  val gatewayName: Input[String] = js.native
  /**
    * Time zone for the gateway. The time zone is of the format "GMT", "GMT-hr:mm", or "GMT+hr:mm". For example, `GMT-4:00` indicates the time is 4 hours behind GMT. The time zone is used, for example, for scheduling snapshots and your gateway's maintenance schedule.
    */
  val gatewayTimezone: Input[String] = js.native
  /**
    * Type of the gateway. The default value is `STORED`. Valid values: `CACHED`, `FILE_S3`, `STORED`, `VTL`.
    */
  val gatewayType: js.UndefOr[Input[String]] = js.native
  val mediumChangerType: js.UndefOr[Input[String]] = js.native
  /**
    * Nested argument with Active Directory domain join information for Server Message Block (SMB) file shares. Only valid for `FILE_S3` gateway type. Must be set before creating `ActiveDirectory` authentication SMB file shares. More details below.
    */
  val smbActiveDirectorySettings: js.UndefOr[Input[GatewaySmbActiveDirectorySettings]] = js.native
  /**
    * Guest password for Server Message Block (SMB) file shares. Only valid for `FILE_S3` gateway type. Must be set before creating `GuestAccess` authentication SMB file shares. This provider can only detect drift of the existence of a guest password, not its actual value from the gateway. This provider can however update the password with changing the argument.
    */
  val smbGuestPassword: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Type of tape drive to use for tape gateway. This provider cannot detect drift of this argument. Valid values: `IBM-ULT3580-TD5`.
    */
  val tapeDriveType: js.UndefOr[Input[String]] = js.native
}

object GatewayArgs {
  @scala.inline
  def apply(gatewayName: Input[String], gatewayTimezone: Input[String]): GatewayArgs = {
    val __obj = js.Dynamic.literal(gatewayName = gatewayName.asInstanceOf[js.Any], gatewayTimezone = gatewayTimezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayArgs]
  }
  @scala.inline
  implicit class GatewayArgsOps[Self <: GatewayArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGatewayName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatewayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGatewayTimezone(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatewayTimezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActivationKey(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activationKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivationKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activationKey")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudwatchLogGroupArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudwatchLogGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudwatchLogGroupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudwatchLogGroupArn")(js.undefined)
        ret
    }
    @scala.inline
    def withGatewayIpAddress(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatewayIpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGatewayIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatewayIpAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withGatewayType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatewayType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGatewayType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatewayType")(js.undefined)
        ret
    }
    @scala.inline
    def withMediumChangerType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediumChangerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediumChangerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediumChangerType")(js.undefined)
        ret
    }
    @scala.inline
    def withSmbActiveDirectorySettings(value: Input[GatewaySmbActiveDirectorySettings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smbActiveDirectorySettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmbActiveDirectorySettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smbActiveDirectorySettings")(js.undefined)
        ret
    }
    @scala.inline
    def withSmbGuestPassword(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smbGuestPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmbGuestPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smbGuestPassword")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTapeDriveType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tapeDriveType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTapeDriveType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tapeDriveType")(js.undefined)
        ret
    }
  }
  
}

