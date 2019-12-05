package typingsSlinky.atAwsDashCryptoIe11DashDetection.buildMsSubtleCryptoMod

import typingsSlinky.atAwsDashCryptoIe11DashDetection.buildCryptoOperationMod.CryptoOperation
import typingsSlinky.atAwsDashCryptoIe11DashDetection.buildKeyMod.Key
import typingsSlinky.atAwsDashCryptoIe11DashDetection.buildKeyOperationMod.KeyOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MsSubtleCrypto extends js.Object {
  def decrypt(algorithm: Ie11EncryptionAlgorithm, key: Key): CryptoOperation = js.native
  def decrypt(algorithm: Ie11EncryptionAlgorithm, key: Key, buffer: scala.scalajs.js.typedarray.ArrayBufferView): CryptoOperation = js.native
  def digest(algorithm: Ie11DigestAlgorithm): CryptoOperation = js.native
  def digest(algorithm: Ie11DigestAlgorithm, buffer: scala.scalajs.js.typedarray.ArrayBufferView): CryptoOperation = js.native
  def encrypt(algorithm: Ie11EncryptionAlgorithm, key: Key): CryptoOperation = js.native
  def encrypt(algorithm: Ie11EncryptionAlgorithm, key: Key, buffer: scala.scalajs.js.typedarray.ArrayBufferView): CryptoOperation = js.native
  def exportKey(format: String, key: Key): KeyOperation = js.native
  def generateKey(algorithm: Ie11EncryptionAlgorithm): KeyOperation = js.native
  def generateKey(algorithm: Ie11EncryptionAlgorithm, extractable: Boolean): KeyOperation = js.native
  def generateKey(algorithm: Ie11EncryptionAlgorithm, extractable: Boolean, keyUsages: js.Array[KeyUsage]): KeyOperation = js.native
  def generateKey(algorithm: SigningAlgorithm): KeyOperation = js.native
  def generateKey(algorithm: SigningAlgorithm, extractable: Boolean): KeyOperation = js.native
  def generateKey(algorithm: SigningAlgorithm, extractable: Boolean, keyUsages: js.Array[KeyUsage]): KeyOperation = js.native
  def importKey(format: String, keyData: scala.scalajs.js.typedarray.ArrayBufferView, algorithm: js.Any): KeyOperation = js.native
  def importKey(
    format: String,
    keyData: scala.scalajs.js.typedarray.ArrayBufferView,
    algorithm: js.Any,
    extractable: Boolean
  ): KeyOperation = js.native
  def importKey(
    format: String,
    keyData: scala.scalajs.js.typedarray.ArrayBufferView,
    algorithm: js.Any,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): KeyOperation = js.native
  def sign(algorithm: SigningAlgorithm, key: Key): CryptoOperation = js.native
  def sign(algorithm: SigningAlgorithm, key: Key, buffer: scala.scalajs.js.typedarray.ArrayBufferView): CryptoOperation = js.native
  def verify(
    algorithm: EncryptionOrVerificationAlgorithm,
    key: Key,
    signature: scala.scalajs.js.typedarray.ArrayBufferView
  ): CryptoOperation = js.native
  def verify(
    algorithm: EncryptionOrVerificationAlgorithm,
    key: Key,
    signature: scala.scalajs.js.typedarray.ArrayBufferView,
    buffer: scala.scalajs.js.typedarray.ArrayBufferView
  ): CryptoOperation = js.native
  def verify(algorithm: SigningAlgorithm, key: Key, signature: scala.scalajs.js.typedarray.ArrayBufferView): CryptoOperation = js.native
  def verify(
    algorithm: SigningAlgorithm,
    key: Key,
    signature: scala.scalajs.js.typedarray.ArrayBufferView,
    buffer: scala.scalajs.js.typedarray.ArrayBufferView
  ): CryptoOperation = js.native
}

