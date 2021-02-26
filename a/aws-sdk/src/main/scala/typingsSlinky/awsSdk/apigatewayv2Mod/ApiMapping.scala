package typingsSlinky.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiMapping extends StObject {
  
  /**
    * The API identifier.
    */
  var ApiId: Id = js.native
  
  /**
    * The API mapping identifier.
    */
  var ApiMappingId: js.UndefOr[Id] = js.native
  
  /**
    * The API mapping key.
    */
  var ApiMappingKey: js.UndefOr[SelectionKey] = js.native
  
  /**
    * The API stage.
    */
  var Stage: StringWithLengthBetween1And128 = js.native
}
object ApiMapping {
  
  @scala.inline
  def apply(ApiId: Id, Stage: StringWithLengthBetween1And128): ApiMapping = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], Stage = Stage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiMapping]
  }
  
  @scala.inline
  implicit class ApiMappingMutableBuilder[Self <: ApiMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiId(value: Id): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiMappingId(value: Id): Self = StObject.set(x, "ApiMappingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiMappingIdUndefined: Self = StObject.set(x, "ApiMappingId", js.undefined)
    
    @scala.inline
    def setApiMappingKey(value: SelectionKey): Self = StObject.set(x, "ApiMappingKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiMappingKeyUndefined: Self = StObject.set(x, "ApiMappingKey", js.undefined)
    
    @scala.inline
    def setStage(value: StringWithLengthBetween1And128): Self = StObject.set(x, "Stage", value.asInstanceOf[js.Any])
  }
}
