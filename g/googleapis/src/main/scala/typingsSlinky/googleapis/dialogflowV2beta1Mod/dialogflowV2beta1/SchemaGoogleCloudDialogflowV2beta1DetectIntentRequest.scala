package typingsSlinky.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request to detect user&#39;s intent.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1DetectIntentRequest extends js.Object {
  /**
    * Optional. The natural language speech audio to be processed. This field
    * should be populated iff `query_input` is set to an input audio config. A
    * single request can contain up to 1 minute of speech audio data.
    */
  var inputAudio: js.UndefOr[String] = js.native
  /**
    * Optional. Instructs the speech synthesizer how to generate the output
    * audio. If this field is not set and agent-level speech synthesizer is not
    * configured, no output audio is generated.
    */
  var outputAudioConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1OutputAudioConfig] = js.native
  /**
    * Required. The input specification. It can be set to:  1.  an audio config
    * which instructs the speech recognizer how to process the speech audio, 2.
    * a conversational query in the form of text, or  3.  an event that
    * specifies which intent to trigger.
    */
  var queryInput: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1QueryInput] = js.native
  /**
    * Optional. The parameters of this query.
    */
  var queryParams: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1QueryParameters] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1DetectIntentRequest {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1DetectIntentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1DetectIntentRequest]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1DetectIntentRequestOps[Self <: SchemaGoogleCloudDialogflowV2beta1DetectIntentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputAudio(value: String): Self = {
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
    def withOutputAudioConfig(value: SchemaGoogleCloudDialogflowV2beta1OutputAudioConfig): Self = {
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
    def withQueryInput(value: SchemaGoogleCloudDialogflowV2beta1QueryInput): Self = {
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
    def withQueryParams(value: SchemaGoogleCloudDialogflowV2beta1QueryParameters): Self = {
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
  }
  
}

