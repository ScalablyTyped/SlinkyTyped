package typingsSlinky.mz.cryptoMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ArrayBufferView
import typingsSlinky.node.cryptoMod.KeyLike
import typingsSlinky.node.cryptoMod.RsaPrivateKey
import typingsSlinky.node.cryptoMod.RsaPublicKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/crypto", "publicDecrypt")
@js.native
object publicDecrypt extends js.Object {
  def apply(key: KeyLike, buffer: ArrayBufferView): Buffer = js.native
  def apply(key: RsaPrivateKey, buffer: ArrayBufferView): Buffer = js.native
  def apply(key: RsaPublicKey, buffer: ArrayBufferView): Buffer = js.native
}

