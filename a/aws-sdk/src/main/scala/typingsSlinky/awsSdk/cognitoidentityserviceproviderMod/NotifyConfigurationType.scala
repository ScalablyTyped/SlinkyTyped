package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotifyConfigurationType extends js.Object {
  /**
    * Email template used when a detected risk event is blocked.
    */
  var BlockEmail: js.UndefOr[NotifyEmailType] = js.native
  /**
    * The email address that is sending the email. It must be either individually verified with Amazon SES, or from a domain that has been verified with Amazon SES.
    */
  var From: js.UndefOr[StringType] = js.native
  /**
    * The MFA email template used when MFA is challenged as part of a detected risk.
    */
  var MfaEmail: js.UndefOr[NotifyEmailType] = js.native
  /**
    * The email template used when a detected risk event is allowed.
    */
  var NoActionEmail: js.UndefOr[NotifyEmailType] = js.native
  /**
    * The destination to which the receiver of an email should reply to.
    */
  var ReplyTo: js.UndefOr[StringType] = js.native
  /**
    * The Amazon Resource Name (ARN) of the identity that is associated with the sending authorization policy. It permits Amazon Cognito to send for the email address specified in the From parameter.
    */
  var SourceArn: ArnType = js.native
}

object NotifyConfigurationType {
  @scala.inline
  def apply(SourceArn: ArnType): NotifyConfigurationType = {
    val __obj = js.Dynamic.literal(SourceArn = SourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyConfigurationType]
  }
  @scala.inline
  implicit class NotifyConfigurationTypeOps[Self <: NotifyConfigurationType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceArn(value: ArnType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlockEmail(value: NotifyEmailType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: StringType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("From")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("From")(js.undefined)
        ret
    }
    @scala.inline
    def withMfaEmail(value: NotifyEmailType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MfaEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMfaEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MfaEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withNoActionEmail(value: NotifyEmailType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoActionEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoActionEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoActionEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withReplyTo(value: StringType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplyTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplyTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplyTo")(js.undefined)
        ret
    }
  }
  
}

