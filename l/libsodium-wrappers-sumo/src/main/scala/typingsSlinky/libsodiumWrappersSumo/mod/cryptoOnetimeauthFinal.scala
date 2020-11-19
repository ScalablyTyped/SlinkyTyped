package typingsSlinky.libsodiumWrappersSumo.mod

import typingsSlinky.libsodiumWrappers.mod.StateAddress
import typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
import typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libsodium-wrappers-sumo", "crypto_onetimeauth_final")
@js.native
object cryptoOnetimeauthFinal extends js.Object {
  
  def apply(state_address: StateAddress): js.typedarray.Uint8Array = js.native
  def apply(state_address: StateAddress, outputFormat: StringOutputFormat): String = js.native
  def apply(state_address: StateAddress, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = js.native
}
