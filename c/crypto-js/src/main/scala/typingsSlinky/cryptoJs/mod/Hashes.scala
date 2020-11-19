package typingsSlinky.cryptoJs.mod

import typingsSlinky.cryptoJs.anon.AES
import typingsSlinky.cryptoJs.anon.AnsiX923
import typingsSlinky.cryptoJs.anon.Base64
import typingsSlinky.cryptoJs.anon.CBC
import typingsSlinky.cryptoJs.anon.Hex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hashes extends js.Object {
  
  var AES: CipherHelper = js.native
  
  var DES: CipherHelper = js.native
  
  var EvpKDF: CipherHelper = js.native
  
  def HmacMD5(message: String, key: js.UndefOr[scala.Nothing], options: js.Any*): WordArray = js.native
  def HmacMD5(message: String, key: String, options: js.Any*): WordArray = js.native
  def HmacMD5(message: String, key: WordArray, options: js.Any*): WordArray = js.native
  def HmacMD5(message: String, options: js.Any*): WordArray = js.native
  def HmacMD5(message: LibWordArray, key: js.UndefOr[scala.Nothing], options: js.Any*): WordArray = js.native
  def HmacMD5(message: LibWordArray, key: String, options: js.Any*): WordArray = js.native
  def HmacMD5(message: LibWordArray, key: WordArray, options: js.Any*): WordArray = js.native
  def HmacMD5(message: LibWordArray, options: js.Any*): WordArray = js.native
  
  def HmacRIPEMD160(message: String, key: js.UndefOr[scala.Nothing], options: js.Any*): WordArray = js.native
  def HmacRIPEMD160(message: String, key: String, options: js.Any*): WordArray = js.native
  def HmacRIPEMD160(message: String, key: WordArray, options: js.Any*): WordArray = js.native
  def HmacRIPEMD160(message: String, options: js.Any*): WordArray = js.native
  def HmacRIPEMD160(message: LibWordArray, key: js.UndefOr[scala.Nothing], options: js.Any*): WordArray = js.native
  def HmacRIPEMD160(message: LibWordArray, key: String, options: js.Any*): WordArray = js.native
  def HmacRIPEMD160(message: LibWordArray, key: WordArray, options: js.Any*): WordArray = js.native
  def HmacRIPEMD160(message: LibWordArray, options: js.Any*): WordArray = js.native
  
  def HmacSHA1(message: String, key: js.UndefOr[scala.Nothing], options: js.Any*): WordArray = js.native
  def HmacSHA1(message: String, key: String, options: js.Any*): WordArray = js.native
  def HmacSHA1(message: String, key: WordArray, options: js.Any*): WordArray = js.native
  def HmacSHA1(message: String, options: js.Any*): WordArray = js.native
  def HmacSHA1(message: LibWordArray, key: js.UndefOr[scala.Nothing], options: js.Any*): WordArray = js.native
  def HmacSHA1(message: LibWordArray, key: String, options: js.Any*): WordArray = js.native
  def HmacSHA1(message: LibWordArray, key: WordArray, options: js.Any*): WordArray = js.native
  def HmacSHA1(message: LibWordArray, options: js.Any*): WordArray = js.native
  
  def HmacSHA224(message: String, key: js.UndefOr[scala.Nothing], options: js.Any*): WordArray = js.native
  def HmacSHA224(message: String, key: String, options: js.Any*): WordArray = js.native
  def HmacSHA224(message: String, key: WordArray, options: js.Any*): WordArray = js.native
  def HmacSHA224(message: String, options: js.Any*): WordArray = js.native
  def HmacSHA224(message: LibWordArray, key: js.UndefOr[scala.Nothing], options: js.Any*): WordArray = js.native
  def HmacSHA224(message: LibWordArray, key: String, options: js.Any*): WordArray = js.native
  def HmacSHA224(message: LibWordArray, key: WordArray, options: js.Any*): WordArray = js.native
  def HmacSHA224(message: LibWordArray, options: js.Any*): WordArray = js.native
  
  def HmacSHA256(message: String, key: js.UndefOr[scala.Nothing], options: js.Any*): WordArray = js.native
  def HmacSHA256(message: String, key: String, options: js.Any*): WordArray = js.native
  def HmacSHA256(message: String, key: WordArray, options: js.Any*): WordArray = js.native
  def HmacSHA256(message: String, options: js.Any*): WordArray = js.native
  def HmacSHA256(message: LibWordArray, key: js.UndefOr[scala.Nothing], options: js.Any*): WordArray = js.native
  def HmacSHA256(message: LibWordArray, key: String, options: js.Any*): WordArray = js.native
  def HmacSHA256(message: LibWordArray, key: WordArray, options: js.Any*): WordArray = js.native
  def HmacSHA256(message: LibWordArray, options: js.Any*): WordArray = js.native
  
  def HmacSHA3(message: String, key: js.UndefOr[scala.Nothing], options: js.Any*): WordArray = js.native
  def HmacSHA3(message: String, key: String, options: js.Any*): WordArray = js.native
  def HmacSHA3(message: String, key: WordArray, options: js.Any*): WordArray = js.native
  def HmacSHA3(message: String, options: js.Any*): WordArray = js.native
  def HmacSHA3(message: LibWordArray, key: js.UndefOr[scala.Nothing], options: js.Any*): WordArray = js.native
  def HmacSHA3(message: LibWordArray, key: String, options: js.Any*): WordArray = js.native
  def HmacSHA3(message: LibWordArray, key: WordArray, options: js.Any*): WordArray = js.native
  def HmacSHA3(message: LibWordArray, options: js.Any*): WordArray = js.native
  
  def HmacSHA384(message: String, key: js.UndefOr[scala.Nothing], options: js.Any*): WordArray = js.native
  def HmacSHA384(message: String, key: String, options: js.Any*): WordArray = js.native
  def HmacSHA384(message: String, key: WordArray, options: js.Any*): WordArray = js.native
  def HmacSHA384(message: String, options: js.Any*): WordArray = js.native
  def HmacSHA384(message: LibWordArray, key: js.UndefOr[scala.Nothing], options: js.Any*): WordArray = js.native
  def HmacSHA384(message: LibWordArray, key: String, options: js.Any*): WordArray = js.native
  def HmacSHA384(message: LibWordArray, key: WordArray, options: js.Any*): WordArray = js.native
  def HmacSHA384(message: LibWordArray, options: js.Any*): WordArray = js.native
  
  def HmacSHA512(message: String, key: js.UndefOr[scala.Nothing], options: js.Any*): WordArray = js.native
  def HmacSHA512(message: String, key: String, options: js.Any*): WordArray = js.native
  def HmacSHA512(message: String, key: WordArray, options: js.Any*): WordArray = js.native
  def HmacSHA512(message: String, options: js.Any*): WordArray = js.native
  def HmacSHA512(message: LibWordArray, key: js.UndefOr[scala.Nothing], options: js.Any*): WordArray = js.native
  def HmacSHA512(message: LibWordArray, key: String, options: js.Any*): WordArray = js.native
  def HmacSHA512(message: LibWordArray, key: WordArray, options: js.Any*): WordArray = js.native
  def HmacSHA512(message: LibWordArray, options: js.Any*): WordArray = js.native
  
  def MD5(message: String, key: js.UndefOr[scala.Nothing], options: js.Any*): WordArray = js.native
  def MD5(message: String, key: String, options: js.Any*): WordArray = js.native
  def MD5(message: String, key: WordArray, options: js.Any*): WordArray = js.native
  def MD5(message: String, options: js.Any*): WordArray = js.native
  def MD5(message: LibWordArray, key: js.UndefOr[scala.Nothing], options: js.Any*): WordArray = js.native
  def MD5(message: LibWordArray, key: String, options: js.Any*): WordArray = js.native
  def MD5(message: LibWordArray, key: WordArray, options: js.Any*): WordArray = js.native
  def MD5(message: LibWordArray, options: js.Any*): WordArray = js.native
  
  def PBKDF2(message: String, key: js.UndefOr[scala.Nothing], options: js.Any*): WordArray = js.native
  def PBKDF2(message: String, key: String, options: js.Any*): WordArray = js.native
  def PBKDF2(message: String, key: WordArray, options: js.Any*): WordArray = js.native
  def PBKDF2(message: String, options: js.Any*): WordArray = js.native
  def PBKDF2(message: LibWordArray, key: js.UndefOr[scala.Nothing], options: js.Any*): WordArray = js.native
  def PBKDF2(message: LibWordArray, key: String, options: js.Any*): WordArray = js.native
  def PBKDF2(message: LibWordArray, key: WordArray, options: js.Any*): WordArray = js.native
  def PBKDF2(message: LibWordArray, options: js.Any*): WordArray = js.native
  
  var RC4: CipherHelper = js.native
  
  var RC4Drop: CipherHelper = js.native
  
  def RIPEMD160(message: String, key: js.UndefOr[scala.Nothing], options: js.Any*): WordArray = js.native
  def RIPEMD160(message: String, key: String, options: js.Any*): WordArray = js.native
  def RIPEMD160(message: String, key: WordArray, options: js.Any*): WordArray = js.native
  def RIPEMD160(message: String, options: js.Any*): WordArray = js.native
  def RIPEMD160(message: LibWordArray, key: js.UndefOr[scala.Nothing], options: js.Any*): WordArray = js.native
  def RIPEMD160(message: LibWordArray, key: String, options: js.Any*): WordArray = js.native
  def RIPEMD160(message: LibWordArray, key: WordArray, options: js.Any*): WordArray = js.native
  def RIPEMD160(message: LibWordArray, options: js.Any*): WordArray = js.native
  
  var Rabbit: CipherHelper = js.native
  
  var RabbitLegacy: CipherHelper = js.native
  
  def SHA1(message: String, key: js.UndefOr[scala.Nothing], options: js.Any*): WordArray = js.native
  def SHA1(message: String, key: String, options: js.Any*): WordArray = js.native
  def SHA1(message: String, key: WordArray, options: js.Any*): WordArray = js.native
  def SHA1(message: String, options: js.Any*): WordArray = js.native
  def SHA1(message: LibWordArray, key: js.UndefOr[scala.Nothing], options: js.Any*): WordArray = js.native
  def SHA1(message: LibWordArray, key: String, options: js.Any*): WordArray = js.native
  def SHA1(message: LibWordArray, key: WordArray, options: js.Any*): WordArray = js.native
  def SHA1(message: LibWordArray, options: js.Any*): WordArray = js.native
  
  def SHA224(message: String, key: js.UndefOr[scala.Nothing], options: js.Any*): WordArray = js.native
  def SHA224(message: String, key: String, options: js.Any*): WordArray = js.native
  def SHA224(message: String, key: WordArray, options: js.Any*): WordArray = js.native
  def SHA224(message: String, options: js.Any*): WordArray = js.native
  def SHA224(message: LibWordArray, key: js.UndefOr[scala.Nothing], options: js.Any*): WordArray = js.native
  def SHA224(message: LibWordArray, key: String, options: js.Any*): WordArray = js.native
  def SHA224(message: LibWordArray, key: WordArray, options: js.Any*): WordArray = js.native
  def SHA224(message: LibWordArray, options: js.Any*): WordArray = js.native
  
  def SHA256(message: String, key: js.UndefOr[scala.Nothing], options: js.Any*): WordArray = js.native
  def SHA256(message: String, key: String, options: js.Any*): WordArray = js.native
  def SHA256(message: String, key: WordArray, options: js.Any*): WordArray = js.native
  def SHA256(message: String, options: js.Any*): WordArray = js.native
  def SHA256(message: LibWordArray, key: js.UndefOr[scala.Nothing], options: js.Any*): WordArray = js.native
  def SHA256(message: LibWordArray, key: String, options: js.Any*): WordArray = js.native
  def SHA256(message: LibWordArray, key: WordArray, options: js.Any*): WordArray = js.native
  def SHA256(message: LibWordArray, options: js.Any*): WordArray = js.native
  
  def SHA3(message: String, key: js.UndefOr[scala.Nothing], options: js.Any*): WordArray = js.native
  def SHA3(message: String, key: String, options: js.Any*): WordArray = js.native
  def SHA3(message: String, key: WordArray, options: js.Any*): WordArray = js.native
  def SHA3(message: String, options: js.Any*): WordArray = js.native
  def SHA3(message: LibWordArray, key: js.UndefOr[scala.Nothing], options: js.Any*): WordArray = js.native
  def SHA3(message: LibWordArray, key: String, options: js.Any*): WordArray = js.native
  def SHA3(message: LibWordArray, key: WordArray, options: js.Any*): WordArray = js.native
  def SHA3(message: LibWordArray, options: js.Any*): WordArray = js.native
  
  def SHA384(message: String, key: js.UndefOr[scala.Nothing], options: js.Any*): WordArray = js.native
  def SHA384(message: String, key: String, options: js.Any*): WordArray = js.native
  def SHA384(message: String, key: WordArray, options: js.Any*): WordArray = js.native
  def SHA384(message: String, options: js.Any*): WordArray = js.native
  def SHA384(message: LibWordArray, key: js.UndefOr[scala.Nothing], options: js.Any*): WordArray = js.native
  def SHA384(message: LibWordArray, key: String, options: js.Any*): WordArray = js.native
  def SHA384(message: LibWordArray, key: WordArray, options: js.Any*): WordArray = js.native
  def SHA384(message: LibWordArray, options: js.Any*): WordArray = js.native
  
  def SHA512(message: String, key: js.UndefOr[scala.Nothing], options: js.Any*): WordArray = js.native
  def SHA512(message: String, key: String, options: js.Any*): WordArray = js.native
  def SHA512(message: String, key: WordArray, options: js.Any*): WordArray = js.native
  def SHA512(message: String, options: js.Any*): WordArray = js.native
  def SHA512(message: LibWordArray, key: js.UndefOr[scala.Nothing], options: js.Any*): WordArray = js.native
  def SHA512(message: LibWordArray, key: String, options: js.Any*): WordArray = js.native
  def SHA512(message: LibWordArray, key: WordArray, options: js.Any*): WordArray = js.native
  def SHA512(message: LibWordArray, options: js.Any*): WordArray = js.native
  
  var TripleDES: CipherHelper = js.native
  
  var algo: AES = js.native
  
  var enc: Base64 = js.native
  
  var format: Hex = js.native
  
  var lib: typingsSlinky.cryptoJs.anon.WordArray = js.native
  
  var mode: CBC = js.native
  
  var pad: AnsiX923 = js.native
}
