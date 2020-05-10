package typingsSlinky.libsodiumWrappers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_sign_open")
@js.native
object cryptoSignOpen extends js.Object {
  def apply(signedMessage: String, publicKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def apply(signedMessage: String, publicKey: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(signedMessage: String, publicKey: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): js.typedarray.Uint8Array = js.native
  def apply(signedMessage: js.typedarray.Uint8Array, publicKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def apply(
    signedMessage: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    signedMessage: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = js.native
}

