package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendCustomVerificationEmailRequest extends js.Object {
  /**
    * Name of a configuration set to use when sending the verification email.
    */
  var ConfigurationSetName: js.UndefOr[typingsSlinky.awsSdk.sesMod.ConfigurationSetName] = js.native
  /**
    * The email address to verify.
    */
  var EmailAddress: Address = js.native
  /**
    * The name of the custom verification email template to use when sending the verification email.
    */
  var TemplateName: typingsSlinky.awsSdk.sesMod.TemplateName = js.native
}

object SendCustomVerificationEmailRequest {
  @scala.inline
  def apply(EmailAddress: Address, TemplateName: TemplateName): SendCustomVerificationEmailRequest = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendCustomVerificationEmailRequest]
  }
  @scala.inline
  implicit class SendCustomVerificationEmailRequestOps[Self <: SendCustomVerificationEmailRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmailAddress(value: Address): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplateName(value: TemplateName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigurationSetName(value: ConfigurationSetName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationSetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationSetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationSetName")(js.undefined)
        ret
    }
  }
  
}

