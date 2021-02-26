package typingsSlinky.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBasePathMappingRequest extends StObject {
  
  /**
    * [Required] The base path name that callers of the API must provide as part of the URL after the domain name. This value must be unique for all of the mappings across a single API. Specify '(none)' if you do not want callers to specify any base path name after the domain name.
    */
  var basePath: String = js.native
  
  /**
    * [Required] The domain name of the BasePathMapping resource to be described.
    */
  var domainName: String = js.native
}
object GetBasePathMappingRequest {
  
  @scala.inline
  def apply(basePath: String, domainName: String): GetBasePathMappingRequest = {
    val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBasePathMappingRequest]
  }
  
  @scala.inline
  implicit class GetBasePathMappingRequestMutableBuilder[Self <: GetBasePathMappingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
  }
}
