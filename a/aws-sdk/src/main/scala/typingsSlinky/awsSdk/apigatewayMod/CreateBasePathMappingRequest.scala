package typingsSlinky.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBasePathMappingRequest extends StObject {
  
  /**
    * The base path name that callers of the API must provide as part of the URL after the domain name. This value must be unique for all of the mappings across a single API. Specify '(none)' if you do not want callers to specify a base path name after the domain name.
    */
  var basePath: js.UndefOr[String] = js.native
  
  /**
    * [Required] The domain name of the BasePathMapping resource to create.
    */
  var domainName: String = js.native
  
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
  
  /**
    * The name of the API's stage that you want to use for this mapping. Specify '(none)' if you want callers to explicitly specify the stage name after any base path name.
    */
  var stage: js.UndefOr[String] = js.native
}
object CreateBasePathMappingRequest {
  
  @scala.inline
  def apply(domainName: String, restApiId: String): CreateBasePathMappingRequest = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBasePathMappingRequest]
  }
  
  @scala.inline
  implicit class CreateBasePathMappingRequestMutableBuilder[Self <: CreateBasePathMappingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
    
    @scala.inline
    def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
  }
}
