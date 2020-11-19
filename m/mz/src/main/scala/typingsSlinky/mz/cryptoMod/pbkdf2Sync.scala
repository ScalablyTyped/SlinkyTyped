package typingsSlinky.mz.cryptoMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.cryptoMod.BinaryLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mz/crypto", "pbkdf2Sync")
@js.native
object pbkdf2Sync extends js.Object {
  
  def apply(password: BinaryLike, salt: BinaryLike, iterations: Double, keylen: Double, digest: String): Buffer = js.native
}
