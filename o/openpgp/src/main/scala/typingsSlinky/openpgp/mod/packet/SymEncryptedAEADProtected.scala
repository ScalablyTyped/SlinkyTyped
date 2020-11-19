package typingsSlinky.openpgp.mod.packet

import typingsSlinky.openpgp.mod.ReadableStream
import typingsSlinky.openpgp.openpgpStrings.decrypt
import typingsSlinky.openpgp.openpgpStrings.encrypt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openpgp", "packet.SymEncryptedAEADProtected")
@js.native
/**
  * Implementation of the Symmetrically Encrypted Authenticated Encryption with
  * Additional Data (AEAD) Protected Data Packet
  * {@link https://tools.ietf.org/html/draft-ford-openpgp-format-00#section-2.1}:
  * AEAD Protected Data Packet
  */
class SymEncryptedAEADProtected () extends js.Object {
  
  @JSName("crypt")
  def crypt_decrypt(
    fn: decrypt,
    key: js.typedarray.Uint8Array,
    data: ReadableStream[js.typedarray.Uint8Array],
    streaming: Boolean
  ): js.typedarray.Uint8Array | ReadableStream[js.typedarray.Uint8Array] = js.native
  @JSName("crypt")
  def crypt_decrypt(fn: decrypt, key: js.typedarray.Uint8Array, data: js.typedarray.Uint8Array, streaming: Boolean): js.typedarray.Uint8Array | ReadableStream[js.typedarray.Uint8Array] = js.native
  @JSName("crypt")
  def crypt_encrypt(
    fn: encrypt,
    key: js.typedarray.Uint8Array,
    data: ReadableStream[js.typedarray.Uint8Array],
    streaming: Boolean
  ): js.typedarray.Uint8Array | ReadableStream[js.typedarray.Uint8Array] = js.native
  /**
    * En/decrypt the payload.
    * @param fn Whether to encrypt or decrypt
    * @param key The session key used to en/decrypt the payload
    * @param data The data to en/decrypt
    * @param streaming Whether the top-level function will return a stream
    * @returns
    */
  @JSName("crypt")
  def crypt_encrypt(fn: encrypt, key: js.typedarray.Uint8Array, data: js.typedarray.Uint8Array, streaming: Boolean): js.typedarray.Uint8Array | ReadableStream[js.typedarray.Uint8Array] = js.native
  
  /**
    * Decrypt the encrypted payload.
    * @param sessionKeyAlgorithm The session key's cipher algorithm e.g. 'aes128'
    * @param key The session key used to encrypt the payload
    * @param streaming Whether the top-level function will return a stream
    * @returns
    */
  def decrypt(sessionKeyAlgorithm: String, key: js.typedarray.Uint8Array, streaming: Boolean): Boolean = js.native
  
  /**
    * Encrypt the packet list payload.
    * @param sessionKeyAlgorithm The session key's cipher algorithm e.g. 'aes128'
    * @param key The session key used to encrypt the payload
    * @param streaming Whether the top-level function will return a stream
    */
  def encrypt(sessionKeyAlgorithm: String, key: js.typedarray.Uint8Array, streaming: Boolean): Unit = js.native
  
  def read(bytes: ReadableStream[js.typedarray.Uint8Array]): Unit = js.native
  /**
    * Parse an encrypted payload of bytes in the order: version, IV, ciphertext (see specification)
    * @param bytes
    */
  def read(bytes: js.typedarray.Uint8Array): Unit = js.native
  
  /**
    * Write the encrypted payload of bytes in the order: version, IV, ciphertext (see specification)
    * @returns The encrypted payload
    */
  def write(): js.typedarray.Uint8Array | ReadableStream[js.typedarray.Uint8Array] = js.native
}
