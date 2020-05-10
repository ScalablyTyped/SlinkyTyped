package typingsSlinky.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response message for a webhook call.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2WebhookResponse extends js.Object {
  /**
    * Optional. Makes the platform immediately invoke another `DetectIntent`
    * call internally with the specified event as input.
    */
  var followupEventInput: js.UndefOr[SchemaGoogleCloudDialogflowV2EventInput] = js.native
  /**
    * Optional. The collection of rich messages to present to the user. This
    * value is passed directly to `QueryResult.fulfillment_messages`.
    */
  var fulfillmentMessages: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2IntentMessage]] = js.native
  /**
    * Optional. The text to be shown on the screen. This value is passed
    * directly to `QueryResult.fulfillment_text`.
    */
  var fulfillmentText: js.UndefOr[String] = js.native
  /**
    * Optional. The collection of output contexts. This value is passed
    * directly to `QueryResult.output_contexts`.
    */
  var outputContexts: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2Context]] = js.native
  /**
    * Optional. This value is passed directly to `QueryResult.webhook_payload`.
    * See the related `fulfillment_messages[i].payload field`, which may be
    * used as an alternative to this field.  This field can be used for Actions
    * on Google responses. It should have a structure similar to the JSON
    * message shown here. For more information, see [Actions on Google Webhook
    * Format](https://developers.google.com/actions/dialogflow/webhook)
    * &lt;pre&gt;{   &quot;google&quot;: {     &quot;expectUserResponse&quot;:
    * true,     &quot;richResponse&quot;: {       &quot;items&quot;: [ {
    * &quot;simpleResponse&quot;: {             &quot;textToSpeech&quot;:
    * &quot;this is a simple response&quot;           }         }       ]     }
    * } }&lt;/pre&gt;
    */
  var payload: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Optional. This value is passed directly to `QueryResult.webhook_source`.
    */
  var source: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2WebhookResponse {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2WebhookResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2WebhookResponse]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2WebhookResponseOps[Self <: SchemaGoogleCloudDialogflowV2WebhookResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFollowupEventInput(value: SchemaGoogleCloudDialogflowV2EventInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followupEventInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowupEventInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followupEventInput")(js.undefined)
        ret
    }
    @scala.inline
    def withFulfillmentMessages(value: js.Array[SchemaGoogleCloudDialogflowV2IntentMessage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fulfillmentMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFulfillmentMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fulfillmentMessages")(js.undefined)
        ret
    }
    @scala.inline
    def withFulfillmentText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fulfillmentText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFulfillmentText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fulfillmentText")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputContexts(value: js.Array[SchemaGoogleCloudDialogflowV2Context]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputContexts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputContexts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputContexts")(js.undefined)
        ret
    }
    @scala.inline
    def withPayload(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

