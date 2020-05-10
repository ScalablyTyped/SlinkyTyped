package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an OutputAudioConfig. */
@js.native
trait IOutputAudioConfig extends js.Object {
  /** OutputAudioConfig audioEncoding */
  var audioEncoding: js.UndefOr[OutputAudioEncoding | Null] = js.native
  /** OutputAudioConfig sampleRateHertz */
  var sampleRateHertz: js.UndefOr[Double | Null] = js.native
  /** OutputAudioConfig synthesizeSpeechConfig */
  var synthesizeSpeechConfig: js.UndefOr[ISynthesizeSpeechConfig | Null] = js.native
}

object IOutputAudioConfig {
  @scala.inline
  def apply(): IOutputAudioConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOutputAudioConfig]
  }
  @scala.inline
  implicit class IOutputAudioConfigOps[Self <: IOutputAudioConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioEncoding(value: OutputAudioEncoding): Self = {
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
    def withAudioEncodingNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioEncoding")(null)
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
    def withSampleRateHertzNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleRateHertz")(null)
        ret
    }
    @scala.inline
    def withSynthesizeSpeechConfig(value: ISynthesizeSpeechConfig): Self = {
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
    @scala.inline
    def withSynthesizeSpeechConfigNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synthesizeSpeechConfig")(null)
        ret
    }
  }
  
}

