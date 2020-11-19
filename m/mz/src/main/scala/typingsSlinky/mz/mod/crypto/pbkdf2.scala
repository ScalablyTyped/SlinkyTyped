package typingsSlinky.mz.mod.crypto

import typingsSlinky.node.Buffer
import typingsSlinky.node.cryptoMod.BinaryLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mz", "crypto.pbkdf2")
@js.native
object pbkdf2 extends js.Object {
  
  def apply(password: BinaryLike, salt: BinaryLike, iterations: Double, keylen: Double, digest: String): js.Promise[Buffer] = js.native
  def apply(
    password: BinaryLike,
    salt: BinaryLike,
    iterations: Double,
    keylen: Double,
    digest: String,
    callback: js.Function2[/* err */ js.Error | Null, /* derivedKey */ Buffer, _]
  ): Unit = js.native
}
