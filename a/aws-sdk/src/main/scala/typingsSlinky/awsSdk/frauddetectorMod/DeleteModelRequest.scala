package typingsSlinky.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteModelRequest extends StObject {
  
  /**
    * The model ID of the model to delete.
    */
  var modelId: modelIdentifier = js.native
  
  /**
    * The model type of the model to delete.
    */
  var modelType: ModelTypeEnum = js.native
}
object DeleteModelRequest {
  
  @scala.inline
  def apply(modelId: modelIdentifier, modelType: ModelTypeEnum): DeleteModelRequest = {
    val __obj = js.Dynamic.literal(modelId = modelId.asInstanceOf[js.Any], modelType = modelType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteModelRequest]
  }
  
  @scala.inline
  implicit class DeleteModelRequestMutableBuilder[Self <: DeleteModelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModelId(value: modelIdentifier): Self = StObject.set(x, "modelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelType(value: ModelTypeEnum): Self = StObject.set(x, "modelType", value.asInstanceOf[js.Any])
  }
}
