package typingsSlinky.libsodiumWrappersSumo.mod

import typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
import typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import typingsSlinky.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_shorthash")
@js.native
object cryptoShorthash extends js.Object {
  def apply(message: String, key: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(message: String, key: scala.scalajs.js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(message: String, key: scala.scalajs.js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(message: Uint8Array, key: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(message: Uint8Array, key: scala.scalajs.js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(
    message: Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
}

