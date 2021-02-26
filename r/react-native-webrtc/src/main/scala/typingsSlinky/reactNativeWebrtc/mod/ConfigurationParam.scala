package typingsSlinky.reactNativeWebrtc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurationParam extends StObject {
  
  var credential: js.UndefOr[String] = js.native
  
  var username: js.UndefOr[String] = js.native
}
object ConfigurationParam {
  
  @scala.inline
  def apply(): ConfigurationParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationParam]
  }
  
  @scala.inline
  implicit class ConfigurationParamMutableBuilder[Self <: ConfigurationParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredential(value: String): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialUndefined: Self = StObject.set(x, "credential", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
