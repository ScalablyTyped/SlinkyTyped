package typingsSlinky.cryptojs.CryptoJS.lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LibStatic extends js.Object {
  var Base: typingsSlinky.cryptojs.CryptoJS.lib.Base
  var CipherParams: typingsSlinky.cryptojs.CryptoJS.lib.CipherParams
  var PasswordBasedCipher: typingsSlinky.cryptojs.CryptoJS.lib.PasswordBasedCipher
  var SerializableCipher: typingsSlinky.cryptojs.CryptoJS.lib.SerializableCipher
  var WordArray: typingsSlinky.cryptojs.CryptoJS.lib.WordArray
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
}

