package typingsSlinky.node.cryptoMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("crypto", "sign")
@js.native
object sign extends js.Object {
  
  def apply(algorithm: js.UndefOr[scala.Nothing], data: ArrayBufferView, key: KeyLike): Buffer = js.native
  def apply(algorithm: js.UndefOr[scala.Nothing], data: ArrayBufferView, key: SignPrivateKeyInput): Buffer = js.native
  /**
    * Calculates and returns the signature for `data` using the given private key and
    * algorithm. If `algorithm` is `null` or `undefined`, then the algorithm is
    * dependent upon the key type (especially Ed25519 and Ed448).
    *
    * If `key` is not a [`KeyObject`][], this function behaves as if `key` had been
    * passed to [`crypto.createPrivateKey()`][].
    */
  def apply(algorithm: String, data: ArrayBufferView, key: KeyLike): Buffer = js.native
  def apply(algorithm: String, data: ArrayBufferView, key: SignPrivateKeyInput): Buffer = js.native
  def apply(algorithm: Null, data: ArrayBufferView, key: KeyLike): Buffer = js.native
  def apply(algorithm: Null, data: ArrayBufferView, key: SignPrivateKeyInput): Buffer = js.native
}
