package typingsSlinky.pulumiAws.storagegatewayGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.storagegateway.GatewaySmbActiveDirectorySettings
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GatewayState extends js.Object {
  
  /**
    * Gateway activation key during resource creation. Conflicts with `gatewayIpAddress`. Additional information is available in the [Storage Gateway User Guide](https://docs.aws.amazon.com/storagegateway/latest/userguide/get-activation-key.html).
    */
  val activationKey: js.UndefOr[Input[String]] = js.native
  
  /**
    * Amazon Resource Name (ARN) of the gateway.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon CloudWatch log group to use to monitor and log events in the gateway.
    */
  val cloudwatchLogGroupArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Identifier of the gateway.
    */
  val gatewayId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Gateway IP address to retrieve activation key during resource creation. Conflicts with `activationKey`. Gateway must be accessible on port 80 from where this provider is running. Additional information is available in the [Storage Gateway User Guide](https://docs.aws.amazon.com/storagegateway/latest/userguide/get-activation-key.html).
    */
  val gatewayIpAddress: js.UndefOr[Input[String]] = js.native
  
  /**
    * Name of the gateway.
    */
  val gatewayName: js.UndefOr[Input[String]] = js.native
  
  /**
    * Time zone for the gateway. The time zone is of the format "GMT", "GMT-hr:mm", or "GMT+hr:mm". For example, `GMT-4:00` indicates the time is 4 hours behind GMT. The time zone is used, for example, for scheduling snapshots and your gateway's maintenance schedule.
    */
  val gatewayTimezone: js.UndefOr[Input[String]] = js.native
  
  /**
    * Type of the gateway. The default value is `STORED`. Valid values: `CACHED`, `FILE_S3`, `STORED`, `VTL`.
    */
  val gatewayType: js.UndefOr[Input[String]] = js.native
  
  /**
    * VPC endpoint address to be used when activating your gateway. This should be used when your instance is in a private subnet. Requires HTTP access from client computer running Pulumi. More info on what ports are required by your VPC Endpoint Security group in [Activating a Gateway in a Virtual Private Cloud](https://docs.aws.amazon.com/storagegateway/latest/userguide/gateway-private-link.html).
    */
  val gatewayVpcEndpoint: js.UndefOr[Input[String]] = js.native
  
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
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Type of tape drive to use for tape gateway. This provider cannot detect drift of this argument. Valid values: `IBM-ULT3580-TD5`.
    */
  val tapeDriveType: js.UndefOr[Input[String]] = js.native
}
object GatewayState {
  
  @scala.inline
  def apply(): GatewayState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatewayState]
  }
  
  @scala.inline
  implicit class GatewayStateOps[Self <: GatewayState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActivationKey(value: Input[String]): Self = this.set("activationKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivationKey: Self = this.set("activationKey", js.undefined)
    
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setCloudwatchLogGroupArn(value: Input[String]): Self = this.set("cloudwatchLogGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudwatchLogGroupArn: Self = this.set("cloudwatchLogGroupArn", js.undefined)
    
    @scala.inline
    def setGatewayId(value: Input[String]): Self = this.set("gatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayId: Self = this.set("gatewayId", js.undefined)
    
    @scala.inline
    def setGatewayIpAddress(value: Input[String]): Self = this.set("gatewayIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayIpAddress: Self = this.set("gatewayIpAddress", js.undefined)
    
    @scala.inline
    def setGatewayName(value: Input[String]): Self = this.set("gatewayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayName: Self = this.set("gatewayName", js.undefined)
    
    @scala.inline
    def setGatewayTimezone(value: Input[String]): Self = this.set("gatewayTimezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayTimezone: Self = this.set("gatewayTimezone", js.undefined)
    
    @scala.inline
    def setGatewayType(value: Input[String]): Self = this.set("gatewayType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayType: Self = this.set("gatewayType", js.undefined)
    
    @scala.inline
    def setGatewayVpcEndpoint(value: Input[String]): Self = this.set("gatewayVpcEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayVpcEndpoint: Self = this.set("gatewayVpcEndpoint", js.undefined)
    
    @scala.inline
    def setMediumChangerType(value: Input[String]): Self = this.set("mediumChangerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediumChangerType: Self = this.set("mediumChangerType", js.undefined)
    
    @scala.inline
    def setSmbActiveDirectorySettings(value: Input[GatewaySmbActiveDirectorySettings]): Self = this.set("smbActiveDirectorySettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmbActiveDirectorySettings: Self = this.set("smbActiveDirectorySettings", js.undefined)
    
    @scala.inline
    def setSmbGuestPassword(value: Input[String]): Self = this.set("smbGuestPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmbGuestPassword: Self = this.set("smbGuestPassword", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTapeDriveType(value: Input[String]): Self = this.set("tapeDriveType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTapeDriveType: Self = this.set("tapeDriveType", js.undefined)
  }
}
