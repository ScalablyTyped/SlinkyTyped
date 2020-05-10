package typingsSlinky.openpgp.mod.crypto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "crypto.eax")
@js.native
object eax extends js.Object {
  /**
    * Class to en/decrypt using EAX mode.
    * @param cipher The symmetric cipher algorithm to use e.g. 'aes128'
    * @param key The encryption key
    */
  def EAX(cipher: String, key: js.typedarray.Uint8Array): Unit = js.native
  /**
    * Decrypt ciphertext input.
    * @param ciphertext The ciphertext input to be decrypted
    * @param nonce The nonce (16 bytes)
    * @param adata Associated data to verify
    * @returns The plaintext output
    */
  def decrypt(
    ciphertext: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    adata: js.typedarray.Uint8Array
  ): js.Promise[js.typedarray.Uint8Array] = js.native
  /**
    * Encrypt plaintext input.
    * @param plaintext The cleartext input to be encrypted
    * @param nonce The nonce (16 bytes)
    * @param adata Associated data to sign
    * @returns The ciphertext output
    */
  def encrypt(
    plaintext: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    adata: js.typedarray.Uint8Array
  ): js.Promise[js.typedarray.Uint8Array] = js.native
}

