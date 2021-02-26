package typingsSlinky.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateModelVersionRequest extends StObject {
  
  /**
    * The event details.
    */
  var externalEventsDetail: js.UndefOr[ExternalEventsDetail] = js.native
  
  /**
    * The major version number.
    */
  var majorVersionNumber: wholeNumberVersionString = js.native
  
  /**
    * The model ID.
    */
  var modelId: modelIdentifier = js.native
  
  /**
    * The model type.
    */
  var modelType: ModelTypeEnum = js.native
  
  /**
    * A collection of key and value pairs.
    */
  var tags: js.UndefOr[tagList] = js.native
}
object UpdateModelVersionRequest {
  
  @scala.inline
  def apply(majorVersionNumber: wholeNumberVersionString, modelId: modelIdentifier, modelType: ModelTypeEnum): UpdateModelVersionRequest = {
    val __obj = js.Dynamic.literal(majorVersionNumber = majorVersionNumber.asInstanceOf[js.Any], modelId = modelId.asInstanceOf[js.Any], modelType = modelType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateModelVersionRequest]
  }
  
  @scala.inline
  implicit class UpdateModelVersionRequestMutableBuilder[Self <: UpdateModelVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExternalEventsDetail(value: ExternalEventsDetail): Self = StObject.set(x, "externalEventsDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalEventsDetailUndefined: Self = StObject.set(x, "externalEventsDetail", js.undefined)
    
    @scala.inline
    def setMajorVersionNumber(value: wholeNumberVersionString): Self = StObject.set(x, "majorVersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelId(value: modelIdentifier): Self = StObject.set(x, "modelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelType(value: ModelTypeEnum): Self = StObject.set(x, "modelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: tagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
