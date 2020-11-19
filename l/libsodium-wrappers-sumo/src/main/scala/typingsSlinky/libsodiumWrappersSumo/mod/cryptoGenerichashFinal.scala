package typingsSlinky.libsodiumWrappersSumo.mod

import typingsSlinky.libsodiumWrappers.mod.StateAddress
import typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
import typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libsodium-wrappers-sumo", "crypto_generichash_final")
@js.native
object cryptoGenerichashFinal extends js.Object {
  
  def apply(state_address: StateAddress, hash_length: Double): js.typedarray.Uint8Array = js.native
  def apply(state_address: StateAddress, hash_length: Double, outputFormat: StringOutputFormat): String = js.native
  def apply(state_address: StateAddress, hash_length: Double, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = js.native
}
