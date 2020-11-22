package typingsSlinky.libp2pCrypto.mod.aes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libp2p-crypto", "aes.create")
@js.native
object create extends js.Object {
  
  /**
    * Create a new AES Cipher.
    * @param key The key, if length 16 then AES 128 is used. For length 32, AES 256 is used.
    * @param iv Must have length 16.
    */
  def apply(key: js.typedarray.Uint8Array, iv: js.typedarray.Uint8Array): js.Promise[Cipher] = js.native
}
