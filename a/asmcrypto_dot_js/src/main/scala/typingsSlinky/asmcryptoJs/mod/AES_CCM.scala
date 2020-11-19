package typingsSlinky.asmcryptoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asmcrypto.js", "AES_CCM")
@js.native
class AES_CCM protected ()
  extends typingsSlinky.asmcryptoJs.ccmMod.AES_CCM {
  def this(
    key: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    adata: js.UndefOr[scala.Nothing],
    tagSize: js.UndefOr[scala.Nothing],
    dataLength: Double
  ) = this()
  def this(
    key: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    adata: js.UndefOr[scala.Nothing],
    tagSize: Double,
    dataLength: Double
  ) = this()
  def this(
    key: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    adata: js.typedarray.Uint8Array,
    tagSize: js.UndefOr[scala.Nothing],
    dataLength: Double
  ) = this()
  def this(
    key: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    adata: js.typedarray.Uint8Array,
    tagSize: Double,
    dataLength: Double
  ) = this()
}
/* static members */
@JSImport("asmcrypto.js", "AES_CCM")
@js.native
object AES_CCM extends js.Object {
  
  def decrypt(cipher: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def decrypt(
    cipher: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    adata: js.UndefOr[scala.Nothing],
    tagsize: Double
  ): js.typedarray.Uint8Array = js.native
  def decrypt(
    cipher: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    adata: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = js.native
  def decrypt(
    cipher: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    adata: js.typedarray.Uint8Array,
    tagsize: Double
  ): js.typedarray.Uint8Array = js.native
  
  def encrypt(clear: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def encrypt(
    clear: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    adata: js.UndefOr[scala.Nothing],
    tagsize: Double
  ): js.typedarray.Uint8Array = js.native
  def encrypt(
    clear: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    adata: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = js.native
  def encrypt(
    clear: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    adata: js.typedarray.Uint8Array,
    tagsize: Double
  ): js.typedarray.Uint8Array = js.native
}
