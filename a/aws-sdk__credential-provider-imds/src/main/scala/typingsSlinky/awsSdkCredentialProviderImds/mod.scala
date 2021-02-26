package typingsSlinky.awsSdkCredentialProviderImds

import typingsSlinky.awsSdkCredentialProviderImds.remoteProviderInitMod.RemoteProviderConfig
import typingsSlinky.awsSdkCredentialProviderImds.remoteProviderInitMod.RemoteProviderInit
import typingsSlinky.awsSdkTypes.credentialsMod.CredentialProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/credential-provider-imds", "DEFAULT_MAX_RETRIES")
  @js.native
  val DEFAULT_MAX_RETRIES: /* 0 */ Double = js.native
  
  @JSImport("@aws-sdk/credential-provider-imds", "DEFAULT_TIMEOUT")
  @js.native
  val DEFAULT_TIMEOUT: /* 1000 */ Double = js.native
  
  @JSImport("@aws-sdk/credential-provider-imds", "ENV_CMDS_AUTH_TOKEN")
  @js.native
  val ENV_CMDS_AUTH_TOKEN: /* "AWS_CONTAINER_AUTHORIZATION_TOKEN" */ String = js.native
  
  @JSImport("@aws-sdk/credential-provider-imds", "ENV_CMDS_FULL_URI")
  @js.native
  val ENV_CMDS_FULL_URI: /* "AWS_CONTAINER_CREDENTIALS_FULL_URI" */ String = js.native
  
  @JSImport("@aws-sdk/credential-provider-imds", "ENV_CMDS_RELATIVE_URI")
  @js.native
  val ENV_CMDS_RELATIVE_URI: /* "AWS_CONTAINER_CREDENTIALS_RELATIVE_URI" */ String = js.native
  
  @JSImport("@aws-sdk/credential-provider-imds", "fromContainerMetadata")
  @js.native
  def fromContainerMetadata(): CredentialProvider = js.native
  @JSImport("@aws-sdk/credential-provider-imds", "fromContainerMetadata")
  @js.native
  def fromContainerMetadata(init: RemoteProviderInit): CredentialProvider = js.native
  
  @JSImport("@aws-sdk/credential-provider-imds", "fromInstanceMetadata")
  @js.native
  def fromInstanceMetadata(): CredentialProvider = js.native
  @JSImport("@aws-sdk/credential-provider-imds", "fromInstanceMetadata")
  @js.native
  def fromInstanceMetadata(init: RemoteProviderInit): CredentialProvider = js.native
  
  @JSImport("@aws-sdk/credential-provider-imds", "providerConfigFromInit")
  @js.native
  def providerConfigFromInit(hasMaxRetriesTimeout: RemoteProviderInit): RemoteProviderConfig = js.native
}
