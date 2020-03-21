package typingsSlinky.libsodiumWrappersSumo.mod

import typingsSlinky.libsodiumWrappers.mod.CryptoBox
import typingsSlinky.libsodiumWrappers.mod.StringCryptoBox
import typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
import typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import typingsSlinky.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_encrypt_detached")
@js.native
object cryptoAeadChacha20poly1305EncryptDetached extends js.Object {
  def apply(
    message: String,
    additional_data: String,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def apply(
    message: String,
    additional_data: String,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: String,
    additional_data: String,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def apply(
    message: String,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def apply(
    message: String,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: String,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def apply(
    message: String,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def apply(
    message: String,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: String,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def apply(
    message: String,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def apply(
    message: String,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: String,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def apply(
    message: String,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def apply(
    message: String,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: String,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def apply(
    message: String,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def apply(
    message: String,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: String,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def apply(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def apply(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def apply(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def apply(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def apply(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def apply(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: String,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def apply(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def apply(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def apply(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def apply(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def apply(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def apply(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: Uint8Array,
    additional_data: String,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def apply(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def apply(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def apply(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def apply(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def apply(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def apply(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: Uint8Array,
    additional_data: Null,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def apply(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def apply(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: String,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def apply(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def apply(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Null,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
  def apply(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): CryptoBox = js.native
  def apply(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: Uint8Array,
    additional_data: Uint8Array,
    secret_nonce: Uint8Array,
    public_nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): CryptoBox = js.native
}

