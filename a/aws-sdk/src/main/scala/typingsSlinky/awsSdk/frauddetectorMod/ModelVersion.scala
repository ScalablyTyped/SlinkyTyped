package typingsSlinky.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelVersion extends StObject {
  
  /**
    * The model version ARN.
    */
  var arn: js.UndefOr[fraudDetectorArn] = js.native
  
  /**
    * The model ID.
    */
  var modelId: modelIdentifier = js.native
  
  /**
    * The model type.
    */
  var modelType: ModelTypeEnum = js.native
  
  /**
    * The model version number.
    */
  var modelVersionNumber: nonEmptyString = js.native
}
object ModelVersion {
  
  @scala.inline
  def apply(modelId: modelIdentifier, modelType: ModelTypeEnum, modelVersionNumber: nonEmptyString): ModelVersion = {
    val __obj = js.Dynamic.literal(modelId = modelId.asInstanceOf[js.Any], modelType = modelType.asInstanceOf[js.Any], modelVersionNumber = modelVersionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelVersion]
  }
  
  @scala.inline
  implicit class ModelVersionMutableBuilder[Self <: ModelVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: fraudDetectorArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setModelId(value: modelIdentifier): Self = StObject.set(x, "modelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelType(value: ModelTypeEnum): Self = StObject.set(x, "modelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelVersionNumber(value: nonEmptyString): Self = StObject.set(x, "modelVersionNumber", value.asInstanceOf[js.Any])
  }
}
