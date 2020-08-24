package typingsSlinky.asmcryptoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js", "AES_GCM")
@js.native
class AES_GCM protected ()
  extends typingsSlinky.asmcryptoJs.gcmMod.AES_GCM {
  def this(key: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array) = this()
  def this(key: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array, adata: js.typedarray.Uint8Array) = this()
  def this(
    key: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    adata: js.UndefOr[scala.Nothing],
    tagSize: Double
  ) = this()
  def this(
    key: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    adata: js.typedarray.Uint8Array,
    tagSize: Double
  ) = this()
}

/* static members */
@JSImport("asmcrypto.js", "AES_GCM")
@js.native
object AES_GCM extends js.Object {
  def decrypt(
    ciphertext: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = js.native
  def decrypt(
    ciphertext: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    adata: js.UndefOr[scala.Nothing],
    tagsize: Double
  ): js.typedarray.Uint8Array = js.native
  def decrypt(
    ciphertext: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    adata: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = js.native
  def decrypt(
    ciphertext: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    adata: js.typedarray.Uint8Array,
    tagsize: Double
  ): js.typedarray.Uint8Array = js.native
  def encrypt(
    cleartext: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = js.native
  def encrypt(
    cleartext: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    adata: js.UndefOr[scala.Nothing],
    tagsize: Double
  ): js.typedarray.Uint8Array = js.native
  def encrypt(
    cleartext: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    adata: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = js.native
  def encrypt(
    cleartext: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    adata: js.typedarray.Uint8Array,
    tagsize: Double
  ): js.typedarray.Uint8Array = js.native
}

