package typingsSlinky.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEventPredictionRequest extends StObject {
  
  /**
    * The detector ID.
    */
  var detectorId: String = js.native
  
  /**
    * The detector version ID.
    */
  var detectorVersionId: js.UndefOr[wholeNumberVersionString] = js.native
  
  /**
    * The entity type (associated with the detector's event type) and specific entity ID representing who performed the event. If an entity id is not available, use "UNKNOWN."
    */
  var entities: listOfEntities = js.native
  
  /**
    * The unique ID used to identify the event.
    */
  var eventId: String = js.native
  
  /**
    * Timestamp that defines when the event under evaluation occurred.
    */
  var eventTimestamp: String = js.native
  
  /**
    * The event type associated with the detector specified for the prediction.
    */
  var eventTypeName: String = js.native
  
  /**
    * Names of the event type's variables you defined in Amazon Fraud Detector to represent data elements and their corresponding values for the event you are sending for evaluation.
    */
  var eventVariables: EventVariableMap = js.native
  
  /**
    * The Amazon SageMaker model endpoint input data blobs.
    */
  var externalModelEndpointDataBlobs: js.UndefOr[ExternalModelEndpointDataBlobMap] = js.native
}
object GetEventPredictionRequest {
  
  @scala.inline
  def apply(
    detectorId: String,
    entities: listOfEntities,
    eventId: String,
    eventTimestamp: String,
    eventTypeName: String,
    eventVariables: EventVariableMap
  ): GetEventPredictionRequest = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any], entities = entities.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any], eventTimestamp = eventTimestamp.asInstanceOf[js.Any], eventTypeName = eventTypeName.asInstanceOf[js.Any], eventVariables = eventVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEventPredictionRequest]
  }
  
  @scala.inline
  implicit class GetEventPredictionRequestMutableBuilder[Self <: GetEventPredictionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectorId(value: String): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorVersionId(value: wholeNumberVersionString): Self = StObject.set(x, "detectorVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorVersionIdUndefined: Self = StObject.set(x, "detectorVersionId", js.undefined)
    
    @scala.inline
    def setEntities(value: listOfEntities): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesVarargs(value: Entity*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    @scala.inline
    def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTimestamp(value: String): Self = StObject.set(x, "eventTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypeName(value: String): Self = StObject.set(x, "eventTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventVariables(value: EventVariableMap): Self = StObject.set(x, "eventVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalModelEndpointDataBlobs(value: ExternalModelEndpointDataBlobMap): Self = StObject.set(x, "externalModelEndpointDataBlobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalModelEndpointDataBlobsUndefined: Self = StObject.set(x, "externalModelEndpointDataBlobs", js.undefined)
  }
}
