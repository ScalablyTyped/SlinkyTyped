package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typingsSlinky.dialogflow.mod.google.rpc.IStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a DetectIntentResponse. */
@js.native
trait IDetectIntentResponse extends StObject {
  
  /** DetectIntentResponse alternativeQueryResults */
  var alternativeQueryResults: js.UndefOr[js.Array[IQueryResult] | Null] = js.native
  
  /** DetectIntentResponse outputAudio */
  var outputAudio: js.UndefOr[js.typedarray.Uint8Array | String | Null] = js.native
  
  /** DetectIntentResponse outputAudioConfig */
  var outputAudioConfig: js.UndefOr[IOutputAudioConfig | Null] = js.native
  
  /** DetectIntentResponse queryResult */
  var queryResult: js.UndefOr[IQueryResult | Null] = js.native
  
  /** DetectIntentResponse responseId */
  var responseId: js.UndefOr[String | Null] = js.native
  
  /** DetectIntentResponse webhookStatus */
  var webhookStatus: js.UndefOr[IStatus | Null] = js.native
}
object IDetectIntentResponse {
  
  @scala.inline
  def apply(): IDetectIntentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDetectIntentResponse]
  }
  
  @scala.inline
  implicit class IDetectIntentResponseMutableBuilder[Self <: IDetectIntentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternativeQueryResults(value: js.Array[IQueryResult]): Self = StObject.set(x, "alternativeQueryResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternativeQueryResultsNull: Self = StObject.set(x, "alternativeQueryResults", null)
    
    @scala.inline
    def setAlternativeQueryResultsUndefined: Self = StObject.set(x, "alternativeQueryResults", js.undefined)
    
    @scala.inline
    def setAlternativeQueryResultsVarargs(value: IQueryResult*): Self = StObject.set(x, "alternativeQueryResults", js.Array(value :_*))
    
    @scala.inline
    def setOutputAudio(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "outputAudio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputAudioConfig(value: IOutputAudioConfig): Self = StObject.set(x, "outputAudioConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputAudioConfigNull: Self = StObject.set(x, "outputAudioConfig", null)
    
    @scala.inline
    def setOutputAudioConfigUndefined: Self = StObject.set(x, "outputAudioConfig", js.undefined)
    
    @scala.inline
    def setOutputAudioNull: Self = StObject.set(x, "outputAudio", null)
    
    @scala.inline
    def setOutputAudioUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "outputAudio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputAudioUndefined: Self = StObject.set(x, "outputAudio", js.undefined)
    
    @scala.inline
    def setQueryResult(value: IQueryResult): Self = StObject.set(x, "queryResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryResultNull: Self = StObject.set(x, "queryResult", null)
    
    @scala.inline
    def setQueryResultUndefined: Self = StObject.set(x, "queryResult", js.undefined)
    
    @scala.inline
    def setResponseId(value: String): Self = StObject.set(x, "responseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseIdNull: Self = StObject.set(x, "responseId", null)
    
    @scala.inline
    def setResponseIdUndefined: Self = StObject.set(x, "responseId", js.undefined)
    
    @scala.inline
    def setWebhookStatus(value: IStatus): Self = StObject.set(x, "webhookStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebhookStatusNull: Self = StObject.set(x, "webhookStatus", null)
    
    @scala.inline
    def setWebhookStatusUndefined: Self = StObject.set(x, "webhookStatus", js.undefined)
  }
}
