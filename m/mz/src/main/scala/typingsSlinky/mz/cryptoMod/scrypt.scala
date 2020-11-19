package typingsSlinky.mz.cryptoMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.cryptoMod.BinaryLike
import typingsSlinky.node.cryptoMod.ScryptOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mz/crypto", "scrypt")
@js.native
object scrypt extends js.Object {
  
  def apply(
    password: BinaryLike,
    salt: BinaryLike,
    keylen: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* derivedKey */ Buffer, Unit]
  ): Unit = js.native
  def apply(
    password: BinaryLike,
    salt: BinaryLike,
    keylen: Double,
    options: ScryptOptions,
    callback: js.Function2[/* err */ js.Error | Null, /* derivedKey */ Buffer, Unit]
  ): Unit = js.native
}
