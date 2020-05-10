package typingsSlinky.cryptoJs

import typingsSlinky.cryptoJs.mod.Base
import typingsSlinky.cryptoJs.mod.BlockCipher
import typingsSlinky.cryptoJs.mod.Hasher
import typingsSlinky.cryptoJs.mod.StreamCipher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAES extends js.Object {
  var AES: BlockCipher = js.native
  var DES: BlockCipher = js.native
  var EvpKDF: Base = js.native
  var HMAC: Base = js.native
  var MD5: Hasher = js.native
  var PBKDF2: Base = js.native
  var RC4: StreamCipher = js.native
  var RC4Drop: StreamCipher = js.native
  var RIPEMD160: Hasher = js.native
  var Rabbit: StreamCipher = js.native
  var RabbitLegacy: StreamCipher = js.native
  var SHA1: Hasher = js.native
  var SHA256: Hasher = js.native
  var SHA3: Hasher = js.native
  var SHA384: Hasher = js.native
  var SHA512: Hasher = js.native
  var TripleDES: BlockCipher = js.native
}

object AnonAES {
  @scala.inline
  def apply(
    AES: BlockCipher,
    DES: BlockCipher,
    EvpKDF: Base,
    HMAC: Base,
    MD5: Hasher,
    PBKDF2: Base,
    RC4: StreamCipher,
    RC4Drop: StreamCipher,
    RIPEMD160: Hasher,
    Rabbit: StreamCipher,
    RabbitLegacy: StreamCipher,
    SHA1: Hasher,
    SHA256: Hasher,
    SHA3: Hasher,
    SHA384: Hasher,
    SHA512: Hasher,
    TripleDES: BlockCipher
  ): AnonAES = {
    val __obj = js.Dynamic.literal(AES = AES.asInstanceOf[js.Any], DES = DES.asInstanceOf[js.Any], EvpKDF = EvpKDF.asInstanceOf[js.Any], HMAC = HMAC.asInstanceOf[js.Any], MD5 = MD5.asInstanceOf[js.Any], PBKDF2 = PBKDF2.asInstanceOf[js.Any], RC4 = RC4.asInstanceOf[js.Any], RC4Drop = RC4Drop.asInstanceOf[js.Any], RIPEMD160 = RIPEMD160.asInstanceOf[js.Any], Rabbit = Rabbit.asInstanceOf[js.Any], RabbitLegacy = RabbitLegacy.asInstanceOf[js.Any], SHA1 = SHA1.asInstanceOf[js.Any], SHA256 = SHA256.asInstanceOf[js.Any], SHA3 = SHA3.asInstanceOf[js.Any], SHA384 = SHA384.asInstanceOf[js.Any], SHA512 = SHA512.asInstanceOf[js.Any], TripleDES = TripleDES.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAES]
  }
  @scala.inline
  implicit class AnonAESOps[Self <: AnonAES] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAES(value: BlockCipher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AES")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDES(value: BlockCipher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DES")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvpKDF(value: Base): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvpKDF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHMAC(value: Base): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HMAC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMD5(value: Hasher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MD5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPBKDF2(value: Base): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PBKDF2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRC4(value: StreamCipher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RC4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRC4Drop(value: StreamCipher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RC4Drop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRIPEMD160(value: Hasher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RIPEMD160")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRabbit(value: StreamCipher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rabbit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRabbitLegacy(value: StreamCipher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RabbitLegacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSHA1(value: Hasher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHA1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSHA256(value: Hasher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHA256")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSHA3(value: Hasher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHA3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSHA384(value: Hasher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHA384")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSHA512(value: Hasher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHA512")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTripleDES(value: BlockCipher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TripleDES")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

