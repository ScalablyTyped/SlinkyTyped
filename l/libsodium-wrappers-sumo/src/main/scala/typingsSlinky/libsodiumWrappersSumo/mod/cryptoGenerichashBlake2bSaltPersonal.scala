package typingsSlinky.libsodiumWrappersSumo.mod

import typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
import typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_generichash_blake2b_salt_personal")
@js.native
object cryptoGenerichashBlake2bSaltPersonal extends js.Object {
  def apply(subkey_len: Double, key: String, id: js.typedarray.Uint8Array, ctx: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def apply(
    subkey_len: Double,
    key: String,
    id: js.typedarray.Uint8Array,
    ctx: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    subkey_len: Double,
    key: String,
    id: js.typedarray.Uint8Array,
    ctx: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = js.native
  def apply(subkey_len: Double, key: Null, id: js.typedarray.Uint8Array, ctx: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def apply(
    subkey_len: Double,
    key: Null,
    id: js.typedarray.Uint8Array,
    ctx: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    subkey_len: Double,
    key: Null,
    id: js.typedarray.Uint8Array,
    ctx: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = js.native
  def apply(
    subkey_len: Double,
    key: js.typedarray.Uint8Array,
    id: js.typedarray.Uint8Array,
    ctx: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = js.native
  def apply(
    subkey_len: Double,
    key: js.typedarray.Uint8Array,
    id: js.typedarray.Uint8Array,
    ctx: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    subkey_len: Double,
    key: js.typedarray.Uint8Array,
    id: js.typedarray.Uint8Array,
    ctx: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = js.native
}

