package typingsSlinky.atAwsDashSdkCredentialDashProviderDashImds

import typingsSlinky.atAwsDashSdkCredentialDashProviderDashImds.atAwsDashSdkCredentialDashProviderDashImdsNumbers.`0`
import typingsSlinky.atAwsDashSdkCredentialDashProviderDashImds.atAwsDashSdkCredentialDashProviderDashImdsNumbers.`1000`
import typingsSlinky.atAwsDashSdkCredentialDashProviderDashImds.buildRemoteProviderImdsCredentialsMod.ImdsCredentials
import typingsSlinky.atAwsDashSdkCredentialDashProviderDashImds.buildRemoteProviderRemoteProviderInitMod.RemoteProviderConfig
import typingsSlinky.atAwsDashSdkCredentialDashProviderDashImds.buildRemoteProviderRemoteProviderInitMod.RemoteProviderInit
import typingsSlinky.atAwsDashSdkTypes.buildCredentialsMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/credential-provider-imds/build/remoteProvider", JSImport.Namespace)
@js.native
object buildRemoteProviderMod extends js.Object {
  val DEFAULT_MAX_RETRIES: `0` = js.native
  val DEFAULT_TIMEOUT: `1000` = js.native
  def fromImdsCredentials(creds: ImdsCredentials): Credentials = js.native
  def isImdsCredentials(arg: js.Any): /* is @aws-sdk/credential-provider-imds.@aws-sdk/credential-provider-imds/build/remoteProvider/ImdsCredentials.ImdsCredentials */ Boolean = js.native
  def providerConfigFromInit(init: RemoteProviderInit): RemoteProviderConfig = js.native
}

