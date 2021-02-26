package typingsSlinky.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDocumentationPartsRequest extends StObject {
  
  /**
    * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
    */
  var limit: js.UndefOr[NullableInteger] = js.native
  
  /**
    * The status of the API documentation parts to retrieve. Valid values are DOCUMENTED for retrieving DocumentationPart resources with content and UNDOCUMENTED for DocumentationPart resources without content.
    */
  var locationStatus: js.UndefOr[LocationStatusType] = js.native
  
  /**
    * The name of API entities of the to-be-retrieved documentation parts.
    */
  var nameQuery: js.UndefOr[String] = js.native
  
  /**
    * The path of API entities of the to-be-retrieved documentation parts.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * The current pagination position in the paged result set.
    */
  var position: js.UndefOr[String] = js.native
  
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
  
  /**
    * The type of API entities of the to-be-retrieved documentation parts. 
    */
  var `type`: js.UndefOr[DocumentationPartType] = js.native
}
object GetDocumentationPartsRequest {
  
  @scala.inline
  def apply(restApiId: String): GetDocumentationPartsRequest = {
    val __obj = js.Dynamic.literal(restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDocumentationPartsRequest]
  }
  
  @scala.inline
  implicit class GetDocumentationPartsRequestMutableBuilder[Self <: GetDocumentationPartsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: NullableInteger): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setLocationStatus(value: LocationStatusType): Self = StObject.set(x, "locationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationStatusUndefined: Self = StObject.set(x, "locationStatus", js.undefined)
    
    @scala.inline
    def setNameQuery(value: String): Self = StObject.set(x, "nameQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameQueryUndefined: Self = StObject.set(x, "nameQuery", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: DocumentationPartType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
