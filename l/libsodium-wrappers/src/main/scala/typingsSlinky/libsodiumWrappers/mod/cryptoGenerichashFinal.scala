package typingsSlinky.libsodiumWrappers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_generichash_final")
@js.native
object cryptoGenerichashFinal extends js.Object {
  def apply(state_address: StateAddress, hash_length: Double): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(state_address: StateAddress, hash_length: Double, outputFormat: StringOutputFormat): String = js.native
  def apply(state_address: StateAddress, hash_length: Double, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
}

