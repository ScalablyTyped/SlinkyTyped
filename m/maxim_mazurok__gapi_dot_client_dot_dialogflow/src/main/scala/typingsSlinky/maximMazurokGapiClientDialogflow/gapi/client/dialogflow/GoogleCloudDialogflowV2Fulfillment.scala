package typingsSlinky.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2Fulfillment extends StObject {
  
  /** Optional. The human-readable name of the fulfillment, unique within the agent. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Optional. Whether fulfillment is enabled. */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /** Optional. The field defines whether the fulfillment is enabled for certain features. */
  var features: js.UndefOr[js.Array[GoogleCloudDialogflowV2FulfillmentFeature]] = js.native
  
  /** Configuration for a generic web service. */
  var genericWebService: js.UndefOr[GoogleCloudDialogflowV2FulfillmentGenericWebService] = js.native
  
  /** Required. The unique identifier of the fulfillment. Format: `projects//agent/fulfillment`. */
  var name: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2Fulfillment {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2Fulfillment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2Fulfillment]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2FulfillmentMutableBuilder[Self <: GoogleCloudDialogflowV2Fulfillment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setFeatures(value: js.Array[GoogleCloudDialogflowV2FulfillmentFeature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    @scala.inline
    def setFeaturesVarargs(value: GoogleCloudDialogflowV2FulfillmentFeature*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    @scala.inline
    def setGenericWebService(value: GoogleCloudDialogflowV2FulfillmentGenericWebService): Self = StObject.set(x, "genericWebService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenericWebServiceUndefined: Self = StObject.set(x, "genericWebService", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
