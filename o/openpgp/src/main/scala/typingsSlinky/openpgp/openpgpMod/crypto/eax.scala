package typingsSlinky.openpgp.openpgpMod.crypto

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
  def EAX(cipher: String, key: scala.scalajs.js.typedarray.Uint8Array): Unit = js.native
  /**
    * Decrypt ciphertext input.
    * @param ciphertext The ciphertext input to be decrypted
    * @param nonce The nonce (16 bytes)
    * @param adata Associated data to verify
    * @returns The plaintext output
    */
  def decrypt(
    ciphertext: scala.scalajs.js.typedarray.Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    adata: scala.scalajs.js.typedarray.Uint8Array
  ): js.Promise[scala.scalajs.js.typedarray.Uint8Array] = js.native
  /**
    * Encrypt plaintext input.
    * @param plaintext The cleartext input to be encrypted
    * @param nonce The nonce (16 bytes)
    * @param adata Associated data to sign
    * @returns The ciphertext output
    */
  def encrypt(
    plaintext: scala.scalajs.js.typedarray.Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    adata: scala.scalajs.js.typedarray.Uint8Array
  ): js.Promise[scala.scalajs.js.typedarray.Uint8Array] = js.native
}

