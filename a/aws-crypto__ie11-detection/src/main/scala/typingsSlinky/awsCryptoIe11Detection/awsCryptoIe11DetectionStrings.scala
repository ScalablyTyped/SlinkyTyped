package typingsSlinky.awsCryptoIe11Detection

import typingsSlinky.awsCryptoIe11Detection.msSubtleCryptoMod.Ie11DigestAlgorithm
import typingsSlinky.awsCryptoIe11Detection.msSubtleCryptoMod.KeyUsage
import typingsSlinky.awsCryptoIe11Detection.msSubtleCryptoMod._Ie11EncryptionAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object awsCryptoIe11DetectionStrings {
  
  @scala.inline
  def `AES-CBC`: `AES-CBC` = "AES-CBC".asInstanceOf[`AES-CBC`]
  
  @scala.inline
  def `AES-GCM`: `AES-GCM` = "AES-GCM".asInstanceOf[`AES-GCM`]
  
  @scala.inline
  def HMAC: HMAC = "HMAC".asInstanceOf[HMAC]
  
  @scala.inline
  def `RSA-OAEP`: `RSA-OAEP` = "RSA-OAEP".asInstanceOf[`RSA-OAEP`]
  
  @scala.inline
  def `RSAES-PKCS1-v1_5`: `RSAES-PKCS1-v1_5` = "RSAES-PKCS1-v1_5".asInstanceOf[`RSAES-PKCS1-v1_5`]
  
  @scala.inline
  def `SHA-1`: `SHA-1` = "SHA-1".asInstanceOf[`SHA-1`]
  
  @scala.inline
  def `SHA-256`: `SHA-256` = "SHA-256".asInstanceOf[`SHA-256`]
  
  @scala.inline
  def `SHA-384`: `SHA-384` = "SHA-384".asInstanceOf[`SHA-384`]
  
  @scala.inline
  def decrypt: decrypt = "decrypt".asInstanceOf[decrypt]
  
  @scala.inline
  def derive: derive = "derive".asInstanceOf[derive]
  
  @scala.inline
  def encrypt: encrypt = "encrypt".asInstanceOf[encrypt]
  
  @scala.inline
  def importKey: importKey = "importKey".asInstanceOf[importKey]
  
  @scala.inline
  def sign: sign = "sign".asInstanceOf[sign]
  
  @scala.inline
  def unwrapKey: unwrapKey = "unwrapKey".asInstanceOf[unwrapKey]
  
  @scala.inline
  def verify: verify = "verify".asInstanceOf[verify]
  
  @scala.inline
  def wrapKey: wrapKey = "wrapKey".asInstanceOf[wrapKey]
  
  @js.native
  sealed trait `AES-CBC` extends _Ie11EncryptionAlgorithm
  
  @js.native
  sealed trait `AES-GCM` extends _Ie11EncryptionAlgorithm
  
  @js.native
  sealed trait HMAC extends js.Object
  
  @js.native
  sealed trait `RSA-OAEP` extends _Ie11EncryptionAlgorithm
  
  @js.native
  sealed trait `RSAES-PKCS1-v1_5` extends js.Object
  
  @js.native
  sealed trait `SHA-1` extends Ie11DigestAlgorithm
  
  @js.native
  sealed trait `SHA-256` extends Ie11DigestAlgorithm
  
  @js.native
  sealed trait `SHA-384` extends Ie11DigestAlgorithm
  
  @js.native
  sealed trait decrypt extends KeyUsage
  
  @js.native
  sealed trait derive extends KeyUsage
  
  @js.native
  sealed trait encrypt extends KeyUsage
  
  @js.native
  sealed trait importKey extends KeyUsage
  
  @js.native
  sealed trait sign extends KeyUsage
  
  @js.native
  sealed trait unwrapKey extends KeyUsage
  
  @js.native
  sealed trait verify extends KeyUsage
  
  @js.native
  sealed trait wrapKey extends KeyUsage
}
