package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VoiceMessage extends js.Object {
  /**
    * The text of the script to use for the voice message.
    */
  var Body: js.UndefOr[string] = js.native
  /**
    * The code for the language to use when synthesizing the text of the message script. For a list of supported languages and the code for each one, see the Amazon Polly Developer Guide.
    */
  var LanguageCode: js.UndefOr[string] = js.native
  /**
    * The long code to send the voice message from. This value should be one of the dedicated long codes that's assigned to your AWS account. Although it isn't required, we recommend that you specify the long code in E.164 format, for example +12065550100, to ensure prompt and accurate delivery of the message.
    */
  var OriginationNumber: js.UndefOr[string] = js.native
  /**
    * The default message variables to use in the voice message. You can override the default variables with individual address variables.
    */
  var Substitutions: js.UndefOr[MapOfListOfString] = js.native
  /**
    * The name of the voice to use when delivering the message. For a list of supported voices, see the Amazon Polly Developer Guide.
    */
  var VoiceId: js.UndefOr[string] = js.native
}

object VoiceMessage {
  @scala.inline
  def apply(): VoiceMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoiceMessage]
  }
  @scala.inline
  implicit class VoiceMessageOps[Self <: VoiceMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Body")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguageCode(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageCode")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginationNumber(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginationNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginationNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginationNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withSubstitutions(value: MapOfListOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Substitutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubstitutions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Substitutions")(js.undefined)
        ret
    }
    @scala.inline
    def withVoiceId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VoiceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoiceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VoiceId")(js.undefined)
        ret
    }
  }
  
}

