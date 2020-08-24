package typingsSlinky.libsodiumWrappers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_aead_xchacha20poly1305_ietf_encrypt_detached")
@js.native
object cryptoAeadXchacha20poly1305IetfEncryptDetached extends js.Object {
  def apply(
    message: String | js.typedarray.Uint8Array,
    additional_data: String | js.typedarray.Uint8Array | Null,
    secret_nonce: String | js.typedarray.Uint8Array | Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: js.UndefOr[Uint8ArrayOutputFormat | Null]
  ): CryptoBox = js.native
  def apply(
    message: String,
    additional_data: String,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: String,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: String,
    additional_data: String,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: String,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: String,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: String,
    additional_data: Null,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: String,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: String,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: String,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: js.typedarray.Uint8Array,
    additional_data: String,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: js.typedarray.Uint8Array,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: js.typedarray.Uint8Array,
    additional_data: String,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: js.typedarray.Uint8Array,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: js.typedarray.Uint8Array,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: js.typedarray.Uint8Array,
    additional_data: Null,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
}

