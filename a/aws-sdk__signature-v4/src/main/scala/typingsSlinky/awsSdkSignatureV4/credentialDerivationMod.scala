package typingsSlinky.awsSdkSignatureV4

import typingsSlinky.awsSdkTypes.credentialsMod.Credentials
import typingsSlinky.awsSdkTypes.cryptoMod.HashConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/signature-v4/build/credentialDerivation", JSImport.Namespace)
@js.native
object credentialDerivationMod extends js.Object {
  
  def createScope(shortDate: String, region: String, service: String): String = js.native
  
  def getSigningKey(
    sha256Constructor: HashConstructor,
    credentials: Credentials,
    shortDate: String,
    region: String,
    service: String
  ): js.Promise[js.typedarray.Uint8Array] = js.native
}
