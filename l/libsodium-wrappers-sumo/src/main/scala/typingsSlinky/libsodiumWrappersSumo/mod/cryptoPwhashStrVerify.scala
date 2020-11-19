package typingsSlinky.libsodiumWrappersSumo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libsodium-wrappers-sumo", "crypto_pwhash_str_verify")
@js.native
object cryptoPwhashStrVerify extends js.Object {
  
  def apply(hashed_password: String, password: String): Boolean = js.native
  def apply(hashed_password: String, password: js.typedarray.Uint8Array): Boolean = js.native
}
