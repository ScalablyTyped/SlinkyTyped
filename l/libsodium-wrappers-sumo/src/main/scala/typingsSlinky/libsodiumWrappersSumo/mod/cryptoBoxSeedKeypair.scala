package typingsSlinky.libsodiumWrappersSumo.mod

import typingsSlinky.libsodiumWrappers.mod.KeyPair
import typingsSlinky.libsodiumWrappers.mod.StringKeyPair
import typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
import typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_box_seed_keypair")
@js.native
object cryptoBoxSeedKeypair extends js.Object {
  def apply(seed: js.typedarray.Uint8Array): KeyPair = js.native
  def apply(seed: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): StringKeyPair = js.native
  def apply(seed: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): KeyPair = js.native
}

