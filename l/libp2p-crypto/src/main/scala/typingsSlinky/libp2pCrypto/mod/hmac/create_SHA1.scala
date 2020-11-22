package typingsSlinky.libp2pCrypto.mod.hmac

import typingsSlinky.libp2pCrypto.libp2pCryptoStrings.SHA1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libp2p-crypto", "hmac.create")
@js.native
object create_SHA1 extends js.Object {
  
  /**
    * Create a new HMAC Digest.
    */
  def apply(hash: SHA1, secret: js.typedarray.Uint8Array): js.Promise[Digest] = js.native
}
