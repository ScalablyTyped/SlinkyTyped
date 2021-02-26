package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.`0`
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accountTwoFactorLoginOptionsMod {
  
  @js.native
  trait AccountTwoFactorLoginOptions extends StObject {
    
    var trustThisDevice: js.UndefOr[`1` | `0`] = js.native
    
    var twoFactorIdentifier: String = js.native
    
    var username: String = js.native
    
    var verificationCode: String = js.native
    
    var verificationMethod: js.UndefOr[String] = js.native
  }
  object AccountTwoFactorLoginOptions {
    
    @scala.inline
    def apply(twoFactorIdentifier: String, username: String, verificationCode: String): AccountTwoFactorLoginOptions = {
      val __obj = js.Dynamic.literal(twoFactorIdentifier = twoFactorIdentifier.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], verificationCode = verificationCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccountTwoFactorLoginOptions]
    }
    
    @scala.inline
    implicit class AccountTwoFactorLoginOptionsMutableBuilder[Self <: AccountTwoFactorLoginOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTrustThisDevice(value: `1` | `0`): Self = StObject.set(x, "trustThisDevice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrustThisDeviceUndefined: Self = StObject.set(x, "trustThisDevice", js.undefined)
      
      @scala.inline
      def setTwoFactorIdentifier(value: String): Self = StObject.set(x, "twoFactorIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerificationCode(value: String): Self = StObject.set(x, "verificationCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerificationMethod(value: String): Self = StObject.set(x, "verificationMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerificationMethodUndefined: Self = StObject.set(x, "verificationMethod", js.undefined)
    }
  }
}
