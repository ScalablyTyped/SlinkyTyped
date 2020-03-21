package typingsSlinky.libsodiumWrappersSumo.mod

import typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
import typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import typingsSlinky.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_generichash_blake2b_salt_personal")
@js.native
object cryptoGenerichashBlake2bSaltPersonal extends js.Object {
  def apply(
    subkey_len: Double,
    key: String,
    id: scala.scalajs.js.typedarray.Uint8Array,
    ctx: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(
    subkey_len: Double,
    key: String,
    id: scala.scalajs.js.typedarray.Uint8Array,
    ctx: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    subkey_len: Double,
    key: String,
    id: scala.scalajs.js.typedarray.Uint8Array,
    ctx: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(
    subkey_len: Double,
    key: Null,
    id: scala.scalajs.js.typedarray.Uint8Array,
    ctx: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(
    subkey_len: Double,
    key: Null,
    id: scala.scalajs.js.typedarray.Uint8Array,
    ctx: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    subkey_len: Double,
    key: Null,
    id: scala.scalajs.js.typedarray.Uint8Array,
    ctx: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(
    subkey_len: Double,
    key: Uint8Array,
    id: scala.scalajs.js.typedarray.Uint8Array,
    ctx: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(
    subkey_len: Double,
    key: Uint8Array,
    id: scala.scalajs.js.typedarray.Uint8Array,
    ctx: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    subkey_len: Double,
    key: Uint8Array,
    id: scala.scalajs.js.typedarray.Uint8Array,
    ctx: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
}

