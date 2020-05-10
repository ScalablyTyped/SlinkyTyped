package typingsSlinky.cryptojs.CryptoJS.lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LibStatic extends js.Object {
  var Base: typingsSlinky.cryptojs.CryptoJS.lib.Base = js.native
  var CipherParams: typingsSlinky.cryptojs.CryptoJS.lib.CipherParams = js.native
  var PasswordBasedCipher: typingsSlinky.cryptojs.CryptoJS.lib.PasswordBasedCipher = js.native
  var SerializableCipher: typingsSlinky.cryptojs.CryptoJS.lib.SerializableCipher = js.native
  var WordArray: typingsSlinky.cryptojs.CryptoJS.lib.WordArray = js.native
}

object LibStatic {
  @scala.inline
  def apply(
    Base: Base,
    CipherParams: CipherParams,
    PasswordBasedCipher: PasswordBasedCipher,
    SerializableCipher: SerializableCipher,
    WordArray: WordArray
  ): LibStatic = {
    val __obj = js.Dynamic.literal(Base = Base.asInstanceOf[js.Any], CipherParams = CipherParams.asInstanceOf[js.Any], PasswordBasedCipher = PasswordBasedCipher.asInstanceOf[js.Any], SerializableCipher = SerializableCipher.asInstanceOf[js.Any], WordArray = WordArray.asInstanceOf[js.Any])
    __obj.asInstanceOf[LibStatic]
  }
  @scala.inline
  implicit class LibStaticOps[Self <: LibStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: Base): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCipherParams(value: CipherParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CipherParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPasswordBasedCipher(value: PasswordBasedCipher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PasswordBasedCipher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerializableCipher(value: SerializableCipher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SerializableCipher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordArray(value: WordArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WordArray")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

