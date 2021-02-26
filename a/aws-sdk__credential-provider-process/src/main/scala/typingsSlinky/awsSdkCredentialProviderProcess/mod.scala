package typingsSlinky.awsSdkCredentialProviderProcess

import typingsSlinky.awsSdkSharedIniFileLoader.mod.SharedConfigFiles
import typingsSlinky.awsSdkSharedIniFileLoader.mod.SharedConfigInit
import typingsSlinky.awsSdkTypes.credentialsMod.CredentialProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/credential-provider-process", "ENV_PROFILE")
  @js.native
  val ENV_PROFILE: /* "AWS_PROFILE" */ String = js.native
  
  @JSImport("@aws-sdk/credential-provider-process", "fromProcess")
  @js.native
  def fromProcess(): CredentialProvider = js.native
  @JSImport("@aws-sdk/credential-provider-process", "fromProcess")
  @js.native
  def fromProcess(init: FromProcessInit): CredentialProvider = js.native
  
  @js.native
  trait FromProcessInit extends SharedConfigInit {
    
    /**
      * A promise that will be resolved with loaded and parsed credentials files.
      * Used to avoid loading shared config files multiple times.
      */
    var loadedConfig: js.UndefOr[js.Promise[SharedConfigFiles]] = js.native
    
    /**
      * The configuration profile to use.
      */
    var profile: js.UndefOr[String] = js.native
  }
  object FromProcessInit {
    
    @scala.inline
    def apply(): FromProcessInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FromProcessInit]
    }
    
    @scala.inline
    implicit class FromProcessInitMutableBuilder[Self <: FromProcessInit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoadedConfig(value: js.Promise[SharedConfigFiles]): Self = StObject.set(x, "loadedConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadedConfigUndefined: Self = StObject.set(x, "loadedConfig", js.undefined)
      
      @scala.inline
      def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    }
  }
}
