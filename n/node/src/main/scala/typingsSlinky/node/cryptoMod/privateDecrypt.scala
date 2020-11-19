package typingsSlinky.node.cryptoMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("crypto", "privateDecrypt")
@js.native
object privateDecrypt extends js.Object {
  
  def apply(private_key: KeyLike, buffer: ArrayBufferView): Buffer = js.native
  def apply(private_key: RsaPrivateKey, buffer: ArrayBufferView): Buffer = js.native
}
