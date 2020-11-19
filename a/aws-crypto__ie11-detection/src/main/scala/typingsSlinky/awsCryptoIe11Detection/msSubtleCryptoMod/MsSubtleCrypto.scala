package typingsSlinky.awsCryptoIe11Detection.msSubtleCryptoMod

import typingsSlinky.awsCryptoIe11Detection.cryptoOperationMod.CryptoOperation
import typingsSlinky.awsCryptoIe11Detection.keyMod.Key
import typingsSlinky.awsCryptoIe11Detection.keyOperationMod.KeyOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MsSubtleCrypto extends js.Object {
  
  def decrypt(algorithm: Ie11EncryptionAlgorithm, key: Key): CryptoOperation = js.native
  def decrypt(algorithm: Ie11EncryptionAlgorithm, key: Key, buffer: js.typedarray.ArrayBufferView): CryptoOperation = js.native
  
  def digest(algorithm: Ie11DigestAlgorithm): CryptoOperation = js.native
  def digest(algorithm: Ie11DigestAlgorithm, buffer: js.typedarray.ArrayBufferView): CryptoOperation = js.native
  
  def encrypt(algorithm: Ie11EncryptionAlgorithm, key: Key): CryptoOperation = js.native
  def encrypt(algorithm: Ie11EncryptionAlgorithm, key: Key, buffer: js.typedarray.ArrayBufferView): CryptoOperation = js.native
  
  def exportKey(format: String, key: Key): KeyOperation = js.native
  
  def generateKey(algorithm: Ie11EncryptionAlgorithm): KeyOperation = js.native
  def generateKey(
    algorithm: Ie11EncryptionAlgorithm,
    extractable: js.UndefOr[scala.Nothing],
    keyUsages: js.Array[KeyUsage]
  ): KeyOperation = js.native
  def generateKey(algorithm: Ie11EncryptionAlgorithm, extractable: Boolean): KeyOperation = js.native
  def generateKey(algorithm: Ie11EncryptionAlgorithm, extractable: Boolean, keyUsages: js.Array[KeyUsage]): KeyOperation = js.native
  def generateKey(algorithm: SigningAlgorithm): KeyOperation = js.native
  def generateKey(algorithm: SigningAlgorithm, extractable: js.UndefOr[scala.Nothing], keyUsages: js.Array[KeyUsage]): KeyOperation = js.native
  def generateKey(algorithm: SigningAlgorithm, extractable: Boolean): KeyOperation = js.native
  def generateKey(algorithm: SigningAlgorithm, extractable: Boolean, keyUsages: js.Array[KeyUsage]): KeyOperation = js.native
  
  def importKey(format: String, keyData: js.typedarray.ArrayBufferView, algorithm: js.Any): KeyOperation = js.native
  def importKey(
    format: String,
    keyData: js.typedarray.ArrayBufferView,
    algorithm: js.Any,
    extractable: js.UndefOr[scala.Nothing],
    keyUsages: js.Array[KeyUsage]
  ): KeyOperation = js.native
  def importKey(format: String, keyData: js.typedarray.ArrayBufferView, algorithm: js.Any, extractable: Boolean): KeyOperation = js.native
  def importKey(
    format: String,
    keyData: js.typedarray.ArrayBufferView,
    algorithm: js.Any,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): KeyOperation = js.native
  
  def sign(algorithm: SigningAlgorithm, key: Key): CryptoOperation = js.native
  def sign(algorithm: SigningAlgorithm, key: Key, buffer: js.typedarray.ArrayBufferView): CryptoOperation = js.native
  
  def verify(algorithm: EncryptionOrVerificationAlgorithm, key: Key, signature: js.typedarray.ArrayBufferView): CryptoOperation = js.native
  def verify(
    algorithm: EncryptionOrVerificationAlgorithm,
    key: Key,
    signature: js.typedarray.ArrayBufferView,
    buffer: js.typedarray.ArrayBufferView
  ): CryptoOperation = js.native
  def verify(algorithm: SigningAlgorithm, key: Key, signature: js.typedarray.ArrayBufferView): CryptoOperation = js.native
  def verify(
    algorithm: SigningAlgorithm,
    key: Key,
    signature: js.typedarray.ArrayBufferView,
    buffer: js.typedarray.ArrayBufferView
  ): CryptoOperation = js.native
}
