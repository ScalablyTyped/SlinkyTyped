package typingsSlinky.libsodiumWrappers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_shorthash")
@js.native
object cryptoShorthash extends js.Object {
  def apply(message: String, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def apply(message: String, key: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(message: String, key: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = js.native
  def apply(message: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def apply(message: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(
    message: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = js.native
}

