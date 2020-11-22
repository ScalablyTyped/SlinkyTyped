package typingsSlinky.libp2pCrypto.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libp2p-crypto", "pbkdf2")
@js.native
object pbkdf2 extends js.Object {
  
  def apply(password: String, salt: String, iterations: Double, keySize: Double, hash: String): js.typedarray.Uint8Array = js.native
  def apply(
    password: String,
    salt: js.typedarray.Uint8Array,
    iterations: Double,
    keySize: Double,
    hash: String
  ): js.typedarray.Uint8Array = js.native
  def apply(
    password: js.typedarray.Uint8Array,
    salt: String,
    iterations: Double,
    keySize: Double,
    hash: String
  ): js.typedarray.Uint8Array = js.native
  def apply(
    password: js.typedarray.Uint8Array,
    salt: js.typedarray.Uint8Array,
    iterations: Double,
    keySize: Double,
    hash: String
  ): js.typedarray.Uint8Array = js.native
}
