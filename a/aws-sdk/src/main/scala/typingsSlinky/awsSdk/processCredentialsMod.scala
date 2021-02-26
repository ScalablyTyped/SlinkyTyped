package typingsSlinky.awsSdk

import typingsSlinky.awsSdk.configBaseMod.HTTPOptions
import typingsSlinky.awsSdk.credentialsMod.Credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object processCredentialsMod {
  
  @JSImport("aws-sdk/lib/credentials/process_credentials", "ProcessCredentials")
  @js.native
  /**
    * Creates a new ProcessCredentials object.
    */
  class ProcessCredentials () extends Credentials {
    def this(options: ProcessCredentialsOptions) = this()
  }
  
  @js.native
  trait ProcessCredentialsOptions extends StObject {
    
    var filename: js.UndefOr[String] = js.native
    
    var httpOptions: js.UndefOr[HTTPOptions] = js.native
    
    var profile: js.UndefOr[String] = js.native
  }
  object ProcessCredentialsOptions {
    
    @scala.inline
    def apply(): ProcessCredentialsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProcessCredentialsOptions]
    }
    
    @scala.inline
    implicit class ProcessCredentialsOptionsMutableBuilder[Self <: ProcessCredentialsOptions] (val x: Self) extends AnyVal {
      
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
    }
  }
}
