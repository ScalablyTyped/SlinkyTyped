package typingsSlinky.awsSdkCredentialProviderImds

import typingsSlinky.awsSdkCredentialProviderImds.awsSdkCredentialProviderImdsNumbers.`0`
import typingsSlinky.awsSdkCredentialProviderImds.awsSdkCredentialProviderImdsNumbers.`1000`
import typingsSlinky.awsSdkCredentialProviderImds.imdsCredentialsMod.ImdsCredentials
import typingsSlinky.awsSdkCredentialProviderImds.remoteProviderInitMod.RemoteProviderConfig
import typingsSlinky.awsSdkCredentialProviderImds.remoteProviderInitMod.RemoteProviderInit
import typingsSlinky.awsSdkTypes.credentialsMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/credential-provider-imds/build/remoteProvider", JSImport.Namespace)
@js.native
object remoteProviderMod extends js.Object {
  val DEFAULT_MAX_RETRIES: `0` = js.native
  val DEFAULT_TIMEOUT: `1000` = js.native
  def fromImdsCredentials(creds: ImdsCredentials): Credentials = js.native
  def isImdsCredentials(arg: js.Any): /* is @aws-sdk/credential-provider-imds.@aws-sdk/credential-provider-imds/build/remoteProvider/ImdsCredentials.ImdsCredentials */ Boolean = js.native
  def providerConfigFromInit(init: RemoteProviderInit): RemoteProviderConfig = js.native
}

