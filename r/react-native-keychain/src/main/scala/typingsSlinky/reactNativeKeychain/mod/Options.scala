package typingsSlinky.reactNativeKeychain.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends StObject {
  
  var accessControl: js.UndefOr[ACCESS_CONTROL] = js.native
  
  var accessGroup: js.UndefOr[String] = js.native
  
  var accessible: js.UndefOr[ACCESSIBLE] = js.native
  
  var authenticationPrompt: js.UndefOr[String | AuthenticationPrompt] = js.native
  
  var authenticationType: js.UndefOr[AUTHENTICATION_TYPE] = js.native
  
  var rules: js.UndefOr[SECURITY_RULES] = js.native
  
  var securityLevel: js.UndefOr[SECURITY_LEVEL] = js.native
  
  var service: js.UndefOr[String] = js.native
  
  var storage: js.UndefOr[STORAGE_TYPE] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessControl(value: ACCESS_CONTROL): Self = StObject.set(x, "accessControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessControlUndefined: Self = StObject.set(x, "accessControl", js.undefined)
    
    @scala.inline
    def setAccessGroup(value: String): Self = StObject.set(x, "accessGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessGroupUndefined: Self = StObject.set(x, "accessGroup", js.undefined)
    
    @scala.inline
    def setAccessible(value: ACCESSIBLE): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
    
    @scala.inline
    def setAuthenticationPrompt(value: String | AuthenticationPrompt): Self = StObject.set(x, "authenticationPrompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationPromptUndefined: Self = StObject.set(x, "authenticationPrompt", js.undefined)
    
    @scala.inline
    def setAuthenticationType(value: AUTHENTICATION_TYPE): Self = StObject.set(x, "authenticationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationTypeUndefined: Self = StObject.set(x, "authenticationType", js.undefined)
    
    @scala.inline
    def setRules(value: SECURITY_RULES): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setSecurityLevel(value: SECURITY_LEVEL): Self = StObject.set(x, "securityLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityLevelUndefined: Self = StObject.set(x, "securityLevel", js.undefined)
    
    @scala.inline
    def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    @scala.inline
    def setStorage(value: STORAGE_TYPE): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
  }
}
