package typingsSlinky.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The collection of simple response candidates. This message in
  * `QueryResult.fulfillment_messages` and
  * `WebhookResponse.fulfillment_messages` should contain only one
  * `SimpleResponse`.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponses extends js.Object {
  /**
    * Required. The list of simple responses.
    */
  var simpleResponses: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponse]] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponses {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponses]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesOps[Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSimpleResponses(value: js.Array[SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleResponses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimpleResponses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleResponses")(js.undefined)
        ret
    }
  }
  
}

