package typingsSlinky.awsSdkCredentialProviderImds

import typingsSlinky.awsSdkCredentialProviderImds.remoteProviderInitMod.RemoteProviderInit
import typingsSlinky.awsSdkTypes.credentialsMod.CredentialProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromContainerMetadataMod {
  
  @JSImport("@aws-sdk/credential-provider-imds/dist/cjs/fromContainerMetadata", "ENV_CMDS_AUTH_TOKEN")
  @js.native
  val ENV_CMDS_AUTH_TOKEN: /* "AWS_CONTAINER_AUTHORIZATION_TOKEN" */ String = js.native
  
  @JSImport("@aws-sdk/credential-provider-imds/dist/cjs/fromContainerMetadata", "ENV_CMDS_FULL_URI")
  @js.native
  val ENV_CMDS_FULL_URI: /* "AWS_CONTAINER_CREDENTIALS_FULL_URI" */ String = js.native
  
  @JSImport("@aws-sdk/credential-provider-imds/dist/cjs/fromContainerMetadata", "ENV_CMDS_RELATIVE_URI")
  @js.native
  val ENV_CMDS_RELATIVE_URI: /* "AWS_CONTAINER_CREDENTIALS_RELATIVE_URI" */ String = js.native
  
  @JSImport("@aws-sdk/credential-provider-imds/dist/cjs/fromContainerMetadata", "fromContainerMetadata")
  @js.native
  def fromContainerMetadata(): CredentialProvider = js.native
  @JSImport("@aws-sdk/credential-provider-imds/dist/cjs/fromContainerMetadata", "fromContainerMetadata")
  @js.native
  def fromContainerMetadata(init: RemoteProviderInit): CredentialProvider = js.native
}
