package typingsSlinky.awsSdkCredentialProviderEnv

import typingsSlinky.awsSdkCredentialProviderEnv.awsSdkCredentialProviderEnvStrings.AWS_ACCESS_KEY_ID
import typingsSlinky.awsSdkCredentialProviderEnv.awsSdkCredentialProviderEnvStrings.AWS_CREDENTIAL_EXPIRATION
import typingsSlinky.awsSdkCredentialProviderEnv.awsSdkCredentialProviderEnvStrings.AWS_SECRET_ACCESS_KEY
import typingsSlinky.awsSdkCredentialProviderEnv.awsSdkCredentialProviderEnvStrings.AWS_SESSION_TOKEN
import typingsSlinky.awsSdkTypes.credentialsMod.CredentialProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/credential-provider-env", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val ENV_EXPIRATION: AWS_CREDENTIAL_EXPIRATION = js.native
  val ENV_KEY: AWS_ACCESS_KEY_ID = js.native
  val ENV_SECRET: AWS_SECRET_ACCESS_KEY = js.native
  val ENV_SESSION: AWS_SESSION_TOKEN = js.native
  def fromEnv(): CredentialProvider = js.native
}

