package typingsSlinky.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowCxV3WebhookRequestFulfillmentInfo extends StObject {
  
  /** Always present. The tag used to identify which fulfillment is being called. */
  var tag: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowCxV3WebhookRequestFulfillmentInfo {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowCxV3WebhookRequestFulfillmentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3WebhookRequestFulfillmentInfo]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowCxV3WebhookRequestFulfillmentInfoMutableBuilder[Self <: GoogleCloudDialogflowCxV3WebhookRequestFulfillmentInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
