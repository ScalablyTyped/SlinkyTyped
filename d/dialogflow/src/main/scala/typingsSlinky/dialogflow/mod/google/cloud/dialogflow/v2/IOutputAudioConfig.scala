package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an OutputAudioConfig. */
trait IOutputAudioConfig extends js.Object {
  /** OutputAudioConfig audioEncoding */
  var audioEncoding: js.UndefOr[OutputAudioEncoding | Null] = js.undefined
  /** OutputAudioConfig sampleRateHertz */
  var sampleRateHertz: js.UndefOr[Double | Null] = js.undefined
  /** OutputAudioConfig synthesizeSpeechConfig */
  var synthesizeSpeechConfig: js.UndefOr[ISynthesizeSpeechConfig | Null] = js.undefined
}

object IOutputAudioConfig {
  @scala.inline
  def apply(
    audioEncoding: js.UndefOr[Null | OutputAudioEncoding] = js.undefined,
    sampleRateHertz: js.UndefOr[Null | Double] = js.undefined,
    synthesizeSpeechConfig: js.UndefOr[Null | ISynthesizeSpeechConfig] = js.undefined
  ): IOutputAudioConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(audioEncoding)) __obj.updateDynamic("audioEncoding")(audioEncoding.asInstanceOf[js.Any])
    if (!js.isUndefined(sampleRateHertz)) __obj.updateDynamic("sampleRateHertz")(sampleRateHertz.asInstanceOf[js.Any])
    if (!js.isUndefined(synthesizeSpeechConfig)) __obj.updateDynamic("synthesizeSpeechConfig")(synthesizeSpeechConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOutputAudioConfig]
  }
}

