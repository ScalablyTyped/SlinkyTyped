package typingsSlinky.openapiTypes.mod.OpenAPIV2

import typingsSlinky.openapiTypes.openapiTypesStrings.`implicit`
import typingsSlinky.openapiTypes.openapiTypesStrings.accessCode
import typingsSlinky.openapiTypes.openapiTypesStrings.apiKey
import typingsSlinky.openapiTypes.openapiTypesStrings.application
import typingsSlinky.openapiTypes.openapiTypesStrings.basic
import typingsSlinky.openapiTypes.openapiTypesStrings.oauth2
import typingsSlinky.openapiTypes.openapiTypesStrings.password
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.openapiTypes.mod.OpenAPIV2.SecuritySchemeBasic
  - typingsSlinky.openapiTypes.mod.OpenAPIV2.SecuritySchemeApiKey
  - typingsSlinky.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2
*/
trait SecuritySchemeObject extends StObject
object SecuritySchemeObject {
  
  @scala.inline
  def SecuritySchemeApiKey(in: String, name: String, `type`: apiKey): typingsSlinky.openapiTypes.mod.OpenAPIV2.SecuritySchemeApiKey = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.openapiTypes.mod.OpenAPIV2.SecuritySchemeApiKey]
  }
  
  @scala.inline
  def SecuritySchemeBasic(`type`: basic): typingsSlinky.openapiTypes.mod.OpenAPIV2.SecuritySchemeBasic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.openapiTypes.mod.OpenAPIV2.SecuritySchemeBasic]
  }
  
  @scala.inline
  def SecuritySchemeOauth2AccessCode(authorizationUrl: String, flow: accessCode, scopes: ScopesObject, tokenUrl: String, `type`: oauth2): typingsSlinky.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2AccessCode = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2AccessCode]
  }
  
  @scala.inline
  def SecuritySchemeOauth2Application(flow: application, scopes: ScopesObject, tokenUrl: String, `type`: oauth2): typingsSlinky.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2Application = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2Application]
  }
  
  @scala.inline
  def SecuritySchemeOauth2Implicit(authorizationUrl: String, flow: `implicit`, scopes: ScopesObject, `type`: oauth2): typingsSlinky.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2Implicit = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2Implicit]
  }
  
  @scala.inline
  def SecuritySchemeOauth2Password(flow: password, scopes: ScopesObject, tokenUrl: String, `type`: oauth2): typingsSlinky.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2Password = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.openapiTypes.mod.OpenAPIV2.SecuritySchemeOauth2Password]
  }
}
