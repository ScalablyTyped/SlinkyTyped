package typingsSlinky.node.cryptoMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("crypto", "publicDecrypt")
@js.native
object publicDecrypt extends js.Object {
  
  def apply(key: KeyLike, buffer: ArrayBufferView): Buffer = js.native
  def apply(key: RsaPrivateKey, buffer: ArrayBufferView): Buffer = js.native
  def apply(key: RsaPublicKey, buffer: ArrayBufferView): Buffer = js.native
}
