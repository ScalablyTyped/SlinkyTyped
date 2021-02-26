package typingsSlinky.awsSdk

import typingsSlinky.awsSdk.configBaseMod.HTTPOptions
import typingsSlinky.awsSdk.credentialsMod.Credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sharedIniFileCredentialsMod {
  
  @JSImport("aws-sdk/lib/credentials/shared_ini_file_credentials", "SharedIniFileCredentials")
  @js.native
  /**
    * Creates a new SharedIniFileCredentials object.
    */
  class SharedIniFileCredentials () extends Credentials {
    def this(options: SharedIniFileCredentialsOptions) = this()
  }
  
  @js.native
  trait SharedIniFileCredentialsOptions extends StObject {
    
    var callback: js.UndefOr[js.Function1[/* err */ js.UndefOr[js.Error], Unit]] = js.native
    
    var disableAssumeRole: js.UndefOr[Boolean] = js.native
    
    var filename: js.UndefOr[String] = js.native
    
    var httpOptions: js.UndefOr[HTTPOptions] = js.native
    
    var profile: js.UndefOr[String] = js.native
    
    var tokenCodeFn: js.UndefOr[
        js.Function2[
          /* mfaSerial */ String, 
          /* callback */ js.Function2[/* err */ js.UndefOr[js.Error], /* token */ js.UndefOr[String], Unit], 
          Unit
        ]
      ] = js.native
  }
  object SharedIniFileCredentialsOptions {
    
    @scala.inline
    def apply(): SharedIniFileCredentialsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedIniFileCredentialsOptions]
    }
    
    @scala.inline
    implicit class SharedIniFileCredentialsOptionsMutableBuilder[Self <: SharedIniFileCredentialsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: /* err */ js.UndefOr[js.Error] => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setDisableAssumeRole(value: Boolean): Self = StObject.set(x, "disableAssumeRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableAssumeRoleUndefined: Self = StObject.set(x, "disableAssumeRole", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setHttpOptions(value: HTTPOptions): Self = StObject.set(x, "httpOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpOptionsUndefined: Self = StObject.set(x, "httpOptions", js.undefined)
      
      @scala.inline
      def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      @scala.inline
      def setTokenCodeFn(
        value: (/* mfaSerial */ String, /* callback */ js.Function2[/* err */ js.UndefOr[js.Error], /* token */ js.UndefOr[String], Unit]) => Unit
      ): Self = StObject.set(x, "tokenCodeFn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTokenCodeFnUndefined: Self = StObject.set(x, "tokenCodeFn", js.undefined)
    }
  }
}
