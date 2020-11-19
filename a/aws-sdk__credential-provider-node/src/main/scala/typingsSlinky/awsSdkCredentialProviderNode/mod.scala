package typingsSlinky.awsSdkCredentialProviderNode

import typingsSlinky.awsSdkCredentialProviderImds.remoteProviderInitMod.RemoteProviderInit
import typingsSlinky.awsSdkCredentialProviderIni.mod.FromIniInit
import typingsSlinky.awsSdkTypes.credentialsMod.CredentialProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/credential-provider-node", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val ENV_IMDS_DISABLED: /* "AWS_EC2_METADATA_DISABLED" */ String = js.native
  
  def defaultProvider(): CredentialProvider = js.native
  def defaultProvider(init: FromIniInit with RemoteProviderInit): CredentialProvider = js.native
}
