package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateConfiguration extends js.Object {
  /**
    * The email template to use for the message.
    */
  var EmailTemplate: js.UndefOr[Template] = js.native
  /**
    * The push notification template to use for the message.
    */
  var PushTemplate: js.UndefOr[Template] = js.native
  /**
    * The SMS template to use for the message.
    */
  var SMSTemplate: js.UndefOr[Template] = js.native
  /**
    * The voice template to use for the message. This object isn't supported for campaigns.
    */
  var VoiceTemplate: js.UndefOr[Template] = js.native
}

object TemplateConfiguration {
  @scala.inline
  def apply(): TemplateConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateConfiguration]
  }
  @scala.inline
  implicit class TemplateConfigurationOps[Self <: TemplateConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmailTemplate(value: Template): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withPushTemplate(value: Template): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PushTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPushTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PushTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withSMSTemplate(value: Template): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SMSTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSMSTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SMSTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withVoiceTemplate(value: Template): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VoiceTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoiceTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VoiceTemplate")(js.undefined)
        ret
    }
  }
  
}

