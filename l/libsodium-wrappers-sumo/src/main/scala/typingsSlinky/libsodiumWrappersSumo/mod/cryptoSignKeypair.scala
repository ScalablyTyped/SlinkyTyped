package typingsSlinky.libsodiumWrappersSumo.mod

import typingsSlinky.libsodiumWrappers.mod.KeyPair
import typingsSlinky.libsodiumWrappers.mod.StringKeyPair
import typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
import typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libsodium-wrappers-sumo", "crypto_sign_keypair")
@js.native
object cryptoSignKeypair extends js.Object {
  
  def apply(): KeyPair = js.native
  def apply(outputFormat: StringOutputFormat): StringKeyPair = js.native
  def apply(outputFormat: Uint8ArrayOutputFormat): KeyPair = js.native
}
