package typingsSlinky.cryptoJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def AES: typingsSlinky.cryptoJs.mod.CipherHelper = typingsSlinky.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("AES").asInstanceOf[typingsSlinky.cryptoJs.mod.CipherHelper]
  
  type CipherParams = typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.CipherParams
  
  @scala.inline
  def DES: typingsSlinky.cryptoJs.mod.CipherHelper = typingsSlinky.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("DES").asInstanceOf[typingsSlinky.cryptoJs.mod.CipherHelper]
  
  @scala.inline
  def EvpKDF(password: java.lang.String, salt: java.lang.String): typingsSlinky.cryptoJs.mod.WordArray = (typingsSlinky.cryptoJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.cryptoJs.mod.WordArray]
  @scala.inline
  def EvpKDF(password: java.lang.String, salt: java.lang.String, cfg: typingsSlinky.cryptoJs.anon.Hasher): typingsSlinky.cryptoJs.mod.WordArray = (typingsSlinky.cryptoJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.cryptoJs.mod.WordArray]
  @scala.inline
  def EvpKDF(password: java.lang.String, salt: typingsSlinky.cryptoJs.mod.WordArray): typingsSlinky.cryptoJs.mod.WordArray = (typingsSlinky.cryptoJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.cryptoJs.mod.WordArray]
  @scala.inline
  def EvpKDF(
    password: java.lang.String,
    salt: typingsSlinky.cryptoJs.mod.WordArray,
    cfg: typingsSlinky.cryptoJs.anon.Hasher
  ): typingsSlinky.cryptoJs.mod.WordArray = (typingsSlinky.cryptoJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.cryptoJs.mod.WordArray]
  @scala.inline
  def EvpKDF(password: typingsSlinky.cryptoJs.mod.WordArray, salt: java.lang.String): typingsSlinky.cryptoJs.mod.WordArray = (typingsSlinky.cryptoJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.cryptoJs.mod.WordArray]
  @scala.inline
  def EvpKDF(
    password: typingsSlinky.cryptoJs.mod.WordArray,
    salt: java.lang.String,
    cfg: typingsSlinky.cryptoJs.anon.Hasher
  ): typingsSlinky.cryptoJs.mod.WordArray = (typingsSlinky.cryptoJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.cryptoJs.mod.WordArray]
  @scala.inline
  def EvpKDF(password: typingsSlinky.cryptoJs.mod.WordArray, salt: typingsSlinky.cryptoJs.mod.WordArray): typingsSlinky.cryptoJs.mod.WordArray = (typingsSlinky.cryptoJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.cryptoJs.mod.WordArray]
  @scala.inline
  def EvpKDF(
    password: typingsSlinky.cryptoJs.mod.WordArray,
    salt: typingsSlinky.cryptoJs.mod.WordArray,
    cfg: typingsSlinky.cryptoJs.anon.Hasher
  ): typingsSlinky.cryptoJs.mod.WordArray = (typingsSlinky.cryptoJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("EvpKDF")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.cryptoJs.mod.WordArray]
  
  type HasherHelper = js.Function2[
    /* message */ typingsSlinky.cryptoJs.mod.WordArray | java.lang.String, 
    /* cfg */ js.UndefOr[js.Object], 
    typingsSlinky.cryptoJs.mod.WordArray
  ]
  
  type HmacHasherHelper = js.Function2[
    /* message */ typingsSlinky.cryptoJs.mod.WordArray | java.lang.String, 
    /* key */ typingsSlinky.cryptoJs.mod.WordArray | java.lang.String, 
    typingsSlinky.cryptoJs.mod.WordArray
  ]
  
  @scala.inline
  def HmacMD5: typingsSlinky.cryptoJs.mod.HmacHasherHelper = typingsSlinky.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("HmacMD5").asInstanceOf[typingsSlinky.cryptoJs.mod.HmacHasherHelper]
  
  @scala.inline
  def HmacRIPEMD160: typingsSlinky.cryptoJs.mod.HmacHasherHelper = typingsSlinky.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("HmacRIPEMD160").asInstanceOf[typingsSlinky.cryptoJs.mod.HmacHasherHelper]
  
  @scala.inline
  def HmacSHA1: typingsSlinky.cryptoJs.mod.HmacHasherHelper = typingsSlinky.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("HmacSHA1").asInstanceOf[typingsSlinky.cryptoJs.mod.HmacHasherHelper]
  
  @scala.inline
  def HmacSHA224: typingsSlinky.cryptoJs.mod.HmacHasherHelper = typingsSlinky.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("HmacSHA224").asInstanceOf[typingsSlinky.cryptoJs.mod.HmacHasherHelper]
  
  @scala.inline
  def HmacSHA256: typingsSlinky.cryptoJs.mod.HmacHasherHelper = typingsSlinky.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("HmacSHA256").asInstanceOf[typingsSlinky.cryptoJs.mod.HmacHasherHelper]
  
  @scala.inline
  def HmacSHA3: typingsSlinky.cryptoJs.mod.HmacHasherHelper = typingsSlinky.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("HmacSHA3").asInstanceOf[typingsSlinky.cryptoJs.mod.HmacHasherHelper]
  
  @scala.inline
  def HmacSHA384: typingsSlinky.cryptoJs.mod.HmacHasherHelper = typingsSlinky.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("HmacSHA384").asInstanceOf[typingsSlinky.cryptoJs.mod.HmacHasherHelper]
  
  @scala.inline
  def HmacSHA512: typingsSlinky.cryptoJs.mod.HmacHasherHelper = typingsSlinky.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("HmacSHA512").asInstanceOf[typingsSlinky.cryptoJs.mod.HmacHasherHelper]
  
  @scala.inline
  def MD5: typingsSlinky.cryptoJs.mod.HasherHelper = typingsSlinky.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("MD5").asInstanceOf[typingsSlinky.cryptoJs.mod.HasherHelper]
  
  @scala.inline
  def PBKDF2(password: java.lang.String, salt: java.lang.String): typingsSlinky.cryptoJs.mod.WordArray = (typingsSlinky.cryptoJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("PBKDF2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.cryptoJs.mod.WordArray]
  @scala.inline
  def PBKDF2(password: java.lang.String, salt: java.lang.String, cfg: typingsSlinky.cryptoJs.mod.KDFOption): typingsSlinky.cryptoJs.mod.WordArray = (typingsSlinky.cryptoJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("PBKDF2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.cryptoJs.mod.WordArray]
  @scala.inline
  def PBKDF2(password: java.lang.String, salt: typingsSlinky.cryptoJs.mod.WordArray): typingsSlinky.cryptoJs.mod.WordArray = (typingsSlinky.cryptoJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("PBKDF2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.cryptoJs.mod.WordArray]
  @scala.inline
  def PBKDF2(
    password: java.lang.String,
    salt: typingsSlinky.cryptoJs.mod.WordArray,
    cfg: typingsSlinky.cryptoJs.mod.KDFOption
  ): typingsSlinky.cryptoJs.mod.WordArray = (typingsSlinky.cryptoJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("PBKDF2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.cryptoJs.mod.WordArray]
  @scala.inline
  def PBKDF2(password: typingsSlinky.cryptoJs.mod.WordArray, salt: java.lang.String): typingsSlinky.cryptoJs.mod.WordArray = (typingsSlinky.cryptoJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("PBKDF2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.cryptoJs.mod.WordArray]
  @scala.inline
  def PBKDF2(
    password: typingsSlinky.cryptoJs.mod.WordArray,
    salt: java.lang.String,
    cfg: typingsSlinky.cryptoJs.mod.KDFOption
  ): typingsSlinky.cryptoJs.mod.WordArray = (typingsSlinky.cryptoJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("PBKDF2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.cryptoJs.mod.WordArray]
  @scala.inline
  def PBKDF2(password: typingsSlinky.cryptoJs.mod.WordArray, salt: typingsSlinky.cryptoJs.mod.WordArray): typingsSlinky.cryptoJs.mod.WordArray = (typingsSlinky.cryptoJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("PBKDF2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.cryptoJs.mod.WordArray]
  @scala.inline
  def PBKDF2(
    password: typingsSlinky.cryptoJs.mod.WordArray,
    salt: typingsSlinky.cryptoJs.mod.WordArray,
    cfg: typingsSlinky.cryptoJs.mod.KDFOption
  ): typingsSlinky.cryptoJs.mod.WordArray = (typingsSlinky.cryptoJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("PBKDF2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.cryptoJs.mod.WordArray]
  
  @scala.inline
  def RC4: typingsSlinky.cryptoJs.mod.CipherHelper = typingsSlinky.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("RC4").asInstanceOf[typingsSlinky.cryptoJs.mod.CipherHelper]
  
  @scala.inline
  def RC4Drop: typingsSlinky.cryptoJs.mod.CipherHelper = typingsSlinky.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("RC4Drop").asInstanceOf[typingsSlinky.cryptoJs.mod.CipherHelper]
  
  @scala.inline
  def RIPEMD160: typingsSlinky.cryptoJs.mod.HasherHelper = typingsSlinky.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("RIPEMD160").asInstanceOf[typingsSlinky.cryptoJs.mod.HasherHelper]
  
  @scala.inline
  def Rabbit: typingsSlinky.cryptoJs.mod.CipherHelper = typingsSlinky.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Rabbit").asInstanceOf[typingsSlinky.cryptoJs.mod.CipherHelper]
  
  @scala.inline
  def RabbitLegacy: typingsSlinky.cryptoJs.mod.CipherHelper = typingsSlinky.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("RabbitLegacy").asInstanceOf[typingsSlinky.cryptoJs.mod.CipherHelper]
  
  @scala.inline
  def SHA1: typingsSlinky.cryptoJs.mod.HasherHelper = typingsSlinky.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("SHA1").asInstanceOf[typingsSlinky.cryptoJs.mod.HasherHelper]
  
  @scala.inline
  def SHA224: typingsSlinky.cryptoJs.mod.HasherHelper = typingsSlinky.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("SHA224").asInstanceOf[typingsSlinky.cryptoJs.mod.HasherHelper]
  
  @scala.inline
  def SHA256: typingsSlinky.cryptoJs.mod.HasherHelper = typingsSlinky.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("SHA256").asInstanceOf[typingsSlinky.cryptoJs.mod.HasherHelper]
  
  @scala.inline
  def SHA3: typingsSlinky.cryptoJs.mod.HasherHelper = typingsSlinky.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("SHA3").asInstanceOf[typingsSlinky.cryptoJs.mod.HasherHelper]
  
  @scala.inline
  def SHA384: typingsSlinky.cryptoJs.mod.HasherHelper = typingsSlinky.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("SHA384").asInstanceOf[typingsSlinky.cryptoJs.mod.HasherHelper]
  
  @scala.inline
  def SHA512: typingsSlinky.cryptoJs.mod.HasherHelper = typingsSlinky.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("SHA512").asInstanceOf[typingsSlinky.cryptoJs.mod.HasherHelper]
  
  @scala.inline
  def TripleDES: typingsSlinky.cryptoJs.mod.CipherHelper = typingsSlinky.cryptoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("TripleDES").asInstanceOf[typingsSlinky.cryptoJs.mod.CipherHelper]
  
  type WordArray = typingsSlinky.cryptoJs.mod.global.CryptoJS.lib.WordArray
  
  type X64Word = typingsSlinky.cryptoJs.mod.global.CryptoJS.x64.Word
}
