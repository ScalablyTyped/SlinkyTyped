package typingsSlinky.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateModelRequest extends StObject {
  
  /**
    * [Required] The name of the model to update.
    */
  var modelName: String = js.native
  
  /**
    * A list of update operations to be applied to the specified resource and in the order specified in this list.
    */
  var patchOperations: js.UndefOr[ListOfPatchOperation] = js.native
  
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
}
object UpdateModelRequest {
  
  @scala.inline
  def apply(modelName: String, restApiId: String): UpdateModelRequest = {
    val __obj = js.Dynamic.literal(modelName = modelName.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateModelRequest]
  }
  
  @scala.inline
  implicit class UpdateModelRequestMutableBuilder[Self <: UpdateModelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModelName(value: String): Self = StObject.set(x, "modelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchOperations(value: ListOfPatchOperation): Self = StObject.set(x, "patchOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchOperationsUndefined: Self = StObject.set(x, "patchOperations", js.undefined)
    
    @scala.inline
    def setPatchOperationsVarargs(value: PatchOperation*): Self = StObject.set(x, "patchOperations", js.Array(value :_*))
    
    @scala.inline
    def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
  }
}
