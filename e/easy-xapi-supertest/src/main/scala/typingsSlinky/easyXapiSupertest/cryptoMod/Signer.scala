package typingsSlinky.easyXapiSupertest.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Signer extends js.Object {
  def sign(private_key: String, output_format: String): String = js.native
  def update(data: js.Any): Unit = js.native
}

object Signer {
  @scala.inline
  def apply(sign: (String, String) => String, update: js.Any => Unit): Signer = {
    val __obj = js.Dynamic.literal(sign = js.Any.fromFunction2(sign), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Signer]
  }
  @scala.inline
  implicit class SignerOps[Self <: Signer] (val x: Self) extends AnyVal {
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
    def withUpdate(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

