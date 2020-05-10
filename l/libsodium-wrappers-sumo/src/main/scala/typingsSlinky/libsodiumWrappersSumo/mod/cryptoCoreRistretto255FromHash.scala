package typingsSlinky.libsodiumWrappersSumo.mod

import typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
import typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_from_hash")
@js.native
object cryptoCoreRistretto255FromHash extends js.Object {
  def apply(r: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def apply(r: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(r: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = js.native
}

