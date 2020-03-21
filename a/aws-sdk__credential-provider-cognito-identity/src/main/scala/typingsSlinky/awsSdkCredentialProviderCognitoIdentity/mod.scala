package typingsSlinky.awsSdkCredentialProviderCognitoIdentity

import typingsSlinky.awsSdkCredentialProviderCognitoIdentity.fromCognitoIdentityMod.FromCognitoIdentityParameters
import typingsSlinky.awsSdkCredentialProviderCognitoIdentity.fromCognitoIdentityPoolMod.FromCognitoIdentityPoolParameters
import typingsSlinky.awsSdkTypes.credentialsMod.CredentialProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/credential-provider-cognito-identity", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def fromCognitoIdentity(parameters: FromCognitoIdentityParameters): CredentialProvider = js.native
  def fromCognitoIdentityPool(
    hasAccountIdCacheClientCustomRoleArnIdentityPoolIdLoginsUserIdentifier: FromCognitoIdentityPoolParameters
  ): CredentialProvider = js.native
}

