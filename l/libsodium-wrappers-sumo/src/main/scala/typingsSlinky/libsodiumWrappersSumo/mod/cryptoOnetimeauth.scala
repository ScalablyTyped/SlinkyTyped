package typingsSlinky.libsodiumWrappersSumo.mod

import typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
import typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_onetimeauth")
@js.native
object cryptoOnetimeauth extends js.Object {
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

