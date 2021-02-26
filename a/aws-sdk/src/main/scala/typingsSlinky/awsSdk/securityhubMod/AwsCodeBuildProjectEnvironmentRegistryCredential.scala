package typingsSlinky.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsCodeBuildProjectEnvironmentRegistryCredential extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) or name of credentials created using AWS Secrets Manager.  The credential can use the name of the credentials only if they exist in your current AWS Region.  
    */
  var Credential: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The service that created the credentials to access a private Docker registry. The valid value, SECRETS_MANAGER, is for AWS Secrets Manager.
    */
  var CredentialProvider: js.UndefOr[NonEmptyString] = js.native
}
object AwsCodeBuildProjectEnvironmentRegistryCredential {
  
  @scala.inline
  def apply(): AwsCodeBuildProjectEnvironmentRegistryCredential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCodeBuildProjectEnvironmentRegistryCredential]
  }
  
  @scala.inline
  implicit class AwsCodeBuildProjectEnvironmentRegistryCredentialMutableBuilder[Self <: AwsCodeBuildProjectEnvironmentRegistryCredential] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredential(value: NonEmptyString): Self = StObject.set(x, "Credential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialProvider(value: NonEmptyString): Self = StObject.set(x, "CredentialProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialProviderUndefined: Self = StObject.set(x, "CredentialProvider", js.undefined)
    
    @scala.inline
    def setCredentialUndefined: Self = StObject.set(x, "Credential", js.undefined)
  }
}
