package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2

import typingsSlinky.dialogflow.mod.google.rpc.IStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a DetectIntentResponse. */
trait IDetectIntentResponse extends js.Object {
  /** DetectIntentResponse outputAudio */
  var outputAudio: js.UndefOr[scala.scalajs.js.typedarray.Uint8Array | Null] = js.undefined
  /** DetectIntentResponse outputAudioConfig */
  var outputAudioConfig: js.UndefOr[IOutputAudioConfig | Null] = js.undefined
  /** DetectIntentResponse queryResult */
  var queryResult: js.UndefOr[IQueryResult | Null] = js.undefined
  /** DetectIntentResponse responseId */
  var responseId: js.UndefOr[String | Null] = js.undefined
  /** DetectIntentResponse webhookStatus */
  var webhookStatus: js.UndefOr[IStatus | Null] = js.undefined
}

object IDetectIntentResponse {
  @scala.inline
  def apply(
    outputAudio: scala.scalajs.js.typedarray.Uint8Array = null,
    outputAudioConfig: IOutputAudioConfig = null,
    queryResult: IQueryResult = null,
    responseId: String = null,
    webhookStatus: IStatus = null
  ): IDetectIntentResponse = {
    val __obj = js.Dynamic.literal()
    if (outputAudio != null) __obj.updateDynamic("outputAudio")(outputAudio.asInstanceOf[js.Any])
    if (outputAudioConfig != null) __obj.updateDynamic("outputAudioConfig")(outputAudioConfig.asInstanceOf[js.Any])
    if (queryResult != null) __obj.updateDynamic("queryResult")(queryResult.asInstanceOf[js.Any])
    if (responseId != null) __obj.updateDynamic("responseId")(responseId.asInstanceOf[js.Any])
    if (webhookStatus != null) __obj.updateDynamic("webhookStatus")(webhookStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetectIntentResponse]
  }
}

