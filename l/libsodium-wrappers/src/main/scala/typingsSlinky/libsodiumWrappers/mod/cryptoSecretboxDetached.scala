package typingsSlinky.libsodiumWrappers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_secretbox_detached")
@js.native
object cryptoSecretboxDetached extends js.Object {
  def apply(message: String, nonce: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): SecretBox = js.native
  def apply(
    message: String,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringSecretBox = js.native
  def apply(
    message: String,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): SecretBox = js.native
  def apply(message: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): SecretBox = js.native
  def apply(
    message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringSecretBox = js.native
  def apply(
    message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): SecretBox = js.native
}

