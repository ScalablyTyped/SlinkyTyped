package typingsSlinky.node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object cryptoMod {
  
  type BinaryLike = java.lang.String | typingsSlinky.node.NodeJS.ArrayBufferView
  
  type CipherKey = typingsSlinky.node.cryptoMod.BinaryLike | typingsSlinky.node.cryptoMod.KeyObject
  
  /** @deprecated since v10.0.0 */
  @scala.inline
  def DEFAULT_ENCODING: typingsSlinky.node.BufferEncoding = typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_ENCODING").asInstanceOf[typingsSlinky.node.BufferEncoding]
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.node.Buffer
    - typingsSlinky.node.cryptoMod.KeyObject
  */
  type KeyLike = typingsSlinky.node.cryptoMod._KeyLike | java.lang.String
  
  /** @deprecated since v10.0.0 use `createCipheriv()` */
  @scala.inline
  def createCipher(algorithm: java.lang.String, password: typingsSlinky.node.cryptoMod.BinaryLike): typingsSlinky.node.cryptoMod.Cipher = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.Cipher]
  @scala.inline
  def createCipher(
    algorithm: java.lang.String,
    password: typingsSlinky.node.cryptoMod.BinaryLike,
    options: typingsSlinky.node.streamMod.TransformOptions
  ): typingsSlinky.node.cryptoMod.Cipher = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.Cipher]
  /** @deprecated since v10.0.0 use `createCipheriv()` */
  @scala.inline
  def createCipher(
    algorithm: typingsSlinky.node.cryptoMod.CipherCCMTypes,
    password: typingsSlinky.node.cryptoMod.BinaryLike,
    options: typingsSlinky.node.cryptoMod.CipherCCMOptions
  ): typingsSlinky.node.cryptoMod.CipherCCM = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.CipherCCM]
  /** @deprecated since v10.0.0 use `createCipheriv()` */
  @scala.inline
  def createCipher(
    algorithm: typingsSlinky.node.cryptoMod.CipherGCMTypes,
    password: typingsSlinky.node.cryptoMod.BinaryLike
  ): typingsSlinky.node.cryptoMod.CipherGCM = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.CipherGCM]
  @scala.inline
  def createCipher(
    algorithm: typingsSlinky.node.cryptoMod.CipherGCMTypes,
    password: typingsSlinky.node.cryptoMod.BinaryLike,
    options: typingsSlinky.node.cryptoMod.CipherGCMOptions
  ): typingsSlinky.node.cryptoMod.CipherGCM = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.CipherGCM]
  
  @scala.inline
  def createCipheriv(algorithm: java.lang.String, key: typingsSlinky.node.cryptoMod.CipherKey): typingsSlinky.node.cryptoMod.Cipher = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.Cipher]
  @scala.inline
  def createCipheriv(
    algorithm: java.lang.String,
    key: typingsSlinky.node.cryptoMod.CipherKey,
    iv: scala.Null,
    options: typingsSlinky.node.streamMod.TransformOptions
  ): typingsSlinky.node.cryptoMod.Cipher = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.Cipher]
  @scala.inline
  def createCipheriv(
    algorithm: java.lang.String,
    key: typingsSlinky.node.cryptoMod.CipherKey,
    iv: typingsSlinky.node.cryptoMod.BinaryLike
  ): typingsSlinky.node.cryptoMod.Cipher = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.Cipher]
  @scala.inline
  def createCipheriv(
    algorithm: java.lang.String,
    key: typingsSlinky.node.cryptoMod.CipherKey,
    iv: typingsSlinky.node.cryptoMod.BinaryLike,
    options: typingsSlinky.node.streamMod.TransformOptions
  ): typingsSlinky.node.cryptoMod.Cipher = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.Cipher]
  @scala.inline
  def createCipheriv(
    algorithm: typingsSlinky.node.cryptoMod.CipherCCMTypes,
    key: typingsSlinky.node.cryptoMod.CipherKey,
    iv: scala.Null,
    options: typingsSlinky.node.cryptoMod.CipherCCMOptions
  ): typingsSlinky.node.cryptoMod.CipherCCM = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.CipherCCM]
  @scala.inline
  def createCipheriv(
    algorithm: typingsSlinky.node.cryptoMod.CipherCCMTypes,
    key: typingsSlinky.node.cryptoMod.CipherKey,
    iv: typingsSlinky.node.cryptoMod.BinaryLike,
    options: typingsSlinky.node.cryptoMod.CipherCCMOptions
  ): typingsSlinky.node.cryptoMod.CipherCCM = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.CipherCCM]
  @scala.inline
  def createCipheriv(
    algorithm: typingsSlinky.node.cryptoMod.CipherGCMTypes,
    key: typingsSlinky.node.cryptoMod.CipherKey
  ): typingsSlinky.node.cryptoMod.CipherGCM = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.CipherGCM]
  @scala.inline
  def createCipheriv(
    algorithm: typingsSlinky.node.cryptoMod.CipherGCMTypes,
    key: typingsSlinky.node.cryptoMod.CipherKey,
    iv: scala.Null,
    options: typingsSlinky.node.cryptoMod.CipherGCMOptions
  ): typingsSlinky.node.cryptoMod.CipherGCM = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.CipherGCM]
  @scala.inline
  def createCipheriv(
    algorithm: typingsSlinky.node.cryptoMod.CipherGCMTypes,
    key: typingsSlinky.node.cryptoMod.CipherKey,
    iv: typingsSlinky.node.cryptoMod.BinaryLike
  ): typingsSlinky.node.cryptoMod.CipherGCM = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.CipherGCM]
  @scala.inline
  def createCipheriv(
    algorithm: typingsSlinky.node.cryptoMod.CipherGCMTypes,
    key: typingsSlinky.node.cryptoMod.CipherKey,
    iv: typingsSlinky.node.cryptoMod.BinaryLike,
    options: typingsSlinky.node.cryptoMod.CipherGCMOptions
  ): typingsSlinky.node.cryptoMod.CipherGCM = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.CipherGCM]
  
  /** @deprecated since v10.0.0 use `createDecipheriv()` */
  @scala.inline
  def createDecipher(algorithm: java.lang.String, password: typingsSlinky.node.cryptoMod.BinaryLike): typingsSlinky.node.cryptoMod.Decipher = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.Decipher]
  @scala.inline
  def createDecipher(
    algorithm: java.lang.String,
    password: typingsSlinky.node.cryptoMod.BinaryLike,
    options: typingsSlinky.node.streamMod.TransformOptions
  ): typingsSlinky.node.cryptoMod.Decipher = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.Decipher]
  /** @deprecated since v10.0.0 use `createDecipheriv()` */
  @scala.inline
  def createDecipher(
    algorithm: typingsSlinky.node.cryptoMod.CipherCCMTypes,
    password: typingsSlinky.node.cryptoMod.BinaryLike,
    options: typingsSlinky.node.cryptoMod.CipherCCMOptions
  ): typingsSlinky.node.cryptoMod.DecipherCCM = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.DecipherCCM]
  /** @deprecated since v10.0.0 use `createDecipheriv()` */
  @scala.inline
  def createDecipher(
    algorithm: typingsSlinky.node.cryptoMod.CipherGCMTypes,
    password: typingsSlinky.node.cryptoMod.BinaryLike
  ): typingsSlinky.node.cryptoMod.DecipherGCM = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.DecipherGCM]
  @scala.inline
  def createDecipher(
    algorithm: typingsSlinky.node.cryptoMod.CipherGCMTypes,
    password: typingsSlinky.node.cryptoMod.BinaryLike,
    options: typingsSlinky.node.cryptoMod.CipherGCMOptions
  ): typingsSlinky.node.cryptoMod.DecipherGCM = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.DecipherGCM]
  
  @scala.inline
  def createDecipheriv(algorithm: java.lang.String, key: typingsSlinky.node.cryptoMod.CipherKey): typingsSlinky.node.cryptoMod.Decipher = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.Decipher]
  @scala.inline
  def createDecipheriv(
    algorithm: java.lang.String,
    key: typingsSlinky.node.cryptoMod.CipherKey,
    iv: scala.Null,
    options: typingsSlinky.node.streamMod.TransformOptions
  ): typingsSlinky.node.cryptoMod.Decipher = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.Decipher]
  @scala.inline
  def createDecipheriv(
    algorithm: java.lang.String,
    key: typingsSlinky.node.cryptoMod.CipherKey,
    iv: typingsSlinky.node.cryptoMod.BinaryLike
  ): typingsSlinky.node.cryptoMod.Decipher = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.Decipher]
  @scala.inline
  def createDecipheriv(
    algorithm: java.lang.String,
    key: typingsSlinky.node.cryptoMod.CipherKey,
    iv: typingsSlinky.node.cryptoMod.BinaryLike,
    options: typingsSlinky.node.streamMod.TransformOptions
  ): typingsSlinky.node.cryptoMod.Decipher = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.Decipher]
  @scala.inline
  def createDecipheriv(
    algorithm: typingsSlinky.node.cryptoMod.CipherCCMTypes,
    key: typingsSlinky.node.cryptoMod.CipherKey,
    iv: scala.Null,
    options: typingsSlinky.node.cryptoMod.CipherCCMOptions
  ): typingsSlinky.node.cryptoMod.DecipherCCM = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.DecipherCCM]
  @scala.inline
  def createDecipheriv(
    algorithm: typingsSlinky.node.cryptoMod.CipherCCMTypes,
    key: typingsSlinky.node.cryptoMod.CipherKey,
    iv: typingsSlinky.node.cryptoMod.BinaryLike,
    options: typingsSlinky.node.cryptoMod.CipherCCMOptions
  ): typingsSlinky.node.cryptoMod.DecipherCCM = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.DecipherCCM]
  @scala.inline
  def createDecipheriv(
    algorithm: typingsSlinky.node.cryptoMod.CipherGCMTypes,
    key: typingsSlinky.node.cryptoMod.CipherKey
  ): typingsSlinky.node.cryptoMod.DecipherGCM = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.DecipherGCM]
  @scala.inline
  def createDecipheriv(
    algorithm: typingsSlinky.node.cryptoMod.CipherGCMTypes,
    key: typingsSlinky.node.cryptoMod.CipherKey,
    iv: scala.Null,
    options: typingsSlinky.node.cryptoMod.CipherGCMOptions
  ): typingsSlinky.node.cryptoMod.DecipherGCM = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.DecipherGCM]
  @scala.inline
  def createDecipheriv(
    algorithm: typingsSlinky.node.cryptoMod.CipherGCMTypes,
    key: typingsSlinky.node.cryptoMod.CipherKey,
    iv: typingsSlinky.node.cryptoMod.BinaryLike
  ): typingsSlinky.node.cryptoMod.DecipherGCM = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.DecipherGCM]
  @scala.inline
  def createDecipheriv(
    algorithm: typingsSlinky.node.cryptoMod.CipherGCMTypes,
    key: typingsSlinky.node.cryptoMod.CipherKey,
    iv: typingsSlinky.node.cryptoMod.BinaryLike,
    options: typingsSlinky.node.cryptoMod.CipherGCMOptions
  ): typingsSlinky.node.cryptoMod.DecipherGCM = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.DecipherGCM]
  
  @scala.inline
  def createDiffieHellman(prime_length: scala.Double): typingsSlinky.node.cryptoMod.DiffieHellman_ = typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime_length.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.cryptoMod.DiffieHellman_]
  @scala.inline
  def createDiffieHellman(prime_length: scala.Double, generator: scala.Double): typingsSlinky.node.cryptoMod.DiffieHellman_ = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime_length.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.DiffieHellman_]
  @scala.inline
  def createDiffieHellman(prime_length: scala.Double, generator: typingsSlinky.node.NodeJS.ArrayBufferView): typingsSlinky.node.cryptoMod.DiffieHellman_ = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime_length.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.DiffieHellman_]
  @scala.inline
  def createDiffieHellman(prime: java.lang.String, prime_encoding: typingsSlinky.node.cryptoMod.HexBase64Latin1Encoding): typingsSlinky.node.cryptoMod.DiffieHellman_ = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], prime_encoding.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.DiffieHellman_]
  @scala.inline
  def createDiffieHellman(
    prime: java.lang.String,
    prime_encoding: typingsSlinky.node.cryptoMod.HexBase64Latin1Encoding,
    generator: java.lang.String,
    generator_encoding: typingsSlinky.node.cryptoMod.HexBase64Latin1Encoding
  ): typingsSlinky.node.cryptoMod.DiffieHellman_ = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], prime_encoding.asInstanceOf[js.Any], generator.asInstanceOf[js.Any], generator_encoding.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.DiffieHellman_]
  @scala.inline
  def createDiffieHellman(
    prime: java.lang.String,
    prime_encoding: typingsSlinky.node.cryptoMod.HexBase64Latin1Encoding,
    generator: scala.Double
  ): typingsSlinky.node.cryptoMod.DiffieHellman_ = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], prime_encoding.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.DiffieHellman_]
  @scala.inline
  def createDiffieHellman(
    prime: java.lang.String,
    prime_encoding: typingsSlinky.node.cryptoMod.HexBase64Latin1Encoding,
    generator: typingsSlinky.node.NodeJS.ArrayBufferView
  ): typingsSlinky.node.cryptoMod.DiffieHellman_ = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], prime_encoding.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.DiffieHellman_]
  @scala.inline
  def createDiffieHellman(prime: typingsSlinky.node.NodeJS.ArrayBufferView): typingsSlinky.node.cryptoMod.DiffieHellman_ = typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.cryptoMod.DiffieHellman_]
  
  @scala.inline
  def createECDH(curve_name: java.lang.String): typingsSlinky.node.cryptoMod.ECDH = typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createECDH")(curve_name.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.cryptoMod.ECDH]
  
  @scala.inline
  def createHash(algorithm: java.lang.String): typingsSlinky.node.cryptoMod.Hash = typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createHash")(algorithm.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.cryptoMod.Hash]
  @scala.inline
  def createHash(algorithm: java.lang.String, options: typingsSlinky.node.cryptoMod.HashOptions): typingsSlinky.node.cryptoMod.Hash = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createHash")(algorithm.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.Hash]
  
  @scala.inline
  def createHmac(algorithm: java.lang.String, key: typingsSlinky.node.cryptoMod.BinaryLike): typingsSlinky.node.cryptoMod.Hmac = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createHmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.Hmac]
  @scala.inline
  def createHmac(
    algorithm: java.lang.String,
    key: typingsSlinky.node.cryptoMod.BinaryLike,
    options: typingsSlinky.node.streamMod.TransformOptions
  ): typingsSlinky.node.cryptoMod.Hmac = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createHmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.Hmac]
  @scala.inline
  def createHmac(algorithm: java.lang.String, key: typingsSlinky.node.cryptoMod.KeyObject): typingsSlinky.node.cryptoMod.Hmac = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createHmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.Hmac]
  @scala.inline
  def createHmac(
    algorithm: java.lang.String,
    key: typingsSlinky.node.cryptoMod.KeyObject,
    options: typingsSlinky.node.streamMod.TransformOptions
  ): typingsSlinky.node.cryptoMod.Hmac = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createHmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.Hmac]
  
  @scala.inline
  def createPrivateKey(key: java.lang.String): typingsSlinky.node.cryptoMod.KeyObject = typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createPrivateKey")(key.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.cryptoMod.KeyObject]
  @scala.inline
  def createPrivateKey(key: typingsSlinky.node.Buffer): typingsSlinky.node.cryptoMod.KeyObject = typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createPrivateKey")(key.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.cryptoMod.KeyObject]
  @scala.inline
  def createPrivateKey(key: typingsSlinky.node.cryptoMod.PrivateKeyInput): typingsSlinky.node.cryptoMod.KeyObject = typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createPrivateKey")(key.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.cryptoMod.KeyObject]
  
  @scala.inline
  def createPublicKey(key: java.lang.String): typingsSlinky.node.cryptoMod.KeyObject = typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createPublicKey")(key.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.cryptoMod.KeyObject]
  @scala.inline
  def createPublicKey(key: typingsSlinky.node.Buffer): typingsSlinky.node.cryptoMod.KeyObject = typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createPublicKey")(key.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.cryptoMod.KeyObject]
  @scala.inline
  def createPublicKey(key: typingsSlinky.node.cryptoMod.KeyObject): typingsSlinky.node.cryptoMod.KeyObject = typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createPublicKey")(key.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.cryptoMod.KeyObject]
  @scala.inline
  def createPublicKey(key: typingsSlinky.node.cryptoMod.PublicKeyInput): typingsSlinky.node.cryptoMod.KeyObject = typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createPublicKey")(key.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.cryptoMod.KeyObject]
  
  @scala.inline
  def createSecretKey(key: typingsSlinky.node.NodeJS.ArrayBufferView): typingsSlinky.node.cryptoMod.KeyObject = typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecretKey")(key.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.cryptoMod.KeyObject]
  
  @scala.inline
  def createSign(algorithm: java.lang.String): typingsSlinky.node.cryptoMod.Signer = typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSign")(algorithm.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.cryptoMod.Signer]
  @scala.inline
  def createSign(algorithm: java.lang.String, options: typingsSlinky.node.streamMod.WritableOptions): typingsSlinky.node.cryptoMod.Signer = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSign")(algorithm.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.Signer]
  
  @scala.inline
  def createVerify(algorithm: java.lang.String): typingsSlinky.node.cryptoMod.Verify_ = typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createVerify")(algorithm.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.cryptoMod.Verify_]
  @scala.inline
  def createVerify(algorithm: java.lang.String, options: typingsSlinky.node.streamMod.WritableOptions): typingsSlinky.node.cryptoMod.Verify_ = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("createVerify")(algorithm.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.Verify_]
  
  /**
    * Computes the Diffie-Hellman secret based on a privateKey and a publicKey.
    * Both keys must have the same asymmetricKeyType, which must be one of
    * 'dh' (for Diffie-Hellman), 'ec' (for ECDH), 'x448', or 'x25519' (for ECDH-ES).
    */
  @scala.inline
  def diffieHellman(options: typingsSlinky.node.anon.PrivateKey): typingsSlinky.node.Buffer = typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("diffieHellman")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.Buffer]
  
  /** @deprecated since v10.0.0 */
  @scala.inline
  def fips: scala.Boolean = typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].selectDynamic("fips").asInstanceOf[scala.Boolean]
  
  @scala.inline
  def generateKeyPair(
    `type`: typingsSlinky.node.nodeStrings.dsa,
    options: typingsSlinky.node.cryptoMod.DSAKeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ js.Error | scala.Null, 
      /* publicKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      /* privateKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: typingsSlinky.node.nodeStrings.dsa,
    options: typingsSlinky.node.cryptoMod.DSAKeyPairOptions[
      typingsSlinky.node.nodeStrings.der | typingsSlinky.node.nodeStrings.pem, 
      typingsSlinky.node.nodeStrings.der | typingsSlinky.node.nodeStrings.pem
    ],
    callback: js.Function3[
      js.Error | scala.Null, 
      (/* publicKey */ typingsSlinky.node.Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ typingsSlinky.node.Buffer) | (/* privateKey */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: typingsSlinky.node.nodeStrings.ec,
    options: typingsSlinky.node.cryptoMod.ECKeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ js.Error | scala.Null, 
      /* publicKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      /* privateKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: typingsSlinky.node.nodeStrings.ec,
    options: typingsSlinky.node.cryptoMod.ECKeyPairOptions[
      typingsSlinky.node.nodeStrings.der | typingsSlinky.node.nodeStrings.pem, 
      typingsSlinky.node.nodeStrings.der | typingsSlinky.node.nodeStrings.pem
    ],
    callback: js.Function3[
      js.Error | scala.Null, 
      (/* publicKey */ typingsSlinky.node.Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ typingsSlinky.node.Buffer) | (/* privateKey */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: typingsSlinky.node.nodeStrings.ed25519,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ js.Error | scala.Null, 
      /* publicKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      /* privateKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: typingsSlinky.node.nodeStrings.ed25519,
    options: typingsSlinky.node.cryptoMod.ED25519KeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ js.Error | scala.Null, 
      /* publicKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      /* privateKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: typingsSlinky.node.nodeStrings.ed25519,
    options: typingsSlinky.node.cryptoMod.ED25519KeyPairOptions[
      typingsSlinky.node.nodeStrings.der | typingsSlinky.node.nodeStrings.pem, 
      typingsSlinky.node.nodeStrings.der | typingsSlinky.node.nodeStrings.pem
    ],
    callback: js.Function3[
      js.Error | scala.Null, 
      (/* publicKey */ typingsSlinky.node.Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ typingsSlinky.node.Buffer) | (/* privateKey */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: typingsSlinky.node.nodeStrings.ed448,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ js.Error | scala.Null, 
      /* publicKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      /* privateKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: typingsSlinky.node.nodeStrings.ed448,
    options: typingsSlinky.node.cryptoMod.ED448KeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ js.Error | scala.Null, 
      /* publicKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      /* privateKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: typingsSlinky.node.nodeStrings.ed448,
    options: typingsSlinky.node.cryptoMod.ED448KeyPairOptions[
      typingsSlinky.node.nodeStrings.der | typingsSlinky.node.nodeStrings.pem, 
      typingsSlinky.node.nodeStrings.der | typingsSlinky.node.nodeStrings.pem
    ],
    callback: js.Function3[
      js.Error | scala.Null, 
      (/* publicKey */ typingsSlinky.node.Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ typingsSlinky.node.Buffer) | (/* privateKey */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: typingsSlinky.node.nodeStrings.rsa,
    options: typingsSlinky.node.cryptoMod.RSAKeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ js.Error | scala.Null, 
      /* publicKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      /* privateKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: typingsSlinky.node.nodeStrings.rsa,
    options: typingsSlinky.node.cryptoMod.RSAKeyPairOptions[
      typingsSlinky.node.nodeStrings.der | typingsSlinky.node.nodeStrings.pem, 
      typingsSlinky.node.nodeStrings.der | typingsSlinky.node.nodeStrings.pem
    ],
    callback: js.Function3[
      js.Error | scala.Null, 
      (/* publicKey */ typingsSlinky.node.Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ typingsSlinky.node.Buffer) | (/* privateKey */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: typingsSlinky.node.nodeStrings.x25519,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ js.Error | scala.Null, 
      /* publicKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      /* privateKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: typingsSlinky.node.nodeStrings.x25519,
    options: typingsSlinky.node.cryptoMod.X25519KeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ js.Error | scala.Null, 
      /* publicKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      /* privateKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: typingsSlinky.node.nodeStrings.x25519,
    options: typingsSlinky.node.cryptoMod.X25519KeyPairOptions[
      typingsSlinky.node.nodeStrings.der | typingsSlinky.node.nodeStrings.pem, 
      typingsSlinky.node.nodeStrings.der | typingsSlinky.node.nodeStrings.pem
    ],
    callback: js.Function3[
      js.Error | scala.Null, 
      (/* publicKey */ typingsSlinky.node.Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ typingsSlinky.node.Buffer) | (/* privateKey */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: typingsSlinky.node.nodeStrings.x448,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ js.Error | scala.Null, 
      /* publicKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      /* privateKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: typingsSlinky.node.nodeStrings.x448,
    options: typingsSlinky.node.cryptoMod.X448KeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ js.Error | scala.Null, 
      /* publicKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      /* privateKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def generateKeyPair(
    `type`: typingsSlinky.node.nodeStrings.x448,
    options: typingsSlinky.node.cryptoMod.X448KeyPairOptions[
      typingsSlinky.node.nodeStrings.der | typingsSlinky.node.nodeStrings.pem, 
      typingsSlinky.node.nodeStrings.der | typingsSlinky.node.nodeStrings.pem
    ],
    callback: js.Function3[
      js.Error | scala.Null, 
      (/* publicKey */ typingsSlinky.node.Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ typingsSlinky.node.Buffer) | (/* privateKey */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def generateKeyPairSync(
    `type`: typingsSlinky.node.nodeStrings.dsa,
    options: typingsSlinky.node.cryptoMod.DSAKeyPairOptions[
      typingsSlinky.node.nodeStrings.der | typingsSlinky.node.nodeStrings.pem, 
      typingsSlinky.node.nodeStrings.der | typingsSlinky.node.nodeStrings.pem
    ]
  ): typingsSlinky.node.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String] = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String]]
  @scala.inline
  def generateKeyPairSync(
    `type`: typingsSlinky.node.nodeStrings.ec,
    options: typingsSlinky.node.cryptoMod.ECKeyPairOptions[
      typingsSlinky.node.nodeStrings.der | typingsSlinky.node.nodeStrings.pem, 
      typingsSlinky.node.nodeStrings.der | typingsSlinky.node.nodeStrings.pem
    ]
  ): typingsSlinky.node.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String] = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String]]
  @scala.inline
  def generateKeyPairSync(
    `type`: typingsSlinky.node.nodeStrings.ed25519,
    options: typingsSlinky.node.cryptoMod.ED25519KeyPairOptions[
      typingsSlinky.node.nodeStrings.der | typingsSlinky.node.nodeStrings.pem, 
      typingsSlinky.node.nodeStrings.der | typingsSlinky.node.nodeStrings.pem
    ]
  ): typingsSlinky.node.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String] = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String]]
  @scala.inline
  def generateKeyPairSync(
    `type`: typingsSlinky.node.nodeStrings.ed448,
    options: typingsSlinky.node.cryptoMod.ED448KeyPairOptions[
      typingsSlinky.node.nodeStrings.der | typingsSlinky.node.nodeStrings.pem, 
      typingsSlinky.node.nodeStrings.der | typingsSlinky.node.nodeStrings.pem
    ]
  ): typingsSlinky.node.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String] = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String]]
  @scala.inline
  def generateKeyPairSync(
    `type`: typingsSlinky.node.nodeStrings.rsa,
    options: typingsSlinky.node.cryptoMod.RSAKeyPairOptions[
      typingsSlinky.node.nodeStrings.der | typingsSlinky.node.nodeStrings.pem, 
      typingsSlinky.node.nodeStrings.der | typingsSlinky.node.nodeStrings.pem
    ]
  ): typingsSlinky.node.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String] = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String]]
  @scala.inline
  def generateKeyPairSync(
    `type`: typingsSlinky.node.nodeStrings.x25519,
    options: typingsSlinky.node.cryptoMod.X25519KeyPairOptions[
      typingsSlinky.node.nodeStrings.der | typingsSlinky.node.nodeStrings.pem, 
      typingsSlinky.node.nodeStrings.der | typingsSlinky.node.nodeStrings.pem
    ]
  ): typingsSlinky.node.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String] = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String]]
  @scala.inline
  def generateKeyPairSync(
    `type`: typingsSlinky.node.nodeStrings.x448,
    options: typingsSlinky.node.cryptoMod.X448KeyPairOptions[
      typingsSlinky.node.nodeStrings.der | typingsSlinky.node.nodeStrings.pem, 
      typingsSlinky.node.nodeStrings.der | typingsSlinky.node.nodeStrings.pem
    ]
  ): typingsSlinky.node.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String] = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String]]
  
  @scala.inline
  def generateKeyPairSync_dsa(
    `type`: typingsSlinky.node.nodeStrings.dsa,
    options: typingsSlinky.node.cryptoMod.DSAKeyPairKeyObjectOptions
  ): typingsSlinky.node.cryptoMod.KeyPairKeyObjectResult = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.KeyPairKeyObjectResult]
  
  @scala.inline
  def generateKeyPairSync_ec(
    `type`: typingsSlinky.node.nodeStrings.ec,
    options: typingsSlinky.node.cryptoMod.ECKeyPairKeyObjectOptions
  ): typingsSlinky.node.cryptoMod.KeyPairKeyObjectResult = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.KeyPairKeyObjectResult]
  
  @scala.inline
  def generateKeyPairSync_ed25519(`type`: typingsSlinky.node.nodeStrings.ed25519): typingsSlinky.node.cryptoMod.KeyPairKeyObjectResult = typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.cryptoMod.KeyPairKeyObjectResult]
  @scala.inline
  def generateKeyPairSync_ed25519(
    `type`: typingsSlinky.node.nodeStrings.ed25519,
    options: typingsSlinky.node.cryptoMod.ED25519KeyPairKeyObjectOptions
  ): typingsSlinky.node.cryptoMod.KeyPairKeyObjectResult = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.KeyPairKeyObjectResult]
  
  @scala.inline
  def generateKeyPairSync_ed448(`type`: typingsSlinky.node.nodeStrings.ed448): typingsSlinky.node.cryptoMod.KeyPairKeyObjectResult = typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.cryptoMod.KeyPairKeyObjectResult]
  @scala.inline
  def generateKeyPairSync_ed448(
    `type`: typingsSlinky.node.nodeStrings.ed448,
    options: typingsSlinky.node.cryptoMod.ED448KeyPairKeyObjectOptions
  ): typingsSlinky.node.cryptoMod.KeyPairKeyObjectResult = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.KeyPairKeyObjectResult]
  
  @scala.inline
  def generateKeyPairSync_rsa(
    `type`: typingsSlinky.node.nodeStrings.rsa,
    options: typingsSlinky.node.cryptoMod.RSAKeyPairKeyObjectOptions
  ): typingsSlinky.node.cryptoMod.KeyPairKeyObjectResult = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.KeyPairKeyObjectResult]
  
  @scala.inline
  def generateKeyPairSync_x25519(`type`: typingsSlinky.node.nodeStrings.x25519): typingsSlinky.node.cryptoMod.KeyPairKeyObjectResult = typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.cryptoMod.KeyPairKeyObjectResult]
  @scala.inline
  def generateKeyPairSync_x25519(
    `type`: typingsSlinky.node.nodeStrings.x25519,
    options: typingsSlinky.node.cryptoMod.X25519KeyPairKeyObjectOptions
  ): typingsSlinky.node.cryptoMod.KeyPairKeyObjectResult = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.KeyPairKeyObjectResult]
  
  @scala.inline
  def generateKeyPairSync_x448(`type`: typingsSlinky.node.nodeStrings.x448): typingsSlinky.node.cryptoMod.KeyPairKeyObjectResult = typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.cryptoMod.KeyPairKeyObjectResult]
  @scala.inline
  def generateKeyPairSync_x448(
    `type`: typingsSlinky.node.nodeStrings.x448,
    options: typingsSlinky.node.cryptoMod.X448KeyPairKeyObjectOptions
  ): typingsSlinky.node.cryptoMod.KeyPairKeyObjectResult = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.cryptoMod.KeyPairKeyObjectResult]
  
  @scala.inline
  def getCiphers(): js.Array[java.lang.String] = typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("getCiphers")().asInstanceOf[js.Array[java.lang.String]]
  
  @scala.inline
  def getCurves(): js.Array[java.lang.String] = typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("getCurves")().asInstanceOf[js.Array[java.lang.String]]
  
  @scala.inline
  def getDiffieHellman(group_name: java.lang.String): typingsSlinky.node.cryptoMod.DiffieHellman_ = typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("getDiffieHellman")(group_name.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.cryptoMod.DiffieHellman_]
  
  @scala.inline
  def getFips(): typingsSlinky.node.nodeNumbers.`1` | typingsSlinky.node.nodeNumbers.`0` = typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("getFips")().asInstanceOf[typingsSlinky.node.nodeNumbers.`1` | typingsSlinky.node.nodeNumbers.`0`]
  
  @scala.inline
  def getHashes(): js.Array[java.lang.String] = typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("getHashes")().asInstanceOf[js.Array[java.lang.String]]
  
  @scala.inline
  def pbkdf2(
    password: typingsSlinky.node.cryptoMod.BinaryLike,
    salt: typingsSlinky.node.cryptoMod.BinaryLike,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* derivedKey */ typingsSlinky.node.Buffer, _]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def pbkdf2Sync(
    password: typingsSlinky.node.cryptoMod.BinaryLike,
    salt: typingsSlinky.node.cryptoMod.BinaryLike,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): typingsSlinky.node.Buffer = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  
  @scala.inline
  def privateDecrypt(
    private_key: typingsSlinky.node.cryptoMod.KeyLike,
    buffer: typingsSlinky.node.NodeJS.ArrayBufferView
  ): typingsSlinky.node.Buffer = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("privateDecrypt")(private_key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  @scala.inline
  def privateDecrypt(
    private_key: typingsSlinky.node.cryptoMod.RsaPrivateKey,
    buffer: typingsSlinky.node.NodeJS.ArrayBufferView
  ): typingsSlinky.node.Buffer = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("privateDecrypt")(private_key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  
  @scala.inline
  def privateEncrypt(
    private_key: typingsSlinky.node.cryptoMod.KeyLike,
    buffer: typingsSlinky.node.NodeJS.ArrayBufferView
  ): typingsSlinky.node.Buffer = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("privateEncrypt")(private_key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  @scala.inline
  def privateEncrypt(
    private_key: typingsSlinky.node.cryptoMod.RsaPrivateKey,
    buffer: typingsSlinky.node.NodeJS.ArrayBufferView
  ): typingsSlinky.node.Buffer = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("privateEncrypt")(private_key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  
  @scala.inline
  def pseudoRandomBytes(size: scala.Double): typingsSlinky.node.Buffer = typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("pseudoRandomBytes")(size.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.Buffer]
  @scala.inline
  def pseudoRandomBytes(
    size: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ typingsSlinky.node.Buffer, scala.Unit]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("pseudoRandomBytes")(size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def publicDecrypt(key: typingsSlinky.node.cryptoMod.KeyLike, buffer: typingsSlinky.node.NodeJS.ArrayBufferView): typingsSlinky.node.Buffer = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("publicDecrypt")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  @scala.inline
  def publicDecrypt(key: typingsSlinky.node.cryptoMod.RsaPrivateKey, buffer: typingsSlinky.node.NodeJS.ArrayBufferView): typingsSlinky.node.Buffer = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("publicDecrypt")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  @scala.inline
  def publicDecrypt(key: typingsSlinky.node.cryptoMod.RsaPublicKey, buffer: typingsSlinky.node.NodeJS.ArrayBufferView): typingsSlinky.node.Buffer = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("publicDecrypt")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  
  @scala.inline
  def publicEncrypt(key: typingsSlinky.node.cryptoMod.KeyLike, buffer: typingsSlinky.node.NodeJS.ArrayBufferView): typingsSlinky.node.Buffer = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("publicEncrypt")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  @scala.inline
  def publicEncrypt(key: typingsSlinky.node.cryptoMod.RsaPrivateKey, buffer: typingsSlinky.node.NodeJS.ArrayBufferView): typingsSlinky.node.Buffer = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("publicEncrypt")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  @scala.inline
  def publicEncrypt(key: typingsSlinky.node.cryptoMod.RsaPublicKey, buffer: typingsSlinky.node.NodeJS.ArrayBufferView): typingsSlinky.node.Buffer = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("publicEncrypt")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  
  @scala.inline
  def randomBytes(size: scala.Double): typingsSlinky.node.Buffer = typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomBytes")(size.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.Buffer]
  @scala.inline
  def randomBytes(
    size: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ typingsSlinky.node.Buffer, scala.Unit]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomBytes")(size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def randomFill(
    buffer: js.typedarray.DataView,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.DataView, scala.Unit]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.DataView,
    offset: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.DataView, scala.Unit]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.DataView,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.DataView, scala.Unit]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Float32Array,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Float32Array, scala.Unit]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Float32Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Float32Array, scala.Unit]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Float32Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Float32Array, scala.Unit]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Float64Array,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Float64Array, scala.Unit]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Float64Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Float64Array, scala.Unit]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Float64Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Float64Array, scala.Unit]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Int16Array,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Int16Array, scala.Unit]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Int16Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Int16Array, scala.Unit]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Int16Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Int16Array, scala.Unit]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Int32Array,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Int32Array, scala.Unit]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Int32Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Int32Array, scala.Unit]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Int32Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Int32Array, scala.Unit]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Int8Array,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Int8Array, scala.Unit]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Int8Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Int8Array, scala.Unit]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Int8Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Int8Array, scala.Unit]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Uint16Array,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Uint16Array, scala.Unit]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Uint16Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Uint16Array, scala.Unit]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Uint16Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Uint16Array, scala.Unit]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Uint32Array,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Uint32Array, scala.Unit]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Uint32Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Uint32Array, scala.Unit]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Uint32Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Uint32Array, scala.Unit]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Uint8Array,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Uint8Array, scala.Unit]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Uint8Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Uint8Array, scala.Unit]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Uint8Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* buf */ js.typedarray.Uint8Array, scala.Unit]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Uint8ClampedArray,
    callback: js.Function2[
      /* err */ js.Error | scala.Null, 
      /* buf */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    callback: js.Function2[
      /* err */ js.Error | scala.Null, 
      /* buf */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomFill(
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[
      /* err */ js.Error | scala.Null, 
      /* buf */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def randomFillSync(buffer: js.typedarray.DataView): js.typedarray.DataView = typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.DataView]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.DataView, offset: js.UndefOr[scala.Nothing], size: scala.Double): js.typedarray.DataView = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.DataView]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.DataView, offset: scala.Double): js.typedarray.DataView = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.DataView]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.DataView, offset: scala.Double, size: scala.Double): js.typedarray.DataView = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.DataView]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Float32Array): js.typedarray.Float32Array = typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Float32Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Float32Array, offset: js.UndefOr[scala.Nothing], size: scala.Double): js.typedarray.Float32Array = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Float32Array, offset: scala.Double): js.typedarray.Float32Array = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Float32Array, offset: scala.Double, size: scala.Double): js.typedarray.Float32Array = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Float64Array): js.typedarray.Float64Array = typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Float64Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Float64Array, offset: js.UndefOr[scala.Nothing], size: scala.Double): js.typedarray.Float64Array = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float64Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Float64Array, offset: scala.Double): js.typedarray.Float64Array = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float64Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Float64Array, offset: scala.Double, size: scala.Double): js.typedarray.Float64Array = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float64Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Int16Array): js.typedarray.Int16Array = typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Int16Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Int16Array, offset: js.UndefOr[scala.Nothing], size: scala.Double): js.typedarray.Int16Array = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int16Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Int16Array, offset: scala.Double): js.typedarray.Int16Array = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int16Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Int16Array, offset: scala.Double, size: scala.Double): js.typedarray.Int16Array = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int16Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Int32Array): js.typedarray.Int32Array = typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Int32Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Int32Array, offset: js.UndefOr[scala.Nothing], size: scala.Double): js.typedarray.Int32Array = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int32Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Int32Array, offset: scala.Double): js.typedarray.Int32Array = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int32Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Int32Array, offset: scala.Double, size: scala.Double): js.typedarray.Int32Array = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int32Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Int8Array): js.typedarray.Int8Array = typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Int8Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Int8Array, offset: js.UndefOr[scala.Nothing], size: scala.Double): js.typedarray.Int8Array = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int8Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Int8Array, offset: scala.Double): js.typedarray.Int8Array = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int8Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Int8Array, offset: scala.Double, size: scala.Double): js.typedarray.Int8Array = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int8Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint16Array): js.typedarray.Uint16Array = typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint16Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint16Array, offset: js.UndefOr[scala.Nothing], size: scala.Double): js.typedarray.Uint16Array = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint16Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint16Array, offset: scala.Double): js.typedarray.Uint16Array = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint16Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint16Array, offset: scala.Double, size: scala.Double): js.typedarray.Uint16Array = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint16Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint32Array): js.typedarray.Uint32Array = typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint32Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint32Array, offset: js.UndefOr[scala.Nothing], size: scala.Double): js.typedarray.Uint32Array = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint32Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint32Array, offset: scala.Double): js.typedarray.Uint32Array = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint32Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint32Array, offset: scala.Double, size: scala.Double): js.typedarray.Uint32Array = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint32Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint8Array): js.typedarray.Uint8Array = typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint8Array, offset: js.UndefOr[scala.Nothing], size: scala.Double): js.typedarray.Uint8Array = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint8Array, offset: scala.Double): js.typedarray.Uint8Array = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint8Array, offset: scala.Double, size: scala.Double): js.typedarray.Uint8Array = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint8ClampedArray): js.typedarray.Uint8ClampedArray = typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8ClampedArray]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint8ClampedArray, offset: js.UndefOr[scala.Nothing], size: scala.Double): js.typedarray.Uint8ClampedArray = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8ClampedArray]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint8ClampedArray, offset: scala.Double): js.typedarray.Uint8ClampedArray = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8ClampedArray]
  @scala.inline
  def randomFillSync(buffer: js.typedarray.Uint8ClampedArray, offset: scala.Double, size: scala.Double): js.typedarray.Uint8ClampedArray = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8ClampedArray]
  
  @scala.inline
  def randomInt(max: scala.Double): scala.Double = typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomInt")(max.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
  @scala.inline
  def randomInt(
    max: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* value */ scala.Double, scala.Unit]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomInt")(max.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def randomInt(min: scala.Double, max: scala.Double): scala.Double = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomInt")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def randomInt(
    min: scala.Double,
    max: scala.Double,
    callback: js.Function2[/* err */ js.Error | scala.Null, /* value */ scala.Double, scala.Unit]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("randomInt")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def scrypt(
    password: typingsSlinky.node.cryptoMod.BinaryLike,
    salt: typingsSlinky.node.cryptoMod.BinaryLike,
    keylen: scala.Double,
    callback: js.Function2[
      /* err */ js.Error | scala.Null, 
      /* derivedKey */ typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("scrypt")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def scrypt(
    password: typingsSlinky.node.cryptoMod.BinaryLike,
    salt: typingsSlinky.node.cryptoMod.BinaryLike,
    keylen: scala.Double,
    options: typingsSlinky.node.cryptoMod.ScryptOptions,
    callback: js.Function2[
      /* err */ js.Error | scala.Null, 
      /* derivedKey */ typingsSlinky.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("scrypt")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def scryptSync(
    password: typingsSlinky.node.cryptoMod.BinaryLike,
    salt: typingsSlinky.node.cryptoMod.BinaryLike,
    keylen: scala.Double
  ): typingsSlinky.node.Buffer = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("scryptSync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  @scala.inline
  def scryptSync(
    password: typingsSlinky.node.cryptoMod.BinaryLike,
    salt: typingsSlinky.node.cryptoMod.BinaryLike,
    keylen: scala.Double,
    options: typingsSlinky.node.cryptoMod.ScryptOptions
  ): typingsSlinky.node.Buffer = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("scryptSync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  
  @scala.inline
  def sign(
    algorithm: js.UndefOr[scala.Nothing],
    data: typingsSlinky.node.NodeJS.ArrayBufferView,
    key: typingsSlinky.node.cryptoMod.KeyLike
  ): typingsSlinky.node.Buffer = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  @scala.inline
  def sign(
    algorithm: js.UndefOr[scala.Nothing],
    data: typingsSlinky.node.NodeJS.ArrayBufferView,
    key: typingsSlinky.node.cryptoMod.SignKeyObjectInput
  ): typingsSlinky.node.Buffer = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  @scala.inline
  def sign(
    algorithm: js.UndefOr[scala.Nothing],
    data: typingsSlinky.node.NodeJS.ArrayBufferView,
    key: typingsSlinky.node.cryptoMod.SignPrivateKeyInput
  ): typingsSlinky.node.Buffer = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  /**
    * Calculates and returns the signature for `data` using the given private key and
    * algorithm. If `algorithm` is `null` or `undefined`, then the algorithm is
    * dependent upon the key type (especially Ed25519 and Ed448).
    *
    * If `key` is not a [`KeyObject`][], this function behaves as if `key` had been
    * passed to [`crypto.createPrivateKey()`][].
    */
  @scala.inline
  def sign(
    algorithm: java.lang.String,
    data: typingsSlinky.node.NodeJS.ArrayBufferView,
    key: typingsSlinky.node.cryptoMod.KeyLike
  ): typingsSlinky.node.Buffer = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  @scala.inline
  def sign(
    algorithm: java.lang.String,
    data: typingsSlinky.node.NodeJS.ArrayBufferView,
    key: typingsSlinky.node.cryptoMod.SignKeyObjectInput
  ): typingsSlinky.node.Buffer = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  @scala.inline
  def sign(
    algorithm: java.lang.String,
    data: typingsSlinky.node.NodeJS.ArrayBufferView,
    key: typingsSlinky.node.cryptoMod.SignPrivateKeyInput
  ): typingsSlinky.node.Buffer = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  @scala.inline
  def sign(
    algorithm: scala.Null,
    data: typingsSlinky.node.NodeJS.ArrayBufferView,
    key: typingsSlinky.node.cryptoMod.KeyLike
  ): typingsSlinky.node.Buffer = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  @scala.inline
  def sign(
    algorithm: scala.Null,
    data: typingsSlinky.node.NodeJS.ArrayBufferView,
    key: typingsSlinky.node.cryptoMod.SignKeyObjectInput
  ): typingsSlinky.node.Buffer = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  @scala.inline
  def sign(
    algorithm: scala.Null,
    data: typingsSlinky.node.NodeJS.ArrayBufferView,
    key: typingsSlinky.node.cryptoMod.SignPrivateKeyInput
  ): typingsSlinky.node.Buffer = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.node.Buffer]
  
  @scala.inline
  def timingSafeEqual(a: typingsSlinky.node.NodeJS.ArrayBufferView, b: typingsSlinky.node.NodeJS.ArrayBufferView): scala.Boolean = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("timingSafeEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def verify(
    algorithm: js.UndefOr[scala.Nothing],
    data: typingsSlinky.node.NodeJS.ArrayBufferView,
    key: typingsSlinky.node.cryptoMod.KeyLike,
    signature: typingsSlinky.node.NodeJS.ArrayBufferView
  ): scala.Boolean = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def verify(
    algorithm: js.UndefOr[scala.Nothing],
    data: typingsSlinky.node.NodeJS.ArrayBufferView,
    key: typingsSlinky.node.cryptoMod.VerifyKeyObjectInput,
    signature: typingsSlinky.node.NodeJS.ArrayBufferView
  ): scala.Boolean = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def verify(
    algorithm: js.UndefOr[scala.Nothing],
    data: typingsSlinky.node.NodeJS.ArrayBufferView,
    key: typingsSlinky.node.cryptoMod.VerifyPublicKeyInput,
    signature: typingsSlinky.node.NodeJS.ArrayBufferView
  ): scala.Boolean = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  /**
    * Calculates and returns the signature for `data` using the given private key and
    * algorithm. If `algorithm` is `null` or `undefined`, then the algorithm is
    * dependent upon the key type (especially Ed25519 and Ed448).
    *
    * If `key` is not a [`KeyObject`][], this function behaves as if `key` had been
    * passed to [`crypto.createPublicKey()`][].
    */
  @scala.inline
  def verify(
    algorithm: java.lang.String,
    data: typingsSlinky.node.NodeJS.ArrayBufferView,
    key: typingsSlinky.node.cryptoMod.KeyLike,
    signature: typingsSlinky.node.NodeJS.ArrayBufferView
  ): scala.Boolean = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def verify(
    algorithm: java.lang.String,
    data: typingsSlinky.node.NodeJS.ArrayBufferView,
    key: typingsSlinky.node.cryptoMod.VerifyKeyObjectInput,
    signature: typingsSlinky.node.NodeJS.ArrayBufferView
  ): scala.Boolean = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def verify(
    algorithm: java.lang.String,
    data: typingsSlinky.node.NodeJS.ArrayBufferView,
    key: typingsSlinky.node.cryptoMod.VerifyPublicKeyInput,
    signature: typingsSlinky.node.NodeJS.ArrayBufferView
  ): scala.Boolean = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def verify(
    algorithm: scala.Null,
    data: typingsSlinky.node.NodeJS.ArrayBufferView,
    key: typingsSlinky.node.cryptoMod.KeyLike,
    signature: typingsSlinky.node.NodeJS.ArrayBufferView
  ): scala.Boolean = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def verify(
    algorithm: scala.Null,
    data: typingsSlinky.node.NodeJS.ArrayBufferView,
    key: typingsSlinky.node.cryptoMod.VerifyKeyObjectInput,
    signature: typingsSlinky.node.NodeJS.ArrayBufferView
  ): scala.Boolean = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def verify(
    algorithm: scala.Null,
    data: typingsSlinky.node.NodeJS.ArrayBufferView,
    key: typingsSlinky.node.cryptoMod.VerifyPublicKeyInput,
    signature: typingsSlinky.node.NodeJS.ArrayBufferView
  ): scala.Boolean = (typingsSlinky.node.cryptoMod.^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
}
