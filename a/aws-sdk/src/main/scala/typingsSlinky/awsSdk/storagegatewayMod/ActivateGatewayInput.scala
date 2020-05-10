package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivateGatewayInput extends js.Object {
  /**
    * Your gateway activation key. You can obtain the activation key by sending an HTTP GET request with redirects enabled to the gateway IP address (port 80). The redirect URL returned in the response provides you the activation key for your gateway in the query string parameter activationKey. It may also include other activation-related parameters, however, these are merely defaults -- the arguments you pass to the ActivateGateway API call determine the actual configuration of your gateway.  For more information, see https://docs.aws.amazon.com/storagegateway/latest/userguide/get-activation-key.html in the Storage Gateway User Guide.
    */
  var ActivationKey: typingsSlinky.awsSdk.storagegatewayMod.ActivationKey = js.native
  /**
    * The name you configured for your gateway.
    */
  var GatewayName: typingsSlinky.awsSdk.storagegatewayMod.GatewayName = js.native
  /**
    * A value that indicates the AWS Region where you want to store your data. The gateway AWS Region specified must be the same AWS Region as the AWS Region in your Host header in the request. For more information about available AWS Regions and endpoints for AWS Storage Gateway, see Regions and Endpoints in the Amazon Web Services Glossary.  Valid Values: See AWS Storage Gateway Regions and Endpoints in the AWS General Reference. 
    */
  var GatewayRegion: RegionId = js.native
  /**
    * A value that indicates the time zone you want to set for the gateway. The time zone is of the format "GMT-hr:mm" or "GMT+hr:mm". For example, GMT-4:00 indicates the time is 4 hours behind GMT. GMT+2:00 indicates the time is 2 hours ahead of GMT. The time zone is used, for example, for scheduling snapshots and your gateway's maintenance schedule.
    */
  var GatewayTimezone: typingsSlinky.awsSdk.storagegatewayMod.GatewayTimezone = js.native
  /**
    * A value that defines the type of gateway to activate. The type specified is critical to all later functions of the gateway and cannot be changed after activation. The default value is CACHED.   Valid Values: "STORED", "CACHED", "VTL", "FILE_S3"
    */
  var GatewayType: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.GatewayType] = js.native
  /**
    * The value that indicates the type of medium changer to use for tape gateway. This field is optional.  Valid Values: "STK-L700", "AWS-Gateway-VTL"
    */
  var MediumChangerType: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.MediumChangerType] = js.native
  /**
    * A list of up to 50 tags that you can assign to the gateway. Each tag is a key-value pair.  Valid characters for key and value are letters, spaces, and numbers that can be represented in UTF-8 format, and the following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the maximum length for a tag's value is 256 characters. 
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.Tags] = js.native
  /**
    * The value that indicates the type of tape drive to use for tape gateway. This field is optional.  Valid Values: "IBM-ULT3580-TD5" 
    */
  var TapeDriveType: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.TapeDriveType] = js.native
}

object ActivateGatewayInput {
  @scala.inline
  def apply(
    ActivationKey: ActivationKey,
    GatewayName: GatewayName,
    GatewayRegion: RegionId,
    GatewayTimezone: GatewayTimezone
  ): ActivateGatewayInput = {
    val __obj = js.Dynamic.literal(ActivationKey = ActivationKey.asInstanceOf[js.Any], GatewayName = GatewayName.asInstanceOf[js.Any], GatewayRegion = GatewayRegion.asInstanceOf[js.Any], GatewayTimezone = GatewayTimezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivateGatewayInput]
  }
  @scala.inline
  implicit class ActivateGatewayInputOps[Self <: ActivateGatewayInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivationKey(value: ActivationKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActivationKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGatewayName(value: GatewayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGatewayRegion(value: RegionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGatewayTimezone(value: GatewayTimezone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayTimezone")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withMediumChangerType(value: MediumChangerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MediumChangerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediumChangerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MediumChangerType")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTapeDriveType(value: TapeDriveType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TapeDriveType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTapeDriveType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TapeDriveType")(js.undefined)
        ret
    }
  }
  
}

