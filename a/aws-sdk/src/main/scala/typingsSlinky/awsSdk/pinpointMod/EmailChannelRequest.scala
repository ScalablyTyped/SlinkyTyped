package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailChannelRequest extends js.Object {
  /**
    * The configuration set that you want to apply to email that you send through the channel by using the Amazon Pinpoint Email API.
    */
  var ConfigurationSet: js.UndefOr[string] = js.native
  /**
    * Specifies whether to enable the email channel for the application.
    */
  var Enabled: js.UndefOr[boolean] = js.native
  /**
    *  The verified email address that you want to send email from when you send email through the channel.
    */
  var FromAddress: string = js.native
  /**
    *  The Amazon Resource Name (ARN) of the identity, verified with Amazon Simple Email Service (Amazon SES), that you want to use when you send email through the channel.
    */
  var Identity: string = js.native
  /**
    *  The ARN of the AWS Identity and Access Management (IAM) role that you want Amazon Pinpoint to use when it submits email-related event data for the channel.
    */
  var RoleArn: js.UndefOr[string] = js.native
}

object EmailChannelRequest {
  @scala.inline
  def apply(FromAddress: string, Identity: string): EmailChannelRequest = {
    val __obj = js.Dynamic.literal(FromAddress = FromAddress.asInstanceOf[js.Any], Identity = Identity.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailChannelRequest]
  }
  @scala.inline
  implicit class EmailChannelRequestOps[Self <: EmailChannelRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromAddress(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FromAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentity(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Identity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigurationSet(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationSet")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(js.undefined)
        ret
    }
  }
  
}

