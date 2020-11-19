package typingsSlinky.libsodiumWrappersSumo.mod

import typingsSlinky.libsodiumWrappers.mod.StateAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libsodium-wrappers-sumo", "crypto_generichash_update")
@js.native
object cryptoGenerichashUpdate extends js.Object {
  
  def apply(state_address: StateAddress, message_chunk: String): Unit = js.native
  def apply(state_address: StateAddress, message_chunk: js.typedarray.Uint8Array): Unit = js.native
}
