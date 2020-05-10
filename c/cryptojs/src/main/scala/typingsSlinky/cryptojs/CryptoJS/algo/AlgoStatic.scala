package typingsSlinky.cryptojs.CryptoJS.algo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlgoStatic extends js.Object {
  var AES: typingsSlinky.cryptojs.CryptoJS.algo.AES = js.native
  var DES: typingsSlinky.cryptojs.CryptoJS.algo.DES = js.native
  var EvpKDF: typingsSlinky.cryptojs.CryptoJS.algo.EvpKDF = js.native
  var HMAC: typingsSlinky.cryptojs.CryptoJS.algo.HMAC = js.native
  var MD5: typingsSlinky.cryptojs.CryptoJS.algo.MD5 = js.native
  var PBKDF2: typingsSlinky.cryptojs.CryptoJS.algo.PBKDF2 = js.native
  var RC4: typingsSlinky.cryptojs.CryptoJS.algo.RC4 = js.native
  var RC4Drop: typingsSlinky.cryptojs.CryptoJS.algo.RC4Drop = js.native
  var RIPEMD160: typingsSlinky.cryptojs.CryptoJS.algo.RIPEMD160 = js.native
  var Rabbit: typingsSlinky.cryptojs.CryptoJS.algo.Rabbit = js.native
  var RabbitLegacy: typingsSlinky.cryptojs.CryptoJS.algo.RabbitLegacy = js.native
  var SHA1: typingsSlinky.cryptojs.CryptoJS.algo.SHA1 = js.native
  var SHA224: typingsSlinky.cryptojs.CryptoJS.algo.SHA224 = js.native
  var SHA256: typingsSlinky.cryptojs.CryptoJS.algo.SHA256 = js.native
  var SHA3: typingsSlinky.cryptojs.CryptoJS.algo.SHA3 = js.native
  var SHA384: typingsSlinky.cryptojs.CryptoJS.algo.SHA384 = js.native
  var SHA512: typingsSlinky.cryptojs.CryptoJS.algo.SHA512 = js.native
  var TripleDES: typingsSlinky.cryptojs.CryptoJS.algo.TripleDES = js.native
}

object AlgoStatic {
  @scala.inline
  def apply(
    AES: AES,
    DES: DES,
    EvpKDF: EvpKDF,
    HMAC: HMAC,
    MD5: MD5,
    PBKDF2: PBKDF2,
    RC4: RC4,
    RC4Drop: RC4Drop,
    RIPEMD160: RIPEMD160,
    Rabbit: Rabbit,
    RabbitLegacy: RabbitLegacy,
    SHA1: SHA1,
    SHA224: SHA224,
    SHA256: SHA256,
    SHA3: SHA3,
    SHA384: SHA384,
    SHA512: SHA512,
    TripleDES: TripleDES
  ): AlgoStatic = {
    val __obj = js.Dynamic.literal(AES = AES.asInstanceOf[js.Any], DES = DES.asInstanceOf[js.Any], EvpKDF = EvpKDF.asInstanceOf[js.Any], HMAC = HMAC.asInstanceOf[js.Any], MD5 = MD5.asInstanceOf[js.Any], PBKDF2 = PBKDF2.asInstanceOf[js.Any], RC4 = RC4.asInstanceOf[js.Any], RC4Drop = RC4Drop.asInstanceOf[js.Any], RIPEMD160 = RIPEMD160.asInstanceOf[js.Any], Rabbit = Rabbit.asInstanceOf[js.Any], RabbitLegacy = RabbitLegacy.asInstanceOf[js.Any], SHA1 = SHA1.asInstanceOf[js.Any], SHA224 = SHA224.asInstanceOf[js.Any], SHA256 = SHA256.asInstanceOf[js.Any], SHA3 = SHA3.asInstanceOf[js.Any], SHA384 = SHA384.asInstanceOf[js.Any], SHA512 = SHA512.asInstanceOf[js.Any], TripleDES = TripleDES.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlgoStatic]
  }
  @scala.inline
  implicit class AlgoStaticOps[Self <: AlgoStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAES(value: AES): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AES")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDES(value: DES): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DES")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvpKDF(value: EvpKDF): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvpKDF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHMAC(value: HMAC): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HMAC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMD5(value: MD5): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MD5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPBKDF2(value: PBKDF2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PBKDF2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRC4(value: RC4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RC4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRC4Drop(value: RC4Drop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RC4Drop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRIPEMD160(value: RIPEMD160): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RIPEMD160")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRabbit(value: Rabbit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rabbit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRabbitLegacy(value: RabbitLegacy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RabbitLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSHA1(value: SHA1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHA1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSHA224(value: SHA224): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHA224")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSHA256(value: SHA256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHA256")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSHA3(value: SHA3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHA3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSHA384(value: SHA384): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHA384")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSHA512(value: SHA512): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHA512")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTripleDES(value: TripleDES): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TripleDES")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

