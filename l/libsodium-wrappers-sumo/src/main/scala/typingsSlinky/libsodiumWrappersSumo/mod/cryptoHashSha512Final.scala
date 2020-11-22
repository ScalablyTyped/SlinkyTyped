package typingsSlinky.libsodiumWrappersSumo.mod

import typingsSlinky.libsodiumWrappers.mod.StateAddress
import typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
import typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libsodium-wrappers-sumo", "crypto_hash_sha512_final")
@js.native
object cryptoHashSha512Final extends js.Object {
  
  def apply(stateAddress: StateAddress): String = js.native
  def apply(stateAddress: StateAddress, outputFormat: StringOutputFormat): String = js.native
  def apply(stateAddress: StateAddress, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = js.native
}
