package typingsSlinky.easyXHeaders.cryptoMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("crypto", "pbkdf2")
@js.native
object pbkdf2 extends js.Object {
  
  def apply(
    password: String,
    salt: String,
    iterations: Double,
    keylen: Double,
    callback: js.Function2[/* err */ js.Error, /* derivedKey */ Buffer, _]
  ): Unit = js.native
  def apply(
    password: String,
    salt: String,
    iterations: Double,
    keylen: Double,
    digest: String,
    callback: js.Function2[/* err */ js.Error, /* derivedKey */ Buffer, _]
  ): Unit = js.native
}
