package typingsSlinky.awsSdkSignatureV4

import typingsSlinky.awsSdkSignatureV4.signatureV4Mod.SignatureV4CryptoInit
import typingsSlinky.awsSdkSignatureV4.signatureV4Mod.SignatureV4Init
import typingsSlinky.awsSdkTypes.credentialsMod.Credentials
import typingsSlinky.awsSdkTypes.cryptoMod.HashConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/signature-v4", "SignatureV4")
  @js.native
  class SignatureV4 protected ()
    extends typingsSlinky.awsSdkSignatureV4.signatureV4Mod.SignatureV4 {
    def this(hasApplyChecksumCredentialsRegionServiceSha256UriEscapePath: SignatureV4Init with SignatureV4CryptoInit) = this()
  }
  
  @JSImport("@aws-sdk/signature-v4", "createScope")
  @js.native
  def createScope(shortDate: String, region: String, service: String): String = js.native
  
  @JSImport("@aws-sdk/signature-v4", "getSigningKey")
  @js.native
  def getSigningKey(
    sha256Constructor: HashConstructor,
    credentials: Credentials,
    shortDate: String,
    region: String,
    service: String
  ): js.Promise[js.typedarray.Uint8Array] = js.native
}
