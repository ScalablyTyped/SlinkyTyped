package typingsSlinky.awsSdkMiddlewareSigning.configurationsMod

import typingsSlinky.awsSdkTypes.credentialsMod.Credentials
import typingsSlinky.awsSdkTypes.signatureMod.RequestSigner
import typingsSlinky.awsSdkTypes.utilMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsAuthResolvedConfig extends js.Object {
  
  def credentials(): js.Promise[Credentials] = js.native
  @JSName("credentials")
  var credentials_Original: Provider[Credentials] = js.native
  
  def signer(): js.Promise[RequestSigner] = js.native
  @JSName("signer")
  var signer_Original: Provider[RequestSigner] = js.native
  
  var signingEscapePath: Boolean = js.native
  
  var systemClockOffset: Double = js.native
}
