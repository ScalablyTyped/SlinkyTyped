package typingsSlinky.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutRestApiRequest extends StObject {
  
  /**
    * [Required] The PUT request body containing external API definitions. Currently, only OpenAPI definition JSON/YAML files are supported. The maximum size of the API definition file is 6MB.
    */
  var body: _Blob = js.native
  
  /**
    * A query parameter to indicate whether to rollback the API update (true) or not (false) when a warning is encountered. The default value is false.
    */
  var failOnWarnings: js.UndefOr[Boolean] = js.native
  
  /**
    * The mode query parameter to specify the update mode. Valid values are "merge" and "overwrite". By default, the update mode is "merge".
    */
  var mode: js.UndefOr[PutMode] = js.native
  
  /**
    * Custom header parameters as part of the request. For example, to exclude DocumentationParts from an imported API, set ignore=documentation as a parameters value, as in the AWS CLI command of aws apigateway import-rest-api --parameters ignore=documentation --body 'file:///path/to/imported-api-body.json'.
    */
  var parameters: js.UndefOr[MapOfStringToString] = js.native
  
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
}
object PutRestApiRequest {
  
  @scala.inline
  def apply(body: _Blob, restApiId: String): PutRestApiRequest = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRestApiRequest]
  }
  
  @scala.inline
  implicit class PutRestApiRequestMutableBuilder[Self <: PutRestApiRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: _Blob): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailOnWarnings(value: Boolean): Self = StObject.set(x, "failOnWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailOnWarningsUndefined: Self = StObject.set(x, "failOnWarnings", js.undefined)
    
    @scala.inline
    def setMode(value: PutMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setParameters(value: MapOfStringToString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
  }
}
