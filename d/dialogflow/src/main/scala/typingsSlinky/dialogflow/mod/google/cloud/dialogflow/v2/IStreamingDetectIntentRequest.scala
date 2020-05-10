package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a StreamingDetectIntentRequest. */
@js.native
trait IStreamingDetectIntentRequest extends js.Object {
  /** StreamingDetectIntentRequest inputAudio */
  var inputAudio: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
  /** StreamingDetectIntentRequest outputAudioConfig */
  var outputAudioConfig: js.UndefOr[IOutputAudioConfig | Null] = js.native
  /** StreamingDetectIntentRequest queryInput */
  var queryInput: js.UndefOr[IQueryInput | Null] = js.native
  /** StreamingDetectIntentRequest queryParams */
  var queryParams: js.UndefOr[IQueryParameters | Null] = js.native
  /** StreamingDetectIntentRequest session */
  var session: js.UndefOr[String | Null] = js.native
  /** StreamingDetectIntentRequest singleUtterance */
  var singleUtterance: js.UndefOr[Boolean | Null] = js.native
}

object IStreamingDetectIntentRequest {
  @scala.inline
  def apply(): IStreamingDetectIntentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStreamingDetectIntentRequest]
  }
  @scala.inline
  implicit class IStreamingDetectIntentRequestOps[Self <: IStreamingDetectIntentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputAudio(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputAudio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputAudio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputAudio")(js.undefined)
        ret
    }
    @scala.inline
    def withInputAudioNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputAudio")(null)
        ret
    }
    @scala.inline
    def withOutputAudioConfig(value: IOutputAudioConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputAudioConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputAudioConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputAudioConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputAudioConfigNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputAudioConfig")(null)
        ret
    }
    @scala.inline
    def withQueryInput(value: IQueryInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryInput")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryInputNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryInput")(null)
        ret
    }
    @scala.inline
    def withQueryParams(value: IQueryParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParams")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryParamsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParams")(null)
        ret
    }
    @scala.inline
    def withSession(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(null)
        ret
    }
    @scala.inline
    def withSingleUtterance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleUtterance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleUtterance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleUtterance")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleUtteranceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleUtterance")(null)
        ret
    }
  }
  
}

