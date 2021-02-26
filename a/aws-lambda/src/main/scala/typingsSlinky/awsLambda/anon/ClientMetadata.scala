package typingsSlinky.awsLambda.anon

import typingsSlinky.awsLambda.commonMod.StringMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientMetadata extends StObject {
  
  var clientMetadata: js.UndefOr[StringMap] = js.native
  
  var codeParameter: String = js.native
  
  var userAttributes: StringMap = js.native
  
  var usernameParameter: String = js.native
}
object ClientMetadata {
  
  @scala.inline
  def apply(codeParameter: String, userAttributes: StringMap, usernameParameter: String): ClientMetadata = {
    val __obj = js.Dynamic.literal(codeParameter = codeParameter.asInstanceOf[js.Any], userAttributes = userAttributes.asInstanceOf[js.Any], usernameParameter = usernameParameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientMetadata]
  }
  
  @scala.inline
  implicit class ClientMetadataMutableBuilder[Self <: ClientMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientMetadata(value: StringMap): Self = StObject.set(x, "clientMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientMetadataUndefined: Self = StObject.set(x, "clientMetadata", js.undefined)
    
    @scala.inline
    def setCodeParameter(value: String): Self = StObject.set(x, "codeParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAttributes(value: StringMap): Self = StObject.set(x, "userAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameParameter(value: String): Self = StObject.set(x, "usernameParameter", value.asInstanceOf[js.Any])
  }
}
