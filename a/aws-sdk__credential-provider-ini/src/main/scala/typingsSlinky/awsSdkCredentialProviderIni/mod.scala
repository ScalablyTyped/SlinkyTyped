package typingsSlinky.awsSdkCredentialProviderIni

import typingsSlinky.awsSdkSharedIniFileLoader.mod.ParsedIniData
import typingsSlinky.awsSdkSharedIniFileLoader.mod.SharedConfigFiles
import typingsSlinky.awsSdkSharedIniFileLoader.mod.SharedConfigInit
import typingsSlinky.awsSdkTypes.credentialsMod.CredentialProvider
import typingsSlinky.awsSdkTypes.credentialsMod.Credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/credential-provider-ini", "ENV_PROFILE")
  @js.native
  val ENV_PROFILE: /* "AWS_PROFILE" */ String = js.native
  
  @JSImport("@aws-sdk/credential-provider-ini", "fromIni")
  @js.native
  def fromIni(): CredentialProvider = js.native
  @JSImport("@aws-sdk/credential-provider-ini", "fromIni")
  @js.native
  def fromIni(init: FromIniInit): CredentialProvider = js.native
  
  @JSImport("@aws-sdk/credential-provider-ini", "getMasterProfileName")
  @js.native
  def getMasterProfileName(init: FromIniInit): String = js.native
  
  @JSImport("@aws-sdk/credential-provider-ini", "parseKnownFiles")
  @js.native
  def parseKnownFiles(init: FromIniInit): js.Promise[ParsedIniData] = js.native
  
  @js.native
  trait AssumeRoleParams extends StObject {
    
    /**
      * A unique identifier that is used by third parties when assuming roles in
      * their customers' accounts.
      */
    var ExternalId: js.UndefOr[String] = js.native
    
    /**
      * The identifier of the role to be assumed.
      */
    var RoleArn: String = js.native
    
    /**
      * A name for the assumed role session.
      */
    var RoleSessionName: String = js.native
    
    /**
      * The identification number of the MFA device that is associated with the
      * user who is making the `AssumeRole` call.
      */
    var SerialNumber: js.UndefOr[String] = js.native
    
    /**
      * The value provided by the MFA device.
      */
    var TokenCode: js.UndefOr[String] = js.native
  }
  object AssumeRoleParams {
    
    @scala.inline
    def apply(RoleArn: String, RoleSessionName: String): AssumeRoleParams = {
      val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any], RoleSessionName = RoleSessionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssumeRoleParams]
    }
    
    @scala.inline
    implicit class AssumeRoleParamsMutableBuilder[Self <: AssumeRoleParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExternalId(value: String): Self = StObject.set(x, "ExternalId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalIdUndefined: Self = StObject.set(x, "ExternalId", js.undefined)
      
      @scala.inline
      def setRoleArn(value: String): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleSessionName(value: String): Self = StObject.set(x, "RoleSessionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerialNumber(value: String): Self = StObject.set(x, "SerialNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerialNumberUndefined: Self = StObject.set(x, "SerialNumber", js.undefined)
      
      @scala.inline
      def setTokenCode(value: String): Self = StObject.set(x, "TokenCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenCodeUndefined: Self = StObject.set(x, "TokenCode", js.undefined)
    }
  }
  
  @js.native
  trait FromIniInit extends SharedConfigInit {
    
    /**
      * A promise that will be resolved with loaded and parsed credentials files.
      * Used to avoid loading shared config files multiple times.
      */
    var loadedConfig: js.UndefOr[js.Promise[SharedConfigFiles]] = js.native
    
    /**
      * A function that returna a promise fulfilled with an MFA token code for
      * the provided MFA Serial code. If a profile requires an MFA code and
      * `mfaCodeProvider` is not a valid function, the credential provider
      * promise will be rejected.
      *
      * @param mfaSerial The serial code of the MFA device specified.
      */
    var mfaCodeProvider: js.UndefOr[js.Function1[/* mfaSerial */ String, js.Promise[String]]] = js.native
    
    /**
      * The configuration profile to use.
      */
    var profile: js.UndefOr[String] = js.native
    
    /**
      * A function that assumes a role and returns a promise fulfilled with
      * credentials for the assumed role.
      *
      * @param sourceCreds The credentials with which to assume a role.
      * @param params
      */
    var roleAssumer: js.UndefOr[
        js.Function2[
          /* sourceCreds */ Credentials, 
          /* params */ AssumeRoleParams, 
          js.Promise[Credentials]
        ]
      ] = js.native
  }
  object FromIniInit {
    
    @scala.inline
    def apply(): FromIniInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FromIniInit]
    }
    
    @scala.inline
    implicit class FromIniInitMutableBuilder[Self <: FromIniInit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoadedConfig(value: js.Promise[SharedConfigFiles]): Self = StObject.set(x, "loadedConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadedConfigUndefined: Self = StObject.set(x, "loadedConfig", js.undefined)
      
      @scala.inline
      def setMfaCodeProvider(value: /* mfaSerial */ String => js.Promise[String]): Self = StObject.set(x, "mfaCodeProvider", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMfaCodeProviderUndefined: Self = StObject.set(x, "mfaCodeProvider", js.undefined)
      
      @scala.inline
      def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      @scala.inline
      def setRoleAssumer(value: (/* sourceCreds */ Credentials, /* params */ AssumeRoleParams) => js.Promise[Credentials]): Self = StObject.set(x, "roleAssumer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRoleAssumerUndefined: Self = StObject.set(x, "roleAssumer", js.undefined)
    }
  }
}
