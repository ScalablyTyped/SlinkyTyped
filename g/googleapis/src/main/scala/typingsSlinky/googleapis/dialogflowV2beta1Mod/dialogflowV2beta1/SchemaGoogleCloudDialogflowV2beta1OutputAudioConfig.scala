package typingsSlinky.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Instructs the speech synthesizer how to generate the output audio content.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1OutputAudioConfig extends js.Object {
  /**
    * Required. Audio encoding of the synthesized audio content.
    */
  var audioEncoding: js.UndefOr[String] = js.native
  /**
    * Optional. The synthesis sample rate (in hertz) for this audio. If not
    * provided, then the synthesizer will use the default sample rate based on
    * the audio encoding. If this is different from the voice&#39;s natural
    * sample rate, then the synthesizer will honor this request by converting
    * to the desired sample rate (which might result in worse audio quality).
    */
  var sampleRateHertz: js.UndefOr[Double] = js.native
  /**
    * Optional. Configuration of how speech should be synthesized.
    */
  var synthesizeSpeechConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1SynthesizeSpeechConfig] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1OutputAudioConfig {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1OutputAudioConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1OutputAudioConfig]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1OutputAudioConfigOps[Self <: SchemaGoogleCloudDialogflowV2beta1OutputAudioConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioEncoding")(js.undefined)
        ret
    }
    @scala.inline
    def withSampleRateHertz(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleRateHertz")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleRateHertz: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleRateHertz")(js.undefined)
        ret
    }
    @scala.inline
    def withSynthesizeSpeechConfig(value: SchemaGoogleCloudDialogflowV2beta1SynthesizeSpeechConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synthesizeSpeechConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSynthesizeSpeechConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synthesizeSpeechConfig")(js.undefined)
        ret
    }
  }
  
}

