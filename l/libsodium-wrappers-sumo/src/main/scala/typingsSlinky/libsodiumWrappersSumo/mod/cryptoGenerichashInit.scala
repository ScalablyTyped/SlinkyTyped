package typingsSlinky.libsodiumWrappersSumo.mod

import typingsSlinky.libsodiumWrappers.mod.StateAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_generichash_init")
@js.native
object cryptoGenerichashInit extends js.Object {
  def apply(key: String, hash_length: Double): StateAddress = js.native
  def apply(key: Null, hash_length: Double): StateAddress = js.native
  def apply(key: js.typedarray.Uint8Array, hash_length: Double): StateAddress = js.native
}

