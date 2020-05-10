package typingsSlinky.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEmailIdentityResponse extends js.Object {
  /**
    * An object that contains information about the DKIM attributes for the identity. This object includes the tokens that you use to create the CNAME records that are required to complete the DKIM verification process.
    */
  var DkimAttributes: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.DkimAttributes] = js.native
  /**
    * The feedback forwarding configuration for the identity. If the value is true, Amazon Pinpoint sends you email notifications when bounce or complaint events occur. Amazon Pinpoint sends this notification to the address that you specified in the Return-Path header of the original email. When you set this value to false, Amazon Pinpoint sends notifications through other mechanisms, such as by notifying an Amazon SNS topic or another event destination. You're required to have a method of tracking bounces and complaints. If you haven't set up another mechanism for receiving bounce or complaint notifications, Amazon Pinpoint sends an email notification when these events occur (even if this setting is disabled).
    */
  var FeedbackForwardingStatus: js.UndefOr[Enabled] = js.native
  /**
    * The email identity type.
    */
  var IdentityType: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.IdentityType] = js.native
  /**
    * An object that contains information about the Mail-From attributes for the email identity.
    */
  var MailFromAttributes: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.MailFromAttributes] = js.native
  /**
    * An array of objects that define the tags (keys and values) that are associated with the email identity.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * Specifies whether or not the identity is verified. In Amazon Pinpoint, you can only send email from verified email addresses or domains. For more information about verifying identities, see the Amazon Pinpoint User Guide.
    */
  var VerifiedForSendingStatus: js.UndefOr[Enabled] = js.native
}

object GetEmailIdentityResponse {
  @scala.inline
  def apply(): GetEmailIdentityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEmailIdentityResponse]
  }
  @scala.inline
  implicit class GetEmailIdentityResponseOps[Self <: GetEmailIdentityResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDkimAttributes(value: DkimAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DkimAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDkimAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DkimAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withFeedbackForwardingStatus(value: Enabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FeedbackForwardingStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeedbackForwardingStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FeedbackForwardingStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentityType(value: IdentityType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentityType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityType")(js.undefined)
        ret
    }
    @scala.inline
    def withMailFromAttributes(value: MailFromAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MailFromAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMailFromAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MailFromAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
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
    def withVerifiedForSendingStatus(value: Enabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerifiedForSendingStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerifiedForSendingStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerifiedForSendingStatus")(js.undefined)
        ret
    }
  }
  
}

