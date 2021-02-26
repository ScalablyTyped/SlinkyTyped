package typingsSlinky.openapiTypes.mod.OpenAPIV3

import typingsSlinky.openapiTypes.anon.AuthorizationCode
import typingsSlinky.openapiTypes.openapiTypesStrings.apiKey
import typingsSlinky.openapiTypes.openapiTypesStrings.http
import typingsSlinky.openapiTypes.openapiTypesStrings.oauth2
import typingsSlinky.openapiTypes.openapiTypesStrings.openIdConnect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.openapiTypes.mod.OpenAPIV3.HttpSecurityScheme
  - typingsSlinky.openapiTypes.mod.OpenAPIV3.ApiKeySecurityScheme
  - typingsSlinky.openapiTypes.mod.OpenAPIV3.OAuth2SecurityScheme
  - typingsSlinky.openapiTypes.mod.OpenAPIV3.OpenIdSecurityScheme
*/
trait SecuritySchemeObject extends StObject
object SecuritySchemeObject {
  
  @scala.inline
  def ApiKeySecurityScheme(in: String, name: String, `type`: apiKey): typingsSlinky.openapiTypes.mod.OpenAPIV3.ApiKeySecurityScheme = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.openapiTypes.mod.OpenAPIV3.ApiKeySecurityScheme]
  }
  
  @scala.inline
  def HttpSecurityScheme(scheme: String, `type`: http): typingsSlinky.openapiTypes.mod.OpenAPIV3.HttpSecurityScheme = {
    val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.openapiTypes.mod.OpenAPIV3.HttpSecurityScheme]
  }
  
  @scala.inline
  def OAuth2SecurityScheme(flows: AuthorizationCode, `type`: oauth2): typingsSlinky.openapiTypes.mod.OpenAPIV3.OAuth2SecurityScheme = {
    val __obj = js.Dynamic.literal(flows = flows.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.openapiTypes.mod.OpenAPIV3.OAuth2SecurityScheme]
  }
  
  @scala.inline
  def OpenIdSecurityScheme(openIdConnectUrl: String, `type`: openIdConnect): typingsSlinky.openapiTypes.mod.OpenAPIV3.OpenIdSecurityScheme = {
    val __obj = js.Dynamic.literal(openIdConnectUrl = openIdConnectUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.openapiTypes.mod.OpenAPIV3.OpenIdSecurityScheme]
  }
}
