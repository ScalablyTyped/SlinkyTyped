package typingsSlinky.firebaseAuthTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthSettings extends StObject {
  
  var appVerificationDisabledForTesting: Boolean = js.native
}
object AuthSettings {
  
  @scala.inline
  def apply(appVerificationDisabledForTesting: Boolean): AuthSettings = {
    val __obj = js.Dynamic.literal(appVerificationDisabledForTesting = appVerificationDisabledForTesting.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthSettings]
  }
  
  @scala.inline
  implicit class AuthSettingsMutableBuilder[Self <: AuthSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppVerificationDisabledForTesting(value: Boolean): Self = StObject.set(x, "appVerificationDisabledForTesting", value.asInstanceOf[js.Any])
  }
}
