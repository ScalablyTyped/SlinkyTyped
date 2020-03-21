package typingsSlinky.libsodiumWrappersSumo.mod

import typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
import typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_core_ristretto255_sub")
@js.native
object cryptoCoreRistretto255Sub extends js.Object {
  def apply(p: scala.scalajs.js.typedarray.Uint8Array, q: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(
    p: scala.scalajs.js.typedarray.Uint8Array,
    q: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    p: scala.scalajs.js.typedarray.Uint8Array,
    q: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
}

