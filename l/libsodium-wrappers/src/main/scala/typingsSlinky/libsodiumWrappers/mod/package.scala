package typingsSlinky.libsodiumWrappers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def SODIUM_LIBRARY_VERSION_MAJOR: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("SODIUM_LIBRARY_VERSION_MAJOR").asInstanceOf[scala.Double]
  
  @scala.inline
  def SODIUM_LIBRARY_VERSION_MINOR: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("SODIUM_LIBRARY_VERSION_MINOR").asInstanceOf[scala.Double]
  
  @scala.inline
  def SODIUM_VERSION_STRING: java.lang.String = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("SODIUM_VERSION_STRING").asInstanceOf[java.lang.String]
  
  type Uint8ArrayOutputFormat = typingsSlinky.libsodiumWrappers.libsodiumWrappersStrings.uint8array
  
  @scala.inline
  def add(a: js.typedarray.Uint8Array, b: js.typedarray.Uint8Array): scala.Unit = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("add")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def compare(b1: js.typedarray.Uint8Array, b2: js.typedarray.Uint8Array): scala.Double = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("compare")(b1.asInstanceOf[js.Any], b2.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoAeadChacha20poly1305ABYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_ABYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: java.lang.String | js.typedarray.Uint8Array | scala.Null,
    ciphertext: java.lang.String | js.typedarray.Uint8Array,
    additional_data: java.lang.String | js.typedarray.Uint8Array | scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: js.UndefOr[typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat | scala.Null]
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: java.lang.String,
    ciphertext: java.lang.String,
    additional_data: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: java.lang.String,
    ciphertext: java.lang.String,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: java.lang.String,
    ciphertext: java.lang.String,
    additional_data: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: java.lang.String,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: java.lang.String,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: java.lang.String,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: java.lang.String,
    additional_data: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: java.lang.String,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: java.lang.String,
    additional_data: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: scala.Null,
    ciphertext: java.lang.String,
    additional_data: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: scala.Null,
    ciphertext: java.lang.String,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: scala.Null,
    ciphertext: java.lang.String,
    additional_data: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: scala.Null,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: scala.Null,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305Decrypt(
    secret_nonce: scala.Null,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: java.lang.String | js.typedarray.Uint8Array | scala.Null,
    ciphertext: java.lang.String | js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: java.lang.String | js.typedarray.Uint8Array | scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: js.UndefOr[typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat | scala.Null]
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: java.lang.String,
    ciphertext: java.lang.String,
    mac: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: java.lang.String,
    ciphertext: java.lang.String,
    mac: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: java.lang.String,
    ciphertext: java.lang.String,
    mac: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: java.lang.String,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: java.lang.String,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: java.lang.String,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: java.lang.String,
    mac: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: java.lang.String,
    mac: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: java.lang.String,
    mac: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: scala.Null,
    ciphertext: java.lang.String,
    mac: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: scala.Null,
    ciphertext: java.lang.String,
    mac: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: scala.Null,
    ciphertext: java.lang.String,
    mac: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: scala.Null,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: scala.Null,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305DecryptDetached(
    secret_nonce: scala.Null,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def cryptoAeadChacha20poly1305Encrypt(
    message: java.lang.String | js.typedarray.Uint8Array,
    additional_data: java.lang.String | js.typedarray.Uint8Array | scala.Null,
    secret_nonce: java.lang.String | js.typedarray.Uint8Array | scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: js.UndefOr[typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat | scala.Null]
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoAeadChacha20poly1305Encrypt(
    message: java.lang.String,
    additional_data: java.lang.String,
    secret_nonce: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305Encrypt(
    message: java.lang.String,
    additional_data: java.lang.String,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305Encrypt(
    message: java.lang.String,
    additional_data: java.lang.String,
    secret_nonce: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305Encrypt(
    message: java.lang.String,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305Encrypt(
    message: java.lang.String,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305Encrypt(
    message: java.lang.String,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305Encrypt(
    message: java.lang.String,
    additional_data: scala.Null,
    secret_nonce: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305Encrypt(
    message: java.lang.String,
    additional_data: scala.Null,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305Encrypt(
    message: java.lang.String,
    additional_data: scala.Null,
    secret_nonce: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305Encrypt(
    message: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    secret_nonce: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305Encrypt(
    message: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305Encrypt(
    message: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    secret_nonce: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305Encrypt(
    message: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305Encrypt(
    message: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305Encrypt(
    message: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305Encrypt(
    message: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    secret_nonce: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305Encrypt(
    message: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305Encrypt(
    message: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    secret_nonce: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def cryptoAeadChacha20poly1305EncryptDetached(
    message: java.lang.String | js.typedarray.Uint8Array,
    additional_data: java.lang.String | js.typedarray.Uint8Array | scala.Null,
    secret_nonce: java.lang.String | js.typedarray.Uint8Array | scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: js.UndefOr[typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat | scala.Null]
  ): typingsSlinky.libsodiumWrappers.mod.CryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.CryptoBox]
  @scala.inline
  def cryptoAeadChacha20poly1305EncryptDetached(
    message: java.lang.String,
    additional_data: java.lang.String,
    secret_nonce: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadChacha20poly1305EncryptDetached(
    message: java.lang.String,
    additional_data: java.lang.String,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadChacha20poly1305EncryptDetached(
    message: java.lang.String,
    additional_data: java.lang.String,
    secret_nonce: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadChacha20poly1305EncryptDetached(
    message: java.lang.String,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadChacha20poly1305EncryptDetached(
    message: java.lang.String,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadChacha20poly1305EncryptDetached(
    message: java.lang.String,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadChacha20poly1305EncryptDetached(
    message: java.lang.String,
    additional_data: scala.Null,
    secret_nonce: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadChacha20poly1305EncryptDetached(
    message: java.lang.String,
    additional_data: scala.Null,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadChacha20poly1305EncryptDetached(
    message: java.lang.String,
    additional_data: scala.Null,
    secret_nonce: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadChacha20poly1305EncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    secret_nonce: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadChacha20poly1305EncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadChacha20poly1305EncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    secret_nonce: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadChacha20poly1305EncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadChacha20poly1305EncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadChacha20poly1305EncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadChacha20poly1305EncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    secret_nonce: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadChacha20poly1305EncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadChacha20poly1305EncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    secret_nonce: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  
  @scala.inline
  def cryptoAeadChacha20poly1305IetfABYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_ietf_ABYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: java.lang.String | js.typedarray.Uint8Array | scala.Null,
    ciphertext: java.lang.String | js.typedarray.Uint8Array,
    additional_data: java.lang.String | js.typedarray.Uint8Array | scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: js.UndefOr[typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat | scala.Null]
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: java.lang.String,
    ciphertext: java.lang.String,
    additional_data: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: java.lang.String,
    ciphertext: java.lang.String,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: java.lang.String,
    ciphertext: java.lang.String,
    additional_data: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: java.lang.String,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: java.lang.String,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: java.lang.String,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: java.lang.String,
    additional_data: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: java.lang.String,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: java.lang.String,
    additional_data: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: scala.Null,
    ciphertext: java.lang.String,
    additional_data: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: scala.Null,
    ciphertext: java.lang.String,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: scala.Null,
    ciphertext: java.lang.String,
    additional_data: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: scala.Null,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: scala.Null,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfDecrypt(
    secret_nonce: scala.Null,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: java.lang.String | js.typedarray.Uint8Array | scala.Null,
    ciphertext: java.lang.String | js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: java.lang.String | js.typedarray.Uint8Array | scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: js.UndefOr[typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat | scala.Null]
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: java.lang.String,
    ciphertext: java.lang.String,
    mac: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: java.lang.String,
    ciphertext: java.lang.String,
    mac: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: java.lang.String,
    ciphertext: java.lang.String,
    mac: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: java.lang.String,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: java.lang.String,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: java.lang.String,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: java.lang.String,
    mac: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: java.lang.String,
    mac: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: java.lang.String,
    mac: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: scala.Null,
    ciphertext: java.lang.String,
    mac: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: scala.Null,
    ciphertext: java.lang.String,
    mac: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: scala.Null,
    ciphertext: java.lang.String,
    mac: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: scala.Null,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: scala.Null,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfDecryptDetached(
    secret_nonce: scala.Null,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def cryptoAeadChacha20poly1305IetfEncrypt(
    message: java.lang.String | js.typedarray.Uint8Array,
    additional_data: java.lang.String | js.typedarray.Uint8Array | scala.Null,
    secret_nonce: java.lang.String | js.typedarray.Uint8Array | scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: js.UndefOr[typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat | scala.Null]
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfEncrypt(
    message: java.lang.String,
    additional_data: java.lang.String,
    secret_nonce: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfEncrypt(
    message: java.lang.String,
    additional_data: java.lang.String,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfEncrypt(
    message: java.lang.String,
    additional_data: java.lang.String,
    secret_nonce: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfEncrypt(
    message: java.lang.String,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfEncrypt(
    message: java.lang.String,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfEncrypt(
    message: java.lang.String,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfEncrypt(
    message: java.lang.String,
    additional_data: scala.Null,
    secret_nonce: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfEncrypt(
    message: java.lang.String,
    additional_data: scala.Null,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfEncrypt(
    message: java.lang.String,
    additional_data: scala.Null,
    secret_nonce: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfEncrypt(
    message: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    secret_nonce: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfEncrypt(
    message: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfEncrypt(
    message: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    secret_nonce: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfEncrypt(
    message: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfEncrypt(
    message: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfEncrypt(
    message: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfEncrypt(
    message: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    secret_nonce: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfEncrypt(
    message: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfEncrypt(
    message: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    secret_nonce: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: java.lang.String | js.typedarray.Uint8Array,
    additional_data: java.lang.String | js.typedarray.Uint8Array | scala.Null,
    secret_nonce: java.lang.String | js.typedarray.Uint8Array | scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: js.UndefOr[typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat | scala.Null]
  ): typingsSlinky.libsodiumWrappers.mod.CryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.CryptoBox]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: java.lang.String,
    additional_data: java.lang.String,
    secret_nonce: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: java.lang.String,
    additional_data: java.lang.String,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: java.lang.String,
    additional_data: java.lang.String,
    secret_nonce: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: java.lang.String,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: java.lang.String,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: java.lang.String,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: java.lang.String,
    additional_data: scala.Null,
    secret_nonce: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: java.lang.String,
    additional_data: scala.Null,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: java.lang.String,
    additional_data: scala.Null,
    secret_nonce: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    secret_nonce: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    secret_nonce: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    secret_nonce: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfEncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    secret_nonce: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  
  @scala.inline
  def cryptoAeadChacha20poly1305IetfKEYBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_ietf_KEYBYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoAeadChacha20poly1305IetfKeygen(): js.typedarray.Uint8Array = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_keygen")().asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfKeygen(outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat): java.lang.String = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305IetfKeygen(outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat): js.typedarray.Uint8Array = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_ietf_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def cryptoAeadChacha20poly1305IetfMESSAGEBYTESMAX: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_ietf_MESSAGEBYTES_MAX").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoAeadChacha20poly1305IetfNPUBBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_ietf_NPUBBYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoAeadChacha20poly1305IetfNSECBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_ietf_NSECBYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoAeadChacha20poly1305KEYBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_KEYBYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoAeadChacha20poly1305Keygen(): js.typedarray.Uint8Array = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_keygen")().asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoAeadChacha20poly1305Keygen(outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat): java.lang.String = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadChacha20poly1305Keygen(outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat): js.typedarray.Uint8Array = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_chacha20poly1305_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def cryptoAeadChacha20poly1305MESSAGEBYTESMAX: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_MESSAGEBYTES_MAX").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoAeadChacha20poly1305NPUBBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_NPUBBYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoAeadChacha20poly1305NSECBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_NSECBYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfABYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_xchacha20poly1305_ietf_ABYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: java.lang.String | js.typedarray.Uint8Array | scala.Null,
    ciphertext: java.lang.String | js.typedarray.Uint8Array,
    additional_data: java.lang.String | js.typedarray.Uint8Array | scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: js.UndefOr[typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat | scala.Null]
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: java.lang.String,
    ciphertext: java.lang.String,
    additional_data: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: java.lang.String,
    ciphertext: java.lang.String,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: java.lang.String,
    ciphertext: java.lang.String,
    additional_data: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: java.lang.String,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: java.lang.String,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: java.lang.String,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: java.lang.String,
    additional_data: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: java.lang.String,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: java.lang.String,
    additional_data: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: scala.Null,
    ciphertext: java.lang.String,
    additional_data: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: scala.Null,
    ciphertext: java.lang.String,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: scala.Null,
    ciphertext: java.lang.String,
    additional_data: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: scala.Null,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: scala.Null,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfDecrypt(
    secret_nonce: scala.Null,
    ciphertext: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: java.lang.String | js.typedarray.Uint8Array | scala.Null,
    ciphertext: java.lang.String | js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: java.lang.String | js.typedarray.Uint8Array | scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: js.UndefOr[typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat | scala.Null]
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: java.lang.String,
    ciphertext: java.lang.String,
    mac: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: java.lang.String,
    ciphertext: java.lang.String,
    mac: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: java.lang.String,
    ciphertext: java.lang.String,
    mac: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: java.lang.String,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: java.lang.String,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: java.lang.String,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: java.lang.String,
    mac: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: java.lang.String,
    mac: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: java.lang.String,
    mac: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: js.typedarray.Uint8Array,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: scala.Null,
    ciphertext: java.lang.String,
    mac: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: scala.Null,
    ciphertext: java.lang.String,
    mac: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: scala.Null,
    ciphertext: java.lang.String,
    mac: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: scala.Null,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: scala.Null,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfDecryptDetached(
    secret_nonce: scala.Null,
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_decrypt_detached")(secret_nonce.asInstanceOf[js.Any], ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: java.lang.String | js.typedarray.Uint8Array,
    additional_data: java.lang.String | js.typedarray.Uint8Array | scala.Null,
    secret_nonce: java.lang.String | js.typedarray.Uint8Array | scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: js.UndefOr[typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat | scala.Null]
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: java.lang.String,
    additional_data: java.lang.String,
    secret_nonce: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: java.lang.String,
    additional_data: java.lang.String,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: java.lang.String,
    additional_data: java.lang.String,
    secret_nonce: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: java.lang.String,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: java.lang.String,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: java.lang.String,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: java.lang.String,
    additional_data: scala.Null,
    secret_nonce: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: java.lang.String,
    additional_data: scala.Null,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: java.lang.String,
    additional_data: scala.Null,
    secret_nonce: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    secret_nonce: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    secret_nonce: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    secret_nonce: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfEncrypt(
    message: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    secret_nonce: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: java.lang.String | js.typedarray.Uint8Array,
    additional_data: java.lang.String | js.typedarray.Uint8Array | scala.Null,
    secret_nonce: java.lang.String | js.typedarray.Uint8Array | scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: js.UndefOr[typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat | scala.Null]
  ): typingsSlinky.libsodiumWrappers.mod.CryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.CryptoBox]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: java.lang.String,
    additional_data: java.lang.String,
    secret_nonce: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: java.lang.String,
    additional_data: java.lang.String,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: java.lang.String,
    additional_data: java.lang.String,
    secret_nonce: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: java.lang.String,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: java.lang.String,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: java.lang.String,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: java.lang.String,
    additional_data: scala.Null,
    secret_nonce: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: java.lang.String,
    additional_data: scala.Null,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: java.lang.String,
    additional_data: scala.Null,
    secret_nonce: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    secret_nonce: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: java.lang.String,
    secret_nonce: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    secret_nonce: java.lang.String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfEncryptDetached(
    message: js.typedarray.Uint8Array,
    additional_data: scala.Null,
    secret_nonce: scala.Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_encrypt_detached")(message.asInstanceOf[js.Any], additional_data.asInstanceOf[js.Any], secret_nonce.asInstanceOf[js.Any], public_nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfKEYBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_xchacha20poly1305_ietf_KEYBYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfKeygen(): js.typedarray.Uint8Array = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_keygen")().asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfKeygen(outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat): java.lang.String = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfKeygen(outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat): js.typedarray.Uint8Array = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_aead_xchacha20poly1305_ietf_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfMESSAGEBYTESMAX: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_xchacha20poly1305_ietf_MESSAGEBYTES_MAX").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfNPUBBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_xchacha20poly1305_ietf_NPUBBYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoAeadXchacha20poly1305IetfNSECBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_xchacha20poly1305_ietf_NSECBYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoAuth(message: java.lang.String, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoAuth(
    message: java.lang.String,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAuth(
    message: java.lang.String,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoAuth(message: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoAuth(
    message: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAuth(
    message: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def cryptoAuthBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_auth_BYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoAuthKEYBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_auth_KEYBYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoAuthKeygen(): js.typedarray.Uint8Array = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_keygen")().asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoAuthKeygen(outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat): java.lang.String = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoAuthKeygen(outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat): js.typedarray.Uint8Array = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def cryptoAuthVerify(tag: js.typedarray.Uint8Array, message: java.lang.String, key: js.typedarray.Uint8Array): scala.Boolean = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_verify")(tag.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def cryptoAuthVerify(tag: js.typedarray.Uint8Array, message: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): scala.Boolean = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_auth_verify")(tag.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def cryptoBoxBEFORENMBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_box_BEFORENMBYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoBoxBeforenm(publicKey: js.typedarray.Uint8Array, privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_beforenm")(publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoBoxBeforenm(
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_beforenm")(publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoBoxBeforenm(
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_beforenm")(publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def cryptoBoxDetached(
    message: java.lang.String,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array
  ): typingsSlinky.libsodiumWrappers.mod.CryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_detached")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.CryptoBox]
  @scala.inline
  def cryptoBoxDetached(
    message: java.lang.String,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_detached")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoBoxDetached(
    message: java.lang.String,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.CryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_detached")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.CryptoBox]
  @scala.inline
  def cryptoBoxDetached(
    message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array
  ): typingsSlinky.libsodiumWrappers.mod.CryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_detached")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.CryptoBox]
  @scala.inline
  def cryptoBoxDetached(
    message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_detached")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoBox]
  @scala.inline
  def cryptoBoxDetached(
    message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.CryptoBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_detached")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.CryptoBox]
  
  @scala.inline
  def cryptoBoxEasy(
    message: java.lang.String,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_easy")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoBoxEasy(
    message: java.lang.String,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_easy")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoBoxEasy(
    message: java.lang.String,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_easy")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoBoxEasy(
    message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_easy")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoBoxEasy(
    message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_easy")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoBoxEasy(
    message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_easy")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def cryptoBoxEasyAfternm(message: java.lang.String, nonce: js.typedarray.Uint8Array, sharedKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_easy_afternm")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], sharedKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoBoxEasyAfternm(
    message: java.lang.String,
    nonce: js.typedarray.Uint8Array,
    sharedKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_easy_afternm")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], sharedKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoBoxEasyAfternm(
    message: java.lang.String,
    nonce: js.typedarray.Uint8Array,
    sharedKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_easy_afternm")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], sharedKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoBoxEasyAfternm(
    message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    sharedKey: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_easy_afternm")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], sharedKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoBoxEasyAfternm(
    message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    sharedKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_easy_afternm")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], sharedKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoBoxEasyAfternm(
    message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    sharedKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_easy_afternm")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], sharedKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def cryptoBoxKeypair(): typingsSlinky.libsodiumWrappers.mod.KeyPair = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_keypair")().asInstanceOf[typingsSlinky.libsodiumWrappers.mod.KeyPair]
  @scala.inline
  def cryptoBoxKeypair(outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat): typingsSlinky.libsodiumWrappers.mod.StringKeyPair = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_keypair")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringKeyPair]
  @scala.inline
  def cryptoBoxKeypair(outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat): typingsSlinky.libsodiumWrappers.mod.KeyPair = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_keypair")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.KeyPair]
  
  @scala.inline
  def cryptoBoxMACBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_box_MACBYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoBoxMESSAGEBYTESMAX: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_box_MESSAGEBYTES_MAX").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoBoxNONCEBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_box_NONCEBYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoBoxOpenDetached(
    ciphertext: java.lang.String,
    mac: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_detached")(ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoBoxOpenDetached(
    ciphertext: java.lang.String,
    mac: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_detached")(ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoBoxOpenDetached(
    ciphertext: java.lang.String,
    mac: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_detached")(ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoBoxOpenDetached(
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_detached")(ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoBoxOpenDetached(
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_detached")(ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoBoxOpenDetached(
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_detached")(ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def cryptoBoxOpenEasy(
    ciphertext: java.lang.String,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_easy")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoBoxOpenEasy(
    ciphertext: java.lang.String,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_easy")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoBoxOpenEasy(
    ciphertext: java.lang.String,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_easy")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoBoxOpenEasy(
    ciphertext: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_easy")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoBoxOpenEasy(
    ciphertext: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_easy")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoBoxOpenEasy(
    ciphertext: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_easy")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def cryptoBoxOpenEasyAfternm(ciphertext: java.lang.String, nonce: js.typedarray.Uint8Array, sharedKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_easy_afternm")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], sharedKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoBoxOpenEasyAfternm(
    ciphertext: java.lang.String,
    nonce: js.typedarray.Uint8Array,
    sharedKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_easy_afternm")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], sharedKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoBoxOpenEasyAfternm(
    ciphertext: java.lang.String,
    nonce: js.typedarray.Uint8Array,
    sharedKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_easy_afternm")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], sharedKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoBoxOpenEasyAfternm(
    ciphertext: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    sharedKey: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_easy_afternm")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], sharedKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoBoxOpenEasyAfternm(
    ciphertext: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    sharedKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_easy_afternm")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], sharedKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoBoxOpenEasyAfternm(
    ciphertext: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    sharedKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_open_easy_afternm")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], sharedKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def cryptoBoxPUBLICKEYBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_box_PUBLICKEYBYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoBoxSEALBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_box_SEALBYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoBoxSECRETKEYBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_box_SECRETKEYBYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoBoxSEEDBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_box_SEEDBYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoBoxSeal(message: java.lang.String, publicKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seal")(message.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoBoxSeal(
    message: java.lang.String,
    publicKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seal")(message.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoBoxSeal(
    message: java.lang.String,
    publicKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seal")(message.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoBoxSeal(message: js.typedarray.Uint8Array, publicKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seal")(message.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoBoxSeal(
    message: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seal")(message.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoBoxSeal(
    message: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seal")(message.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def cryptoBoxSealOpen(
    ciphertext: java.lang.String,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seal_open")(ciphertext.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoBoxSealOpen(
    ciphertext: java.lang.String,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seal_open")(ciphertext.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoBoxSealOpen(
    ciphertext: java.lang.String,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seal_open")(ciphertext.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoBoxSealOpen(
    ciphertext: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seal_open")(ciphertext.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoBoxSealOpen(
    ciphertext: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seal_open")(ciphertext.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoBoxSealOpen(
    ciphertext: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seal_open")(ciphertext.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def cryptoBoxSeedKeypair(seed: js.typedarray.Uint8Array): typingsSlinky.libsodiumWrappers.mod.KeyPair = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seed_keypair")(seed.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.KeyPair]
  @scala.inline
  def cryptoBoxSeedKeypair(
    seed: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringKeyPair = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seed_keypair")(seed.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringKeyPair]
  @scala.inline
  def cryptoBoxSeedKeypair(
    seed: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.KeyPair = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_box_seed_keypair")(seed.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.KeyPair]
  
  @scala.inline
  def cryptoGenerichash(hash_length: scala.Double, message: java.lang.String): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoGenerichash(
    hash_length: scala.Double,
    message: java.lang.String,
    key: js.UndefOr[scala.Nothing],
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoGenerichash(hash_length: scala.Double, message: java.lang.String, key: java.lang.String): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoGenerichash(
    hash_length: scala.Double,
    message: java.lang.String,
    key: java.lang.String,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoGenerichash(
    hash_length: scala.Double,
    message: java.lang.String,
    key: java.lang.String,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoGenerichash(hash_length: scala.Double, message: java.lang.String, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoGenerichash(
    hash_length: scala.Double,
    message: java.lang.String,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoGenerichash(
    hash_length: scala.Double,
    message: java.lang.String,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoGenerichash(
    hash_length: scala.Double,
    message: java.lang.String,
    key: scala.Null,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoGenerichash(
    hash_length: scala.Double,
    message: java.lang.String,
    key: scala.Null,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoGenerichash(hash_length: scala.Double, message: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoGenerichash(
    hash_length: scala.Double,
    message: js.typedarray.Uint8Array,
    key: js.UndefOr[scala.Nothing],
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoGenerichash(hash_length: scala.Double, message: js.typedarray.Uint8Array, key: java.lang.String): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoGenerichash(
    hash_length: scala.Double,
    message: js.typedarray.Uint8Array,
    key: java.lang.String,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoGenerichash(
    hash_length: scala.Double,
    message: js.typedarray.Uint8Array,
    key: java.lang.String,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoGenerichash(hash_length: scala.Double, message: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoGenerichash(
    hash_length: scala.Double,
    message: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoGenerichash(
    hash_length: scala.Double,
    message: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoGenerichash(
    hash_length: scala.Double,
    message: js.typedarray.Uint8Array,
    key: scala.Null,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoGenerichash(
    hash_length: scala.Double,
    message: js.typedarray.Uint8Array,
    key: scala.Null,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash")(hash_length.asInstanceOf[js.Any], message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def cryptoGenerichashBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_generichash_BYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoGenerichashBYTESMAX: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_generichash_BYTES_MAX").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoGenerichashBYTESMIN: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_generichash_BYTES_MIN").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoGenerichashFinal(state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress, hash_length: scala.Double): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_final")(state_address.asInstanceOf[js.Any], hash_length.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoGenerichashFinal(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    hash_length: scala.Double,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_final")(state_address.asInstanceOf[js.Any], hash_length.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoGenerichashFinal(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    hash_length: scala.Double,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_final")(state_address.asInstanceOf[js.Any], hash_length.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def cryptoGenerichashInit(key: java.lang.String, hash_length: scala.Double): typingsSlinky.libsodiumWrappers.mod.StateAddress = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_init")(key.asInstanceOf[js.Any], hash_length.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StateAddress]
  @scala.inline
  def cryptoGenerichashInit(key: js.typedarray.Uint8Array, hash_length: scala.Double): typingsSlinky.libsodiumWrappers.mod.StateAddress = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_init")(key.asInstanceOf[js.Any], hash_length.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StateAddress]
  @scala.inline
  def cryptoGenerichashInit(key: scala.Null, hash_length: scala.Double): typingsSlinky.libsodiumWrappers.mod.StateAddress = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_init")(key.asInstanceOf[js.Any], hash_length.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StateAddress]
  
  @scala.inline
  def cryptoGenerichashKEYBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_generichash_KEYBYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoGenerichashKEYBYTESMAX: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_generichash_KEYBYTES_MAX").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoGenerichashKEYBYTESMIN: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_generichash_KEYBYTES_MIN").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoGenerichashKeygen(): js.typedarray.Uint8Array = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_keygen")().asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoGenerichashKeygen(outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat): java.lang.String = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoGenerichashKeygen(outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat): js.typedarray.Uint8Array = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def cryptoGenerichashUpdate(state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress, message_chunk: java.lang.String): scala.Unit = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_update")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def cryptoGenerichashUpdate(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    message_chunk: js.typedarray.Uint8Array
  ): scala.Unit = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_generichash_update")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def cryptoHash(message: java.lang.String): js.typedarray.Uint8Array = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash")(message.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoHash(message: java.lang.String, outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash")(message.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoHash(
    message: java.lang.String,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash")(message.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoHash(message: js.typedarray.Uint8Array): js.typedarray.Uint8Array = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash")(message.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoHash(
    message: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash")(message.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoHash(
    message: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_hash")(message.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def cryptoHashBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_hash_BYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoKdfBYTESMAX: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_kdf_BYTES_MAX").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoKdfBYTESMIN: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_kdf_BYTES_MIN").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoKdfCONTEXTBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_kdf_CONTEXTBYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoKdfDeriveFromKey(
    subkey_len: scala.Double,
    subkey_id: scala.Double,
    ctx: java.lang.String,
    key: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kdf_derive_from_key")(subkey_len.asInstanceOf[js.Any], subkey_id.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoKdfDeriveFromKey(
    subkey_len: scala.Double,
    subkey_id: scala.Double,
    ctx: java.lang.String,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kdf_derive_from_key")(subkey_len.asInstanceOf[js.Any], subkey_id.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoKdfDeriveFromKey(
    subkey_len: scala.Double,
    subkey_id: scala.Double,
    ctx: java.lang.String,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kdf_derive_from_key")(subkey_len.asInstanceOf[js.Any], subkey_id.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def cryptoKdfKEYBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_kdf_KEYBYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoKdfKeygen(): js.typedarray.Uint8Array = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kdf_keygen")().asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoKdfKeygen(outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat): java.lang.String = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kdf_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoKdfKeygen(outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat): js.typedarray.Uint8Array = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kdf_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def cryptoKxClientSessionKeys(
    clientPublicKey: js.typedarray.Uint8Array,
    clientSecretKey: js.typedarray.Uint8Array,
    serverPublicKey: js.typedarray.Uint8Array
  ): typingsSlinky.libsodiumWrappers.mod.CryptoKX = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_client_session_keys")(clientPublicKey.asInstanceOf[js.Any], clientSecretKey.asInstanceOf[js.Any], serverPublicKey.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.CryptoKX]
  @scala.inline
  def cryptoKxClientSessionKeys(
    clientPublicKey: js.typedarray.Uint8Array,
    clientSecretKey: js.typedarray.Uint8Array,
    serverPublicKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoKX = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_client_session_keys")(clientPublicKey.asInstanceOf[js.Any], clientSecretKey.asInstanceOf[js.Any], serverPublicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoKX]
  @scala.inline
  def cryptoKxClientSessionKeys(
    clientPublicKey: js.typedarray.Uint8Array,
    clientSecretKey: js.typedarray.Uint8Array,
    serverPublicKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.CryptoKX = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_client_session_keys")(clientPublicKey.asInstanceOf[js.Any], clientSecretKey.asInstanceOf[js.Any], serverPublicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.CryptoKX]
  
  @scala.inline
  def cryptoKxKeypair(): typingsSlinky.libsodiumWrappers.mod.KeyPair = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_keypair")().asInstanceOf[typingsSlinky.libsodiumWrappers.mod.KeyPair]
  @scala.inline
  def cryptoKxKeypair(outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat): typingsSlinky.libsodiumWrappers.mod.StringKeyPair = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_keypair")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringKeyPair]
  @scala.inline
  def cryptoKxKeypair(outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat): typingsSlinky.libsodiumWrappers.mod.KeyPair = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_keypair")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.KeyPair]
  
  @scala.inline
  def cryptoKxPUBLICKEYBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_kx_PUBLICKEYBYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoKxSECRETKEYBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_kx_SECRETKEYBYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoKxSEEDBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_kx_SEEDBYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoKxSESSIONKEYBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_kx_SESSIONKEYBYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoKxSeedKeypair(seed: js.typedarray.Uint8Array): typingsSlinky.libsodiumWrappers.mod.KeyPair = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_seed_keypair")(seed.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.KeyPair]
  @scala.inline
  def cryptoKxSeedKeypair(
    seed: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringKeyPair = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_seed_keypair")(seed.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringKeyPair]
  @scala.inline
  def cryptoKxSeedKeypair(
    seed: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.KeyPair = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_seed_keypair")(seed.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.KeyPair]
  
  @scala.inline
  def cryptoKxServerSessionKeys(
    serverPublicKey: js.typedarray.Uint8Array,
    serverSecretKey: js.typedarray.Uint8Array,
    clientPublicKey: js.typedarray.Uint8Array
  ): typingsSlinky.libsodiumWrappers.mod.CryptoKX = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_server_session_keys")(serverPublicKey.asInstanceOf[js.Any], serverSecretKey.asInstanceOf[js.Any], clientPublicKey.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.CryptoKX]
  @scala.inline
  def cryptoKxServerSessionKeys(
    serverPublicKey: js.typedarray.Uint8Array,
    serverSecretKey: js.typedarray.Uint8Array,
    clientPublicKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringCryptoKX = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_server_session_keys")(serverPublicKey.asInstanceOf[js.Any], serverSecretKey.asInstanceOf[js.Any], clientPublicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringCryptoKX]
  @scala.inline
  def cryptoKxServerSessionKeys(
    serverPublicKey: js.typedarray.Uint8Array,
    serverSecretKey: js.typedarray.Uint8Array,
    clientPublicKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.CryptoKX = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_kx_server_session_keys")(serverPublicKey.asInstanceOf[js.Any], serverSecretKey.asInstanceOf[js.Any], clientPublicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.CryptoKX]
  
  @scala.inline
  def cryptoPwhash(
    keyLength: scala.Double,
    password: java.lang.String,
    salt: js.typedarray.Uint8Array,
    opsLimit: scala.Double,
    memLimit: scala.Double,
    algorithm: scala.Double
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash")(keyLength.asInstanceOf[js.Any], password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], memLimit.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoPwhash(
    keyLength: scala.Double,
    password: java.lang.String,
    salt: js.typedarray.Uint8Array,
    opsLimit: scala.Double,
    memLimit: scala.Double,
    algorithm: scala.Double,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash")(keyLength.asInstanceOf[js.Any], password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], memLimit.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoPwhash(
    keyLength: scala.Double,
    password: java.lang.String,
    salt: js.typedarray.Uint8Array,
    opsLimit: scala.Double,
    memLimit: scala.Double,
    algorithm: scala.Double,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash")(keyLength.asInstanceOf[js.Any], password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], memLimit.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoPwhash(
    keyLength: scala.Double,
    password: js.typedarray.Uint8Array,
    salt: js.typedarray.Uint8Array,
    opsLimit: scala.Double,
    memLimit: scala.Double,
    algorithm: scala.Double
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash")(keyLength.asInstanceOf[js.Any], password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], memLimit.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoPwhash(
    keyLength: scala.Double,
    password: js.typedarray.Uint8Array,
    salt: js.typedarray.Uint8Array,
    opsLimit: scala.Double,
    memLimit: scala.Double,
    algorithm: scala.Double,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash")(keyLength.asInstanceOf[js.Any], password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], memLimit.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoPwhash(
    keyLength: scala.Double,
    password: js.typedarray.Uint8Array,
    salt: js.typedarray.Uint8Array,
    opsLimit: scala.Double,
    memLimit: scala.Double,
    algorithm: scala.Double,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash")(keyLength.asInstanceOf[js.Any], password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], memLimit.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def cryptoPwhashALGARGON2I13: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_ALG_ARGON2I13").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoPwhashALGARGON2ID13: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_ALG_ARGON2ID13").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoPwhashALGDEFAULT: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_ALG_DEFAULT").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoPwhashBYTESMAX: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_BYTES_MAX").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoPwhashBYTESMIN: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_BYTES_MIN").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoPwhashMEMLIMITINTERACTIVE: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_MEMLIMIT_INTERACTIVE").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoPwhashMEMLIMITMAX: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_MEMLIMIT_MAX").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoPwhashMEMLIMITMIN: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_MEMLIMIT_MIN").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoPwhashMEMLIMITMODERATE: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_MEMLIMIT_MODERATE").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoPwhashMEMLIMITSENSITIVE: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_MEMLIMIT_SENSITIVE").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoPwhashOPSLIMITINTERACTIVE: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_OPSLIMIT_INTERACTIVE").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoPwhashOPSLIMITMAX: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_OPSLIMIT_MAX").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoPwhashOPSLIMITMIN: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_OPSLIMIT_MIN").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoPwhashOPSLIMITMODERATE: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_OPSLIMIT_MODERATE").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoPwhashOPSLIMITSENSITIVE: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_OPSLIMIT_SENSITIVE").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoPwhashPASSWDMAX: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_PASSWD_MAX").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoPwhashPASSWDMIN: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_PASSWD_MIN").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoPwhashSALTBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_SALTBYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoPwhashSTRBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_STRBYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoPwhashSTRPREFIX: java.lang.String = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_pwhash_STRPREFIX").asInstanceOf[java.lang.String]
  
  @scala.inline
  def cryptoPwhashStr(password: java.lang.String, opsLimit: scala.Double, memLimit: scala.Double): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash_str")(password.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], memLimit.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoPwhashStr(password: js.typedarray.Uint8Array, opsLimit: scala.Double, memLimit: scala.Double): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash_str")(password.asInstanceOf[js.Any], opsLimit.asInstanceOf[js.Any], memLimit.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def cryptoPwhashStrVerify(hashed_password: java.lang.String, password: java.lang.String): scala.Boolean = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash_str_verify")(hashed_password.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def cryptoPwhashStrVerify(hashed_password: java.lang.String, password: js.typedarray.Uint8Array): scala.Boolean = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_pwhash_str_verify")(hashed_password.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def cryptoScalarmult(privateKey: js.typedarray.Uint8Array, publicKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult")(privateKey.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoScalarmult(
    privateKey: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult")(privateKey.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoScalarmult(
    privateKey: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult")(privateKey.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def cryptoScalarmultBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_scalarmult_BYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoScalarmultBase(privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult_base")(privateKey.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoScalarmultBase(
    privateKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult_base")(privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoScalarmultBase(
    privateKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_scalarmult_base")(privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def cryptoScalarmultSCALARBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_scalarmult_SCALARBYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoSecretboxDetached(message: java.lang.String, nonce: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): typingsSlinky.libsodiumWrappers.mod.SecretBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_detached")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.SecretBox]
  @scala.inline
  def cryptoSecretboxDetached(
    message: java.lang.String,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringSecretBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_detached")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringSecretBox]
  @scala.inline
  def cryptoSecretboxDetached(
    message: java.lang.String,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.SecretBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_detached")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.SecretBox]
  @scala.inline
  def cryptoSecretboxDetached(message: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): typingsSlinky.libsodiumWrappers.mod.SecretBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_detached")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.SecretBox]
  @scala.inline
  def cryptoSecretboxDetached(
    message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringSecretBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_detached")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringSecretBox]
  @scala.inline
  def cryptoSecretboxDetached(
    message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.SecretBox = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_detached")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.SecretBox]
  
  @scala.inline
  def cryptoSecretboxEasy(message: java.lang.String, nonce: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_easy")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoSecretboxEasy(
    message: java.lang.String,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_easy")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoSecretboxEasy(
    message: java.lang.String,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_easy")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoSecretboxEasy(message: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_easy")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoSecretboxEasy(
    message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_easy")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoSecretboxEasy(
    message: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_easy")(message.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def cryptoSecretboxKEYBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_secretbox_KEYBYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoSecretboxKeygen(): js.typedarray.Uint8Array = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_keygen")().asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoSecretboxKeygen(outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat): java.lang.String = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoSecretboxKeygen(outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat): js.typedarray.Uint8Array = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def cryptoSecretboxMACBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_secretbox_MACBYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoSecretboxMESSAGEBYTESMAX: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_secretbox_MESSAGEBYTES_MAX").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoSecretboxNONCEBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_secretbox_NONCEBYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoSecretboxOpenDetached(
    ciphertext: java.lang.String,
    mac: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_open_detached")(ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoSecretboxOpenDetached(
    ciphertext: java.lang.String,
    mac: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_open_detached")(ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoSecretboxOpenDetached(
    ciphertext: java.lang.String,
    mac: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_open_detached")(ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoSecretboxOpenDetached(
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_open_detached")(ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoSecretboxOpenDetached(
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_open_detached")(ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoSecretboxOpenDetached(
    ciphertext: js.typedarray.Uint8Array,
    mac: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_open_detached")(ciphertext.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def cryptoSecretboxOpenEasy(ciphertext: java.lang.String, nonce: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_open_easy")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoSecretboxOpenEasy(
    ciphertext: java.lang.String,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_open_easy")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoSecretboxOpenEasy(
    ciphertext: java.lang.String,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_open_easy")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoSecretboxOpenEasy(
    ciphertext: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_open_easy")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoSecretboxOpenEasy(
    ciphertext: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_open_easy")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoSecretboxOpenEasy(
    ciphertext: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretbox_open_easy")(ciphertext.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305ABYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_secretstream_xchacha20poly1305_ABYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305HEADERBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_secretstream_xchacha20poly1305_HEADERBYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305InitPull(header: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): typingsSlinky.libsodiumWrappers.mod.StateAddress = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_init_pull")(header.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StateAddress]
  
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305InitPush(key: js.typedarray.Uint8Array): typingsSlinky.libsodiumWrappers.anon.Header = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_init_push")(key.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.libsodiumWrappers.anon.Header]
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305InitPush(
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.anon.State = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_init_push")(key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.anon.State]
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305InitPush(
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): typingsSlinky.libsodiumWrappers.anon.Header = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_init_push")(key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.anon.Header]
  
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305KEYBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_secretstream_xchacha20poly1305_KEYBYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305Keygen(): js.typedarray.Uint8Array = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_keygen")().asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305Keygen(outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat): java.lang.String = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305Keygen(outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat): js.typedarray.Uint8Array = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305MESSAGEBYTESMAX: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_secretstream_xchacha20poly1305_MESSAGEBYTES_MAX").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305Pull(state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress, cipher: java.lang.String): typingsSlinky.libsodiumWrappers.mod.MessageTag = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.MessageTag]
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305Pull(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    cipher: java.lang.String,
    ad: js.UndefOr[scala.Nothing],
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.MessageTag = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.MessageTag]
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305Pull(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    cipher: java.lang.String,
    ad: java.lang.String
  ): typingsSlinky.libsodiumWrappers.mod.MessageTag = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.MessageTag]
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305Pull(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    cipher: java.lang.String,
    ad: java.lang.String,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringMessageTag = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringMessageTag]
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305Pull(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    cipher: java.lang.String,
    ad: java.lang.String,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.MessageTag = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.MessageTag]
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305Pull(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    cipher: java.lang.String,
    ad: js.typedarray.Uint8Array
  ): typingsSlinky.libsodiumWrappers.mod.MessageTag = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.MessageTag]
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305Pull(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    cipher: java.lang.String,
    ad: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringMessageTag = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringMessageTag]
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305Pull(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    cipher: java.lang.String,
    ad: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.MessageTag = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.MessageTag]
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305Pull(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    cipher: java.lang.String,
    ad: scala.Null,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringMessageTag = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringMessageTag]
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305Pull(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    cipher: java.lang.String,
    ad: scala.Null,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.MessageTag = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.MessageTag]
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305Pull(state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress, cipher: js.typedarray.Uint8Array): typingsSlinky.libsodiumWrappers.mod.MessageTag = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.MessageTag]
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305Pull(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    cipher: js.typedarray.Uint8Array,
    ad: js.UndefOr[scala.Nothing],
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.MessageTag = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.MessageTag]
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305Pull(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    cipher: js.typedarray.Uint8Array,
    ad: java.lang.String
  ): typingsSlinky.libsodiumWrappers.mod.MessageTag = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.MessageTag]
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305Pull(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    cipher: js.typedarray.Uint8Array,
    ad: java.lang.String,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringMessageTag = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringMessageTag]
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305Pull(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    cipher: js.typedarray.Uint8Array,
    ad: java.lang.String,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.MessageTag = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.MessageTag]
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305Pull(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    cipher: js.typedarray.Uint8Array,
    ad: js.typedarray.Uint8Array
  ): typingsSlinky.libsodiumWrappers.mod.MessageTag = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.MessageTag]
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305Pull(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    cipher: js.typedarray.Uint8Array,
    ad: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringMessageTag = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringMessageTag]
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305Pull(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    cipher: js.typedarray.Uint8Array,
    ad: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.MessageTag = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.MessageTag]
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305Pull(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    cipher: js.typedarray.Uint8Array,
    ad: scala.Null,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringMessageTag = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringMessageTag]
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305Pull(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    cipher: js.typedarray.Uint8Array,
    ad: scala.Null,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.MessageTag = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_pull")(state_address.asInstanceOf[js.Any], cipher.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.MessageTag]
  
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305Push(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    message_chunk: java.lang.String,
    ad: java.lang.String,
    tag: scala.Double
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305Push(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    message_chunk: java.lang.String,
    ad: java.lang.String,
    tag: scala.Double,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305Push(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    message_chunk: java.lang.String,
    ad: java.lang.String,
    tag: scala.Double,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305Push(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    message_chunk: java.lang.String,
    ad: js.typedarray.Uint8Array,
    tag: scala.Double
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305Push(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    message_chunk: java.lang.String,
    ad: js.typedarray.Uint8Array,
    tag: scala.Double,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305Push(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    message_chunk: java.lang.String,
    ad: js.typedarray.Uint8Array,
    tag: scala.Double,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305Push(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    message_chunk: java.lang.String,
    ad: scala.Null,
    tag: scala.Double
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305Push(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    message_chunk: java.lang.String,
    ad: scala.Null,
    tag: scala.Double,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305Push(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    message_chunk: java.lang.String,
    ad: scala.Null,
    tag: scala.Double,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305Push(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    message_chunk: js.typedarray.Uint8Array,
    ad: java.lang.String,
    tag: scala.Double
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305Push(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    message_chunk: js.typedarray.Uint8Array,
    ad: java.lang.String,
    tag: scala.Double,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305Push(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    message_chunk: js.typedarray.Uint8Array,
    ad: java.lang.String,
    tag: scala.Double,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305Push(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    message_chunk: js.typedarray.Uint8Array,
    ad: js.typedarray.Uint8Array,
    tag: scala.Double
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305Push(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    message_chunk: js.typedarray.Uint8Array,
    ad: js.typedarray.Uint8Array,
    tag: scala.Double,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305Push(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    message_chunk: js.typedarray.Uint8Array,
    ad: js.typedarray.Uint8Array,
    tag: scala.Double,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305Push(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    message_chunk: js.typedarray.Uint8Array,
    ad: scala.Null,
    tag: scala.Double
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305Push(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    message_chunk: js.typedarray.Uint8Array,
    ad: scala.Null,
    tag: scala.Double,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305Push(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    message_chunk: js.typedarray.Uint8Array,
    ad: scala.Null,
    tag: scala.Double,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_push")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any], ad.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305Rekey(state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress): typingsSlinky.libsodiumWrappers.libsodiumWrappersBooleans.`true` = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_secretstream_xchacha20poly1305_rekey")(state_address.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.libsodiumWrappers.libsodiumWrappersBooleans.`true`]
  
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305TAGFINAL: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_secretstream_xchacha20poly1305_TAG_FINAL").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305TAGMESSAGE: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_secretstream_xchacha20poly1305_TAG_MESSAGE").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305TAGPUSH: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_secretstream_xchacha20poly1305_TAG_PUSH").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoSecretstreamXchacha20poly1305TAGREKEY: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_secretstream_xchacha20poly1305_TAG_REKEY").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoShorthash(message: java.lang.String, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_shorthash")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoShorthash(
    message: java.lang.String,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_shorthash")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoShorthash(
    message: java.lang.String,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_shorthash")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoShorthash(message: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_shorthash")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoShorthash(
    message: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_shorthash")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoShorthash(
    message: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_shorthash")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def cryptoShorthashBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_shorthash_BYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoShorthashKEYBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_shorthash_KEYBYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoShorthashKeygen(): js.typedarray.Uint8Array = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_shorthash_keygen")().asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoShorthashKeygen(outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat): java.lang.String = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_shorthash_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoShorthashKeygen(outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat): js.typedarray.Uint8Array = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_shorthash_keygen")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def cryptoSign(message: java.lang.String, privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoSign(
    message: java.lang.String,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoSign(
    message: java.lang.String,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoSign(message: js.typedarray.Uint8Array, privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoSign(
    message: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoSign(
    message: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def cryptoSignBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_sign_BYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoSignDetached(message: java.lang.String, privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_detached")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoSignDetached(
    message: java.lang.String,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_detached")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoSignDetached(
    message: java.lang.String,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_detached")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoSignDetached(message: js.typedarray.Uint8Array, privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_detached")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoSignDetached(
    message: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_detached")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoSignDetached(
    message: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_detached")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def cryptoSignEd25519PkToCurve25519(edPk: js.typedarray.Uint8Array): js.typedarray.Uint8Array = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_ed25519_pk_to_curve25519")(edPk.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoSignEd25519PkToCurve25519(
    edPk: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_ed25519_pk_to_curve25519")(edPk.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoSignEd25519PkToCurve25519(
    edPk: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_ed25519_pk_to_curve25519")(edPk.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def cryptoSignEd25519SkToCurve25519(edSk: js.typedarray.Uint8Array): js.typedarray.Uint8Array = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_ed25519_sk_to_curve25519")(edSk.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoSignEd25519SkToCurve25519(
    edSk: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_ed25519_sk_to_curve25519")(edSk.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoSignEd25519SkToCurve25519(
    edSk: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_ed25519_sk_to_curve25519")(edSk.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def cryptoSignFinalCreate(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    privateKey: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_final_create")(state_address.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoSignFinalCreate(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_final_create")(state_address.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoSignFinalCreate(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    privateKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_final_create")(state_address.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def cryptoSignFinalVerify(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    signature: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array
  ): scala.Boolean = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_final_verify")(state_address.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def cryptoSignInit(): typingsSlinky.libsodiumWrappers.mod.StateAddress = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_init")().asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StateAddress]
  
  @scala.inline
  def cryptoSignKeypair(): typingsSlinky.libsodiumWrappers.mod.KeyPair = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_keypair")().asInstanceOf[typingsSlinky.libsodiumWrappers.mod.KeyPair]
  @scala.inline
  def cryptoSignKeypair(outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat): typingsSlinky.libsodiumWrappers.mod.StringKeyPair = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_keypair")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringKeyPair]
  @scala.inline
  def cryptoSignKeypair(outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat): typingsSlinky.libsodiumWrappers.mod.KeyPair = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_keypair")(outputFormat.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.KeyPair]
  
  @scala.inline
  def cryptoSignMESSAGEBYTESMAX: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_sign_MESSAGEBYTES_MAX").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoSignOpen(signedMessage: java.lang.String, publicKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_open")(signedMessage.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoSignOpen(
    signedMessage: java.lang.String,
    publicKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_open")(signedMessage.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoSignOpen(
    signedMessage: java.lang.String,
    publicKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_open")(signedMessage.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoSignOpen(signedMessage: js.typedarray.Uint8Array, publicKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_open")(signedMessage.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def cryptoSignOpen(
    signedMessage: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_open")(signedMessage.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def cryptoSignOpen(
    signedMessage: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_open")(signedMessage.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def cryptoSignPUBLICKEYBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_sign_PUBLICKEYBYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoSignSECRETKEYBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_sign_SECRETKEYBYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoSignSEEDBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_sign_SEEDBYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def cryptoSignSeedKeypair(seed: js.typedarray.Uint8Array): typingsSlinky.libsodiumWrappers.mod.KeyPair = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_seed_keypair")(seed.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.KeyPair]
  @scala.inline
  def cryptoSignSeedKeypair(
    seed: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.StringKeyPair = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_seed_keypair")(seed.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.StringKeyPair]
  @scala.inline
  def cryptoSignSeedKeypair(
    seed: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): typingsSlinky.libsodiumWrappers.mod.KeyPair = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_seed_keypair")(seed.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.libsodiumWrappers.mod.KeyPair]
  
  @scala.inline
  def cryptoSignUpdate(state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress, message_chunk: java.lang.String): scala.Unit = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_update")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def cryptoSignUpdate(
    state_address: typingsSlinky.libsodiumWrappers.mod.StateAddress,
    message_chunk: js.typedarray.Uint8Array
  ): scala.Unit = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_update")(state_address.asInstanceOf[js.Any], message_chunk.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def cryptoSignVerifyDetached(
    signature: js.typedarray.Uint8Array,
    message: java.lang.String,
    publicKey: js.typedarray.Uint8Array
  ): scala.Boolean = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_verify_detached")(signature.asInstanceOf[js.Any], message.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def cryptoSignVerifyDetached(
    signature: js.typedarray.Uint8Array,
    message: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array
  ): scala.Boolean = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("crypto_sign_verify_detached")(signature.asInstanceOf[js.Any], message.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def crypto_AeadChacha20poly1305IETFABYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_IETF_ABYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def crypto_AeadChacha20poly1305IETFKEYBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_IETF_KEYBYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def crypto_AeadChacha20poly1305IETFMESSAGEBYTESMAX: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_IETF_MESSAGEBYTES_MAX").asInstanceOf[scala.Double]
  
  @scala.inline
  def crypto_AeadChacha20poly1305IETFNPUBBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_IETF_NPUBBYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def crypto_AeadChacha20poly1305IETFNSECBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_chacha20poly1305_IETF_NSECBYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def crypto_AeadXchacha20poly1305IETFABYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_xchacha20poly1305_IETF_ABYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def crypto_AeadXchacha20poly1305IETFKEYBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_xchacha20poly1305_IETF_KEYBYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def crypto_AeadXchacha20poly1305IETFMESSAGEBYTESMAX: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_xchacha20poly1305_IETF_MESSAGEBYTES_MAX").asInstanceOf[scala.Double]
  
  @scala.inline
  def crypto_AeadXchacha20poly1305IETFNPUBBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_xchacha20poly1305_IETF_NPUBBYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def crypto_AeadXchacha20poly1305IETFNSECBYTES: scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("crypto_aead_xchacha20poly1305_IETF_NSECBYTES").asInstanceOf[scala.Double]
  
  @scala.inline
  def fromBase64(input: java.lang.String): js.typedarray.Uint8Array = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("from_base64")(input.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def fromBase64(input: java.lang.String, variant: typingsSlinky.libsodiumWrappers.mod.base64Variants): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("from_base64")(input.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def fromHex(input: java.lang.String): js.typedarray.Uint8Array = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("from_hex")(input.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def fromString(str: java.lang.String): js.typedarray.Uint8Array = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("from_string")(str.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def increment(bytes: js.typedarray.Uint8Array): scala.Unit = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("increment")(bytes.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def isZero(bytes: js.typedarray.Uint8Array): scala.Boolean = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("is_zero")(bytes.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def memcmp(b1: js.typedarray.Uint8Array, b2: js.typedarray.Uint8Array): scala.Boolean = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("memcmp")(b1.asInstanceOf[js.Any], b2.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def memzero(bytes: js.typedarray.Uint8Array): scala.Unit = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("memzero")(bytes.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def outputFormats(): js.Array[
    typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat | typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ] = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("output_formats")().asInstanceOf[js.Array[
    typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat | typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ]]
  
  @scala.inline
  def pad(buf: js.typedarray.Uint8Array, blocksize: scala.Double): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pad")(buf.asInstanceOf[js.Any], blocksize.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def randombytesBuf(length: scala.Double): js.typedarray.Uint8Array = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("randombytes_buf")(length.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def randombytesBuf(length: scala.Double, outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("randombytes_buf")(length.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def randombytesBuf(length: scala.Double, outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("randombytes_buf")(length.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def randombytesBufDeterministic(length: scala.Double, seed: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("randombytes_buf_deterministic")(length.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def randombytesBufDeterministic(
    length: scala.Double,
    seed: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
  ): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("randombytes_buf_deterministic")(length.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def randombytesBufDeterministic(
    length: scala.Double,
    seed: js.typedarray.Uint8Array,
    outputFormat: typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
  ): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("randombytes_buf_deterministic")(length.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], outputFormat.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @scala.inline
  def randombytesClose(): scala.Unit = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("randombytes_close")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def randombytesRandom(): scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("randombytes_random")().asInstanceOf[scala.Double]
  
  @scala.inline
  def randombytesStir(): scala.Unit = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("randombytes_stir")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def randombytesUniform(upper_bound: scala.Double): scala.Double = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("randombytes_uniform")(upper_bound.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
  
  @scala.inline
  def ready: js.Promise[scala.Unit] = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ready").asInstanceOf[js.Promise[scala.Unit]]
  
  @scala.inline
  def sodiumVersionString(): java.lang.String = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sodium_version_string")().asInstanceOf[java.lang.String]
  
  @scala.inline
  def symbols(): js.Array[java.lang.String] = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("symbols")().asInstanceOf[js.Array[java.lang.String]]
  
  @scala.inline
  def toBase64(input: java.lang.String): java.lang.String = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("to_base64")(input.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def toBase64(input: java.lang.String, variant: typingsSlinky.libsodiumWrappers.mod.base64Variants): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("to_base64")(input.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def toBase64(input: js.typedarray.Uint8Array): java.lang.String = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("to_base64")(input.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def toBase64(input: js.typedarray.Uint8Array, variant: typingsSlinky.libsodiumWrappers.mod.base64Variants): java.lang.String = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("to_base64")(input.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def toHex(input: java.lang.String): java.lang.String = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("to_hex")(input.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def toHex(input: js.typedarray.Uint8Array): java.lang.String = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("to_hex")(input.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def toString(bytes: js.typedarray.Uint8Array): java.lang.String = typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("to_string")(bytes.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def unpad(buf: js.typedarray.Uint8Array, blocksize: scala.Double): js.typedarray.Uint8Array = (typingsSlinky.libsodiumWrappers.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unpad")(buf.asInstanceOf[js.Any], blocksize.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
}
