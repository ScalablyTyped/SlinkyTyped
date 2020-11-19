package typingsSlinky.jsrsasign.jsrsasign.KJUR.crypto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Mac(Message Authentication Code) class which is very similar to java.security.Mac class
  * @param params parameters for constructor
  * @description
  *
  * Currently this supports following algorithm and providers combination:
  * - hmacmd5 - cryptojs
  * - hmacsha1 - cryptojs
  * - hmacsha224 - cryptojs
  * - hmacsha256 - cryptojs
  * - hmacsha384 - cryptojs
  * - hmacsha512 - cryptojs
  * NOTE: HmacSHA224 and HmacSHA384 issue was fixed since jsrsasign 4.1.4.
  * Please use 'ext/cryptojs-312-core-fix*.js' instead of 'core.js' of original CryptoJS
  * to avoid those issue.
  *
  * NOTE2: Hmac signature bug was fixed in jsrsasign 4.9.0 by providing CryptoJS
  * bug workaround.
  *
  * Please see `KJUR.crypto.Mac.setPassword` how to provide password
  * in various ways in detail.
  * @example
  * var mac = new KJUR.crypto.Mac({alg: "HmacSHA1", "pass": "pass"});
  * mac.updateString('aaa')
  * var macHex = mac.doFinal()
  *
  * // other password representation
  * var mac = new KJUR.crypto.Mac({alg: "HmacSHA256", "pass": {"hex":  "6161"}});
  * var mac = new KJUR.crypto.Mac({alg: "HmacSHA256", "pass": {"utf8": "aa"}});
  * var mac = new KJUR.crypto.Mac({alg: "HmacSHA256", "pass": {"rstr": "\x61\x61"}});
  * var mac = new KJUR.crypto.Mac({alg: "HmacSHA256", "pass": {"b64":  "Mi02/+...a=="}});
  * var mac = new KJUR.crypto.Mac({alg: "HmacSHA256", "pass": {"b64u": "Mi02_-...a"}});
  */
@js.native
trait Mac extends js.Object {
  
  /**
    * completes hash calculation and returns hash result
    * @example
    * mac.digest()
    */
  def doFinal(): Unit = js.native
  
  /**
    * performs final update on the digest using hexadecimal string,
    * then completes the digest computation
    * @param hex hexadecimal string to final update
    * @example
    * mac.digestHex('0f2abd')
    */
  def doFinalHex(hex: String): Unit = js.native
  
  /**
    * performs final update on the digest using string, then completes the digest computation
    * @param str string to final update
    * @example
    * mac.digestString('aaa')
    */
  def doFinalString(str: String): Unit = js.native
  
  def setAlgAndProvider(alg: String, prov: String): Unit = js.native
  
  /**
    * set password for Mac
    * @param pass password for Mac
    * @description
    * This method will set password for (H)Mac internally.
    * Argument 'pass' can be specified as following:
    * - even length string of 0..9, a..f or A-F: implicitly specified as hexadecimal string
    * - not above string: implicitly specified as raw string
    * - {rstr: "\x65\x70"}: explicitly specified as raw string
    * - {hex: "6570"}: explicitly specified as hexacedimal string
    * - {utf8: "秘密"}: explicitly specified as UTF8 string
    * - {b64: "Mi78..=="}: explicitly specified as Base64 string
    * - {b64u: "Mi7-_"}: explicitly specified as Base64URL string
    * It is *STRONGLY RECOMMENDED* that explicit representation of password argument
    * to avoid ambiguity. For example string  "6161" can mean a string "6161" or
    * a hexadecimal string of "aa" (i.e. \x61\x61).
    * @example
    * mac = KJUR.crypto.Mac({'alg': 'hmacsha256'});
    * // set password by implicit raw string
    * mac.setPassword("\x65\x70\xb9\x0b");
    * mac.setPassword("password");
    * // set password by implicit hexadecimal string
    * mac.setPassword("6570b90b");
    * mac.setPassword("6570B90B");
    * // set password by explicit raw string
    * mac.setPassword({"rstr": "\x65\x70\xb9\x0b"});
    * // set password by explicit hexadecimal string
    * mac.setPassword({"hex": "6570b90b"});
    * // set password by explicit utf8 string
    * mac.setPassword({"utf8": "passwordパスワード");
    * // set password by explicit Base64 string
    * mac.setPassword({"b64": "Mb+c3f/=="});
    * // set password by explicit Base64URL string
    * mac.setPassword({"b64u": "Mb-c3f_"});
    */
  def setPassword(pass: String): Unit = js.native
  
  /**
    * update digest by specified hexadecimal string
    * @param hex hexadecimal string to update
    * @example
    * mac.updateHex('0afe36');
    */
  def updateHex(hex: String): Unit = js.native
  
  /**
    * update digest by specified string
    * @param str string to update
    * @example
    * mac.updateString('New York');
    */
  def updateString(str: String): Unit = js.native
}
object Mac {
  
  @scala.inline
  def apply(
    doFinal: () => Unit,
    doFinalHex: String => Unit,
    doFinalString: String => Unit,
    setAlgAndProvider: (String, String) => Unit,
    setPassword: String => Unit,
    updateHex: String => Unit,
    updateString: String => Unit
  ): Mac = {
    val __obj = js.Dynamic.literal(doFinal = js.Any.fromFunction0(doFinal), doFinalHex = js.Any.fromFunction1(doFinalHex), doFinalString = js.Any.fromFunction1(doFinalString), setAlgAndProvider = js.Any.fromFunction2(setAlgAndProvider), setPassword = js.Any.fromFunction1(setPassword), updateHex = js.Any.fromFunction1(updateHex), updateString = js.Any.fromFunction1(updateString))
    __obj.asInstanceOf[Mac]
  }
  
  @scala.inline
  implicit class MacOps[Self <: Mac] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDoFinal(value: () => Unit): Self = this.set("doFinal", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDoFinalHex(value: String => Unit): Self = this.set("doFinalHex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDoFinalString(value: String => Unit): Self = this.set("doFinalString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAlgAndProvider(value: (String, String) => Unit): Self = this.set("setAlgAndProvider", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetPassword(value: String => Unit): Self = this.set("setPassword", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateHex(value: String => Unit): Self = this.set("updateHex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateString(value: String => Unit): Self = this.set("updateString", js.Any.fromFunction1(value))
  }
}
