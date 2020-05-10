package typingsSlinky.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Synthesizes speech and plays back the synthesized audio to the caller in
  * Telephony Gateway.  Telephony Gateway takes the synthesizer settings from
  * `DetectIntentResponse.output_audio_config` which can either be set at
  * request-level or can come from the agent-level synthesizer config.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech extends js.Object {
  /**
    * The SSML to be synthesized. For more information, see
    * [SSML](https://developers.google.com/actions/reference/ssml).
    */
  var ssml: js.UndefOr[String] = js.native
  /**
    * The raw text to be synthesized.
    */
  var text: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechOps[Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSsml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssml")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

