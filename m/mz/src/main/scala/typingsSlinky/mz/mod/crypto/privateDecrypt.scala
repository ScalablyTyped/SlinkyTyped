package typingsSlinky.mz.mod.crypto

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ArrayBufferView
import typingsSlinky.node.cryptoMod.KeyLike
import typingsSlinky.node.cryptoMod.RsaPrivateKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mz", "crypto.privateDecrypt")
@js.native
object privateDecrypt extends js.Object {
  
  def apply(private_key: KeyLike, buffer: ArrayBufferView): Buffer = js.native
  def apply(private_key: RsaPrivateKey, buffer: ArrayBufferView): Buffer = js.native
}
