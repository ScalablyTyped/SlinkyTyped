package typingsSlinky.atAwsDashSdkCredentialDashProviderDashCognitoDashIdentity

import typingsSlinky.atAwsDashSdkCredentialDashProviderDashCognitoDashIdentity.buildFromCognitoIdentityMod.FromCognitoIdentityParameters
import typingsSlinky.atAwsDashSdkCredentialDashProviderDashCognitoDashIdentity.buildFromCognitoIdentityPoolMod.FromCognitoIdentityPoolParameters
import typingsSlinky.atAwsDashSdkTypes.buildCredentialsMod.CredentialProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/credential-provider-cognito-identity", JSImport.Namespace)
@js.native
object atAwsDashSdkCredentialDashProviderDashCognitoDashIdentityMod extends js.Object {
  def fromCognitoIdentity(parameters: FromCognitoIdentityParameters): CredentialProvider = js.native
  def fromCognitoIdentityPool(
    hasAccountIdCacheClientCustomRoleArnIdentityPoolIdLoginsUserIdentifier: FromCognitoIdentityPoolParameters
  ): CredentialProvider = js.native
}

