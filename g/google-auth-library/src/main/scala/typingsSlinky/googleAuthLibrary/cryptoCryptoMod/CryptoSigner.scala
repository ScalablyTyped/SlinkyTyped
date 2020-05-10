package typingsSlinky.googleAuthLibrary.cryptoCryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CryptoSigner extends js.Object {
  def sign(key: String, outputFormat: String): String = js.native
  def update(data: String): Unit = js.native
}

object CryptoSigner {
  @scala.inline
  def apply(sign: (String, String) => String, update: String => Unit): CryptoSigner = {
    val __obj = js.Dynamic.literal(sign = js.Any.fromFunction2(sign), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CryptoSigner]
  }
  @scala.inline
  implicit class CryptoSignerOps[Self <: CryptoSigner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSign(value: (String, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sign")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUpdate(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

