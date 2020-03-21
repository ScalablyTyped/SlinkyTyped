package typingsSlinky.libsodiumWrappers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_kx_seed_keypair")
@js.native
object cryptoKxSeedKeypair extends js.Object {
  def apply(seed: scala.scalajs.js.typedarray.Uint8Array): KeyPair = js.native
  def apply(seed: scala.scalajs.js.typedarray.Uint8Array, outputFormat: StringOutputFormat): StringKeyPair = js.native
  def apply(seed: scala.scalajs.js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): KeyPair = js.native
}

