package typingsSlinky.libsodiumWrappers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libsodium-wrappers", "crypto_pwhash_str")
@js.native
object cryptoPwhashStr extends js.Object {
  
  def apply(password: String, opsLimit: Double, memLimit: Double): String = js.native
  def apply(password: js.typedarray.Uint8Array, opsLimit: Double, memLimit: Double): String = js.native
}
