package typingsSlinky.openapiTypes.mod.OpenAPIV2

import typingsSlinky.openapiTypes.openapiTypesStrings.`implicit`
import typingsSlinky.openapiTypes.openapiTypesStrings.accessCode
import typingsSlinky.openapiTypes.openapiTypesStrings.application
import typingsSlinky.openapiTypes.openapiTypesStrings.oauth2
import typingsSlinky.openapiTypes.openapiTypesStrings.password
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecuritySchemeOauth2Base extends SecuritySchemeObjectBase {
  
  var flow: `implicit` | password | application | accessCode = js.native
  
  var scopes: ScopesObject = js.native
  
  @JSName("type")
  var type_SecuritySchemeOauth2Base: oauth2 = js.native
}
object SecuritySchemeOauth2Base {
  
  @scala.inline
  def apply(flow: `implicit` | password | application | accessCode, scopes: ScopesObject, `type`: oauth2): SecuritySchemeOauth2Base = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeOauth2Base]
  }
  
  @scala.inline
  implicit class SecuritySchemeOauth2BaseMutableBuilder[Self <: SecuritySchemeOauth2Base] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlow(value: `implicit` | password | application | accessCode): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopes(value: ScopesObject): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: oauth2): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
