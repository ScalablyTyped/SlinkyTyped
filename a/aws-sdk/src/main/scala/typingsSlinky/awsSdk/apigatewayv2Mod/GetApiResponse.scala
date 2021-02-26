package typingsSlinky.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetApiResponse extends StObject {
  
  /**
    * The URI of the API, of the form {api-id}.execute-api.{region}.amazonaws.com. The stage name is typically appended to this URI to form a complete path to a deployed API stage.
    */
  var ApiEndpoint: js.UndefOr[string] = js.native
  
  /**
    * Specifies whether an API is managed by API Gateway. You can't update or delete a managed API by using API Gateway. A managed API can be deleted only through the tooling or service that created it.
    */
  var ApiGatewayManaged: js.UndefOr[boolean] = js.native
  
  /**
    * The API ID.
    */
  var ApiId: js.UndefOr[Id] = js.native
  
  /**
    * An API key selection expression. Supported only for WebSocket APIs. See API Key Selection Expressions.
    */
  var ApiKeySelectionExpression: js.UndefOr[SelectionExpression] = js.native
  
  /**
    * A CORS configuration. Supported only for HTTP APIs.
    */
  var CorsConfiguration: js.UndefOr[Cors] = js.native
  
  /**
    * The timestamp when the API was created.
    */
  var CreatedDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The description of the API.
    */
  var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.native
  
  /**
    * Specifies whether clients can invoke your API by using the default execute-api endpoint. By default, clients can invoke your API with the default https://{api_id}.execute-api.{region}.amazonaws.com endpoint. To require that clients use a custom domain name to invoke your API, disable the default endpoint.
    */
  var DisableExecuteApiEndpoint: js.UndefOr[boolean] = js.native
  
  /**
    * Avoid validating models when creating a deployment. Supported only for WebSocket APIs.
    */
  var DisableSchemaValidation: js.UndefOr[boolean] = js.native
  
  /**
    * The validation information during API import. This may include particular properties of your OpenAPI definition which are ignored during import. Supported only for HTTP APIs.
    */
  var ImportInfo: js.UndefOr[listOfString] = js.native
  
  /**
    * The name of the API.
    */
  var Name: js.UndefOr[StringWithLengthBetween1And128] = js.native
  
  /**
    * The API protocol.
    */
  var ProtocolType: js.UndefOr[typingsSlinky.awsSdk.apigatewayv2Mod.ProtocolType] = js.native
  
  /**
    * The route selection expression for the API. For HTTP APIs, the routeSelectionExpression must be ${request.method} ${request.path}. If not provided, this will be the default for HTTP APIs. This property is required for WebSocket APIs.
    */
  var RouteSelectionExpression: js.UndefOr[SelectionExpression] = js.native
  
  /**
    * A collection of tags associated with the API.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.apigatewayv2Mod.Tags] = js.native
  
  /**
    * A version identifier for the API.
    */
  var Version: js.UndefOr[StringWithLengthBetween1And64] = js.native
  
  /**
    * The warning messages reported when failonwarnings is turned on during API import.
    */
  var Warnings: js.UndefOr[listOfString] = js.native
}
object GetApiResponse {
  
  @scala.inline
  def apply(): GetApiResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetApiResponse]
  }
  
  @scala.inline
  implicit class GetApiResponseMutableBuilder[Self <: GetApiResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiEndpoint(value: string): Self = StObject.set(x, "ApiEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiEndpointUndefined: Self = StObject.set(x, "ApiEndpoint", js.undefined)
    
    @scala.inline
    def setApiGatewayManaged(value: boolean): Self = StObject.set(x, "ApiGatewayManaged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiGatewayManagedUndefined: Self = StObject.set(x, "ApiGatewayManaged", js.undefined)
    
    @scala.inline
    def setApiId(value: Id): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiIdUndefined: Self = StObject.set(x, "ApiId", js.undefined)
    
    @scala.inline
    def setApiKeySelectionExpression(value: SelectionExpression): Self = StObject.set(x, "ApiKeySelectionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiKeySelectionExpressionUndefined: Self = StObject.set(x, "ApiKeySelectionExpression", js.undefined)
    
    @scala.inline
    def setCorsConfiguration(value: Cors): Self = StObject.set(x, "CorsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorsConfigurationUndefined: Self = StObject.set(x, "CorsConfiguration", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: js.Date): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    @scala.inline
    def setDescription(value: StringWithLengthBetween0And1024): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDisableExecuteApiEndpoint(value: boolean): Self = StObject.set(x, "DisableExecuteApiEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableExecuteApiEndpointUndefined: Self = StObject.set(x, "DisableExecuteApiEndpoint", js.undefined)
    
    @scala.inline
    def setDisableSchemaValidation(value: boolean): Self = StObject.set(x, "DisableSchemaValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableSchemaValidationUndefined: Self = StObject.set(x, "DisableSchemaValidation", js.undefined)
    
    @scala.inline
    def setImportInfo(value: listOfString): Self = StObject.set(x, "ImportInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportInfoUndefined: Self = StObject.set(x, "ImportInfo", js.undefined)
    
    @scala.inline
    def setImportInfoVarargs(value: string*): Self = StObject.set(x, "ImportInfo", js.Array(value :_*))
    
    @scala.inline
    def setName(value: StringWithLengthBetween1And128): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setProtocolType(value: ProtocolType): Self = StObject.set(x, "ProtocolType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolTypeUndefined: Self = StObject.set(x, "ProtocolType", js.undefined)
    
    @scala.inline
    def setRouteSelectionExpression(value: SelectionExpression): Self = StObject.set(x, "RouteSelectionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteSelectionExpressionUndefined: Self = StObject.set(x, "RouteSelectionExpression", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setVersion(value: StringWithLengthBetween1And64): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
    
    @scala.inline
    def setWarnings(value: listOfString): Self = StObject.set(x, "Warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsUndefined: Self = StObject.set(x, "Warnings", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: string*): Self = StObject.set(x, "Warnings", js.Array(value :_*))
  }
}
