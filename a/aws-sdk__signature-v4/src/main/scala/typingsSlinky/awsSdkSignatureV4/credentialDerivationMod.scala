package typingsSlinky.awsSdkSignatureV4

import typingsSlinky.awsSdkTypes.credentialsMod.Credentials
import typingsSlinky.awsSdkTypes.cryptoMod.HashConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object credentialDerivationMod {
  
  @JSImport("@aws-sdk/signature-v4/dist/cjs/credentialDerivation", "createScope")
  @js.native
  def createScope(shortDate: String, region: String, service: String): String = js.native
  
  @JSImport("@aws-sdk/signature-v4/dist/cjs/credentialDerivation", "getSigningKey")
  @js.native
  def getSigningKey(
    sha256Constructor: HashConstructor,
    credentials: Credentials,
    shortDate: String,
    region: String,
    service: String
  ): js.Promise[js.typedarray.Uint8Array] = js.native
}
