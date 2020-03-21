package typingsSlinky.libsodiumWrappers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_kdf_derive_from_key")
@js.native
object cryptoKdfDeriveFromKey extends js.Object {
  def apply(subkey_len: Double, subkey_id: Double, ctx: String, key: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(
    subkey_len: Double,
    subkey_id: Double,
    ctx: String,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    subkey_len: Double,
    subkey_id: Double,
    ctx: String,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
}

