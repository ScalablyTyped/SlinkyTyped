package typingsSlinky.libsodiumWrappersSumo.mod

import typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
import typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_generichash")
@js.native
object cryptoGenerichash extends js.Object {
  def apply(hash_length: Double, message: String): js.typedarray.Uint8Array = js.native
  def apply(
    hash_length: Double,
    message: String,
    key: js.UndefOr[scala.Nothing],
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = js.native
  def apply(hash_length: Double, message: String, key: String): js.typedarray.Uint8Array = js.native
  def apply(hash_length: Double, message: String, key: String, outputFormat: StringOutputFormat): String = js.native
  def apply(hash_length: Double, message: String, key: String, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = js.native
  def apply(hash_length: Double, message: String, key: Null, outputFormat: StringOutputFormat): String = js.native
  def apply(hash_length: Double, message: String, key: Null, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = js.native
  def apply(hash_length: Double, message: String, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def apply(
    hash_length: Double,
    message: String,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    hash_length: Double,
    message: String,
    key: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = js.native
  def apply(hash_length: Double, message: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def apply(
    hash_length: Double,
    message: js.typedarray.Uint8Array,
    key: js.UndefOr[scala.Nothing],
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = js.native
  def apply(hash_length: Double, message: js.typedarray.Uint8Array, key: String): js.typedarray.Uint8Array = js.native
  def apply(
    hash_length: Double,
    message: js.typedarray.Uint8Array,
    key: String,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    hash_length: Double,
    message: js.typedarray.Uint8Array,
    key: String,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = js.native
  def apply(
    hash_length: Double,
    message: js.typedarray.Uint8Array,
    key: Null,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    hash_length: Double,
    message: js.typedarray.Uint8Array,
    key: Null,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = js.native
  def apply(hash_length: Double, message: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def apply(
    hash_length: Double,
    message: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    hash_length: Double,
    message: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = js.native
}

