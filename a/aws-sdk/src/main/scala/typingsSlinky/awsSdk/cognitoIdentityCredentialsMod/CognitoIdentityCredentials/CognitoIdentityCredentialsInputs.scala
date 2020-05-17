package typingsSlinky.awsSdk.cognitoIdentityCredentialsMod.CognitoIdentityCredentials

import typingsSlinky.awsSdk.cognitoidentityMod.GetCredentialsForIdentityInput
import typingsSlinky.awsSdk.cognitoidentityMod.GetIdInput
import typingsSlinky.awsSdk.cognitoidentityMod.GetOpenIdTokenInput
import typingsSlinky.awsSdk.stsMod.AssumeRoleWithWebIdentityRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.cognitoidentityMod.GetIdInput
  - typingsSlinky.awsSdk.cognitoidentityMod.GetCredentialsForIdentityInput
  - typingsSlinky.awsSdk.cognitoidentityMod.GetOpenIdTokenInput
  - typingsSlinky.awsSdk.stsMod.AssumeRoleWithWebIdentityRequest
*/
trait CognitoIdentityCredentialsInputs extends js.Object

object CognitoIdentityCredentialsInputs {
  @scala.inline
  implicit def apply(value: AssumeRoleWithWebIdentityRequest): CognitoIdentityCredentialsInputs = value.asInstanceOf[CognitoIdentityCredentialsInputs]
  @scala.inline
  implicit def apply(value: GetCredentialsForIdentityInput): CognitoIdentityCredentialsInputs = value.asInstanceOf[CognitoIdentityCredentialsInputs]
  @scala.inline
  implicit def apply(value: GetIdInput): CognitoIdentityCredentialsInputs = value.asInstanceOf[CognitoIdentityCredentialsInputs]
  @scala.inline
  implicit def apply(value: GetOpenIdTokenInput): CognitoIdentityCredentialsInputs = value.asInstanceOf[CognitoIdentityCredentialsInputs]
}

